package com.plan.report.service;

import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.report.domain.bo.ScsFgFcstHistoryBo;
import com.plan.report.domain.vo.ScsFgFcstHistoryVo;

import java.util.Collection;
import java.util.List;

/**
 * scs_fg_fcst_historyService接口
 *
 * @author ruoyi
 * @date 2024-11-26
 */
public interface IScsFgFcstHistoryService {

    /**
     * 查询scs_fg_fcst_history
     */
    ScsFgFcstHistoryVo queryById(Long id);

    /**
     * 查询scs_fg_fcst_history列表
     */
    TableDataInfo<ScsFgFcstHistoryVo> queryPageList(ScsFgFcstHistoryBo bo, PageQuery pageQuery);

    /**
     * 查询scs_fg_fcst_history列表
     */
    List<ScsFgFcstHistoryVo> queryList(ScsFgFcstHistoryBo bo);

    /**
     * 新增scs_fg_fcst_history
     */
    Boolean insertByBo(ScsFgFcstHistoryBo bo);

    /**
     * 修改scs_fg_fcst_history
     */
    Boolean updateByBo(ScsFgFcstHistoryBo bo);

    /**
     * 校验并批量删除scs_fg_fcst_history信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
