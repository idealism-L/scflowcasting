package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.plan.report.domain.bo.ScsFlowcastingOutputBo;
import com.plan.report.domain.vo.ScsFlowcastingOutputVo;
import com.plan.report.domain.ScsFlowcastingOutput;
import com.plan.report.mapper.ScsFlowcastingOutputMapper;
import com.plan.report.service.IScsFlowcastingOutputService;

import java.util.List;
import java.util.Map;
import java.util.Collection;

/**
 * scs_flowcasting_outputService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsFlowcastingOutputServiceImpl implements IScsFlowcastingOutputService {

    private final ScsFlowcastingOutputMapper baseMapper;

    /**
     * 查询scs_flowcasting_output
     */
    @Override
    public ScsFlowcastingOutputVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_flowcasting_output列表
     */
    @Override
    public TableDataInfo<ScsFlowcastingOutputVo> queryPageList(ScsFlowcastingOutputBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsFlowcastingOutput> lqw = buildQueryWrapper(bo);
        Page<ScsFlowcastingOutputVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_flowcasting_output列表
     */
    @Override
    public List<ScsFlowcastingOutputVo> queryList(ScsFlowcastingOutputBo bo) {
        LambdaQueryWrapper<ScsFlowcastingOutput> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsFlowcastingOutput> buildQueryWrapper(ScsFlowcastingOutputBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsFlowcastingOutput> lqw = Wrappers.lambdaQuery();
        return lqw;
    }

    /**
     * 新增scs_flowcasting_output
     */
    @Override
    public Boolean insertByBo(ScsFlowcastingOutputBo bo) {
        ScsFlowcastingOutput add = BeanUtil.toBean(bo, ScsFlowcastingOutput.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_flowcasting_output
     */
    @Override
    public Boolean updateByBo(ScsFlowcastingOutputBo bo) {
        ScsFlowcastingOutput update = BeanUtil.toBean(bo, ScsFlowcastingOutput.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsFlowcastingOutput entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_flowcasting_output
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
