package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsLoc;
import com.plan.report.domain.bo.ScsLocBo;
import com.plan.report.domain.vo.ScsLocVo;
import com.plan.report.mapper.ScsLocMapper;
import com.plan.report.service.IScsLocService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * scs_locService业务层处理
 *
 * @author ruoyi
 */
@RequiredArgsConstructor
@Service
public class ScsLocServiceImpl implements IScsLocService {

    private final ScsLocMapper baseMapper;

    /**
     * 查询scs_loc
     */
    @Override
    public ScsLocVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_loc列表
     */
    @Override
    public TableDataInfo<ScsLocVo> queryPageList(ScsLocBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsLoc> lqw = buildQueryWrapper(bo);
        Page<ScsLocVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_loc列表
     */
    @Override
    public List<ScsLocVo> queryList(ScsLocBo bo) {
        LambdaQueryWrapper<ScsLoc> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    /**
     * 根据集团查地点
     */
    public List<String> listByCorporation(ScsLocBo bo) {
        LambdaQueryWrapper<ScsLoc> lqw = new LambdaQueryWrapper<>();
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsLoc::getCorporation, bo.getCorporation());
        List<ScsLocVo> selectVoList = baseMapper.selectVoList(lqw);
        List<String> locs = new ArrayList<>();
        for (ScsLocVo scsLocVo : selectVoList) {
            locs.add(scsLocVo.getLoc());
        }
        return locs;
    }

    private LambdaQueryWrapper<ScsLoc> buildQueryWrapper(ScsLocBo bo) {
        LambdaQueryWrapper<ScsLoc> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsLoc::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getLocOwnCode()), ScsLoc::getLocOwnCode, bo.getLocOwnCode());
        lqw.eq(StringUtils.isNotBlank(bo.getDescr()), ScsLoc::getDescr, bo.getDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getOu()), ScsLoc::getOu, bo.getOu());
        lqw.eq(StringUtils.isNotBlank(bo.getOuDescr()), ScsLoc::getOuDescr, bo.getOuDescr());
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), ScsLoc::getCorporation, bo.getCorporation());
        lqw.eq(StringUtils.isNotBlank(bo.getLocType()), ScsLoc::getLocType, bo.getLocType());
        // 将等值查询改为模糊查询
        lqw.like(StringUtils.isNotBlank(bo.getCpsCode()), ScsLoc::getCpsCode, bo.getCpsCode());
        lqw.eq(StringUtils.isNotBlank(bo.getEmail()), ScsLoc::getEmail, bo.getEmail());
        lqw.eq(bo.getVersionNo() != null, ScsLoc::getVersionNo, bo.getVersionNo());
        // 检查 ids 数组是否不为空
        if (bo.getIds() != null && bo.getIds().length > 0) {
            lqw.in(ScsLoc::getId, Arrays.asList(bo.getIds()));
        }
        return lqw;
    }

    /**
     * 新增scs_loc
     */
    @Override
    public Boolean insertByBo(ScsLocBo bo) {
        ScsLoc add = BeanUtil.toBean(bo, ScsLoc.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_loc
     */
    @Override
    public Boolean updateByBo(ScsLocBo bo) {
        ScsLoc update = BeanUtil.toBean(bo, ScsLoc.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsLoc entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_loc
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }

    @Override
    public List<ScsLoc> checkUnique(ScsLocBo bo) {
        LambdaQueryWrapper<ScsLoc> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), ScsLoc::getLoc, bo.getLoc());
        return baseMapper.selectList(lqw);
    }
}
