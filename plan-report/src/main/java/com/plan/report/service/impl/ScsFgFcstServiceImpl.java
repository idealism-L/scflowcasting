package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.DateUtils;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsFgFcst;
import com.plan.report.domain.bo.ScsFgFcstBo;
import com.plan.report.domain.vo.ScsCalendarVo;
import com.plan.report.domain.vo.ScsFgFcstVo;
import com.plan.report.mapper.ScsFgFcstMapper;
import com.plan.report.service.IScsFgFcstService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * scs_fg_fcstService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-26
 */
@RequiredArgsConstructor
@Service
public class ScsFgFcstServiceImpl implements IScsFgFcstService {

    private final ScsFgFcstMapper baseMapper;

    private final ScsCalendarServiceImpl scsCalendarService;

    /**
     * 查询scs_fg_fcst
     */
    @Override
    public ScsFgFcstVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_fg_fcst列表
     */
    @Override
    public TableDataInfo<ScsFgFcstVo> queryPageList(ScsFgFcstBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsFgFcst> lqw = buildQueryWrapper(bo);
        Page<ScsFgFcstVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_fg_fcst列表
     */
    @Override
    public List<ScsFgFcstVo> queryList(ScsFgFcstBo bo) {
        LambdaQueryWrapper<ScsFgFcst> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    @Override
    public TableDataInfo<ScsFgFcstVo> queryPageListCorporation(ScsFgFcstBo bo, PageQuery pageQuery) {
        // 当前日期
        String currentDate = DateUtils.getDate();
        // 判断当前日期是否是周六或周日
        if (DateUtils.isWeekend(currentDate)) {
            // 如果是周六或周日，取上周六的日期
            currentDate = DateUtils.getPreviousFriday();
        }

        // 转换成一个日期 ID yyyy-mm-dd 转换成 yyyymmdd的long类型
        Long dateId = Long.parseLong(currentDate.replace("-", ""));
        ScsCalendarVo scsCalendarVo = scsCalendarService.queryById(dateId);

        String start = String.valueOf(scsCalendarVo.getC445WeekStartDt());

        // 取出截至日期
        String end = baseMapper.getStartDate(bo);

        // 根据start和end创建一个日期列表 依次加7
        List<String> dates = DateUtils.getDateList(start, end);

        // 构建 TableDataInfo
        TableDataInfo<ScsFgFcstVo> tableDataInfo = new TableDataInfo<>();
        List<ScsFgFcstVo> data = new ArrayList<>();

        // 计算总计数据
        List<Map<String,Object>> totals = baseMapper.getTotal(bo, dates);
        //转换成map 并且累计总和计算为total加入totalQty
        Map<String, Object> totalMap = new HashMap<>();
        BigDecimal totalQty = new BigDecimal(0);
        for (Map<String, Object> total : totals) {
            totalMap.put(total.get("startDate").toString(), total.get("totalQty"));
            totalQty = totalQty.add((BigDecimal) total.get("totalQty"));
        }
        totalMap.put("totalQty", totalQty);

        // 执行 行转列SQL查询
        Page<Map<String, Object>> resultList = baseMapper.listCorporation(pageQuery.build(), bo, dates);

        tableDataInfo.setTotal(resultList.getTotal());

        for (Map<String, Object> row : resultList.getRecords()) {
            ScsFgFcstVo vo = new ScsFgFcstVo();
            vo.setId((Long) row.get("id"));
            vo.setItemCode((String) row.get("item_code"));
            vo.setDescr((String) row.get("descr"));
            vo.setCorporation((String) row.get("corporation"));
            vo.setTotFcstPC((String) row.get("totFcst"));
            for (String startDate : dates) {
                vo.getQuantities().put(startDate, (BigDecimal) row.get(startDate));
            }
            vo.setTotalQty();
            vo.stripTrailingZerosToString();
            data.add(vo);
        }

        // 构建 columns 数据
        List<Map<String, Object>> columns = new ArrayList<>();
        for (String startDate : dates) {
            Map<String, Object> column = new HashMap<>();
            column.put("label", startDate);
            column.put("prop", startDate);
            column.put("width", "150");
            columns.add(column);
        }

        tableDataInfo.setRows(data);
        tableDataInfo.setTotals(totalMap);
        tableDataInfo.setColumns(columns);

        return tableDataInfo;
    }

    @Override
    public List<Map<String, Object>> getCorporationExportData(ScsFgFcstBo bo) {
        // 当前日期
        String currentDate = DateUtils.getDate();
        // 判断当前日期是否是周六或周日
        if (DateUtils.isWeekend(currentDate)) {
            // 如果是周六或周日，取上周六的日期
            currentDate = DateUtils.getPreviousFriday();
        }

        // 转换成一个日期 ID yyyy-mm-dd 转换成 yyyymmdd的long类型
        Long dateId = Long.parseLong(currentDate.replace("-", ""));
        ScsCalendarVo scsCalendarVo = scsCalendarService.queryById(dateId);

        String start = String.valueOf(scsCalendarVo.getC445WeekStartDt());
        // 取出截至日期
        String end = baseMapper.getStartDate(bo);
        return null;
    }

    private LambdaQueryWrapper<ScsFgFcst> buildQueryWrapper(ScsFgFcstBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsFgFcst> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getParentId() != null, ScsFgFcst::getParentId, bo.getParentId());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsFgFcst::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCorporation()), ScsFgFcst::getItemCorporation, bo.getItemCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsFgFcst::getItemCode, bo.getItemCode());
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), ScsFgFcst::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), ScsFgFcst::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getDescrEn()), ScsFgFcst::getDescrEn, bo.getDescrEn());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), ScsFgFcst::getDmdgroup, bo.getDmdgroup());
        lqw.eq(bo.getStartdate() != null, ScsFgFcst::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsFgFcst::getLoc, bo.getLoc());
        lqw.eq(bo.getQty() != null, ScsFgFcst::getQty, bo.getQty());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), ScsFgFcst::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsFgFcst::getUComment, bo.getUComment());
        lqw.eq(StringUtils.isNotBlank(bo.getFileBatch()), ScsFgFcst::getFileBatch, bo.getFileBatch());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsFgFcst::getFileName, bo.getFileName());
        lqw.eq(bo.getEditdate() != null, ScsFgFcst::getEditdate, bo.getEditdate());
        lqw.eq(bo.getVersionNo() != null, ScsFgFcst::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_fg_fcst
     */
    @Override
    public Boolean insertByBo(ScsFgFcstBo bo) {
        ScsFgFcst add = BeanUtil.toBean(bo, ScsFgFcst.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_fg_fcst
     */
    @Override
    public Boolean updateByBo(ScsFgFcstBo bo) {
        ScsFgFcst update = BeanUtil.toBean(bo, ScsFgFcst.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsFgFcst entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_fg_fcst
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
