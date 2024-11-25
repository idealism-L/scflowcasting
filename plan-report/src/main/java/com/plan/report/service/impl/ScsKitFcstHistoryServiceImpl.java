package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsKitFcstHistory;
import com.plan.report.domain.bo.ScsKitFcstHistoryBo;
import com.plan.report.domain.vo.ScsKitFcstHistoryVo;
import com.plan.report.mapper.ScsKitFcstHistoryMapper;
import com.plan.report.service.IScsKitFcstHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_kit_fcst_historyService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-25
 */
@RequiredArgsConstructor
@Service
public class ScsKitFcstHistoryServiceImpl implements IScsKitFcstHistoryService {

    private final ScsKitFcstHistoryMapper baseMapper;

    /**
     * 查询scs_kit_fcst_history
     */
    @Override
    public ScsKitFcstHistoryVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_kit_fcst_history列表
     */
    @Override
    public TableDataInfo<ScsKitFcstHistoryVo> queryPageList(ScsKitFcstHistoryBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsKitFcstHistory> lqw = buildQueryWrapper(bo);
        Page<ScsKitFcstHistoryVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_kit_fcst_history列表
     */
    @Override
    public List<ScsKitFcstHistoryVo> queryList(ScsKitFcstHistoryBo bo) {
        LambdaQueryWrapper<ScsKitFcstHistory> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsKitFcstHistory> buildQueryWrapper(ScsKitFcstHistoryBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsKitFcstHistory> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getParentId() != null, ScsKitFcstHistory::getParentId, bo.getParentId());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsKitFcstHistory::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCorporation()), ScsKitFcstHistory::getItemCorporation, bo.getItemCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsKitFcstHistory::getItemCode, bo.getItemCode());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), ScsKitFcstHistory::getDmdgroup, bo.getDmdgroup());
        lqw.eq(bo.getStartdate() != null, ScsKitFcstHistory::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsKitFcstHistory::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getSkuLoc()), ScsKitFcstHistory::getSkuLoc, bo.getSkuLoc());
        lqw.eq(bo.getQty() != null, ScsKitFcstHistory::getQty, bo.getQty());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), ScsKitFcstHistory::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsKitFcstHistory::getUComment, bo.getUComment());
        lqw.eq(StringUtils.isNotBlank(bo.getFileBatch()), ScsKitFcstHistory::getFileBatch, bo.getFileBatch());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsKitFcstHistory::getFileName, bo.getFileName());
        lqw.eq(bo.getEditdate() != null, ScsKitFcstHistory::getEditdate, bo.getEditdate());
        lqw.eq(bo.getVersionNo() != null, ScsKitFcstHistory::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_kit_fcst_history
     */
    @Override
    public Boolean insertByBo(ScsKitFcstHistoryBo bo) {
        ScsKitFcstHistory add = BeanUtil.toBean(bo, ScsKitFcstHistory.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_kit_fcst_history
     */
    @Override
    public Boolean updateByBo(ScsKitFcstHistoryBo bo) {
        ScsKitFcstHistory update = BeanUtil.toBean(bo, ScsKitFcstHistory.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsKitFcstHistory entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_kit_fcst_history
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
