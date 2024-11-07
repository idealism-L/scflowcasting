package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.TFcstKit26w;
import com.plan.report.domain.bo.TFcstKit26wBo;
import com.plan.report.domain.vo.TFcstKit26wVo;
import com.plan.report.mapper.TFcstKit26wMapper;
import com.plan.report.service.ITFcstKit26wService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * t_fcst_kit_26wService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class TFcstKit26wServiceImpl implements ITFcstKit26wService {

    private final TFcstKit26wMapper baseMapper;

    /**
     * 查询t_fcst_kit_26w
     */
    @Override
    public TFcstKit26wVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询t_fcst_kit_26w列表
     */
    @Override
    public TableDataInfo<TFcstKit26wVo> queryPageList(TFcstKit26wBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<TFcstKit26w> lqw = buildQueryWrapper(bo);
        Page<TFcstKit26wVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询t_fcst_kit_26w列表
     */
    @Override
    public List<TFcstKit26wVo> queryList(TFcstKit26wBo bo) {
        LambdaQueryWrapper<TFcstKit26w> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<TFcstKit26w> buildQueryWrapper(TFcstKit26wBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<TFcstKit26w> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), TFcstKit26w::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdunit()), TFcstKit26w::getDmdunit, bo.getDmdunit());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), TFcstKit26w::getDmdgroup, bo.getDmdgroup());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), TFcstKit26w::getLoc, bo.getLoc());
        lqw.eq(bo.getStartdate() != null, TFcstKit26w::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getUOh()), TFcstKit26w::getUOh, bo.getUOh());
        lqw.eq(bo.getUW1() != null, TFcstKit26w::getUW1, bo.getUW1());
        lqw.eq(bo.getUW2() != null, TFcstKit26w::getUW2, bo.getUW2());
        lqw.eq(bo.getUW3() != null, TFcstKit26w::getUW3, bo.getUW3());
        lqw.eq(bo.getUW4() != null, TFcstKit26w::getUW4, bo.getUW4());
        lqw.eq(bo.getUW5() != null, TFcstKit26w::getUW5, bo.getUW5());
        lqw.eq(bo.getUW6() != null, TFcstKit26w::getUW6, bo.getUW6());
        lqw.eq(bo.getUW7() != null, TFcstKit26w::getUW7, bo.getUW7());
        lqw.eq(bo.getUW8() != null, TFcstKit26w::getUW8, bo.getUW8());
        lqw.eq(bo.getUW9() != null, TFcstKit26w::getUW9, bo.getUW9());
        lqw.eq(bo.getUW10() != null, TFcstKit26w::getUW10, bo.getUW10());
        lqw.eq(bo.getUW11() != null, TFcstKit26w::getUW11, bo.getUW11());
        lqw.eq(bo.getUW12() != null, TFcstKit26w::getUW12, bo.getUW12());
        lqw.eq(bo.getUW13() != null, TFcstKit26w::getUW13, bo.getUW13());
        lqw.eq(bo.getUW14() != null, TFcstKit26w::getUW14, bo.getUW14());
        lqw.eq(bo.getUW15() != null, TFcstKit26w::getUW15, bo.getUW15());
        lqw.eq(bo.getUW16() != null, TFcstKit26w::getUW16, bo.getUW16());
        lqw.eq(bo.getUW17() != null, TFcstKit26w::getUW17, bo.getUW17());
        lqw.eq(bo.getUW18() != null, TFcstKit26w::getUW18, bo.getUW18());
        lqw.eq(bo.getUW19() != null, TFcstKit26w::getUW19, bo.getUW19());
        lqw.eq(bo.getUW20() != null, TFcstKit26w::getUW20, bo.getUW20());
        lqw.eq(bo.getUW21() != null, TFcstKit26w::getUW21, bo.getUW21());
        lqw.eq(bo.getUW22() != null, TFcstKit26w::getUW22, bo.getUW22());
        lqw.eq(bo.getUW23() != null, TFcstKit26w::getUW23, bo.getUW23());
        lqw.eq(bo.getUW24() != null, TFcstKit26w::getUW24, bo.getUW24());
        lqw.eq(bo.getUW25() != null, TFcstKit26w::getUW25, bo.getUW25());
        lqw.eq(bo.getUW26() != null, TFcstKit26w::getUW26, bo.getUW26());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), TFcstKit26w::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), TFcstKit26w::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), TFcstKit26w::getUFilename, bo.getUFilename());
        lqw.eq(StringUtils.isNotBlank(bo.getUEditdate()), TFcstKit26w::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增t_fcst_kit_26w
     */
    @Override
    public Boolean insertByBo(TFcstKit26wBo bo) {
        TFcstKit26w add = BeanUtil.toBean(bo, TFcstKit26w.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改t_fcst_kit_26w
     */
    @Override
    public Boolean updateByBo(TFcstKit26wBo bo) {
        TFcstKit26w update = BeanUtil.toBean(bo, TFcstKit26w.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(TFcstKit26w entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除t_fcst_kit_26w
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
