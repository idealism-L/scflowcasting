package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.EtlHldYearfcst;
import com.plan.report.domain.bo.EtlHldYearfcstBo;
import com.plan.report.domain.vo.EtlHldYearfcstVo;
import com.plan.report.mapper.EtlHldYearfcstMapper;
import com.plan.report.service.IEtlHldYearfcstService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 年预测Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class EtlHldYearfcstServiceImpl implements IEtlHldYearfcstService {

    private final EtlHldYearfcstMapper baseMapper;

    /**
     * 查询年预测
     */
    @Override
    public EtlHldYearfcstVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询年预测列表
     */
    @Override
    public TableDataInfo<EtlHldYearfcstVo> queryPageList(EtlHldYearfcstBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<EtlHldYearfcst> lqw = buildQueryWrapper(bo);
        Page<EtlHldYearfcstVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询年预测列表
     */
    @Override
    public List<EtlHldYearfcstVo> queryList(EtlHldYearfcstBo bo) {
        LambdaQueryWrapper<EtlHldYearfcst> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<EtlHldYearfcst> buildQueryWrapper(EtlHldYearfcstBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<EtlHldYearfcst> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), EtlHldYearfcst::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), EtlHldYearfcst::getLoc, bo.getLoc());
        lqw.eq(bo.getStartdate() != null, EtlHldYearfcst::getStartdate, bo.getStartdate());
        lqw.eq(bo.getUM1() != null, EtlHldYearfcst::getUM1, bo.getUM1());
        lqw.eq(bo.getUM2() != null, EtlHldYearfcst::getUM2, bo.getUM2());
        lqw.eq(bo.getUM3() != null, EtlHldYearfcst::getUM3, bo.getUM3());
        lqw.eq(bo.getUM4() != null, EtlHldYearfcst::getUM4, bo.getUM4());
        lqw.eq(bo.getUM5() != null, EtlHldYearfcst::getUM5, bo.getUM5());
        lqw.eq(bo.getUM6() != null, EtlHldYearfcst::getUM6, bo.getUM6());
        lqw.eq(bo.getUM7() != null, EtlHldYearfcst::getUM7, bo.getUM7());
        lqw.eq(bo.getUM8() != null, EtlHldYearfcst::getUM8, bo.getUM8());
        lqw.eq(bo.getUM9() != null, EtlHldYearfcst::getUM9, bo.getUM9());
        lqw.eq(bo.getUM10() != null, EtlHldYearfcst::getUM10, bo.getUM10());
        lqw.eq(bo.getUM11() != null, EtlHldYearfcst::getUM11, bo.getUM11());
        lqw.eq(bo.getUM12() != null, EtlHldYearfcst::getUM12, bo.getUM12());
        lqw.eq(bo.getUM13() != null, EtlHldYearfcst::getUM13, bo.getUM13());
        lqw.eq(bo.getUM14() != null, EtlHldYearfcst::getUM14, bo.getUM14());
        lqw.eq(bo.getUM15() != null, EtlHldYearfcst::getUM15, bo.getUM15());
        lqw.eq(bo.getUM16() != null, EtlHldYearfcst::getUM16, bo.getUM16());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), EtlHldYearfcst::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), EtlHldYearfcst::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), EtlHldYearfcst::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), EtlHldYearfcst::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), EtlHldYearfcst::getUFilename, bo.getUFilename());
        lqw.eq(StringUtils.isNotBlank(bo.getUEditdate()), EtlHldYearfcst::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增年预测
     */
    @Override
    public Boolean insertByBo(EtlHldYearfcstBo bo) {
        EtlHldYearfcst add = BeanUtil.toBean(bo, EtlHldYearfcst.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改年预测
     */
    @Override
    public Boolean updateByBo(EtlHldYearfcstBo bo) {
        EtlHldYearfcst update = BeanUtil.toBean(bo, EtlHldYearfcst.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(EtlHldYearfcst entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除年预测
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
