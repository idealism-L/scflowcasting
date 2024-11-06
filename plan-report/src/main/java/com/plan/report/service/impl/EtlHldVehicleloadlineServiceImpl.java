package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.EtlHldVehicleloadline;
import com.plan.report.domain.bo.EtlHldVehicleloadlineBo;
import com.plan.report.domain.vo.EtlHldVehicleloadlineVo;
import com.plan.report.mapper.EtlHldVehicleloadlineMapper;
import com.plan.report.service.IEtlHldVehicleloadlineService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 在途Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class EtlHldVehicleloadlineServiceImpl implements IEtlHldVehicleloadlineService {

    private final EtlHldVehicleloadlineMapper baseMapper;

    /**
     * 查询在途
     */
    @Override
    public EtlHldVehicleloadlineVo queryById(Long imMainInsuranceConfigId){
        return baseMapper.selectVoById(imMainInsuranceConfigId);
    }

    /**
     * 查询在途列表
     */
    @Override
    public TableDataInfo<EtlHldVehicleloadlineVo> queryPageList(EtlHldVehicleloadlineBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<EtlHldVehicleloadline> lqw = buildQueryWrapper(bo);
        Page<EtlHldVehicleloadlineVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询在途列表
     */
    @Override
    public List<EtlHldVehicleloadlineVo> queryList(EtlHldVehicleloadlineBo bo) {
        LambdaQueryWrapper<EtlHldVehicleloadline> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<EtlHldVehicleloadline> buildQueryWrapper(EtlHldVehicleloadlineBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<EtlHldVehicleloadline> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getLoadid()), EtlHldVehicleloadline::getLoadid, bo.getLoadid());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), EtlHldVehicleloadline::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getSourcestatus()), EtlHldVehicleloadline::getSourcestatus, bo.getSourcestatus());
        lqw.eq(StringUtils.isNotBlank(bo.getDeststatus0()), EtlHldVehicleloadline::getDeststatus0, bo.getDeststatus0());
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), EtlHldVehicleloadline::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getSource()), EtlHldVehicleloadline::getSource, bo.getSource());
        lqw.eq(StringUtils.isNotBlank(bo.getDest()), EtlHldVehicleloadline::getDest, bo.getDest());
        lqw.eq(bo.getQty() != null, EtlHldVehicleloadline::getQty, bo.getQty());
        lqw.eq(bo.getAvaildate() != null, EtlHldVehicleloadline::getAvaildate, bo.getAvaildate());
        lqw.eq(bo.getAvaildate0() != null, EtlHldVehicleloadline::getAvaildate0, bo.getAvaildate0());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), EtlHldVehicleloadline::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getUCorporation()), EtlHldVehicleloadline::getUCorporation, bo.getUCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), EtlHldVehicleloadline::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), EtlHldVehicleloadline::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getUFilename()), EtlHldVehicleloadline::getUFilename, bo.getUFilename());
        lqw.eq(StringUtils.isNotBlank(bo.getUEditdate()), EtlHldVehicleloadline::getUEditdate, bo.getUEditdate());
        return lqw;
    }

    /**
     * 新增在途
     */
    @Override
    public Boolean insertByBo(EtlHldVehicleloadlineBo bo) {
        EtlHldVehicleloadline add = BeanUtil.toBean(bo, EtlHldVehicleloadline.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setImMainInsuranceConfigId(add.getImMainInsuranceConfigId());
        }
        return flag;
    }

    /**
     * 修改在途
     */
    @Override
    public Boolean updateByBo(EtlHldVehicleloadlineBo bo) {
        EtlHldVehicleloadline update = BeanUtil.toBean(bo, EtlHldVehicleloadline.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(EtlHldVehicleloadline entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除在途
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
