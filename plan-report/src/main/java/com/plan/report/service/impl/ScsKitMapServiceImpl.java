package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsKitMap;
import com.plan.report.domain.bo.ScsKitMapBo;
import com.plan.report.domain.vo.ScsKitMapVo;
import com.plan.report.mapper.ScsKitMapMapper;
import com.plan.report.service.IScsKitMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_kit_mapService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsKitMapServiceImpl implements IScsKitMapService {

    private final ScsKitMapMapper baseMapper;

    /**
     * 查询scs_kit_map
     */
    @Override
    public ScsKitMapVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_kit_map列表
     */
    @Override
    public TableDataInfo<ScsKitMapVo> queryPageList(ScsKitMapBo bo, PageQuery pageQuery) {
        // LambdaQueryWrapper<ScsKitMap> lqw = buildQueryWrapper(bo);
        Page<ScsKitMapVo> result = baseMapper.selectListVoPage(pageQuery.build(), bo);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_kit_map列表
     */
    @Override
    public List<ScsKitMapVo> queryList(ScsKitMapBo bo) {
        // LambdaQueryWrapper<ScsKitMap> lqw = buildQueryWrapper(bo);
        return baseMapper.selectListVo(bo);
    }

    @Override
    public List<ScsKitMapVo> queryErrorList(ScsKitMapBo bo) {
        return baseMapper.selectErrorListVo(bo);
    }

    private LambdaQueryWrapper<ScsKitMap> buildQueryWrapper(ScsKitMapBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsKitMap> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getItemId() != null, ScsKitMap::getItemId, bo.getItemId());
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), ScsKitMap::getItem, bo.getItem());
        lqw.eq(bo.getLocId() != null, ScsKitMap::getLocId, bo.getLocId());
        lqw.eq(StringUtils.isNotBlank(bo.getLocCode()), ScsKitMap::getLocCode, bo.getLocCode());
        lqw.eq(bo.getKitItemId() != null, ScsKitMap::getKitItemId, bo.getKitItemId());
        lqw.eq(StringUtils.isNotBlank(bo.getKitItem()), ScsKitMap::getKitItem, bo.getKitItem());
        lqw.eq(bo.getConvfactor() != null, ScsKitMap::getConvfactor, bo.getConvfactor());
        lqw.eq(StringUtils.isNotBlank(bo.getProductHierarchy()), ScsKitMap::getProductHierarchy, bo.getProductHierarchy());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), ScsKitMap::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsKitMap::getUComment, bo.getUComment());
        lqw.eq(bo.getVersionNo() != null, ScsKitMap::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_kit_map
     */
    @Override
    public Boolean insertByBo(ScsKitMapBo bo) {
        ScsKitMap add = BeanUtil.toBean(bo, ScsKitMap.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_kit_map
     */
    @Override
    public Boolean updateByBo(ScsKitMapBo bo) {
        ScsKitMap update = BeanUtil.toBean(bo, ScsKitMap.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsKitMap entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_kit_map
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
