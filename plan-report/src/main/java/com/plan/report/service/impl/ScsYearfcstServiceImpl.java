package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsYearfcst;
import com.plan.report.domain.bo.ScsYearfcstBo;
import com.plan.report.domain.vo.ScsYearfcstVo;
import com.plan.report.mapper.ScsYearfcstMapper;
import com.plan.report.service.IScsYearfcstService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_yearfcstService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-13
 */
@RequiredArgsConstructor
@Service
public class ScsYearfcstServiceImpl implements IScsYearfcstService {

    private final ScsYearfcstMapper baseMapper;

    /**
     * 查询scs_yearfcst
     */
    @Override
    public ScsYearfcstVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_yearfcst列表
     */
    @Override
    public TableDataInfo<ScsYearfcstVo> queryPageList(ScsYearfcstBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsYearfcst> lqw = buildQueryWrapper(bo);
        Page<ScsYearfcstVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_yearfcst列表
     */
    @Override
    public List<ScsYearfcstVo> queryList(ScsYearfcstBo bo) {
        LambdaQueryWrapper<ScsYearfcst> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsYearfcst> buildQueryWrapper(ScsYearfcstBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsYearfcst> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getParentId() != null, ScsYearfcst::getParentId, bo.getParentId());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsYearfcst::getItemCode, bo.getItemCode());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), ScsYearfcst::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getDescrEn()), ScsYearfcst::getDescrEn, bo.getDescrEn());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsYearfcst::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getUom()), ScsYearfcst::getUom, bo.getUom());
        lqw.eq(bo.getStartdate() != null, ScsYearfcst::getStartdate, bo.getStartdate());
        lqw.eq(bo.getUM1() != null, ScsYearfcst::getUM1, bo.getUM1());
        lqw.eq(bo.getUM2() != null, ScsYearfcst::getUM2, bo.getUM2());
        lqw.eq(bo.getUM3() != null, ScsYearfcst::getUM3, bo.getUM3());
        lqw.eq(bo.getUM4() != null, ScsYearfcst::getUM4, bo.getUM4());
        lqw.eq(bo.getUM5() != null, ScsYearfcst::getUM5, bo.getUM5());
        lqw.eq(bo.getUM6() != null, ScsYearfcst::getUM6, bo.getUM6());
        lqw.eq(bo.getUM7() != null, ScsYearfcst::getUM7, bo.getUM7());
        lqw.eq(bo.getUM8() != null, ScsYearfcst::getUM8, bo.getUM8());
        lqw.eq(bo.getUM9() != null, ScsYearfcst::getUM9, bo.getUM9());
        lqw.eq(bo.getUM10() != null, ScsYearfcst::getUM10, bo.getUM10());
        lqw.eq(bo.getUM11() != null, ScsYearfcst::getUM11, bo.getUM11());
        lqw.eq(bo.getUM12() != null, ScsYearfcst::getUM12, bo.getUM12());
        lqw.eq(bo.getUM13() != null, ScsYearfcst::getUM13, bo.getUM13());
        lqw.eq(bo.getUM14() != null, ScsYearfcst::getUM14, bo.getUM14());
        lqw.eq(bo.getUM15() != null, ScsYearfcst::getUM15, bo.getUM15());
        lqw.eq(bo.getUM16() != null, ScsYearfcst::getUM16, bo.getUM16());
        lqw.eq(StringUtils.isNotBlank(bo.getItemPattern()), ScsYearfcst::getItemPattern, bo.getItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsYearfcst::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), ScsYearfcst::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsYearfcst::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsYearfcst::getFileName, bo.getFileName());
        lqw.eq(bo.getEditdate() != null, ScsYearfcst::getEditdate, bo.getEditdate());
        lqw.eq(bo.getVersionNo() != null, ScsYearfcst::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_yearfcst
     */
    @Override
    public Boolean insertByBo(ScsYearfcstBo bo) {
        ScsYearfcst add = BeanUtil.toBean(bo, ScsYearfcst.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_yearfcst
     */
    @Override
    public Boolean updateByBo(ScsYearfcstBo bo) {
        ScsYearfcst update = BeanUtil.toBean(bo, ScsYearfcst.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsYearfcst entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_yearfcst
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
