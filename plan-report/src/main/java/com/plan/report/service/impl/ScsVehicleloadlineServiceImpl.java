package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsVehicleloadline;
import com.plan.report.domain.bo.ScsVehicleloadlineBo;
import com.plan.report.domain.vo.ScsVehicleloadlineVo;
import com.plan.report.mapper.ScsVehicleloadlineMapper;
import com.plan.report.service.IScsVehicleloadlineService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_vehicleloadlineService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-20
 */
@RequiredArgsConstructor
@Service
public class ScsVehicleloadlineServiceImpl implements IScsVehicleloadlineService {

    private final ScsVehicleloadlineMapper baseMapper;

    /**
     * 查询scs_vehicleloadline
     */
    @Override
    public ScsVehicleloadlineVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_vehicleloadline列表
     */
    @Override
    public TableDataInfo<ScsVehicleloadlineVo> queryPageList(ScsVehicleloadlineBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsVehicleloadline> lqw = buildQueryWrapper(bo);
        Page<ScsVehicleloadlineVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_vehicleloadline列表
     */
    @Override
    public List<ScsVehicleloadlineVo> queryList(ScsVehicleloadlineBo bo) {
        LambdaQueryWrapper<ScsVehicleloadline> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsVehicleloadline> buildQueryWrapper(ScsVehicleloadlineBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsVehicleloadline> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsVehicleloadline::getItemCode, bo.getItemCode());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), ScsVehicleloadline::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getDescrEn()), ScsVehicleloadline::getDescrEn, bo.getDescrEn());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsVehicleloadline::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsVehicleloadline::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getBppBrand()), ScsVehicleloadline::getBppBrand, bo.getBppBrand());
        lqw.eq(StringUtils.isNotBlank(bo.getBppFlavor()), ScsVehicleloadline::getBppFlavor, bo.getBppFlavor());
        lqw.eq(bo.getSchedarrivdate() != null, ScsVehicleloadline::getSchedarrivdate, bo.getSchedarrivdate());
        lqw.eq(bo.getActualQty() != null, ScsVehicleloadline::getActualQty, bo.getActualQty());
        lqw.eq(bo.getPlanQty() != null, ScsVehicleloadline::getPlanQty, bo.getPlanQty());
        lqw.eq(bo.getSuQty() != null, ScsVehicleloadline::getSuQty, bo.getSuQty());
        lqw.eq(bo.getUcQty() != null, ScsVehicleloadline::getUcQty, bo.getUcQty());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsVehicleloadline::getFileName, bo.getFileName());
        lqw.eq(bo.getEditdate() != null, ScsVehicleloadline::getEditdate, bo.getEditdate());
        lqw.eq(bo.getVersionNo() != null, ScsVehicleloadline::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_vehicleloadline
     */
    @Override
    public Boolean insertByBo(ScsVehicleloadlineBo bo) {
        ScsVehicleloadline add = BeanUtil.toBean(bo, ScsVehicleloadline.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_vehicleloadline
     */
    @Override
    public Boolean updateByBo(ScsVehicleloadlineBo bo) {
        ScsVehicleloadline update = BeanUtil.toBean(bo, ScsVehicleloadline.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsVehicleloadline entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_vehicleloadline
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
