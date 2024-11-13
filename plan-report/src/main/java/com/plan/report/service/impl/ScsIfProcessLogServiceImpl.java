package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsIfProcessLog;
import com.plan.report.domain.bo.ScsIfProcessLogBo;
import com.plan.report.domain.vo.ScsIfProcessLogVo;
import com.plan.report.mapper.ScsIfProcessLogMapper;
import com.plan.report.service.IScsIfProcessLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_if_process_logService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-13
 */
@RequiredArgsConstructor
@Service
public class ScsIfProcessLogServiceImpl implements IScsIfProcessLogService {

    private final ScsIfProcessLogMapper baseMapper;

    /**
     * 查询scs_if_process_log
     */
    @Override
    public ScsIfProcessLogVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_if_process_log列表
     */
    @Override
    public TableDataInfo<ScsIfProcessLogVo> queryPageList(ScsIfProcessLogBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsIfProcessLog> lqw = buildQueryWrapper(bo);
        Page<ScsIfProcessLogVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_if_process_log列表
     */
    @Override
    public List<ScsIfProcessLogVo> queryList(ScsIfProcessLogBo bo) {
        LambdaQueryWrapper<ScsIfProcessLog> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsIfProcessLog> buildQueryWrapper(ScsIfProcessLogBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsIfProcessLog> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getFileTime() != null, ScsIfProcessLog::getFileTime, bo.getFileTime());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsIfProcessLog::getFileName, bo.getFileName());
        lqw.like(StringUtils.isNotBlank(bo.getEtlTableName()), ScsIfProcessLog::getEtlTableName, bo.getEtlTableName());
        lqw.eq(StringUtils.isNotBlank(bo.getItemPattern()), ScsIfProcessLog::getItemPattern, bo.getItemPattern());
        return lqw;
    }

    /**
     * 新增scs_if_process_log
     */
    @Override
    public Boolean insertByBo(ScsIfProcessLogBo bo) {
        ScsIfProcessLog add = BeanUtil.toBean(bo, ScsIfProcessLog.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_if_process_log
     */
    @Override
    public Boolean updateByBo(ScsIfProcessLogBo bo) {
        ScsIfProcessLog update = BeanUtil.toBean(bo, ScsIfProcessLog.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsIfProcessLog entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_if_process_log
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
