package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.EtlClnItem;
import com.plan.report.domain.bo.EtlClnItemBo;
import com.plan.report.domain.vo.EtlClnItemVo;
import com.plan.report.mapper.EtlClnItemMapper;
import com.plan.report.service.IEtlClnItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 物料编码Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class EtlClnItemServiceImpl implements IEtlClnItemService {

    private final EtlClnItemMapper baseMapper;

    /**
     * 查询物料编码
     */
    @Override
    public EtlClnItemVo queryById(Long imMainInsuranceConfigId){
        return baseMapper.selectVoById(imMainInsuranceConfigId);
    }

    /**
     * 查询物料编码列表
     */
    @Override
    public TableDataInfo<EtlClnItemVo> queryPageList(EtlClnItemBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<EtlClnItem> lqw = buildQueryWrapper(bo);
        Page<EtlClnItemVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询物料编码列表
     */
    @Override
    public List<EtlClnItemVo> queryList(EtlClnItemBo bo) {
        LambdaQueryWrapper<EtlClnItem> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<EtlClnItem> buildQueryWrapper(EtlClnItemBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<EtlClnItem> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), EtlClnItem::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), EtlClnItem::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUDescrEn()), EtlClnItem::getUDescrEn, bo.getUDescrEn());
        lqw.eq(StringUtils.isNotBlank(bo.getUDescrShort()), EtlClnItem::getUDescrShort, bo.getUDescrShort());
        lqw.eq(StringUtils.isNotBlank(bo.getUCategory()), EtlClnItem::getUCategory, bo.getUCategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUCategoryDescr()), EtlClnItem::getUCategoryDescr, bo.getUCategoryDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubcategory()), EtlClnItem::getUSubcategory, bo.getUSubcategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubcategoryDescr()), EtlClnItem::getUSubcategoryDescr, bo.getUSubcategoryDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUBrand()), EtlClnItem::getUBrand, bo.getUBrand());
        lqw.eq(StringUtils.isNotBlank(bo.getUBrandDescr()), EtlClnItem::getUBrandDescr, bo.getUBrandDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlavor()), EtlClnItem::getUFlavor, bo.getUFlavor());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlavorDescr()), EtlClnItem::getUFlavorDescr, bo.getUFlavorDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackage()), EtlClnItem::getUPackage, bo.getUPackage());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackageDescr()), EtlClnItem::getUPackageDescr, bo.getUPackageDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubflavor()), EtlClnItem::getUSubflavor, bo.getUSubflavor());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubflavorDescr()), EtlClnItem::getUSubflavorDescr, bo.getUSubflavorDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackageCap()), EtlClnItem::getUPackageCap, bo.getUPackageCap());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackageCapDescr()), EtlClnItem::getUPackageCapDescr, bo.getUPackageCapDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUScclCode()), EtlClnItem::getUScclCode, bo.getUScclCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUCblCode()), EtlClnItem::getUCblCode, bo.getUCblCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUZhCode()), EtlClnItem::getUZhCode, bo.getUZhCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUFamily()), EtlClnItem::getUFamily, bo.getUFamily());
        lqw.eq(StringUtils.isNotBlank(bo.getUSpec()), EtlClnItem::getUSpec, bo.getUSpec());
        lqw.eq(StringUtils.isNotBlank(bo.getUSpecDescr()), EtlClnItem::getUSpecDescr, bo.getUSpecDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), EtlClnItem::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), EtlClnItem::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getUFruitCategory()), EtlClnItem::getUFruitCategory, bo.getUFruitCategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUUom()), EtlClnItem::getUUom, bo.getUUom());
        lqw.eq(bo.getUUomRate1() != null, EtlClnItem::getUUomRate1, bo.getUUomRate1());
        lqw.eq(bo.getUUomRate2() != null, EtlClnItem::getUUomRate2, bo.getUUomRate2());
        lqw.eq(bo.getUUc() != null, EtlClnItem::getUUc, bo.getUUc());
        lqw.eq(bo.getUPc() != null, EtlClnItem::getUPc, bo.getUPc());
        lqw.eq(StringUtils.isNotBlank(bo.getUBppCode()), EtlClnItem::getUBppCode, bo.getUBppCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUHierarchy2()), EtlClnItem::getUHierarchy2, bo.getUHierarchy2());
        lqw.eq(StringUtils.isNotBlank(bo.getUCarbonic()), EtlClnItem::getUCarbonic, bo.getUCarbonic());
        lqw.eq(StringUtils.isNotBlank(bo.getUAbc()), EtlClnItem::getUAbc, bo.getUAbc());
        lqw.eq(StringUtils.isNotBlank(bo.getUNew()), EtlClnItem::getUNew, bo.getUNew());
        lqw.eq(StringUtils.isNotBlank(bo.getURegion()), EtlClnItem::getURegion, bo.getURegion());
        lqw.eq(StringUtils.isNotBlank(bo.getUStatus()), EtlClnItem::getUStatus, bo.getUStatus());
        lqw.like(StringUtils.isNotBlank(bo.getUFileName()), EtlClnItem::getUFileName, bo.getUFileName());
        lqw.eq(StringUtils.isNotBlank(bo.getUEditdate()), EtlClnItem::getUEditdate, bo.getUEditdate());
        lqw.eq(StringUtils.isNotBlank(bo.getUCreatedate()), EtlClnItem::getUCreatedate, bo.getUCreatedate());
        return lqw;
    }

    /**
     * 新增物料编码
     */
    @Override
    public Boolean insertByBo(EtlClnItemBo bo) {
        EtlClnItem add = BeanUtil.toBean(bo, EtlClnItem.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setImMainInsuranceConfigId(add.getImMainInsuranceConfigId());
        }
        return flag;
    }

    /**
     * 修改物料编码
     */
    @Override
    public Boolean updateByBo(EtlClnItemBo bo) {
        EtlClnItem update = BeanUtil.toBean(bo, EtlClnItem.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(EtlClnItem entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除物料编码
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
