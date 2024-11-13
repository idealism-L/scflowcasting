package com.plan.report.service;

import com.plan.report.domain.ScsYearfcstHistory;
import com.plan.report.domain.vo.ScsYearfcstHistoryVo;
import com.plan.report.domain.bo.ScsYearfcstHistoryBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_yearfcst_historyService接口
 *
 * @author ruoyi
 * @date 2024-11-13
 */
public interface IScsYearfcstHistoryService {

    /**
     * 查询scs_yearfcst_history
     */
    ScsYearfcstHistoryVo queryById(Long id);

    /**
     * 查询scs_yearfcst_history列表
     */
    TableDataInfo<ScsYearfcstHistoryVo> queryPageList(ScsYearfcstHistoryBo bo, PageQuery pageQuery);

    /**
     * 查询scs_yearfcst_history列表
     */
    List<ScsYearfcstHistoryVo> queryList(ScsYearfcstHistoryBo bo);

    /**
     * 新增scs_yearfcst_history
     */
    Boolean insertByBo(ScsYearfcstHistoryBo bo);

    /**
     * 修改scs_yearfcst_history
     */
    Boolean updateByBo(ScsYearfcstHistoryBo bo);

    /**
     * 校验并批量删除scs_yearfcst_history信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
