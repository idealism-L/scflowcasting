package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsLocMap;
import com.plan.report.domain.bo.ScsLocMapBo;
import com.plan.report.domain.vo.ScsLocMapVo;
import com.plan.report.mapper.ScsLocMapMapper;
import com.plan.report.service.IScsLocMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_loc_mapService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsLocMapServiceImpl implements IScsLocMapService {

    private final ScsLocMapMapper baseMapper;

    /**
     * 查询scs_loc_map
     */
    @Override
    public ScsLocMapVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_loc_map列表
     */
    @Override
    public TableDataInfo<ScsLocMapVo> queryPageList(ScsLocMapBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsLocMap> lqw = buildQueryWrapper(bo);
        Page<ScsLocMapVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_loc_map列表
     */
    @Override
    public List<ScsLocMapVo> queryList(ScsLocMapBo bo) {
        LambdaQueryWrapper<ScsLocMap> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsLocMap> buildQueryWrapper(ScsLocMapBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsLocMap> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsLocMap::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getUCodeType()), ScsLocMap::getUCodeType, bo.getUCodeType());
        lqw.eq(StringUtils.isNotBlank(bo.getUOriginalCode()), ScsLocMap::getUOriginalCode, bo.getUOriginalCode());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsLocMap::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getUOwnCode()), ScsLocMap::getUOwnCode, bo.getUOwnCode());
        lqw.eq(bo.getVersionNo() != null, ScsLocMap::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_loc_map
     */
    @Override
    public Boolean insertByBo(ScsLocMapBo bo) {
        ScsLocMap add = BeanUtil.toBean(bo, ScsLocMap.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_loc_map
     */
    @Override
    public Boolean updateByBo(ScsLocMapBo bo) {
        ScsLocMap update = BeanUtil.toBean(bo, ScsLocMap.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsLocMap entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_loc_map
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
