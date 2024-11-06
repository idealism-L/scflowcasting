package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.TDcItem;
import com.plan.report.domain.bo.TDcItemBo;
import com.plan.report.domain.vo.TDcItemVo;
import com.plan.report.mapper.TDcItemMapper;
import com.plan.report.service.ITDcItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 物料Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class TDcItemServiceImpl implements ITDcItemService {

    private final TDcItemMapper baseMapper;

    /**
     * 查询物料
     */
    @Override
    public TDcItemVo queryById(Long imMainInsuranceConfigId){
        return baseMapper.selectVoById(imMainInsuranceConfigId);
    }

    /**
     * 查询物料列表
     */
    @Override
    public TableDataInfo<TDcItemVo> queryPageList(TDcItemBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<TDcItem> lqw = buildQueryWrapper(bo);
        Page<TDcItemVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询物料列表
     */
    @Override
    public List<TDcItemVo> queryList(TDcItemBo bo) {
        LambdaQueryWrapper<TDcItem> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<TDcItem> buildQueryWrapper(TDcItemBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<TDcItem> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), TDcItem::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), TDcItem::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUDescrEn()), TDcItem::getUDescrEn, bo.getUDescrEn());
        lqw.eq(StringUtils.isNotBlank(bo.getUDescrShort()), TDcItem::getUDescrShort, bo.getUDescrShort());
        lqw.eq(StringUtils.isNotBlank(bo.getUCategory()), TDcItem::getUCategory, bo.getUCategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUCategoryDescr()), TDcItem::getUCategoryDescr, bo.getUCategoryDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubcategory()), TDcItem::getUSubcategory, bo.getUSubcategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubcategoryDescr()), TDcItem::getUSubcategoryDescr, bo.getUSubcategoryDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUBrand()), TDcItem::getUBrand, bo.getUBrand());
        lqw.eq(StringUtils.isNotBlank(bo.getUBrandDescr()), TDcItem::getUBrandDescr, bo.getUBrandDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlavor()), TDcItem::getUFlavor, bo.getUFlavor());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlavorDescr()), TDcItem::getUFlavorDescr, bo.getUFlavorDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackage()), TDcItem::getUPackage, bo.getUPackage());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackageDescr()), TDcItem::getUPackageDescr, bo.getUPackageDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubflavor()), TDcItem::getUSubflavor, bo.getUSubflavor());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubflavorDescr()), TDcItem::getUSubflavorDescr, bo.getUSubflavorDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackageCap()), TDcItem::getUPackageCap, bo.getUPackageCap());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackageCapDescr()), TDcItem::getUPackageCapDescr, bo.getUPackageCapDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUScclCode()), TDcItem::getUScclCode, bo.getUScclCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUCblCode()), TDcItem::getUCblCode, bo.getUCblCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUZhCode()), TDcItem::getUZhCode, bo.getUZhCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUFamily()), TDcItem::getUFamily, bo.getUFamily());
        lqw.eq(StringUtils.isNotBlank(bo.getUSpec()), TDcItem::getUSpec, bo.getUSpec());
        lqw.eq(StringUtils.isNotBlank(bo.getUSpecDescr()), TDcItem::getUSpecDescr, bo.getUSpecDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), TDcItem::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), TDcItem::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getUFruitCategory()), TDcItem::getUFruitCategory, bo.getUFruitCategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUUom()), TDcItem::getUUom, bo.getUUom());
        lqw.eq(bo.getUUomRate1() != null, TDcItem::getUUomRate1, bo.getUUomRate1());
        lqw.eq(bo.getUUomRate2() != null, TDcItem::getUUomRate2, bo.getUUomRate2());
        lqw.eq(bo.getUUc() != null, TDcItem::getUUc, bo.getUUc());
        lqw.eq(bo.getUPc() != null, TDcItem::getUPc, bo.getUPc());
        lqw.eq(StringUtils.isNotBlank(bo.getUBppCode()), TDcItem::getUBppCode, bo.getUBppCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUHierarchy2()), TDcItem::getUHierarchy2, bo.getUHierarchy2());
        lqw.eq(StringUtils.isNotBlank(bo.getUCarbonic()), TDcItem::getUCarbonic, bo.getUCarbonic());
        lqw.eq(StringUtils.isNotBlank(bo.getUAbc()), TDcItem::getUAbc, bo.getUAbc());
        lqw.eq(StringUtils.isNotBlank(bo.getUNew()), TDcItem::getUNew, bo.getUNew());
        lqw.eq(StringUtils.isNotBlank(bo.getURegion()), TDcItem::getURegion, bo.getURegion());
        lqw.eq(StringUtils.isNotBlank(bo.getUStatus()), TDcItem::getUStatus, bo.getUStatus());
        lqw.like(StringUtils.isNotBlank(bo.getUFileName()), TDcItem::getUFileName, bo.getUFileName());
        return lqw;
    }

    /**
     * 新增物料
     */
    @Override
    public Boolean insertByBo(TDcItemBo bo) {
        TDcItem add = BeanUtil.toBean(bo, TDcItem.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setImMainInsuranceConfigId(add.getImMainInsuranceConfigId());
        }
        return flag;
    }

    /**
     * 修改物料
     */
    @Override
    public Boolean updateByBo(TDcItemBo bo) {
        TDcItem update = BeanUtil.toBean(bo, TDcItem.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(TDcItem entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除物料
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
