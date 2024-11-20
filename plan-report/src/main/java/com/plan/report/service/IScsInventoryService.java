package com.plan.report.service;

import com.plan.report.domain.ScsInventory;
import com.plan.report.domain.vo.ScsInventoryVo;
import com.plan.report.domain.bo.ScsInventoryBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_inventoryService接口
 *
 * @author ruoyi
 * @date 2024-11-20
 */
public interface IScsInventoryService {

    /**
     * 查询scs_inventory
     */
    ScsInventoryVo queryById(Long id);

    /**
     * 查询scs_inventory列表
     */
    TableDataInfo<ScsInventoryVo> queryPageList(ScsInventoryBo bo, PageQuery pageQuery);

    /**
     * 查询scs_inventory列表
     */
    List<ScsInventoryVo> queryList(ScsInventoryBo bo);

    /**
     * 新增scs_inventory
     */
    Boolean insertByBo(ScsInventoryBo bo);

    /**
     * 修改scs_inventory
     */
    Boolean updateByBo(ScsInventoryBo bo);

    /**
     * 校验并批量删除scs_inventory信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
