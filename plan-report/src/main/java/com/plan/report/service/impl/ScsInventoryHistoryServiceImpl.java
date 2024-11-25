package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsInventoryHistory;
import com.plan.report.domain.bo.ScsInventoryHistoryBo;
import com.plan.report.domain.vo.ScsInventoryHistoryVo;
import com.plan.report.mapper.ScsInventoryHistoryMapper;
import com.plan.report.service.IScsInventoryHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_inventory_historyService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-25
 */
@RequiredArgsConstructor
@Service
public class ScsInventoryHistoryServiceImpl implements IScsInventoryHistoryService {

    private final ScsInventoryHistoryMapper baseMapper;

    /**
     * 查询scs_inventory_history
     */
    @Override
    public ScsInventoryHistoryVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_inventory_history列表
     */
    @Override
    public TableDataInfo<ScsInventoryHistoryVo> queryPageList(ScsInventoryHistoryBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsInventoryHistory> lqw = buildQueryWrapper(bo);
        Page<ScsInventoryHistoryVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_inventory_history列表
     */
    @Override
    public List<ScsInventoryHistoryVo> queryList(ScsInventoryHistoryBo bo) {
        LambdaQueryWrapper<ScsInventoryHistory> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsInventoryHistory> buildQueryWrapper(ScsInventoryHistoryBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsInventoryHistory> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getParentId() != null, ScsInventoryHistory::getParentId, bo.getParentId());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsInventoryHistory::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCorporation()), ScsInventoryHistory::getItemCorporation, bo.getItemCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsInventoryHistory::getItemCode, bo.getItemCode());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), ScsInventoryHistory::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getDescrEn()), ScsInventoryHistory::getDescrEn, bo.getDescrEn());
        lqw.eq(StringUtils.isNotBlank(bo.getBppBrand()), ScsInventoryHistory::getBppBrand, bo.getBppBrand());
        lqw.eq(StringUtils.isNotBlank(bo.getBppFlavor()), ScsInventoryHistory::getBppFlavor, bo.getBppFlavor());
        lqw.eq(StringUtils.isNotBlank(bo.getFileBatch()), ScsInventoryHistory::getFileBatch, bo.getFileBatch());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsInventoryHistory::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getLocOwnCode()), ScsInventoryHistory::getLocOwnCode, bo.getLocOwnCode());
        lqw.eq(bo.getAvaildate() != null, ScsInventoryHistory::getAvaildate, bo.getAvaildate());
        lqw.eq(StringUtils.isNotBlank(bo.getScclItemCode()), ScsInventoryHistory::getScclItemCode, bo.getScclItemCode());
        lqw.eq(bo.getQty() != null, ScsInventoryHistory::getQty, bo.getQty());
        lqw.eq(bo.getExpdate() != null, ScsInventoryHistory::getExpdate, bo.getExpdate());
        lqw.eq(StringUtils.isNotBlank(bo.getItemPattern()), ScsInventoryHistory::getItemPattern, bo.getItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), ScsInventoryHistory::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsInventoryHistory::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsInventoryHistory::getFileName, bo.getFileName());
        lqw.eq(bo.getEditdate() != null, ScsInventoryHistory::getEditdate, bo.getEditdate());
        lqw.eq(bo.getVersionNo() != null, ScsInventoryHistory::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_inventory_history
     */
    @Override
    public Boolean insertByBo(ScsInventoryHistoryBo bo) {
        ScsInventoryHistory add = BeanUtil.toBean(bo, ScsInventoryHistory.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_inventory_history
     */
    @Override
    public Boolean updateByBo(ScsInventoryHistoryBo bo) {
        ScsInventoryHistory update = BeanUtil.toBean(bo, ScsInventoryHistory.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsInventoryHistory entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_inventory_history
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
