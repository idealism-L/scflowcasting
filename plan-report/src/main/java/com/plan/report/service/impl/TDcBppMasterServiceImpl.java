package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.TDcBppMaster;
import com.plan.report.domain.bo.TDcBppMasterBo;
import com.plan.report.domain.vo.TDcBppMasterVo;
import com.plan.report.mapper.TDcBppMasterMapper;
import com.plan.report.service.ITDcBppMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * BPP映射Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class TDcBppMasterServiceImpl implements ITDcBppMasterService {

    private final TDcBppMasterMapper baseMapper;

    /**
     * 查询BPP映射
     */
    @Override
    public TDcBppMasterVo queryById(Long imMainInsuranceConfigId){
        return baseMapper.selectVoById(imMainInsuranceConfigId);
    }

    /**
     * 查询BPP映射列表
     */
    @Override
    public TableDataInfo<TDcBppMasterVo> queryPageList(TDcBppMasterBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<TDcBppMaster> lqw = buildQueryWrapper(bo);
        Page<TDcBppMasterVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询BPP映射列表
     */
    @Override
    public List<TDcBppMasterVo> queryList(TDcBppMasterBo bo) {
        LambdaQueryWrapper<TDcBppMaster> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<TDcBppMaster> buildQueryWrapper(TDcBppMasterBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<TDcBppMaster> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getBppCode()), TDcBppMaster::getBppCode, bo.getBppCode());
        lqw.eq(StringUtils.isNotBlank(bo.getBppDescr()), TDcBppMaster::getBppDescr, bo.getBppDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUCategory()), TDcBppMaster::getUCategory, bo.getUCategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUCategoryDescr()), TDcBppMaster::getUCategoryDescr, bo.getUCategoryDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubcategory()), TDcBppMaster::getUSubcategory, bo.getUSubcategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubcategoryDescr()), TDcBppMaster::getUSubcategoryDescr, bo.getUSubcategoryDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUBrand()), TDcBppMaster::getUBrand, bo.getUBrand());
        lqw.eq(StringUtils.isNotBlank(bo.getUBrandDescr()), TDcBppMaster::getUBrandDescr, bo.getUBrandDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlavor()), TDcBppMaster::getUFlavor, bo.getUFlavor());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlavorDescr()), TDcBppMaster::getUFlavorDescr, bo.getUFlavorDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackage()), TDcBppMaster::getUPackage, bo.getUPackage());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackageDescr()), TDcBppMaster::getUPackageDescr, bo.getUPackageDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getBeverage()), TDcBppMaster::getBeverage, bo.getBeverage());
        lqw.eq(StringUtils.isNotBlank(bo.getUStatus()), TDcBppMaster::getUStatus, bo.getUStatus());
        lqw.eq(StringUtils.isNotBlank(bo.getBppShort()), TDcBppMaster::getBppShort, bo.getBppShort());
        lqw.eq(bo.getUFgKitRate() != null, TDcBppMaster::getUFgKitRate, bo.getUFgKitRate());
        lqw.eq(bo.getUUcRate() != null, TDcBppMaster::getUUcRate, bo.getUUcRate());
        return lqw;
    }

    /**
     * 新增BPP映射
     */
    @Override
    public Boolean insertByBo(TDcBppMasterBo bo) {
        TDcBppMaster add = BeanUtil.toBean(bo, TDcBppMaster.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setImMainInsuranceConfigId(add.getImMainInsuranceConfigId());
        }
        return flag;
    }

    /**
     * 修改BPP映射
     */
    @Override
    public Boolean updateByBo(TDcBppMasterBo bo) {
        TDcBppMaster update = BeanUtil.toBean(bo, TDcBppMaster.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(TDcBppMaster entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除BPP映射
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
