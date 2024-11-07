package com.plan.report.service;

import com.plan.report.domain.TLogInterfaceCheck;
import com.plan.report.domain.vo.TLogInterfaceCheckVo;
import com.plan.report.domain.bo.TLogInterfaceCheckBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 预测接口检查Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface ITLogInterfaceCheckService {

    /**
     * 查询预测接口检查
     */
    TLogInterfaceCheckVo queryById(Long id);

    /**
     * 查询预测接口检查列表
     */
    TableDataInfo<TLogInterfaceCheckVo> queryPageList(TLogInterfaceCheckBo bo, PageQuery pageQuery);

    /**
     * 查询预测接口检查列表
     */
    List<TLogInterfaceCheckVo> queryList(TLogInterfaceCheckBo bo);

    /**
     * 新增预测接口检查
     */
    Boolean insertByBo(TLogInterfaceCheckBo bo);

    /**
     * 修改预测接口检查
     */
    Boolean updateByBo(TLogInterfaceCheckBo bo);

    /**
     * 校验并批量删除预测接口检查信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
