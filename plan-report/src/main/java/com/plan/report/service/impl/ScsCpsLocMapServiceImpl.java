package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsCpsLocMap;
import com.plan.report.domain.bo.ScsCpsLocMapBo;
import com.plan.report.domain.vo.ScsCpsLocMapVo;
import com.plan.report.mapper.ScsCpsLocMapMapper;
import com.plan.report.service.IScsCpsLocMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_cps_loc_mapService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-25
 */
@RequiredArgsConstructor
@Service
public class ScsCpsLocMapServiceImpl implements IScsCpsLocMapService {

    private final ScsCpsLocMapMapper baseMapper;

    /**
     * 查询scs_cps_loc_map
     */
    @Override
    public ScsCpsLocMapVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_cps_loc_map列表
     */
    @Override
    public TableDataInfo<ScsCpsLocMapVo> queryPageList(ScsCpsLocMapBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsCpsLocMap> lqw = buildQueryWrapper(bo);
        Page<ScsCpsLocMapVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_cps_loc_map列表
     */
    @Override
    public List<ScsCpsLocMapVo> queryList(ScsCpsLocMapBo bo) {
        LambdaQueryWrapper<ScsCpsLocMap> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsCpsLocMap> buildQueryWrapper(ScsCpsLocMapBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsCpsLocMap> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), ScsCpsLocMap::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getFruitCategory()), ScsCpsLocMap::getFruitCategory, bo.getFruitCategory());
        lqw.eq(StringUtils.isNotBlank(bo.getDfuLoc()), ScsCpsLocMap::getDfuLoc, bo.getDfuLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getSkuLoc()), ScsCpsLocMap::getSkuLoc, bo.getSkuLoc());
        lqw.eq(bo.getVersionNo() != null, ScsCpsLocMap::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_cps_loc_map
     */
    @Override
    public Boolean insertByBo(ScsCpsLocMapBo bo) {
        ScsCpsLocMap add = BeanUtil.toBean(bo, ScsCpsLocMap.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_cps_loc_map
     */
    @Override
    public Boolean updateByBo(ScsCpsLocMapBo bo) {
        ScsCpsLocMap update = BeanUtil.toBean(bo, ScsCpsLocMap.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsCpsLocMap entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_cps_loc_map
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
