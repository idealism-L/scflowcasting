package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.EtlHldFcstKit26w;
import com.plan.report.domain.bo.EtlHldFcstKit26wBo;
import com.plan.report.domain.vo.EtlHldFcstKit26wVo;
import com.plan.report.mapper.EtlHldFcstKit26wMapper;
import com.plan.report.service.IEtlHldFcstKit26wService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 主剂需求预测Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class EtlHldFcstKit26wServiceImpl implements IEtlHldFcstKit26wService {

    private final EtlHldFcstKit26wMapper baseMapper;

    /**
     * 查询主剂需求预测
     */
    @Override
    public EtlHldFcstKit26wVo queryById(Long imMainInsuranceConfigId){
        return baseMapper.selectVoById(imMainInsuranceConfigId);
    }

    /**
     * 查询主剂需求预测列表
     */
    @Override
    public TableDataInfo<EtlHldFcstKit26wVo> queryPageList(EtlHldFcstKit26wBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<EtlHldFcstKit26w> lqw = buildQueryWrapper(bo);
        Page<EtlHldFcstKit26wVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询主剂需求预测列表
     */
    @Override
    public List<EtlHldFcstKit26wVo> queryList(EtlHldFcstKit26wBo bo) {
        LambdaQueryWrapper<EtlHldFcstKit26w> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<EtlHldFcstKit26w> buildQueryWrapper(EtlHldFcstKit26wBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<EtlHldFcstKit26w> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), EtlHldFcstKit26w::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdunit()), EtlHldFcstKit26w::getDmdunit, bo.getDmdunit());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), EtlHldFcstKit26w::getDmdgroup, bo.getDmdgroup());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), EtlHldFcstKit26w::getLoc, bo.getLoc());
        lqw.eq(bo.getStartdate() != null, EtlHldFcstKit26w::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getUOh()), EtlHldFcstKit26w::getUOh, bo.getUOh());
        lqw.eq(bo.getUW1() != null, EtlHldFcstKit26w::getUW1, bo.getUW1());
        lqw.eq(bo.getUW2() != null, EtlHldFcstKit26w::getUW2, bo.getUW2());
        lqw.eq(bo.getUW3() != null, EtlHldFcstKit26w::getUW3, bo.getUW3());
        lqw.eq(bo.getUW4() != null, EtlHldFcstKit26w::getUW4, bo.getUW4());
        lqw.eq(bo.getUW5() != null, EtlHldFcstKit26w::getUW5, bo.getUW5());
        lqw.eq(bo.getUW6() != null, EtlHldFcstKit26w::getUW6, bo.getUW6());
        lqw.eq(bo.getUW7() != null, EtlHldFcstKit26w::getUW7, bo.getUW7());
        lqw.eq(bo.getUW8() != null, EtlHldFcstKit26w::getUW8, bo.getUW8());
        lqw.eq(bo.getUW9() != null, EtlHldFcstKit26w::getUW9, bo.getUW9());
        lqw.eq(bo.getUW10() != null, EtlHldFcstKit26w::getUW10, bo.getUW10());
        lqw.eq(bo.getUW11() != null, EtlHldFcstKit26w::getUW11, bo.getUW11());
        lqw.eq(bo.getUW12() != null, EtlHldFcstKit26w::getUW12, bo.getUW12());
        lqw.eq(bo.getUW13() != null, EtlHldFcstKit26w::getUW13, bo.getUW13());
        lqw.eq(bo.getUW14() != null, EtlHldFcstKit26w::getUW14, bo.getUW14());
        lqw.eq(bo.getUW15() != null, EtlHldFcstKit26w::getUW15, bo.getUW15());
        lqw.eq(bo.getUW16() != null, EtlHldFcstKit26w::getUW16, bo.getUW16());
        lqw.eq(bo.getUW17() != null, EtlHldFcstKit26w::getUW17, bo.getUW17());
        lqw.eq(bo.getUW18() != null, EtlHldFcstKit26w::getUW18, bo.getUW18());
        lqw.eq(bo.getUW19() != null, EtlHldFcstKit26w::getUW19, bo.getUW19());
        lqw.eq(bo.getUW20() != null, EtlHldFcstKit26w::getUW20, bo.getUW20());
        lqw.eq(bo.getUW21() != null, EtlHldFcstKit26w::getUW21, bo.getUW21());
        lqw.eq(bo.getUW22() != null, EtlHldFcstKit26w::getUW22, bo.getUW22());
        lqw.eq(bo.getUW23() != null, EtlHldFcstKit26w::getUW23, bo.getUW23());
        lqw.eq(bo.getUW24() != null, EtlHldFcstKit26w::getUW24, bo.getUW24());
        lqw.eq(bo.getUW25() != null, EtlHldFcstKit26w::getUW25, bo.getUW25());
        lqw.eq(bo.getUW26() != null, EtlHldFcstKit26w::getUW26, bo.getUW26());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), EtlHldFcstKit26w::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), EtlHldFcstKit26w::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), EtlHldFcstKit26w::getUFilename, bo.getUFilename());
        lqw.eq(StringUtils.isNotBlank(bo.getUEditdate()), EtlHldFcstKit26w::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增主剂需求预测
     */
    @Override
    public Boolean insertByBo(EtlHldFcstKit26wBo bo) {
        EtlHldFcstKit26w add = BeanUtil.toBean(bo, EtlHldFcstKit26w.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setImMainInsuranceConfigId(add.getImMainInsuranceConfigId());
        }
        return flag;
    }

    /**
     * 修改主剂需求预测
     */
    @Override
    public Boolean updateByBo(EtlHldFcstKit26wBo bo) {
        EtlHldFcstKit26w update = BeanUtil.toBean(bo, EtlHldFcstKit26w.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(EtlHldFcstKit26w entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除主剂需求预测
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
