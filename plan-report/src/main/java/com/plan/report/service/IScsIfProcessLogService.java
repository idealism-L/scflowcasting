package com.plan.report.service;

import com.plan.report.domain.ScsIfProcessLog;
import com.plan.report.domain.vo.ScsIfProcessLogVo;
import com.plan.report.domain.bo.ScsIfProcessLogBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_if_process_logService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsIfProcessLogService {

    /**
     * 查询scs_if_process_log
     */
    ScsIfProcessLogVo queryById(Long id);

    /**
     * 查询scs_if_process_log列表
     */
    TableDataInfo<ScsIfProcessLogVo> queryPageList(ScsIfProcessLogBo bo, PageQuery pageQuery);

    /**
     * 查询scs_if_process_log列表
     */
    List<ScsIfProcessLogVo> queryList(ScsIfProcessLogBo bo);

    /**
     * 新增scs_if_process_log
     */
    Boolean insertByBo(ScsIfProcessLogBo bo);

    /**
     * 修改scs_if_process_log
     */
    Boolean updateByBo(ScsIfProcessLogBo bo);

    /**
     * 校验并批量删除scs_if_process_log信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
