package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsIfClnItem;
import com.plan.report.domain.bo.ScsIfClnItemBo;
import com.plan.report.domain.vo.ScsIfClnItemVo;
import com.plan.report.mapper.ScsIfClnItemMapper;
import com.plan.report.service.IScsIfClnItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_if_cln_itemService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsIfClnItemServiceImpl implements IScsIfClnItemService {

    private final ScsIfClnItemMapper baseMapper;

    /**
     * 查询scs_if_cln_item
     */
    @Override
    public ScsIfClnItemVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_if_cln_item列表
     */
    @Override
    public TableDataInfo<ScsIfClnItemVo> queryPageList(ScsIfClnItemBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsIfClnItem> lqw = buildQueryWrapper(bo);
        Page<ScsIfClnItemVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_if_cln_item列表
     */
    @Override
    public List<ScsIfClnItemVo> queryList(ScsIfClnItemBo bo) {
        LambdaQueryWrapper<ScsIfClnItem> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsIfClnItem> buildQueryWrapper(ScsIfClnItemBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsIfClnItem> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), ScsIfClnItem::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), ScsIfClnItem::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUDescrEn()), ScsIfClnItem::getUDescrEn, bo.getUDescrEn());
        lqw.eq(StringUtils.isNotBlank(bo.getUDescrShort()), ScsIfClnItem::getUDescrShort, bo.getUDescrShort());
        lqw.eq(StringUtils.isNotBlank(bo.getUCategory()), ScsIfClnItem::getUCategory, bo.getUCategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUCategoryDescr()), ScsIfClnItem::getUCategoryDescr, bo.getUCategoryDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubcategory()), ScsIfClnItem::getUSubcategory, bo.getUSubcategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubcategoryDescr()), ScsIfClnItem::getUSubcategoryDescr, bo.getUSubcategoryDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUBrand()), ScsIfClnItem::getUBrand, bo.getUBrand());
        lqw.eq(StringUtils.isNotBlank(bo.getUBrandDescr()), ScsIfClnItem::getUBrandDescr, bo.getUBrandDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlavor()), ScsIfClnItem::getUFlavor, bo.getUFlavor());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlavorDescr()), ScsIfClnItem::getUFlavorDescr, bo.getUFlavorDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackage()), ScsIfClnItem::getUPackage, bo.getUPackage());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackageDescr()), ScsIfClnItem::getUPackageDescr, bo.getUPackageDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubflavor()), ScsIfClnItem::getUSubflavor, bo.getUSubflavor());
        lqw.eq(StringUtils.isNotBlank(bo.getUSubflavorDescr()), ScsIfClnItem::getUSubflavorDescr, bo.getUSubflavorDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackageCap()), ScsIfClnItem::getUPackageCap, bo.getUPackageCap());
        lqw.eq(StringUtils.isNotBlank(bo.getUPackageCapDescr()), ScsIfClnItem::getUPackageCapDescr, bo.getUPackageCapDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUScclCode()), ScsIfClnItem::getUScclCode, bo.getUScclCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUCblCode()), ScsIfClnItem::getUCblCode, bo.getUCblCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUZhCode()), ScsIfClnItem::getUZhCode, bo.getUZhCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUFamily()), ScsIfClnItem::getUFamily, bo.getUFamily());
        lqw.eq(StringUtils.isNotBlank(bo.getUSpec()), ScsIfClnItem::getUSpec, bo.getUSpec());
        lqw.eq(StringUtils.isNotBlank(bo.getUSpecDescr()), ScsIfClnItem::getUSpecDescr, bo.getUSpecDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), ScsIfClnItem::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), ScsIfClnItem::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getUFruitCategory()), ScsIfClnItem::getUFruitCategory, bo.getUFruitCategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUUom()), ScsIfClnItem::getUUom, bo.getUUom());
        lqw.eq(bo.getUUomRate1() != null, ScsIfClnItem::getUUomRate1, bo.getUUomRate1());
        lqw.eq(bo.getUUomRate2() != null, ScsIfClnItem::getUUomRate2, bo.getUUomRate2());
        lqw.eq(bo.getUUc() != null, ScsIfClnItem::getUUc, bo.getUUc());
        lqw.eq(bo.getUPc() != null, ScsIfClnItem::getUPc, bo.getUPc());
        lqw.eq(StringUtils.isNotBlank(bo.getUBppCode()), ScsIfClnItem::getUBppCode, bo.getUBppCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUHierarchy2()), ScsIfClnItem::getUHierarchy2, bo.getUHierarchy2());
        lqw.eq(StringUtils.isNotBlank(bo.getUCarbonic()), ScsIfClnItem::getUCarbonic, bo.getUCarbonic());
        lqw.eq(StringUtils.isNotBlank(bo.getUAbc()), ScsIfClnItem::getUAbc, bo.getUAbc());
        lqw.eq(StringUtils.isNotBlank(bo.getUNew()), ScsIfClnItem::getUNew, bo.getUNew());
        lqw.eq(StringUtils.isNotBlank(bo.getURegion()), ScsIfClnItem::getURegion, bo.getURegion());
        lqw.eq(StringUtils.isNotBlank(bo.getUStatus()), ScsIfClnItem::getUStatus, bo.getUStatus());
        lqw.like(StringUtils.isNotBlank(bo.getUFileName()), ScsIfClnItem::getUFileName, bo.getUFileName());
        lqw.eq(bo.getUEditdate() != null, ScsIfClnItem::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增scs_if_cln_item
     */
    @Override
    public Boolean insertByBo(ScsIfClnItemBo bo) {
        ScsIfClnItem add = BeanUtil.toBean(bo, ScsIfClnItem.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_if_cln_item
     */
    @Override
    public Boolean updateByBo(ScsIfClnItemBo bo) {
        ScsIfClnItem update = BeanUtil.toBean(bo, ScsIfClnItem.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsIfClnItem entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_if_cln_item
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
