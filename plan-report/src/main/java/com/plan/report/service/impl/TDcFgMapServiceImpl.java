package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.TDcFgMap;
import com.plan.report.domain.bo.TDcFgMapBo;
import com.plan.report.domain.vo.TDcFgMapVo;
import com.plan.report.mapper.TDcFgMapMapper;
import com.plan.report.service.ITDcFgMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 成品映射Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class TDcFgMapServiceImpl implements ITDcFgMapService {

    private final TDcFgMapMapper baseMapper;

    /**
     * 查询成品映射
     */
    @Override
    public TDcFgMapVo queryById(Long imMainInsuranceConfigId){
        return baseMapper.selectVoById(imMainInsuranceConfigId);
    }

    /**
     * 查询成品映射列表
     */
    @Override
    public TableDataInfo<TDcFgMapVo> queryPageList(TDcFgMapBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<TDcFgMap> lqw = buildQueryWrapper(bo);
        Page<TDcFgMapVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询成品映射列表
     */
    @Override
    public List<TDcFgMapVo> queryList(TDcFgMapBo bo) {
        LambdaQueryWrapper<TDcFgMap> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<TDcFgMap> buildQueryWrapper(TDcFgMapBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<TDcFgMap> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), TDcFgMap::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), TDcFgMap::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getItemDescr()), TDcFgMap::getItemDescr, bo.getItemDescr());
        lqw.eq(bo.getConvfactor() != null, TDcFgMap::getConvfactor, bo.getConvfactor());
        lqw.eq(StringUtils.isNotBlank(bo.getKitCode()), TDcFgMap::getKitCode, bo.getKitCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), TDcFgMap::getUComment, bo.getUComment());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), TDcFgMap::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getKeyProductionFlag()), TDcFgMap::getKeyProductionFlag, bo.getKeyProductionFlag());
        return lqw;
    }

    /**
     * 新增成品映射
     */
    @Override
    public Boolean insertByBo(TDcFgMapBo bo) {
        TDcFgMap add = BeanUtil.toBean(bo, TDcFgMap.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setImMainInsuranceConfigId(add.getImMainInsuranceConfigId());
        }
        return flag;
    }

    /**
     * 修改成品映射
     */
    @Override
    public Boolean updateByBo(TDcFgMapBo bo) {
        TDcFgMap update = BeanUtil.toBean(bo, TDcFgMap.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(TDcFgMap entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除成品映射
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
