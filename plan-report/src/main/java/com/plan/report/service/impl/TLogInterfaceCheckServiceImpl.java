package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.TLogInterfaceCheck;
import com.plan.report.domain.bo.TLogInterfaceCheckBo;
import com.plan.report.domain.vo.TLogInterfaceCheckVo;
import com.plan.report.mapper.TLogInterfaceCheckMapper;
import com.plan.report.service.ITLogInterfaceCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 预测接口检查Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class TLogInterfaceCheckServiceImpl implements ITLogInterfaceCheckService {

    private final TLogInterfaceCheckMapper baseMapper;

    /**
     * 查询预测接口检查
     */
    @Override
    public TLogInterfaceCheckVo queryById(Long imMainInsuranceConfigId){
        return baseMapper.selectVoById(imMainInsuranceConfigId);
    }

    /**
     * 查询预测接口检查列表
     */
    @Override
    public TableDataInfo<TLogInterfaceCheckVo> queryPageList(TLogInterfaceCheckBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<TLogInterfaceCheck> lqw = buildQueryWrapper(bo);
        Page<TLogInterfaceCheckVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询预测接口检查列表
     */
    @Override
    public List<TLogInterfaceCheckVo> queryList(TLogInterfaceCheckBo bo) {
        LambdaQueryWrapper<TLogInterfaceCheck> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<TLogInterfaceCheck> buildQueryWrapper(TLogInterfaceCheckBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<TLogInterfaceCheck> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getFileTime() != null, TLogInterfaceCheck::getFileTime, bo.getFileTime());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), TLogInterfaceCheck::getFileName, bo.getFileName());
        return lqw;
    }

    /**
     * 新增预测接口检查
     */
    @Override
    public Boolean insertByBo(TLogInterfaceCheckBo bo) {
        TLogInterfaceCheck add = BeanUtil.toBean(bo, TLogInterfaceCheck.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setImMainInsuranceConfigId(add.getImMainInsuranceConfigId());
        }
        return flag;
    }

    /**
     * 修改预测接口检查
     */
    @Override
    public Boolean updateByBo(TLogInterfaceCheckBo bo) {
        TLogInterfaceCheck update = BeanUtil.toBean(bo, TLogInterfaceCheck.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(TLogInterfaceCheck entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除预测接口检查
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
