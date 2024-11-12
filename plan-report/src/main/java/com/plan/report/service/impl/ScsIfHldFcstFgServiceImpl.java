package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsIfHldFcstFg;
import com.plan.report.domain.bo.ScsIfHldFcstFgBo;
import com.plan.report.domain.vo.ScsIfHldFcstFgVo;
import com.plan.report.mapper.ScsIfHldFcstFgMapper;
import com.plan.report.service.IScsIfHldFcstFgService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_if_hld_fcst_fgService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsIfHldFcstFgServiceImpl implements IScsIfHldFcstFgService {

    private final ScsIfHldFcstFgMapper baseMapper;

    /**
     * 查询scs_if_hld_fcst_fg
     */
    @Override
    public ScsIfHldFcstFgVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_if_hld_fcst_fg列表
     */
    @Override
    public TableDataInfo<ScsIfHldFcstFgVo> queryPageList(ScsIfHldFcstFgBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsIfHldFcstFg> lqw = buildQueryWrapper(bo);
        Page<ScsIfHldFcstFgVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_if_hld_fcst_fg列表
     */
    @Override
    public List<ScsIfHldFcstFgVo> queryList(ScsIfHldFcstFgBo bo) {
        LambdaQueryWrapper<ScsIfHldFcstFg> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsIfHldFcstFg> buildQueryWrapper(ScsIfHldFcstFgBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsIfHldFcstFg> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), ScsIfHldFcstFg::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdunit()), ScsIfHldFcstFg::getDmdunit, bo.getDmdunit());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), ScsIfHldFcstFg::getDmdgroup, bo.getDmdgroup());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsIfHldFcstFg::getLoc, bo.getLoc());
        lqw.eq(bo.getStartdate() != null, ScsIfHldFcstFg::getStartdate, bo.getStartdate());
        lqw.eq(bo.getUOh() != null, ScsIfHldFcstFg::getUOh, bo.getUOh());
        lqw.eq(bo.getUW1() != null, ScsIfHldFcstFg::getUW1, bo.getUW1());
        lqw.eq(bo.getUW2() != null, ScsIfHldFcstFg::getUW2, bo.getUW2());
        lqw.eq(bo.getUW3() != null, ScsIfHldFcstFg::getUW3, bo.getUW3());
        lqw.eq(bo.getUW4() != null, ScsIfHldFcstFg::getUW4, bo.getUW4());
        lqw.eq(bo.getUW5() != null, ScsIfHldFcstFg::getUW5, bo.getUW5());
        lqw.eq(bo.getUW6() != null, ScsIfHldFcstFg::getUW6, bo.getUW6());
        lqw.eq(bo.getUW7() != null, ScsIfHldFcstFg::getUW7, bo.getUW7());
        lqw.eq(bo.getUW8() != null, ScsIfHldFcstFg::getUW8, bo.getUW8());
        lqw.eq(bo.getUW9() != null, ScsIfHldFcstFg::getUW9, bo.getUW9());
        lqw.eq(bo.getUW10() != null, ScsIfHldFcstFg::getUW10, bo.getUW10());
        lqw.eq(bo.getUW11() != null, ScsIfHldFcstFg::getUW11, bo.getUW11());
        lqw.eq(bo.getUW12() != null, ScsIfHldFcstFg::getUW12, bo.getUW12());
        lqw.eq(bo.getUW13() != null, ScsIfHldFcstFg::getUW13, bo.getUW13());
        lqw.eq(bo.getUM1() != null, ScsIfHldFcstFg::getUM1, bo.getUM1());
        lqw.eq(bo.getUM2() != null, ScsIfHldFcstFg::getUM2, bo.getUM2());
        lqw.eq(bo.getUM3() != null, ScsIfHldFcstFg::getUM3, bo.getUM3());
        lqw.eq(bo.getUM4() != null, ScsIfHldFcstFg::getUM4, bo.getUM4());
        lqw.eq(bo.getUFlag() != null, ScsIfHldFcstFg::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsIfHldFcstFg::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), ScsIfHldFcstFg::getUFilename, bo.getUFilename());
        lqw.eq(bo.getUEditdate() != null, ScsIfHldFcstFg::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增scs_if_hld_fcst_fg
     */
    @Override
    public Boolean insertByBo(ScsIfHldFcstFgBo bo) {
        ScsIfHldFcstFg add = BeanUtil.toBean(bo, ScsIfHldFcstFg.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_if_hld_fcst_fg
     */
    @Override
    public Boolean updateByBo(ScsIfHldFcstFgBo bo) {
        ScsIfHldFcstFg update = BeanUtil.toBean(bo, ScsIfHldFcstFg.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsIfHldFcstFg entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_if_hld_fcst_fg
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
