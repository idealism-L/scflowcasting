package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsIfHldCustorder;
import com.plan.report.domain.bo.ScsIfHldCustorderBo;
import com.plan.report.domain.vo.ScsIfHldCustorderVo;
import com.plan.report.mapper.ScsIfHldCustorderMapper;
import com.plan.report.service.IScsIfHldCustorderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_if_hld_custorderService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsIfHldCustorderServiceImpl implements IScsIfHldCustorderService {

    private final ScsIfHldCustorderMapper baseMapper;

    /**
     * 查询scs_if_hld_custorder
     */
    @Override
    public ScsIfHldCustorderVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_if_hld_custorder列表
     */
    @Override
    public TableDataInfo<ScsIfHldCustorderVo> queryPageList(ScsIfHldCustorderBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsIfHldCustorder> lqw = buildQueryWrapper(bo);
        Page<ScsIfHldCustorderVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_if_hld_custorder列表
     */
    @Override
    public List<ScsIfHldCustorderVo> queryList(ScsIfHldCustorderBo bo) {
        LambdaQueryWrapper<ScsIfHldCustorder> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsIfHldCustorder> buildQueryWrapper(ScsIfHldCustorderBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsIfHldCustorder> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), ScsIfHldCustorder::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsIfHldCustorder::getLoc, bo.getLoc());
        lqw.eq(bo.getShipdate() != null, ScsIfHldCustorder::getShipdate, bo.getShipdate());
        lqw.eq(StringUtils.isNotBlank(bo.getOrderid()), ScsIfHldCustorder::getOrderid, bo.getOrderid());
        lqw.eq(bo.getQty() != null, ScsIfHldCustorder::getQty, bo.getQty());
        lqw.eq(StringUtils.isNotBlank(bo.getCust()), ScsIfHldCustorder::getCust, bo.getCust());
        lqw.eq(bo.getFcstsw() != null, ScsIfHldCustorder::getFcstsw, bo.getFcstsw());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), ScsIfHldCustorder::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), ScsIfHldCustorder::getUCorporation, bo.getUCorporation());
        lqw.eq(bo.getUFlag() != null, ScsIfHldCustorder::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsIfHldCustorder::getUComment, bo.getUComment());
        lqw.eq(bo.getUEditdate() != null, ScsIfHldCustorder::getUEditdate, bo.getUEditdate());
        lqw.like(StringUtils.isNotBlank(bo.getUFileName()), ScsIfHldCustorder::getUFileName, bo.getUFileName());
        return lqw;
    }

    /**
     * 新增scs_if_hld_custorder
     */
    @Override
    public Boolean insertByBo(ScsIfHldCustorderBo bo) {
        ScsIfHldCustorder add = BeanUtil.toBean(bo, ScsIfHldCustorder.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_if_hld_custorder
     */
    @Override
    public Boolean updateByBo(ScsIfHldCustorderBo bo) {
        ScsIfHldCustorder update = BeanUtil.toBean(bo, ScsIfHldCustorder.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsIfHldCustorder entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_if_hld_custorder
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
