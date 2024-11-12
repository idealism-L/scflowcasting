package com.plan.report.service;

import com.plan.report.domain.ScsIfExceptionLog;
import com.plan.report.domain.vo.ScsIfExceptionLogVo;
import com.plan.report.domain.bo.ScsIfExceptionLogBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_if_exception_logService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsIfExceptionLogService {

    /**
     * 查询scs_if_exception_log
     */
    ScsIfExceptionLogVo queryById(Long id);

    /**
     * 查询scs_if_exception_log列表
     */
    TableDataInfo<ScsIfExceptionLogVo> queryPageList(ScsIfExceptionLogBo bo, PageQuery pageQuery);

    /**
     * 查询scs_if_exception_log列表
     */
    List<ScsIfExceptionLogVo> queryList(ScsIfExceptionLogBo bo);

    /**
     * 新增scs_if_exception_log
     */
    Boolean insertByBo(ScsIfExceptionLogBo bo);

    /**
     * 修改scs_if_exception_log
     */
    Boolean updateByBo(ScsIfExceptionLogBo bo);

    /**
     * 校验并批量删除scs_if_exception_log信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
