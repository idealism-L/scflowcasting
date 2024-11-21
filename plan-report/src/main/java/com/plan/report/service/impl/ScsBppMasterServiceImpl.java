package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsBppMaster;
import com.plan.report.domain.bo.ScsBppMasterBo;
import com.plan.report.domain.vo.ScsBppMasterVo;
import com.plan.report.mapper.ScsBppMasterMapper;
import com.plan.report.service.IScsBppMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_bpp_masterService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-21
 */
@RequiredArgsConstructor
@Service
public class ScsBppMasterServiceImpl implements IScsBppMasterService {

    private final ScsBppMasterMapper baseMapper;

    /**
     * 查询scs_bpp_master
     */
    @Override
    public ScsBppMasterVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_bpp_master列表
     */
    @Override
    public TableDataInfo<ScsBppMasterVo> queryPageList(ScsBppMasterBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsBppMaster> lqw = buildQueryWrapper(bo);
        Page<ScsBppMasterVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_bpp_master列表
     */
    @Override
    public List<ScsBppMasterVo> queryList(ScsBppMasterBo bo) {
        LambdaQueryWrapper<ScsBppMaster> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsBppMaster> buildQueryWrapper(ScsBppMasterBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsBppMaster> lqw = Wrappers.lambdaQuery();
        lqw.like(StringUtils.isNotBlank(bo.getBppCode()), ScsBppMaster::getBppCode, bo.getBppCode());
        lqw.eq(StringUtils.isNotBlank(bo.getBppDescr()), ScsBppMaster::getBppDescr, bo.getBppDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getCategory()), ScsBppMaster::getCategory, bo.getCategory());
        lqw.eq(StringUtils.isNotBlank(bo.getCategoryDescr()), ScsBppMaster::getCategoryDescr, bo.getCategoryDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getSubcategory()), ScsBppMaster::getSubcategory, bo.getSubcategory());
        lqw.eq(StringUtils.isNotBlank(bo.getSubcategoryDescr()), ScsBppMaster::getSubcategoryDescr, bo.getSubcategoryDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getBrand()), ScsBppMaster::getBrand, bo.getBrand());
        lqw.eq(StringUtils.isNotBlank(bo.getBrandDescr()), ScsBppMaster::getBrandDescr, bo.getBrandDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getFlavor()), ScsBppMaster::getFlavor, bo.getFlavor());
        lqw.eq(StringUtils.isNotBlank(bo.getFlavorDescr()), ScsBppMaster::getFlavorDescr, bo.getFlavorDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getPackageCode()), ScsBppMaster::getPackageCode, bo.getPackageCode());
        lqw.eq(StringUtils.isNotBlank(bo.getPackageDescr()), ScsBppMaster::getPackageDescr, bo.getPackageDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getBeverage()), ScsBppMaster::getBeverage, bo.getBeverage());
        lqw.eq(StringUtils.isNotBlank(bo.getStatus()), ScsBppMaster::getStatus, bo.getStatus());
        lqw.eq(bo.getFgKitRate() != null, ScsBppMaster::getFgKitRate, bo.getFgKitRate());
        lqw.eq(bo.getUcRate() != null, ScsBppMaster::getUcRate, bo.getUcRate());
        lqw.eq(bo.getVersionNo() != null, ScsBppMaster::getVersionNo, bo.getVersionNo());
        // 检查 ids 数组是否不为空
        if (bo.getIds() != null && bo.getIds().length > 0) {
            lqw.in(ScsBppMaster::getId, Arrays.asList(bo.getIds()));
        }
        return lqw;
    }

    /**
     * 新增scs_bpp_master
     */
    @Override
    public Boolean insertByBo(ScsBppMasterBo bo) {
        ScsBppMaster add = BeanUtil.toBean(bo, ScsBppMaster.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_bpp_master
     */
    @Override
    public Boolean updateByBo(ScsBppMasterBo bo) {
        ScsBppMaster update = BeanUtil.toBean(bo, ScsBppMaster.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsBppMaster entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_bpp_master
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
