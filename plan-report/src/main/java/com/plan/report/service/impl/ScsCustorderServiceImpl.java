package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsCustorder;
import com.plan.report.domain.bo.ScsCustorderBo;
import com.plan.report.domain.vo.ScsCustorderVo;
import com.plan.report.mapper.ScsCustorderMapper;
import com.plan.report.service.IScsCustorderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_custorderService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsCustorderServiceImpl implements IScsCustorderService {

    private final ScsCustorderMapper baseMapper;

    /**
     * 查询scs_custorder
     */
    @Override
    public ScsCustorderVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_custorder列表
     */
    @Override
    public TableDataInfo<ScsCustorderVo> queryPageList(ScsCustorderBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsCustorder> lqw = buildQueryWrapper(bo);
        Page<ScsCustorderVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_custorder列表
     */
    @Override
    public List<ScsCustorderVo> queryList(ScsCustorderBo bo) {
        LambdaQueryWrapper<ScsCustorder> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsCustorder> buildQueryWrapper(ScsCustorderBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsCustorder> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsCustorder::getItemCode, bo.getItemCode());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsCustorder::getLoc, bo.getLoc());
        lqw.eq(bo.getShipdate() != null, ScsCustorder::getShipdate, bo.getShipdate());
        lqw.eq(StringUtils.isNotBlank(bo.getOrderid()), ScsCustorder::getOrderid, bo.getOrderid());
        lqw.eq(bo.getQty() != null, ScsCustorder::getQty, bo.getQty());
        lqw.eq(StringUtils.isNotBlank(bo.getItemPattern()), ScsCustorder::getItemPattern, bo.getItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsCustorder::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsCustorder::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsCustorder::getFileName, bo.getFileName());
        lqw.eq(bo.getEditdate() != null, ScsCustorder::getEditdate, bo.getEditdate());
        lqw.eq(bo.getVersionNo() != null, ScsCustorder::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_custorder
     */
    @Override
    public Boolean insertByBo(ScsCustorderBo bo) {
        ScsCustorder add = BeanUtil.toBean(bo, ScsCustorder.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_custorder
     */
    @Override
    public Boolean updateByBo(ScsCustorderBo bo) {
        ScsCustorder update = BeanUtil.toBean(bo, ScsCustorder.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsCustorder entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_custorder
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
