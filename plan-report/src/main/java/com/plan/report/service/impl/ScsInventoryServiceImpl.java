package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsInventory;
import com.plan.report.domain.bo.ScsInventoryBo;
import com.plan.report.domain.vo.ScsInventoryVo;
import com.plan.report.mapper.ScsInventoryMapper;
import com.plan.report.service.IScsInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_inventoryService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-20
 */
@RequiredArgsConstructor
@Service
public class ScsInventoryServiceImpl implements IScsInventoryService {

    private final ScsInventoryMapper baseMapper;

    /**
     * 查询scs_inventory
     */
    @Override
    public ScsInventoryVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_inventory列表
     */
    @Override
    public TableDataInfo<ScsInventoryVo> queryPageList(ScsInventoryBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsInventory> lqw = buildQueryWrapper(bo);
        Page<ScsInventoryVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_inventory列表
     */
    @Override
    public List<ScsInventoryVo> queryList(ScsInventoryBo bo) {
        LambdaQueryWrapper<ScsInventory> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsInventory> buildQueryWrapper(ScsInventoryBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsInventory> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getParentId() != null, ScsInventory::getParentId, bo.getParentId());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsInventory::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getKitCorporation()), ScsInventory::getKitCorporation, bo.getKitCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsInventory::getItemCode, bo.getItemCode());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), ScsInventory::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getDescrEn()), ScsInventory::getDescrEn, bo.getDescrEn());
        lqw.eq(StringUtils.isNotBlank(bo.getBppBrand()), ScsInventory::getBppBrand, bo.getBppBrand());
        lqw.eq(StringUtils.isNotBlank(bo.getBppFlavor()), ScsInventory::getBppFlavor, bo.getBppFlavor());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsInventory::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getLocOwnCode()), ScsInventory::getLocOwnCode, bo.getLocOwnCode());
        lqw.eq(bo.getAvaildate() != null, ScsInventory::getAvaildate, bo.getAvaildate());
        lqw.eq(StringUtils.isNotBlank(bo.getScclItemCode()), ScsInventory::getScclItemCode, bo.getScclItemCode());
        lqw.eq(bo.getQty() != null, ScsInventory::getQty, bo.getQty());
        lqw.eq(bo.getExpdate() != null, ScsInventory::getExpdate, bo.getExpdate());
        lqw.eq(StringUtils.isNotBlank(bo.getItemPattern()), ScsInventory::getItemPattern, bo.getItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), ScsInventory::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsInventory::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsInventory::getFileName, bo.getFileName());
        lqw.eq(bo.getEditdate() != null, ScsInventory::getEditdate, bo.getEditdate());
        lqw.eq(bo.getVersionNo() != null, ScsInventory::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_inventory
     */
    @Override
    public Boolean insertByBo(ScsInventoryBo bo) {
        ScsInventory add = BeanUtil.toBean(bo, ScsInventory.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_inventory
     */
    @Override
    public Boolean updateByBo(ScsInventoryBo bo) {
        ScsInventory update = BeanUtil.toBean(bo, ScsInventory.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsInventory entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_inventory
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
