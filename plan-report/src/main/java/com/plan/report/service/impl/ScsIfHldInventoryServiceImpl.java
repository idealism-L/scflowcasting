package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsIfHldInventory;
import com.plan.report.domain.bo.ScsIfHldInventoryBo;
import com.plan.report.domain.vo.ScsIfHldInventoryVo;
import com.plan.report.mapper.ScsIfHldInventoryMapper;
import com.plan.report.service.IScsIfHldInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_if_hld_inventoryService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsIfHldInventoryServiceImpl implements IScsIfHldInventoryService {

    private final ScsIfHldInventoryMapper baseMapper;

    /**
     * 查询scs_if_hld_inventory
     */
    @Override
    public ScsIfHldInventoryVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_if_hld_inventory列表
     */
    @Override
    public TableDataInfo<ScsIfHldInventoryVo> queryPageList(ScsIfHldInventoryBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsIfHldInventory> lqw = buildQueryWrapper(bo);
        Page<ScsIfHldInventoryVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_if_hld_inventory列表
     */
    @Override
    public List<ScsIfHldInventoryVo> queryList(ScsIfHldInventoryBo bo) {
        LambdaQueryWrapper<ScsIfHldInventory> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsIfHldInventory> buildQueryWrapper(ScsIfHldInventoryBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsIfHldInventory> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), ScsIfHldInventory::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsIfHldInventory::getLoc, bo.getLoc());
        lqw.eq(bo.getAvaildate() != null, ScsIfHldInventory::getAvaildate, bo.getAvaildate());
        lqw.eq(bo.getQty() != null, ScsIfHldInventory::getQty, bo.getQty());
        lqw.eq(bo.getExpdate() != null, ScsIfHldInventory::getExpdate, bo.getExpdate());
        lqw.eq(StringUtils.isNotBlank(bo.getProject()), ScsIfHldInventory::getProject, bo.getProject());
        lqw.eq(StringUtils.isNotBlank(bo.getStore()), ScsIfHldInventory::getStore, bo.getStore());
        lqw.eq(bo.getUFlag() != null, ScsIfHldInventory::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsIfHldInventory::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), ScsIfHldInventory::getUFilename, bo.getUFilename());
        lqw.eq(bo.getUEditdate() != null, ScsIfHldInventory::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增scs_if_hld_inventory
     */
    @Override
    public Boolean insertByBo(ScsIfHldInventoryBo bo) {
        ScsIfHldInventory add = BeanUtil.toBean(bo, ScsIfHldInventory.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_if_hld_inventory
     */
    @Override
    public Boolean updateByBo(ScsIfHldInventoryBo bo) {
        ScsIfHldInventory update = BeanUtil.toBean(bo, ScsIfHldInventory.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsIfHldInventory entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_if_hld_inventory
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
