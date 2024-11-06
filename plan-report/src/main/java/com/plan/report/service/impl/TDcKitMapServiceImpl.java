package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.TDcKitMap;
import com.plan.report.domain.bo.TDcKitMapBo;
import com.plan.report.domain.vo.TDcKitMapVo;
import com.plan.report.mapper.TDcKitMapMapper;
import com.plan.report.service.ITDcKitMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 溶剂映射Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class TDcKitMapServiceImpl implements ITDcKitMapService {

    private final TDcKitMapMapper baseMapper;

    /**
     * 查询溶剂映射
     */
    @Override
    public TDcKitMapVo queryById(Long imMainInsuranceConfigId){
        return baseMapper.selectVoById(imMainInsuranceConfigId);
    }

    /**
     * 查询溶剂映射列表
     */
    @Override
    public TableDataInfo<TDcKitMapVo> queryPageList(TDcKitMapBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<TDcKitMap> lqw = buildQueryWrapper(bo);
        Page<TDcKitMapVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询溶剂映射列表
     */
    @Override
    public List<TDcKitMapVo> queryList(TDcKitMapBo bo) {
        LambdaQueryWrapper<TDcKitMap> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<TDcKitMap> buildQueryWrapper(TDcKitMapBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<TDcKitMap> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), TDcKitMap::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), TDcKitMap::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getItemDescr()), TDcKitMap::getItemDescr, bo.getItemDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), TDcKitMap::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getLocDescr()), TDcKitMap::getLocDescr, bo.getLocDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getKitCode()), TDcKitMap::getKitCode, bo.getKitCode());
        lqw.eq(StringUtils.isNotBlank(bo.getKitDescr()), TDcKitMap::getKitDescr, bo.getKitDescr());
        lqw.eq(bo.getConvfactor() != null, TDcKitMap::getConvfactor, bo.getConvfactor());
        lqw.eq(StringUtils.isNotBlank(bo.getProductHierarchy()), TDcKitMap::getProductHierarchy, bo.getProductHierarchy());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), TDcKitMap::getUComment, bo.getUComment());
        return lqw;
    }

    /**
     * 新增溶剂映射
     */
    @Override
    public Boolean insertByBo(TDcKitMapBo bo) {
        TDcKitMap add = BeanUtil.toBean(bo, TDcKitMap.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setImMainInsuranceConfigId(add.getImMainInsuranceConfigId());
        }
        return flag;
    }

    /**
     * 修改溶剂映射
     */
    @Override
    public Boolean updateByBo(TDcKitMapBo bo) {
        TDcKitMap update = BeanUtil.toBean(bo, TDcKitMap.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(TDcKitMap entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除溶剂映射
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
