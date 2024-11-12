package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsFgMap;
import com.plan.report.domain.bo.ScsFgMapBo;
import com.plan.report.domain.vo.ScsFgMapVo;
import com.plan.report.mapper.ScsFgMapMapper;
import com.plan.report.service.IScsFgMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_fg_mapService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsFgMapServiceImpl implements IScsFgMapService {

    private final ScsFgMapMapper baseMapper;

    /**
     * 查询scs_fg_map
     */
    @Override
    public ScsFgMapVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_fg_map列表
     */
    @Override
    public TableDataInfo<ScsFgMapVo> queryPageList(ScsFgMapBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsFgMap> lqw = buildQueryWrapper(bo);
        Page<ScsFgMapVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_fg_map列表
     */
    @Override
    public List<ScsFgMapVo> queryList(ScsFgMapBo bo) {
        LambdaQueryWrapper<ScsFgMap> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsFgMap> buildQueryWrapper(ScsFgMapBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsFgMap> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getItemId() != null, ScsFgMap::getItemId, bo.getItemId());
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), ScsFgMap::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getFgItemId()), ScsFgMap::getFgItemId, bo.getFgItemId());
        lqw.eq(StringUtils.isNotBlank(bo.getFgItem()), ScsFgMap::getFgItem, bo.getFgItem());
        lqw.eq(bo.getConvfactor() != null, ScsFgMap::getConvfactor, bo.getConvfactor());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsFgMap::getUComment, bo.getUComment());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), ScsFgMap::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getKeyProductionFlag()), ScsFgMap::getKeyProductionFlag, bo.getKeyProductionFlag());
        lqw.eq(bo.getVersionNo() != null, ScsFgMap::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_fg_map
     */
    @Override
    public Boolean insertByBo(ScsFgMapBo bo) {
        ScsFgMap add = BeanUtil.toBean(bo, ScsFgMap.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_fg_map
     */
    @Override
    public Boolean updateByBo(ScsFgMapBo bo) {
        ScsFgMap update = BeanUtil.toBean(bo, ScsFgMap.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsFgMap entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_fg_map
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
