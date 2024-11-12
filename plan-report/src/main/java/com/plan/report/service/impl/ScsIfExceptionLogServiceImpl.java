package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsIfExceptionLog;
import com.plan.report.domain.bo.ScsIfExceptionLogBo;
import com.plan.report.domain.vo.ScsIfExceptionLogVo;
import com.plan.report.mapper.ScsIfExceptionLogMapper;
import com.plan.report.service.IScsIfExceptionLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_if_exception_logService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsIfExceptionLogServiceImpl implements IScsIfExceptionLogService {

    private final ScsIfExceptionLogMapper baseMapper;

    /**
     * 查询scs_if_exception_log
     */
    @Override
    public ScsIfExceptionLogVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_if_exception_log列表
     */
    @Override
    public TableDataInfo<ScsIfExceptionLogVo> queryPageList(ScsIfExceptionLogBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsIfExceptionLog> lqw = buildQueryWrapper(bo);
        Page<ScsIfExceptionLogVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_if_exception_log列表
     */
    @Override
    public List<ScsIfExceptionLogVo> queryList(ScsIfExceptionLogBo bo) {
        LambdaQueryWrapper<ScsIfExceptionLog> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsIfExceptionLog> buildQueryWrapper(ScsIfExceptionLogBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsIfExceptionLog> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsIfExceptionLog::getCorporation, bo.getCorporation());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsIfExceptionLog::getFileName, bo.getFileName());
        lqw.like(StringUtils.isNotBlank(bo.getEtlTableName()), ScsIfExceptionLog::getEtlTableName, bo.getEtlTableName());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), ScsIfExceptionLog::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsIfExceptionLog::getItemCode, bo.getItemCode());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsIfExceptionLog::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getLocOwnCode()), ScsIfExceptionLog::getLocOwnCode, bo.getLocOwnCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsIfExceptionLog::getUComment, bo.getUComment());
        return lqw;
    }

    /**
     * 新增scs_if_exception_log
     */
    @Override
    public Boolean insertByBo(ScsIfExceptionLogBo bo) {
        ScsIfExceptionLog add = BeanUtil.toBean(bo, ScsIfExceptionLog.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_if_exception_log
     */
    @Override
    public Boolean updateByBo(ScsIfExceptionLogBo bo) {
        ScsIfExceptionLog update = BeanUtil.toBean(bo, ScsIfExceptionLog.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsIfExceptionLog entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_if_exception_log
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
