package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.EtlHldInventory;
import com.plan.report.domain.bo.EtlHldInventoryBo;
import com.plan.report.domain.vo.EtlHldInventoryVo;
import com.plan.report.mapper.EtlHldInventoryMapper;
import com.plan.report.service.IEtlHldInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 库存Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class EtlHldInventoryServiceImpl implements IEtlHldInventoryService {

    private final EtlHldInventoryMapper baseMapper;

    /**
     * 查询库存
     */
    @Override
    public EtlHldInventoryVo queryById(Long imMainInsuranceConfigId){
        return baseMapper.selectVoById(imMainInsuranceConfigId);
    }

    /**
     * 查询库存列表
     */
    @Override
    public TableDataInfo<EtlHldInventoryVo> queryPageList(EtlHldInventoryBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<EtlHldInventory> lqw = buildQueryWrapper(bo);
        Page<EtlHldInventoryVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询库存列表
     */
    @Override
    public List<EtlHldInventoryVo> queryList(EtlHldInventoryBo bo) {
        LambdaQueryWrapper<EtlHldInventory> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<EtlHldInventory> buildQueryWrapper(EtlHldInventoryBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<EtlHldInventory> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), EtlHldInventory::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), EtlHldInventory::getLoc, bo.getLoc());
        lqw.eq(bo.getAvaildate() != null, EtlHldInventory::getAvaildate, bo.getAvaildate());
        lqw.eq(bo.getQty() != null, EtlHldInventory::getQty, bo.getQty());
        lqw.eq(bo.getExpdate() != null, EtlHldInventory::getExpdate, bo.getExpdate());
        lqw.eq(StringUtils.isNotBlank(bo.getProject()), EtlHldInventory::getProject, bo.getProject());
        lqw.eq(StringUtils.isNotBlank(bo.getStore()), EtlHldInventory::getStore, bo.getStore());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), EtlHldInventory::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), EtlHldInventory::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), EtlHldInventory::getUFilename, bo.getUFilename());
        lqw.eq(StringUtils.isNotBlank(bo.getUEditdate()), EtlHldInventory::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增库存
     */
    @Override
    public Boolean insertByBo(EtlHldInventoryBo bo) {
        EtlHldInventory add = BeanUtil.toBean(bo, EtlHldInventory.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setImMainInsuranceConfigId(add.getImMainInsuranceConfigId());
        }
        return flag;
    }

    /**
     * 修改库存
     */
    @Override
    public Boolean updateByBo(EtlHldInventoryBo bo) {
        EtlHldInventory update = BeanUtil.toBean(bo, EtlHldInventory.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(EtlHldInventory entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除库存
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
