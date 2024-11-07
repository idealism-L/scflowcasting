package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.TLogExceptionList;
import com.plan.report.domain.bo.TLogExceptionListBo;
import com.plan.report.domain.vo.TLogExceptionListVo;
import com.plan.report.mapper.TLogExceptionListMapper;
import com.plan.report.service.ITLogExceptionListService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 接口异常信息Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@RequiredArgsConstructor
@Service
public class TLogExceptionListServiceImpl implements ITLogExceptionListService {

    private final TLogExceptionListMapper baseMapper;

    /**
     * 查询接口异常信息
     */
    @Override
    public TLogExceptionListVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询接口异常信息列表
     */
    @Override
    public TableDataInfo<TLogExceptionListVo> queryPageList(TLogExceptionListBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<TLogExceptionList> lqw = buildQueryWrapper(bo);
        Page<TLogExceptionListVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询接口异常信息列表
     */
    @Override
    public List<TLogExceptionListVo> queryList(TLogExceptionListBo bo) {
        LambdaQueryWrapper<TLogExceptionList> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<TLogExceptionList> buildQueryWrapper(TLogExceptionListBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<TLogExceptionList> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getCorporation()), TLogExceptionList::getCorporation, bo.getCorporation());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), TLogExceptionList::getFileName, bo.getFileName());
        lqw.eq(StringUtils.isNotBlank(bo.getUItemPattern()), TLogExceptionList::getUItemPattern, bo.getUItemPattern());
        lqw.eq(StringUtils.isNotBlank(bo.getItem()), TLogExceptionList::getItem, bo.getItem());
        lqw.eq(StringUtils.isNotBlank(bo.getLoc()), TLogExceptionList::getLoc, bo.getLoc());
        lqw.eq(StringUtils.isNotBlank(bo.getUComment()), TLogExceptionList::getUComment, bo.getUComment());
        return lqw;
    }

    /**
     * 新增接口异常信息
     */
    @Override
    public Boolean insertByBo(TLogExceptionListBo bo) {
        TLogExceptionList add = BeanUtil.toBean(bo, TLogExceptionList.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改接口异常信息
     */
    @Override
    public Boolean updateByBo(TLogExceptionListBo bo) {
        TLogExceptionList update = BeanUtil.toBean(bo, TLogExceptionList.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(TLogExceptionList entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除接口异常信息
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
