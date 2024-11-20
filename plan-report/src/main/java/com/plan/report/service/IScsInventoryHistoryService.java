package com.plan.report.service;

import com.plan.report.domain.ScsInventoryHistory;
import com.plan.report.domain.vo.ScsInventoryHistoryVo;
import com.plan.report.domain.bo.ScsInventoryHistoryBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_inventory_historyService接口
 *
 * @author ruoyi
 * @date 2024-11-20
 */
public interface IScsInventoryHistoryService {

    /**
     * 查询scs_inventory_history
     */
    ScsInventoryHistoryVo queryById(Long id);

    /**
     * 查询scs_inventory_history列表
     */
    TableDataInfo<ScsInventoryHistoryVo> queryPageList(ScsInventoryHistoryBo bo, PageQuery pageQuery);

    /**
     * 查询scs_inventory_history列表
     */
    List<ScsInventoryHistoryVo> queryList(ScsInventoryHistoryBo bo);

    /**
     * 新增scs_inventory_history
     */
    Boolean insertByBo(ScsInventoryHistoryBo bo);

    /**
     * 修改scs_inventory_history
     */
    Boolean updateByBo(ScsInventoryHistoryBo bo);

    /**
     * 校验并批量删除scs_inventory_history信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
