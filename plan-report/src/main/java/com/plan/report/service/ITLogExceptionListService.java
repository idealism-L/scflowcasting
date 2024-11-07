package com.plan.report.service;

import com.plan.report.domain.TLogExceptionList;
import com.plan.report.domain.vo.TLogExceptionListVo;
import com.plan.report.domain.bo.TLogExceptionListBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 接口异常信息Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface ITLogExceptionListService {

    /**
     * 查询接口异常信息
     */
    TLogExceptionListVo queryById(Long id);

    /**
     * 查询接口异常信息列表
     */
    TableDataInfo<TLogExceptionListVo> queryPageList(TLogExceptionListBo bo, PageQuery pageQuery);

    /**
     * 查询接口异常信息列表
     */
    List<TLogExceptionListVo> queryList(TLogExceptionListBo bo);

    /**
     * 新增接口异常信息
     */
    Boolean insertByBo(TLogExceptionListBo bo);

    /**
     * 修改接口异常信息
     */
    Boolean updateByBo(TLogExceptionListBo bo);

    /**
     * 校验并批量删除接口异常信息信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
