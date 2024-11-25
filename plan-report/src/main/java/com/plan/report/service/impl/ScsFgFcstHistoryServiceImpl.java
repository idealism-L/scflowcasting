package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsFgFcstHistory;
import com.plan.report.domain.bo.ScsFgFcstHistoryBo;
import com.plan.report.domain.vo.ScsFgFcstHistoryVo;
import com.plan.report.mapper.ScsFgFcstHistoryMapper;
import com.plan.report.service.IScsFgFcstHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_fg_fcst_historyService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-25
 */
@RequiredArgsConstructor
@Service
public class ScsFgFcstHistoryServiceImpl implements IScsFgFcstHistoryService {

    private final ScsFgFcstHistoryMapper baseMapper;

    /**
     * 查询scs_fg_fcst_history
     */
    @Override
    public ScsFgFcstHistoryVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_fg_fcst_history列表
     */
    @Override
    public TableDataInfo<ScsFgFcstHistoryVo> queryPageList(ScsFgFcstHistoryBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsFgFcstHistory> lqw = buildQueryWrapper(bo);
        Page<ScsFgFcstHistoryVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_fg_fcst_history列表
     */
    @Override
    public List<ScsFgFcstHistoryVo> queryList(ScsFgFcstHistoryBo bo) {
        LambdaQueryWrapper<ScsFgFcstHistory> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsFgFcstHistory> buildQueryWrapper(ScsFgFcstHistoryBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsFgFcstHistory> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getParentId() != null, ScsFgFcstHistory::getParentId, bo.getParentId());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsFgFcstHistory::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCorporation()), ScsFgFcstHistory::getItemCorporation, bo.getItemCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsFgFcstHistory::getItemCode, bo.getItemCode());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), ScsFgFcstHistory::getDmdgroup, bo.getDmdgroup());
        lqw.eq(bo.getStartdate() != null, ScsFgFcstHistory::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsFgFcstHistory::getLoc, bo.getLoc());
        lqw.eq(bo.getQty() != null, ScsFgFcstHistory::getQty, bo.getQty());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), ScsFgFcstHistory::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsFgFcstHistory::getUComment, bo.getUComment());
        lqw.eq(StringUtils.isNotBlank(bo.getFileBatch()), ScsFgFcstHistory::getFileBatch, bo.getFileBatch());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsFgFcstHistory::getFileName, bo.getFileName());
        lqw.eq(bo.getEditdate() != null, ScsFgFcstHistory::getEditdate, bo.getEditdate());
        lqw.eq(bo.getVersionNo() != null, ScsFgFcstHistory::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_fg_fcst_history
     */
    @Override
    public Boolean insertByBo(ScsFgFcstHistoryBo bo) {
        ScsFgFcstHistory add = BeanUtil.toBean(bo, ScsFgFcstHistory.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_fg_fcst_history
     */
    @Override
    public Boolean updateByBo(ScsFgFcstHistoryBo bo) {
        ScsFgFcstHistory update = BeanUtil.toBean(bo, ScsFgFcstHistory.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsFgFcstHistory entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_fg_fcst_history
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
