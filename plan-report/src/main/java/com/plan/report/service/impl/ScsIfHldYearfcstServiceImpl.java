package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsIfHldYearfcst;
import com.plan.report.domain.bo.ScsIfHldYearfcstBo;
import com.plan.report.domain.vo.ScsIfHldYearfcstVo;
import com.plan.report.mapper.ScsIfHldYearfcstMapper;
import com.plan.report.service.IScsIfHldYearfcstService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_if_hld_yearfcstService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsIfHldYearfcstServiceImpl implements IScsIfHldYearfcstService {

    private final ScsIfHldYearfcstMapper baseMapper;

    /**
     * 查询scs_if_hld_yearfcst
     */
    @Override
    public ScsIfHldYearfcstVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_if_hld_yearfcst列表
     */
    @Override
    public TableDataInfo<ScsIfHldYearfcstVo> queryPageList(ScsIfHldYearfcstBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsIfHldYearfcst> lqw = buildQueryWrapper(bo);
        Page<ScsIfHldYearfcstVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_if_hld_yearfcst列表
     */
    @Override
    public List<ScsIfHldYearfcstVo> queryList(ScsIfHldYearfcstBo bo) {
        LambdaQueryWrapper<ScsIfHldYearfcst> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsIfHldYearfcst> buildQueryWrapper(ScsIfHldYearfcstBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsIfHldYearfcst> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), ScsIfHldYearfcst::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsIfHldYearfcst::getLoc, bo.getLoc());
        lqw.eq(bo.getStartdate() != null, ScsIfHldYearfcst::getStartdate, bo.getStartdate());
        lqw.eq(bo.getUM1() != null, ScsIfHldYearfcst::getUM1, bo.getUM1());
        lqw.eq(bo.getUM2() != null, ScsIfHldYearfcst::getUM2, bo.getUM2());
        lqw.eq(bo.getUM3() != null, ScsIfHldYearfcst::getUM3, bo.getUM3());
        lqw.eq(bo.getUM4() != null, ScsIfHldYearfcst::getUM4, bo.getUM4());
        lqw.eq(bo.getUM5() != null, ScsIfHldYearfcst::getUM5, bo.getUM5());
        lqw.eq(bo.getUM6() != null, ScsIfHldYearfcst::getUM6, bo.getUM6());
        lqw.eq(bo.getUM7() != null, ScsIfHldYearfcst::getUM7, bo.getUM7());
        lqw.eq(bo.getUM8() != null, ScsIfHldYearfcst::getUM8, bo.getUM8());
        lqw.eq(bo.getUM9() != null, ScsIfHldYearfcst::getUM9, bo.getUM9());
        lqw.eq(bo.getUM10() != null, ScsIfHldYearfcst::getUM10, bo.getUM10());
        lqw.eq(bo.getUM11() != null, ScsIfHldYearfcst::getUM11, bo.getUM11());
        lqw.eq(bo.getUM12() != null, ScsIfHldYearfcst::getUM12, bo.getUM12());
        lqw.eq(bo.getUM13() != null, ScsIfHldYearfcst::getUM13, bo.getUM13());
        lqw.eq(bo.getUM14() != null, ScsIfHldYearfcst::getUM14, bo.getUM14());
        lqw.eq(bo.getUM15() != null, ScsIfHldYearfcst::getUM15, bo.getUM15());
        lqw.eq(bo.getUM16() != null, ScsIfHldYearfcst::getUM16, bo.getUM16());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), ScsIfHldYearfcst::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), ScsIfHldYearfcst::getUCorporation, bo.getUCorporation());
        lqw.eq(bo.getUFlag() != null, ScsIfHldYearfcst::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsIfHldYearfcst::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), ScsIfHldYearfcst::getUFilename, bo.getUFilename());
        lqw.eq(bo.getUEditdate() != null, ScsIfHldYearfcst::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增scs_if_hld_yearfcst
     */
    @Override
    public Boolean insertByBo(ScsIfHldYearfcstBo bo) {
        ScsIfHldYearfcst add = BeanUtil.toBean(bo, ScsIfHldYearfcst.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_if_hld_yearfcst
     */
    @Override
    public Boolean updateByBo(ScsIfHldYearfcstBo bo) {
        ScsIfHldYearfcst update = BeanUtil.toBean(bo, ScsIfHldYearfcst.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsIfHldYearfcst entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_if_hld_yearfcst
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
