package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.EtlHldFcst;
import com.plan.report.domain.bo.EtlHldFcstBo;
import com.plan.report.domain.vo.EtlHldFcstVo;
import com.plan.report.mapper.EtlHldFcstMapper;
import com.plan.report.service.IEtlHldFcstService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 销售预测Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class EtlHldFcstServiceImpl implements IEtlHldFcstService {

    private final EtlHldFcstMapper baseMapper;

    /**
     * 查询销售预测
     */
    @Override
    public EtlHldFcstVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询销售预测列表
     */
    @Override
    public TableDataInfo<EtlHldFcstVo> queryPageList(EtlHldFcstBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<EtlHldFcst> lqw = buildQueryWrapper(bo);
        Page<EtlHldFcstVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询销售预测列表
     */
    @Override
    public List<EtlHldFcstVo> queryList(EtlHldFcstBo bo) {
        LambdaQueryWrapper<EtlHldFcst> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<EtlHldFcst> buildQueryWrapper(EtlHldFcstBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<EtlHldFcst> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getDmdunit()), EtlHldFcst::getDmdunit, bo.getDmdunit());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), EtlHldFcst::getDmdgroup, bo.getDmdgroup());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), EtlHldFcst::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getModel()), EtlHldFcst::getModel, bo.getModel());
        lqw.eq(bo.getStartdate() != null, EtlHldFcst::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getDur()), EtlHldFcst::getDur, bo.getDur());
        lqw.eq(bo.getQty() != null, EtlHldFcst::getQty, bo.getQty());
        lqw.eq(StringUtils.isNotBlank(bo.getType()), EtlHldFcst::getType, bo.getType());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), EtlHldFcst::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), EtlHldFcst::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), EtlHldFcst::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), EtlHldFcst::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), EtlHldFcst::getUFilename, bo.getUFilename());
        lqw.eq(StringUtils.isNotBlank(bo.getUEditdate()), EtlHldFcst::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增销售预测
     */
    @Override
    public Boolean insertByBo(EtlHldFcstBo bo) {
        EtlHldFcst add = BeanUtil.toBean(bo, EtlHldFcst.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改销售预测
     */
    @Override
    public Boolean updateByBo(EtlHldFcstBo bo) {
        EtlHldFcst update = BeanUtil.toBean(bo, EtlHldFcst.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(EtlHldFcst entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除销售预测
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
