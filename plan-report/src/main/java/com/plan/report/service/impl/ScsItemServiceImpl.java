package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsItem;
import com.plan.report.domain.bo.ScsItemBo;
import com.plan.report.domain.vo.ScsItemVo;
import com.plan.report.mapper.ScsItemMapper;
import com.plan.report.service.IScsItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_itemService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-15
 */
@RequiredArgsConstructor
@Service
public class ScsItemServiceImpl implements IScsItemService {

    private final ScsItemMapper baseMapper;

    /**
     * 查询scs_item
     */
    @Override
    public ScsItemVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_item列表
     */
    @Override
    public TableDataInfo<ScsItemVo> queryPageList(ScsItemBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsItem> lqw = buildQueryWrapper(bo);
        Page<ScsItemVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_item列表
     */
    @Override
    public List<ScsItemVo> queryList(ScsItemBo bo) {
        LambdaQueryWrapper<ScsItem> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsItem> buildQueryWrapper(ScsItemBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsItem> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), ScsItem::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsItem::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItemPattern()), ScsItem::getItemPattern, bo.getItemPattern());
        // lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsItem::getItemCode, bo.getItemCode());
        // 物料编码模糊查询
        lqw.like(StringUtils.isNotBlank(bo.getItemCode()), ScsItem::getItemCode, bo.getItemCode());
        // lqw.eq(StringUtils.isNotBlank(bo.getDescr()), ScsItem::getDescr, bo.getDescr());
        // 物料描述模糊查询
        lqw.like(StringUtils.isNotBlank(bo.getDescr()), ScsItem::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getDescrEn()), ScsItem::getDescrEn, bo.getDescrEn());
        lqw.eq(StringUtils.isNotBlank(bo.getDescrShort()), ScsItem::getDescrShort, bo.getDescrShort());
        lqw.eq(StringUtils.isNotBlank(bo.getCategory()), ScsItem::getCategory, bo.getCategory());
        lqw.eq(StringUtils.isNotBlank(bo.getCategoryDescr()), ScsItem::getCategoryDescr, bo.getCategoryDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getSubcategory()), ScsItem::getSubcategory, bo.getSubcategory());
        lqw.eq(StringUtils.isNotBlank(bo.getSubcategoryDescr()), ScsItem::getSubcategoryDescr, bo.getSubcategoryDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getBrand()), ScsItem::getBrand, bo.getBrand());
        lqw.eq(StringUtils.isNotBlank(bo.getBrandDescr()), ScsItem::getBrandDescr, bo.getBrandDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getFlavor()), ScsItem::getFlavor, bo.getFlavor());
        lqw.eq(StringUtils.isNotBlank(bo.getFlavorDescr()), ScsItem::getFlavorDescr, bo.getFlavorDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getPackageCode()), ScsItem::getPackageCode, bo.getPackageCode());
        lqw.eq(StringUtils.isNotBlank(bo.getPackageDescr()), ScsItem::getPackageDescr, bo.getPackageDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getSubflavor()), ScsItem::getSubflavor, bo.getSubflavor());
        lqw.eq(StringUtils.isNotBlank(bo.getSubflavorDescr()), ScsItem::getSubflavorDescr, bo.getSubflavorDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getPackageCap()), ScsItem::getPackageCap, bo.getPackageCap());
        lqw.eq(StringUtils.isNotBlank(bo.getPackageCapDescr()), ScsItem::getPackageCapDescr, bo.getPackageCapDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getScclCode()), ScsItem::getScclCode, bo.getScclCode());
        lqw.eq(StringUtils.isNotBlank(bo.getCblCode()), ScsItem::getCblCode, bo.getCblCode());
        lqw.eq(StringUtils.isNotBlank(bo.getZhCode()), ScsItem::getZhCode, bo.getZhCode());
        lqw.eq(StringUtils.isNotBlank(bo.getFamily()), ScsItem::getFamily, bo.getFamily());
        lqw.eq(StringUtils.isNotBlank(bo.getSpec()), ScsItem::getSpec, bo.getSpec());
        lqw.eq(StringUtils.isNotBlank(bo.getSpecDescr()), ScsItem::getSpecDescr, bo.getSpecDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getFruitCategory()), ScsItem::getFruitCategory, bo.getFruitCategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUom()), ScsItem::getUom, bo.getUom());
        lqw.eq(bo.getUomRate1() != null, ScsItem::getUomRate1, bo.getUomRate1());
        lqw.eq(bo.getUomRate2() != null, ScsItem::getUomRate2, bo.getUomRate2());
        lqw.eq(bo.getUc() != null, ScsItem::getUc, bo.getUc());
        lqw.eq(bo.getPc() != null, ScsItem::getPc, bo.getPc());
        lqw.eq(StringUtils.isNotBlank(bo.getBppCode()), ScsItem::getBppCode, bo.getBppCode());
        lqw.eq(StringUtils.isNotBlank(bo.getHierarchy2()), ScsItem::getHierarchy2, bo.getHierarchy2());
        lqw.eq(StringUtils.isNotBlank(bo.getCarbonic()), ScsItem::getCarbonic, bo.getCarbonic());
        lqw.eq(StringUtils.isNotBlank(bo.getAbc()), ScsItem::getAbc, bo.getAbc());
        lqw.eq(StringUtils.isNotBlank(bo.getUNew()), ScsItem::getUNew, bo.getUNew());
        lqw.eq(StringUtils.isNotBlank(bo.getRegion()), ScsItem::getRegion, bo.getRegion());
        lqw.eq(StringUtils.isNotBlank(bo.getStatus()), ScsItem::getStatus, bo.getStatus());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsItem::getFileName, bo.getFileName());
        lqw.eq(bo.getVersionNo() != null, ScsItem::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_item
     */
    @Override
    public Boolean insertByBo(ScsItemBo bo) {
        ScsItem add = BeanUtil.toBean(bo, ScsItem.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_item
     */
    @Override
    public Boolean updateByBo(ScsItemBo bo) {
        ScsItem update = BeanUtil.toBean(bo, ScsItem.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsItem entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_item
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
