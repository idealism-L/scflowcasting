package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.EtlHldFcstFg26w;
import com.plan.report.domain.bo.EtlHldFcstFg26wBo;
import com.plan.report.domain.vo.EtlHldFcstFg26wVo;
import com.plan.report.mapper.EtlHldFcstFg26wMapper;
import com.plan.report.service.IEtlHldFcstFg26wService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 成品销售预测Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class EtlHldFcstFg26wServiceImpl implements IEtlHldFcstFg26wService {

    private final EtlHldFcstFg26wMapper baseMapper;

    /**
     * 查询成品销售预测
     */
    @Override
    public EtlHldFcstFg26wVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询成品销售预测列表
     */
    @Override
    public TableDataInfo<EtlHldFcstFg26wVo> queryPageList(EtlHldFcstFg26wBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<EtlHldFcstFg26w> lqw = buildQueryWrapper(bo);
        Page<EtlHldFcstFg26wVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询成品销售预测列表
     */
    @Override
    public List<EtlHldFcstFg26wVo> queryList(EtlHldFcstFg26wBo bo) {
        LambdaQueryWrapper<EtlHldFcstFg26w> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<EtlHldFcstFg26w> buildQueryWrapper(EtlHldFcstFg26wBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<EtlHldFcstFg26w> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), EtlHldFcstFg26w::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdunit()), EtlHldFcstFg26w::getDmdunit, bo.getDmdunit());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), EtlHldFcstFg26w::getDmdgroup, bo.getDmdgroup());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), EtlHldFcstFg26w::getLoc, bo.getLoc());
        lqw.eq(bo.getStartdate() != null, EtlHldFcstFg26w::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getUOh()), EtlHldFcstFg26w::getUOh, bo.getUOh());
        lqw.eq(bo.getUW1() != null, EtlHldFcstFg26w::getUW1, bo.getUW1());
        lqw.eq(bo.getUW2() != null, EtlHldFcstFg26w::getUW2, bo.getUW2());
        lqw.eq(bo.getUW3() != null, EtlHldFcstFg26w::getUW3, bo.getUW3());
        lqw.eq(bo.getUW4() != null, EtlHldFcstFg26w::getUW4, bo.getUW4());
        lqw.eq(bo.getUW5() != null, EtlHldFcstFg26w::getUW5, bo.getUW5());
        lqw.eq(bo.getUW6() != null, EtlHldFcstFg26w::getUW6, bo.getUW6());
        lqw.eq(bo.getUW7() != null, EtlHldFcstFg26w::getUW7, bo.getUW7());
        lqw.eq(bo.getUW8() != null, EtlHldFcstFg26w::getUW8, bo.getUW8());
        lqw.eq(bo.getUW9() != null, EtlHldFcstFg26w::getUW9, bo.getUW9());
        lqw.eq(bo.getUW10() != null, EtlHldFcstFg26w::getUW10, bo.getUW10());
        lqw.eq(bo.getUW11() != null, EtlHldFcstFg26w::getUW11, bo.getUW11());
        lqw.eq(bo.getUW12() != null, EtlHldFcstFg26w::getUW12, bo.getUW12());
        lqw.eq(bo.getUW13() != null, EtlHldFcstFg26w::getUW13, bo.getUW13());
        lqw.eq(bo.getUW14() != null, EtlHldFcstFg26w::getUW14, bo.getUW14());
        lqw.eq(bo.getUW15() != null, EtlHldFcstFg26w::getUW15, bo.getUW15());
        lqw.eq(bo.getUW16() != null, EtlHldFcstFg26w::getUW16, bo.getUW16());
        lqw.eq(bo.getUW17() != null, EtlHldFcstFg26w::getUW17, bo.getUW17());
        lqw.eq(bo.getUW18() != null, EtlHldFcstFg26w::getUW18, bo.getUW18());
        lqw.eq(bo.getUW19() != null, EtlHldFcstFg26w::getUW19, bo.getUW19());
        lqw.eq(bo.getUW20() != null, EtlHldFcstFg26w::getUW20, bo.getUW20());
        lqw.eq(bo.getUW21() != null, EtlHldFcstFg26w::getUW21, bo.getUW21());
        lqw.eq(bo.getUW22() != null, EtlHldFcstFg26w::getUW22, bo.getUW22());
        lqw.eq(bo.getUW23() != null, EtlHldFcstFg26w::getUW23, bo.getUW23());
        lqw.eq(bo.getUW24() != null, EtlHldFcstFg26w::getUW24, bo.getUW24());
        lqw.eq(bo.getUW25() != null, EtlHldFcstFg26w::getUW25, bo.getUW25());
        lqw.eq(bo.getUW26() != null, EtlHldFcstFg26w::getUW26, bo.getUW26());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), EtlHldFcstFg26w::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), EtlHldFcstFg26w::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), EtlHldFcstFg26w::getUFilename, bo.getUFilename());
        lqw.eq(StringUtils.isNotBlank(bo.getUEditdate()), EtlHldFcstFg26w::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增成品销售预测
     */
    @Override
    public Boolean insertByBo(EtlHldFcstFg26wBo bo) {
        EtlHldFcstFg26w add = BeanUtil.toBean(bo, EtlHldFcstFg26w.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改成品销售预测
     */
    @Override
    public Boolean updateByBo(EtlHldFcstFg26wBo bo) {
        EtlHldFcstFg26w update = BeanUtil.toBean(bo, EtlHldFcstFg26w.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(EtlHldFcstFg26w entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除成品销售预测
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
