package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsFgFcst;
import com.plan.report.domain.bo.ScsFgFcstBo;
import com.plan.report.domain.vo.ScsFgFcstVo;
import com.plan.report.mapper.ScsFgFcstMapper;
import com.plan.report.service.IScsFgFcstService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_fg_fcstService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-13
 */
@RequiredArgsConstructor
@Service
public class ScsFgFcstServiceImpl implements IScsFgFcstService {

    private final ScsFgFcstMapper baseMapper;

    /**
     * 查询scs_fg_fcst
     */
    @Override
    public ScsFgFcstVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_fg_fcst列表
     */
    @Override
    public TableDataInfo<ScsFgFcstVo> queryPageList(ScsFgFcstBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsFgFcst> lqw = buildQueryWrapper(bo);
        Page<ScsFgFcstVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_fg_fcst列表
     */
    @Override
    public List<ScsFgFcstVo> queryList(ScsFgFcstBo bo) {
        LambdaQueryWrapper<ScsFgFcst> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsFgFcst> buildQueryWrapper(ScsFgFcstBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsFgFcst> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getParentId() != null, ScsFgFcst::getParentId, bo.getParentId());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsFgFcst::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsFgFcst::getItemCode, bo.getItemCode());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), ScsFgFcst::getDmdgroup, bo.getDmdgroup());
        lqw.eq(bo.getStartdate() != null, ScsFgFcst::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsFgFcst::getLoc, bo.getLoc());
        lqw.eq(bo.getQty() != null, ScsFgFcst::getQty, bo.getQty());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), ScsFgFcst::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsFgFcst::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsFgFcst::getFileName, bo.getFileName());
        lqw.eq(bo.getEditdate() != null, ScsFgFcst::getEditdate, bo.getEditdate());
        lqw.eq(bo.getVersionNo() != null, ScsFgFcst::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_fg_fcst
     */
    @Override
    public Boolean insertByBo(ScsFgFcstBo bo) {
        ScsFgFcst add = BeanUtil.toBean(bo, ScsFgFcst.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_fg_fcst
     */
    @Override
    public Boolean updateByBo(ScsFgFcstBo bo) {
        ScsFgFcst update = BeanUtil.toBean(bo, ScsFgFcst.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsFgFcst entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_fg_fcst
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
