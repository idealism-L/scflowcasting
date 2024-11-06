package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.EtlHldFcstFg;
import com.plan.report.domain.bo.EtlHldFcstFgBo;
import com.plan.report.domain.vo.EtlHldFcstFgVo;
import com.plan.report.mapper.EtlHldFcstFgMapper;
import com.plan.report.service.IEtlHldFcstFgService;
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
public class EtlHldFcstFgServiceImpl implements IEtlHldFcstFgService {

    private final EtlHldFcstFgMapper baseMapper;

    /**
     * 查询成品销售预测
     */
    @Override
    public EtlHldFcstFgVo queryById(Long imMainInsuranceConfigId){
        return baseMapper.selectVoById(imMainInsuranceConfigId);
    }

    /**
     * 查询成品销售预测列表
     */
    @Override
    public TableDataInfo<EtlHldFcstFgVo> queryPageList(EtlHldFcstFgBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<EtlHldFcstFg> lqw = buildQueryWrapper(bo);
        Page<EtlHldFcstFgVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询成品销售预测列表
     */
    @Override
    public List<EtlHldFcstFgVo> queryList(EtlHldFcstFgBo bo) {
        LambdaQueryWrapper<EtlHldFcstFg> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<EtlHldFcstFg> buildQueryWrapper(EtlHldFcstFgBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<EtlHldFcstFg> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), EtlHldFcstFg::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdunit()), EtlHldFcstFg::getDmdunit, bo.getDmdunit());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), EtlHldFcstFg::getDmdgroup, bo.getDmdgroup());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), EtlHldFcstFg::getLoc, bo.getLoc());
        lqw.eq(bo.getStartdate() != null, EtlHldFcstFg::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getUOh()), EtlHldFcstFg::getUOh, bo.getUOh());
        lqw.eq(bo.getUW1() != null, EtlHldFcstFg::getUW1, bo.getUW1());
        lqw.eq(bo.getUW2() != null, EtlHldFcstFg::getUW2, bo.getUW2());
        lqw.eq(bo.getUW3() != null, EtlHldFcstFg::getUW3, bo.getUW3());
        lqw.eq(bo.getUW4() != null, EtlHldFcstFg::getUW4, bo.getUW4());
        lqw.eq(bo.getUW5() != null, EtlHldFcstFg::getUW5, bo.getUW5());
        lqw.eq(bo.getUW6() != null, EtlHldFcstFg::getUW6, bo.getUW6());
        lqw.eq(bo.getUW7() != null, EtlHldFcstFg::getUW7, bo.getUW7());
        lqw.eq(bo.getUW8() != null, EtlHldFcstFg::getUW8, bo.getUW8());
        lqw.eq(bo.getUW9() != null, EtlHldFcstFg::getUW9, bo.getUW9());
        lqw.eq(bo.getUW10() != null, EtlHldFcstFg::getUW10, bo.getUW10());
        lqw.eq(bo.getUW11() != null, EtlHldFcstFg::getUW11, bo.getUW11());
        lqw.eq(bo.getUW12() != null, EtlHldFcstFg::getUW12, bo.getUW12());
        lqw.eq(bo.getUW13() != null, EtlHldFcstFg::getUW13, bo.getUW13());
        lqw.eq(bo.getUM1() != null, EtlHldFcstFg::getUM1, bo.getUM1());
        lqw.eq(bo.getUM2() != null, EtlHldFcstFg::getUM2, bo.getUM2());
        lqw.eq(bo.getUM3() != null, EtlHldFcstFg::getUM3, bo.getUM3());
        lqw.eq(bo.getUM4() != null, EtlHldFcstFg::getUM4, bo.getUM4());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), EtlHldFcstFg::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), EtlHldFcstFg::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), EtlHldFcstFg::getUFilename, bo.getUFilename());
        lqw.eq(StringUtils.isNotBlank(bo.getUEditdate()), EtlHldFcstFg::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增成品销售预测
     */
    @Override
    public Boolean insertByBo(EtlHldFcstFgBo bo) {
        EtlHldFcstFg add = BeanUtil.toBean(bo, EtlHldFcstFg.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setImMainInsuranceConfigId(add.getImMainInsuranceConfigId());
        }
        return flag;
    }

    /**
     * 修改成品销售预测
     */
    @Override
    public Boolean updateByBo(EtlHldFcstFgBo bo) {
        EtlHldFcstFg update = BeanUtil.toBean(bo, EtlHldFcstFg.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(EtlHldFcstFg entity){
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
