package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsIfHldFcst;
import com.plan.report.domain.bo.ScsIfHldFcstBo;
import com.plan.report.domain.vo.ScsIfHldFcstVo;
import com.plan.report.mapper.ScsIfHldFcstMapper;
import com.plan.report.service.IScsIfHldFcstService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_if_hld_fcstService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsIfHldFcstServiceImpl implements IScsIfHldFcstService {

    private final ScsIfHldFcstMapper baseMapper;

    /**
     * 查询scs_if_hld_fcst
     */
    @Override
    public ScsIfHldFcstVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_if_hld_fcst列表
     */
    @Override
    public TableDataInfo<ScsIfHldFcstVo> queryPageList(ScsIfHldFcstBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsIfHldFcst> lqw = buildQueryWrapper(bo);
        Page<ScsIfHldFcstVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_if_hld_fcst列表
     */
    @Override
    public List<ScsIfHldFcstVo> queryList(ScsIfHldFcstBo bo) {
        LambdaQueryWrapper<ScsIfHldFcst> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsIfHldFcst> buildQueryWrapper(ScsIfHldFcstBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsIfHldFcst> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getDmdunit()), ScsIfHldFcst::getDmdunit, bo.getDmdunit());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), ScsIfHldFcst::getDmdgroup, bo.getDmdgroup());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsIfHldFcst::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getModel()), ScsIfHldFcst::getModel, bo.getModel());
        lqw.eq(bo.getStartdate() != null, ScsIfHldFcst::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getDur()), ScsIfHldFcst::getDur, bo.getDur());
        lqw.eq(bo.getQty() != null, ScsIfHldFcst::getQty, bo.getQty());
        lqw.eq(StringUtils.isNotBlank(bo.getType()), ScsIfHldFcst::getType, bo.getType());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), ScsIfHldFcst::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), ScsIfHldFcst::getUCorporation, bo.getUCorporation());
        lqw.eq(bo.getUFlag() != null, ScsIfHldFcst::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsIfHldFcst::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), ScsIfHldFcst::getUFilename, bo.getUFilename());
        lqw.eq(bo.getUEditdate() != null, ScsIfHldFcst::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增scs_if_hld_fcst
     */
    @Override
    public Boolean insertByBo(ScsIfHldFcstBo bo) {
        ScsIfHldFcst add = BeanUtil.toBean(bo, ScsIfHldFcst.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_if_hld_fcst
     */
    @Override
    public Boolean updateByBo(ScsIfHldFcstBo bo) {
        ScsIfHldFcst update = BeanUtil.toBean(bo, ScsIfHldFcst.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsIfHldFcst entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_if_hld_fcst
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
