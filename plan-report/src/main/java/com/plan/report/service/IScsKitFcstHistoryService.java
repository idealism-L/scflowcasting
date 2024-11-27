package com.plan.report.service;

import com.plan.report.domain.ScsKitFcstHistory;
import com.plan.report.domain.vo.ScsKitFcstHistoryVo;
import com.plan.report.domain.bo.ScsKitFcstHistoryBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_kit_fcst_historyService接口
 *
 * @author ruoyi
 * @date 2024-11-26
 */
public interface IScsKitFcstHistoryService {

    /**
     * 查询scs_kit_fcst_history
     */
    ScsKitFcstHistoryVo queryById(Long id);

    /**
     * 查询scs_kit_fcst_history列表
     */
    TableDataInfo<ScsKitFcstHistoryVo> queryPageList(ScsKitFcstHistoryBo bo, PageQuery pageQuery);

    /**
     * 查询scs_kit_fcst_history列表
     */
    List<ScsKitFcstHistoryVo> queryList(ScsKitFcstHistoryBo bo);

    /**
     * 新增scs_kit_fcst_history
     */
    Boolean insertByBo(ScsKitFcstHistoryBo bo);

    /**
     * 修改scs_kit_fcst_history
     */
    Boolean updateByBo(ScsKitFcstHistoryBo bo);

    /**
     * 校验并批量删除scs_kit_fcst_history信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
