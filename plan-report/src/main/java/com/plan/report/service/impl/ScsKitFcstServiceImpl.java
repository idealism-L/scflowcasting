package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsKitFcst;
import com.plan.report.domain.bo.ScsKitFcstBo;
import com.plan.report.domain.vo.ScsKitFcstVo;
import com.plan.report.mapper.ScsKitFcstMapper;
import com.plan.report.service.IScsKitFcstService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_kit_fcstService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@RequiredArgsConstructor
@Service
public class ScsKitFcstServiceImpl implements IScsKitFcstService {

    private final ScsKitFcstMapper baseMapper;

    /**
     * 查询scs_kit_fcst
     */
    @Override
    public ScsKitFcstVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_kit_fcst列表
     */
    @Override
    public TableDataInfo<ScsKitFcstVo> queryPageList(ScsKitFcstBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsKitFcst> lqw = buildQueryWrapper(bo);
        Page<ScsKitFcstVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_kit_fcst列表
     */
    @Override
    public List<ScsKitFcstVo> queryList(ScsKitFcstBo bo) {
        LambdaQueryWrapper<ScsKitFcst> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsKitFcst> buildQueryWrapper(ScsKitFcstBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsKitFcst> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsKitFcst::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getItemCode()), ScsKitFcst::getItemCode, bo.getItemCode());
        lqw.eq(StringUtils.isNotBlank(bo.getDmdgroup()), ScsKitFcst::getDmdgroup, bo.getDmdgroup());
        lqw.eq(bo.getStartdate() != null, ScsKitFcst::getStartdate, bo.getStartdate());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsKitFcst::getLoc, bo.getLoc());
        lqw.eq(bo.getQty() != null, ScsKitFcst::getQty, bo.getQty());
        lqw.eq(StringUtils.isNotBlank(bo.getUFlag()), ScsKitFcst::getUFlag, bo.getUFlag());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), ScsKitFcst::getUComment, bo.getUComment());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsKitFcst::getFileName, bo.getFileName());
        lqw.eq(bo.getEditdate() != null, ScsKitFcst::getEditdate, bo.getEditdate());
        lqw.eq(bo.getVersionNo() != null, ScsKitFcst::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增scs_kit_fcst
     */
    @Override
    public Boolean insertByBo(ScsKitFcstBo bo) {
        ScsKitFcst add = BeanUtil.toBean(bo, ScsKitFcst.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_kit_fcst
     */
    @Override
    public Boolean updateByBo(ScsKitFcstBo bo) {
        ScsKitFcst update = BeanUtil.toBean(bo, ScsKitFcst.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsKitFcst entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_kit_fcst
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
