package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsIfHldFcstKit;
import com.plan.report.domain.bo.ScsIfHldFcstKitBo;
import com.plan.report.domain.vo.ScsIfHldFcstKitVo;
import com.plan.report.mapper.ScsIfHldFcstKitMapper;
import com.plan.report.service.IScsIfHldFcstKitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_if_hld_fcst_kitService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsIfHldFcstKitServiceImpl implements IScsIfHldFcstKitService {

    private final ScsIfHldFcstKitMapper baseMapper;

    /**
     * 查询scs_if_hld_fcst_kit
     */
    @Override
    public ScsIfHldFcstKitVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_if_hld_fcst_kit列表
     */
    @Override
    public TableDataInfo<ScsIfHldFcstKitVo> queryPageList(ScsIfHldFcstKitBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsIfHldFcstKit> lqw = buildQueryWrapper(bo);
        Page<ScsIfHldFcstKitVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_if_hld_fcst_kit列表
     */
    @Override
    public List<ScsIfHldFcstKitVo> queryList(ScsIfHldFcstKitBo bo) {
        LambdaQueryWrapper<ScsIfHldFcstKit> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsIfHldFcstKit> buildQueryWrapper(ScsIfHldFcstKitBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsIfHldFcstKit> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), ScsIfHldFcstKit::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdunit()), ScsIfHldFcstKit::getDmdunit, bo.getDmdunit());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), ScsIfHldFcstKit::getDmdgroup, bo.getDmdgroup());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsIfHldFcstKit::getLoc, bo.getLoc());
        lqw.eq(bo.getStartdate() != null, ScsIfHldFcstKit::getStartdate, bo.getStartdate());
        lqw.eq(bo.getUOh() != null, ScsIfHldFcstKit::getUOh, bo.getUOh());
        lqw.eq(bo.getUW1() != null, ScsIfHldFcstKit::getUW1, bo.getUW1());
        lqw.eq(bo.getUW2() != null, ScsIfHldFcstKit::getUW2, bo.getUW2());
        lqw.eq(bo.getUW3() != null, ScsIfHldFcstKit::getUW3, bo.getUW3());
        lqw.eq(bo.getUW4() != null, ScsIfHldFcstKit::getUW4, bo.getUW4());
        lqw.eq(bo.getUW5() != null, ScsIfHldFcstKit::getUW5, bo.getUW5());
        lqw.eq(bo.getUW6() != null, ScsIfHldFcstKit::getUW6, bo.getUW6());
        lqw.eq(bo.getUW7() != null, ScsIfHldFcstKit::getUW7, bo.getUW7());
        lqw.eq(bo.getUW8() != null, ScsIfHldFcstKit::getUW8, bo.getUW8());
        lqw.eq(bo.getUW9() != null, ScsIfHldFcstKit::getUW9, bo.getUW9());
        lqw.eq(bo.getUW10() != null, ScsIfHldFcstKit::getUW10, bo.getUW10());
        lqw.eq(bo.getUW11() != null, ScsIfHldFcstKit::getUW11, bo.getUW11());
        lqw.eq(bo.getUW12() != null, ScsIfHldFcstKit::getUW12, bo.getUW12());
        lqw.eq(bo.getUW13() != null, ScsIfHldFcstKit::getUW13, bo.getUW13());
        lqw.eq(bo.getUM1() != null, ScsIfHldFcstKit::getUM1, bo.getUM1());
        lqw.eq(bo.getUM2() != null, ScsIfHldFcstKit::getUM2, bo.getUM2());
        lqw.eq(bo.getUM3() != null, ScsIfHldFcstKit::getUM3, bo.getUM3());
        lqw.eq(bo.getUM4() != null, ScsIfHldFcstKit::getUM4, bo.getUM4());
        lqw.eq(bo.getUFlag() != null, ScsIfHldFcstKit::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsIfHldFcstKit::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), ScsIfHldFcstKit::getUFilename, bo.getUFilename());
        lqw.eq(bo.getUEditdate() != null, ScsIfHldFcstKit::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增scs_if_hld_fcst_kit
     */
    @Override
    public Boolean insertByBo(ScsIfHldFcstKitBo bo) {
        ScsIfHldFcstKit add = BeanUtil.toBean(bo, ScsIfHldFcstKit.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_if_hld_fcst_kit
     */
    @Override
    public Boolean updateByBo(ScsIfHldFcstKitBo bo) {
        ScsIfHldFcstKit update = BeanUtil.toBean(bo, ScsIfHldFcstKit.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsIfHldFcstKit entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_if_hld_fcst_kit
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
