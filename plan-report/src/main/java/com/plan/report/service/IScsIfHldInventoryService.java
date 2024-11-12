package com.plan.report.service;

import com.plan.report.domain.ScsIfHldInventory;
import com.plan.report.domain.vo.ScsIfHldInventoryVo;
import com.plan.report.domain.bo.ScsIfHldInventoryBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_if_hld_inventoryService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsIfHldInventoryService {

    /**
     * 查询scs_if_hld_inventory
     */
    ScsIfHldInventoryVo queryById(Long id);

    /**
     * 查询scs_if_hld_inventory列表
     */
    TableDataInfo<ScsIfHldInventoryVo> queryPageList(ScsIfHldInventoryBo bo, PageQuery pageQuery);

    /**
     * 查询scs_if_hld_inventory列表
     */
    List<ScsIfHldInventoryVo> queryList(ScsIfHldInventoryBo bo);

    /**
     * 新增scs_if_hld_inventory
     */
    Boolean insertByBo(ScsIfHldInventoryBo bo);

    /**
     * 修改scs_if_hld_inventory
     */
    Boolean updateByBo(ScsIfHldInventoryBo bo);

    /**
     * 校验并批量删除scs_if_hld_inventory信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
