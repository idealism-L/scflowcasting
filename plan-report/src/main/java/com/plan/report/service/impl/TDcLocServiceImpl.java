package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.TDcLoc;
import com.plan.report.domain.bo.TDcLocBo;
import com.plan.report.domain.vo.TDcLocVo;
import com.plan.report.mapper.TDcLocMapper;
import com.plan.report.service.ITDcLocService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 地点Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class TDcLocServiceImpl implements ITDcLocService {

    private final TDcLocMapper baseMapper;

    /**
     * 查询地点
     */
    @Override
    public TDcLocVo queryById(Long imMainInsuranceConfigId){
        return baseMapper.selectVoById(imMainInsuranceConfigId);
    }

    /**
     * 查询地点列表
     */
    @Override
    public TableDataInfo<TDcLocVo> queryPageList(TDcLocBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<TDcLoc> lqw = buildQueryWrapper(bo);
        Page<TDcLocVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询地点列表
     */
    @Override
    public List<TDcLocVo> queryList(TDcLocBo bo) {
        LambdaQueryWrapper<TDcLoc> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<TDcLoc> buildQueryWrapper(TDcLocBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<TDcLoc> lqw = Wrappers.lambdaQuery();
        lqw.like(StringUtils.isNotBlank(bo.getLocName()), TDcLoc::getLocName, bo.getLocName());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), TDcLoc::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), TDcLoc::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getUOu()), TDcLoc::getUOu, bo.getUOu());
        lqw.eq(StringUtils.isNotBlank(bo.getUOuDescr()), TDcLoc::getUOuDescr, bo.getUOuDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), TDcLoc::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getULocType()), TDcLoc::getULocType, bo.getULocType());
        lqw.eq(StringUtils.isNotBlank(bo.getUScmcCode()), TDcLoc::getUScmcCode, bo.getUScmcCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUCpsCode()), TDcLoc::getUCpsCode, bo.getUCpsCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUEmail()), TDcLoc::getUEmail, bo.getUEmail());
        lqw.eq(StringUtils.isNotBlank(bo.getUStatus()), TDcLoc::getUStatus, bo.getUStatus());
        return lqw;
    }

    /**
     * 新增地点
     */
    @Override
    public Boolean insertByBo(TDcLocBo bo) {
        TDcLoc add = BeanUtil.toBean(bo, TDcLoc.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setImMainInsuranceConfigId(add.getImMainInsuranceConfigId());
        }
        return flag;
    }

    /**
     * 修改地点
     */
    @Override
    public Boolean updateByBo(TDcLocBo bo) {
        TDcLoc update = BeanUtil.toBean(bo, TDcLoc.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(TDcLoc entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除地点
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
