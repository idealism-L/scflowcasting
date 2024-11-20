package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsFlowcastingOutput;
import com.plan.report.domain.bo.ScsFlowcastingOutputBo;
import com.plan.report.domain.vo.ScsFlowcastingOutputVo;
import com.plan.report.mapper.ScsFlowcastingOutputMapper;
import com.plan.report.service.IScsFlowcastingOutputService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_flowcasting_outputService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-20
 */
@RequiredArgsConstructor
@Service
public class ScsFlowcastingOutputServiceImpl implements IScsFlowcastingOutputService {

    private final ScsFlowcastingOutputMapper baseMapper;

    /**
     * 查询scs_flowcasting_output
     */
    @Override
    public ScsFlowcastingOutputVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_flowcasting_output列表
     */
    @Override
    public TableDataInfo<ScsFlowcastingOutputVo> queryPageList(ScsFlowcastingOutputBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsFlowcastingOutput> lqw = buildQueryWrapper(bo);
        Page<ScsFlowcastingOutputVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_flowcasting_output列表
     */
    @Override
    public List<ScsFlowcastingOutputVo> queryList(ScsFlowcastingOutputBo bo) {
        LambdaQueryWrapper<ScsFlowcastingOutput> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsFlowcastingOutput> buildQueryWrapper(ScsFlowcastingOutputBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsFlowcastingOutput> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), ScsFlowcastingOutput::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getItemOwnCode()), ScsFlowcastingOutput::getItemOwnCode, bo.getItemOwnCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), ScsFlowcastingOutput::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUBppCode()), ScsFlowcastingOutput::getUBppCode, bo.getUBppCode());
        lqw.eq(StringUtils.isNotBlank(bo.getUBppBrand()), ScsFlowcastingOutput::getUBppBrand, bo.getUBppBrand());
        lqw.eq(StringUtils.isNotBlank(bo.getUBppFlavor()), ScsFlowcastingOutput::getUBppFlavor, bo.getUBppFlavor());
        lqw.eq(StringUtils.isNotBlank(bo.getUBppCategory()), ScsFlowcastingOutput::getUBppCategory, bo.getUBppCategory());
        lqw.eq(StringUtils.isNotBlank(bo.getUBppSubcategory()), ScsFlowcastingOutput::getUBppSubcategory, bo.getUBppSubcategory());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsFlowcastingOutput::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getUOu()), ScsFlowcastingOutput::getUOu, bo.getUOu());
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), ScsFlowcastingOutput::getUCorporation, bo.getUCorporation());
        lqw.like(StringUtils.isNotBlank(bo.getMeasurename()), ScsFlowcastingOutput::getMeasurename, bo.getMeasurename());
        lqw.eq(bo.getStartdate() != null, ScsFlowcastingOutput::getStartdate, bo.getStartdate());
        lqw.eq(bo.getPeriod1() != null, ScsFlowcastingOutput::getPeriod1, bo.getPeriod1());
        lqw.eq(bo.getPeriod2() != null, ScsFlowcastingOutput::getPeriod2, bo.getPeriod2());
        lqw.eq(bo.getPeriod3() != null, ScsFlowcastingOutput::getPeriod3, bo.getPeriod3());
        lqw.eq(bo.getPeriod4() != null, ScsFlowcastingOutput::getPeriod4, bo.getPeriod4());
        lqw.eq(bo.getPeriod5() != null, ScsFlowcastingOutput::getPeriod5, bo.getPeriod5());
        lqw.eq(bo.getPeriod6() != null, ScsFlowcastingOutput::getPeriod6, bo.getPeriod6());
        lqw.eq(bo.getPeriod7() != null, ScsFlowcastingOutput::getPeriod7, bo.getPeriod7());
        lqw.eq(bo.getPeriod8() != null, ScsFlowcastingOutput::getPeriod8, bo.getPeriod8());
        lqw.eq(bo.getPeriod9() != null, ScsFlowcastingOutput::getPeriod9, bo.getPeriod9());
        lqw.eq(bo.getPeriod10() != null, ScsFlowcastingOutput::getPeriod10, bo.getPeriod10());
        lqw.eq(bo.getPeriod11() != null, ScsFlowcastingOutput::getPeriod11, bo.getPeriod11());
        lqw.eq(bo.getPeriod12() != null, ScsFlowcastingOutput::getPeriod12, bo.getPeriod12());
        lqw.eq(bo.getPeriod13() != null, ScsFlowcastingOutput::getPeriod13, bo.getPeriod13());
        lqw.eq(bo.getPeriod14() != null, ScsFlowcastingOutput::getPeriod14, bo.getPeriod14());
        lqw.eq(bo.getPeriod15() != null, ScsFlowcastingOutput::getPeriod15, bo.getPeriod15());
        lqw.eq(bo.getPeriod16() != null, ScsFlowcastingOutput::getPeriod16, bo.getPeriod16());
        lqw.eq(bo.getPeriod17() != null, ScsFlowcastingOutput::getPeriod17, bo.getPeriod17());
        lqw.eq(bo.getPeriod18() != null, ScsFlowcastingOutput::getPeriod18, bo.getPeriod18());
        lqw.eq(bo.getPeriod19() != null, ScsFlowcastingOutput::getPeriod19, bo.getPeriod19());
        lqw.eq(bo.getPeriod20() != null, ScsFlowcastingOutput::getPeriod20, bo.getPeriod20());
        lqw.eq(bo.getPeriod21() != null, ScsFlowcastingOutput::getPeriod21, bo.getPeriod21());
        lqw.eq(bo.getPeriod22() != null, ScsFlowcastingOutput::getPeriod22, bo.getPeriod22());
        lqw.eq(bo.getPeriod23() != null, ScsFlowcastingOutput::getPeriod23, bo.getPeriod23());
        lqw.eq(bo.getPeriod24() != null, ScsFlowcastingOutput::getPeriod24, bo.getPeriod24());
        lqw.eq(bo.getPeriod25() != null, ScsFlowcastingOutput::getPeriod25, bo.getPeriod25());
        lqw.eq(bo.getPeriod26() != null, ScsFlowcastingOutput::getPeriod26, bo.getPeriod26());
        lqw.eq(bo.getReportDate() != null, ScsFlowcastingOutput::getReportDate, bo.getReportDate());
        return lqw;
    }

    /**
     * 新增scs_flowcasting_output
     */
    @Override
    public Boolean insertByBo(ScsFlowcastingOutputBo bo) {
        ScsFlowcastingOutput add = BeanUtil.toBean(bo, ScsFlowcastingOutput.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_flowcasting_output
     */
    @Override
    public Boolean updateByBo(ScsFlowcastingOutputBo bo) {
        ScsFlowcastingOutput update = BeanUtil.toBean(bo, ScsFlowcastingOutput.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsFlowcastingOutput entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_flowcasting_output
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
