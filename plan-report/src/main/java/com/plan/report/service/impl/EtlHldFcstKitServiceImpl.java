package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.EtlHldFcstKit;
import com.plan.report.domain.bo.EtlHldFcstKitBo;
import com.plan.report.domain.vo.EtlHldFcstKitVo;
import com.plan.report.mapper.EtlHldFcstKitMapper;
import com.plan.report.service.IEtlHldFcstKitService;
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
public class EtlHldFcstKitServiceImpl implements IEtlHldFcstKitService {

    private final EtlHldFcstKitMapper baseMapper;

    /**
     * 查询主剂需求预测
     */
    @Override
    public EtlHldFcstKitVo queryById(Long imMainInsuranceConfigId){
        return baseMapper.selectVoById(imMainInsuranceConfigId);
    }

    /**
     * 查询主剂需求预测列表
     */
    @Override
    public TableDataInfo<EtlHldFcstKitVo> queryPageList(EtlHldFcstKitBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<EtlHldFcstKit> lqw = buildQueryWrapper(bo);
        Page<EtlHldFcstKitVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询主剂需求预测列表
     */
    @Override
    public List<EtlHldFcstKitVo> queryList(EtlHldFcstKitBo bo) {
        LambdaQueryWrapper<EtlHldFcstKit> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<EtlHldFcstKit> buildQueryWrapper(EtlHldFcstKitBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<EtlHldFcstKit> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), EtlHldFcstKit::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdunit()), EtlHldFcstKit::getDmdunit, bo.getDmdunit());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), EtlHldFcstKit::getDmdgroup, bo.getDmdgroup());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), EtlHldFcstKit::getLoc, bo.getLoc());
        lqw.eq(bo.getStartdate() != null, EtlHldFcstKit::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getUOh()), EtlHldFcstKit::getUOh, bo.getUOh());
        lqw.eq(bo.getUW1() != null, EtlHldFcstKit::getUW1, bo.getUW1());
        lqw.eq(bo.getUW2() != null, EtlHldFcstKit::getUW2, bo.getUW2());
        lqw.eq(bo.getUW3() != null, EtlHldFcstKit::getUW3, bo.getUW3());
        lqw.eq(bo.getUW4() != null, EtlHldFcstKit::getUW4, bo.getUW4());
        lqw.eq(bo.getUW5() != null, EtlHldFcstKit::getUW5, bo.getUW5());
        lqw.eq(bo.getUW6() != null, EtlHldFcstKit::getUW6, bo.getUW6());
        lqw.eq(bo.getUW7() != null, EtlHldFcstKit::getUW7, bo.getUW7());
        lqw.eq(bo.getUW8() != null, EtlHldFcstKit::getUW8, bo.getUW8());
        lqw.eq(bo.getUW9() != null, EtlHldFcstKit::getUW9, bo.getUW9());
        lqw.eq(bo.getUW10() != null, EtlHldFcstKit::getUW10, bo.getUW10());
        lqw.eq(bo.getUW11() != null, EtlHldFcstKit::getUW11, bo.getUW11());
        lqw.eq(bo.getUW12() != null, EtlHldFcstKit::getUW12, bo.getUW12());
        lqw.eq(bo.getUW13() != null, EtlHldFcstKit::getUW13, bo.getUW13());
        lqw.eq(bo.getUM1() != null, EtlHldFcstKit::getUM1, bo.getUM1());
        lqw.eq(bo.getUM2() != null, EtlHldFcstKit::getUM2, bo.getUM2());
        lqw.eq(bo.getUM3() != null, EtlHldFcstKit::getUM3, bo.getUM3());
        lqw.eq(bo.getUM4() != null, EtlHldFcstKit::getUM4, bo.getUM4());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), EtlHldFcstKit::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), EtlHldFcstKit::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), EtlHldFcstKit::getUFilename, bo.getUFilename());
        lqw.eq(StringUtils.isNotBlank(bo.getUEditdate()), EtlHldFcstKit::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增主剂需求预测
     */
    @Override
    public Boolean insertByBo(EtlHldFcstKitBo bo) {
        EtlHldFcstKit add = BeanUtil.toBean(bo, EtlHldFcstKit.class);
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
    public Boolean updateByBo(EtlHldFcstKitBo bo) {
        EtlHldFcstKit update = BeanUtil.toBean(bo, EtlHldFcstKit.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(EtlHldFcstKit entity){
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
