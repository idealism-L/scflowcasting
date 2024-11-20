package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsYearfcstHistory;
import com.plan.report.domain.bo.ScsYearfcstHistoryBo;
import com.plan.report.domain.vo.ScsYearfcstHistoryVo;
import com.plan.report.mapper.ScsYearfcstHistoryMapper;
import com.plan.report.service.IScsYearfcstHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_yearfcst_historyService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-20
 */
@RequiredArgsConstructor
@Service
public class ScsYearfcstHistoryServiceImpl implements IScsYearfcstHistoryService {

    private final ScsYearfcstHistoryMapper baseMapper;

    /**
     * 查询scs_yearfcst_history
     */
    @Override
    public ScsYearfcstHistoryVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_yearfcst_history列表
     */
    @Override
    public TableDataInfo<ScsYearfcstHistoryVo> queryPageList(ScsYearfcstHistoryBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsYearfcstHistory> lqw = buildQueryWrapper(bo);
        Page<ScsYearfcstHistoryVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_yearfcst_history列表
     */
    @Override
    public List<ScsYearfcstHistoryVo> queryList(ScsYearfcstHistoryBo bo) {
        LambdaQueryWrapper<ScsYearfcstHistory> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsYearfcstHistory> buildQueryWrapper(ScsYearfcstHistoryBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsYearfcstHistory> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getParentId() != null, ScsYearfcstHistory::getParentId, bo.getParentId());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsYearfcstHistory::getItemCode, bo.getItemCode());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), ScsYearfcstHistory::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getDescrEn()), ScsYearfcstHistory::getDescrEn, bo.getDescrEn());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsYearfcstHistory::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getUom()), ScsYearfcstHistory::getUom, bo.getUom());
        lqw.eq(bo.getStartdate() != null, ScsYearfcstHistory::getStartdate, bo.getStartdate());
        lqw.eq(bo.getUM1() != null, ScsYearfcstHistory::getUM1, bo.getUM1());
        lqw.eq(bo.getUM2() != null, ScsYearfcstHistory::getUM2, bo.getUM2());
        lqw.eq(bo.getUM3() != null, ScsYearfcstHistory::getUM3, bo.getUM3());
        lqw.eq(bo.getUM4() != null, ScsYearfcstHistory::getUM4, bo.getUM4());
        lqw.eq(bo.getUM5() != null, ScsYearfcstHistory::getUM5, bo.getUM5());
        lqw.eq(bo.getUM6() != null, ScsYearfcstHistory::getUM6, bo.getUM6());
        lqw.eq(bo.getUM7() != null, ScsYearfcstHistory::getUM7, bo.getUM7());
        lqw.eq(bo.getUM8() != null, ScsYearfcstHistory::getUM8, bo.getUM8());
        lqw.eq(bo.getUM9() != null, ScsYearfcstHistory::getUM9, bo.getUM9());
        lqw.eq(bo.getUM10() != null, ScsYearfcstHistory::getUM10, bo.getUM10());
        lqw.eq(bo.getUM11() != null, ScsYearfcstHistory::getUM11, bo.getUM11());
        lqw.eq(bo.getUM12() != null, ScsYearfcstHistory::getUM12, bo.getUM12());
        lqw.eq(bo.getUM13() != null, ScsYearfcstHistory::getUM13, bo.getUM13());
        lqw.eq(bo.getUM14() != null, ScsYearfcstHistory::getUM14, bo.getUM14());
        lqw.eq(bo.getUM15() != null, ScsYearfcstHistory::getUM15, bo.getUM15());
        lqw.eq(bo.getUM16() != null, ScsYearfcstHistory::getUM16, bo.getUM16());
        lqw.eq(StringUtils.isNotBlank(bo.getItemPattern()), ScsYearfcstHistory::getItemPattern, bo.getItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsYearfcstHistory::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getKitCorporation()), ScsYearfcstHistory::getKitCorporation, bo.getKitCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), ScsYearfcstHistory::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsYearfcstHistory::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsYearfcstHistory::getFileName, bo.getFileName());
        lqw.eq(bo.getEditdate() != null, ScsYearfcstHistory::getEditdate, bo.getEditdate());
        lqw.eq(bo.getVersionNo() != null, ScsYearfcstHistory::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_yearfcst_history
     */
    @Override
    public Boolean insertByBo(ScsYearfcstHistoryBo bo) {
        ScsYearfcstHistory add = BeanUtil.toBean(bo, ScsYearfcstHistory.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_yearfcst_history
     */
    @Override
    public Boolean updateByBo(ScsYearfcstHistoryBo bo) {
        ScsYearfcstHistory update = BeanUtil.toBean(bo, ScsYearfcstHistory.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsYearfcstHistory entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_yearfcst_history
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
