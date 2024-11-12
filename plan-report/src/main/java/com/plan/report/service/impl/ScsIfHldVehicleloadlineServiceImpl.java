package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsIfHldVehicleloadline;
import com.plan.report.domain.bo.ScsIfHldVehicleloadlineBo;
import com.plan.report.domain.vo.ScsIfHldVehicleloadlineVo;
import com.plan.report.mapper.ScsIfHldVehicleloadlineMapper;
import com.plan.report.service.IScsIfHldVehicleloadlineService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_if_hld_vehicleloadlineService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsIfHldVehicleloadlineServiceImpl implements IScsIfHldVehicleloadlineService {

    private final ScsIfHldVehicleloadlineMapper baseMapper;

    /**
     * 查询scs_if_hld_vehicleloadline
     */
    @Override
    public ScsIfHldVehicleloadlineVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_if_hld_vehicleloadline列表
     */
    @Override
    public TableDataInfo<ScsIfHldVehicleloadlineVo> queryPageList(ScsIfHldVehicleloadlineBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsIfHldVehicleloadline> lqw = buildQueryWrapper(bo);
        Page<ScsIfHldVehicleloadlineVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_if_hld_vehicleloadline列表
     */
    @Override
    public List<ScsIfHldVehicleloadlineVo> queryList(ScsIfHldVehicleloadlineBo bo) {
        LambdaQueryWrapper<ScsIfHldVehicleloadline> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsIfHldVehicleloadline> buildQueryWrapper(ScsIfHldVehicleloadlineBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsIfHldVehicleloadline> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getLoadid()), ScsIfHldVehicleloadline::getLoadid, bo.getLoadid());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), ScsIfHldVehicleloadline::getDescr, bo.getDescr());
        lqw.eq(bo.getSourcestatus() != null, ScsIfHldVehicleloadline::getSourcestatus, bo.getSourcestatus());
        lqw.eq(StringUtils.isNotBlank(bo.getDeststatus0()), ScsIfHldVehicleloadline::getDeststatus0, bo.getDeststatus0());
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), ScsIfHldVehicleloadline::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getSource()), ScsIfHldVehicleloadline::getSource, bo.getSource());
        lqw.eq(StringUtils.isNotBlank(bo.getDest()), ScsIfHldVehicleloadline::getDest, bo.getDest());
        lqw.eq(bo.getQty() != null, ScsIfHldVehicleloadline::getQty, bo.getQty());
        lqw.eq(bo.getAvaildate() != null, ScsIfHldVehicleloadline::getAvaildate, bo.getAvaildate());
        lqw.eq(bo.getAvaildate0() != null, ScsIfHldVehicleloadline::getAvaildate0, bo.getAvaildate0());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), ScsIfHldVehicleloadline::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), ScsIfHldVehicleloadline::getUCorporation, bo.getUCorporation());
        lqw.eq(bo.getUFlag() != null, ScsIfHldVehicleloadline::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsIfHldVehicleloadline::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), ScsIfHldVehicleloadline::getUFilename, bo.getUFilename());
        lqw.eq(bo.getUEditdate() != null, ScsIfHldVehicleloadline::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增scs_if_hld_vehicleloadline
     */
    @Override
    public Boolean insertByBo(ScsIfHldVehicleloadlineBo bo) {
        ScsIfHldVehicleloadline add = BeanUtil.toBean(bo, ScsIfHldVehicleloadline.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_if_hld_vehicleloadline
     */
    @Override
    public Boolean updateByBo(ScsIfHldVehicleloadlineBo bo) {
        ScsIfHldVehicleloadline update = BeanUtil.toBean(bo, ScsIfHldVehicleloadline.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsIfHldVehicleloadline entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_if_hld_vehicleloadline
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
