package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.TDcCalendar;
import com.plan.report.domain.bo.TDcCalendarBo;
import com.plan.report.domain.vo.TDcCalendarVo;
import com.plan.report.mapper.TDcCalendarMapper;
import com.plan.report.service.ITDcCalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 日历Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class TDcCalendarServiceImpl implements ITDcCalendarService {

    private final TDcCalendarMapper baseMapper;

    /**
     * 查询日历
     */
    @Override
    public TDcCalendarVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询日历列表
     */
    @Override
    public TableDataInfo<TDcCalendarVo> queryPageList(TDcCalendarBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<TDcCalendar> lqw = buildQueryWrapper(bo);
        Page<TDcCalendarVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询日历列表
     */
    @Override
    public List<TDcCalendarVo> queryList(TDcCalendarBo bo) {
        LambdaQueryWrapper<TDcCalendar> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<TDcCalendar> buildQueryWrapper(TDcCalendarBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<TDcCalendar> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getYearNum()), TDcCalendar::getYearNum, bo.getYearNum());
        lqw.eq(bo.getStartdate() != null, TDcCalendar::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getWeekNum()), TDcCalendar::getWeekNum, bo.getWeekNum());
        return lqw;
    }

    /**
     * 新增日历
     */
    @Override
    public Boolean insertByBo(TDcCalendarBo bo) {
        TDcCalendar add = BeanUtil.toBean(bo, TDcCalendar.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改日历
     */
    @Override
    public Boolean updateByBo(TDcCalendarBo bo) {
        TDcCalendar update = BeanUtil.toBean(bo, TDcCalendar.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(TDcCalendar entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除日历
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
