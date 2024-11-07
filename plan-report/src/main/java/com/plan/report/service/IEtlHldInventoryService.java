package com.plan.report.service;

import com.plan.report.domain.EtlHldInventory;
import com.plan.report.domain.vo.EtlHldInventoryVo;
import com.plan.report.domain.bo.EtlHldInventoryBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 库存Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface IEtlHldInventoryService {

    /**
     * 查询库存
     */
    EtlHldInventoryVo queryById(Long id);

    /**
     * 查询库存列表
     */
    TableDataInfo<EtlHldInventoryVo> queryPageList(EtlHldInventoryBo bo, PageQuery pageQuery);

    /**
     * 查询库存列表
     */
    List<EtlHldInventoryVo> queryList(EtlHldInventoryBo bo);

    /**
     * 新增库存
     */
    Boolean insertByBo(EtlHldInventoryBo bo);

    /**
     * 修改库存
     */
    Boolean updateByBo(EtlHldInventoryBo bo);

    /**
     * 校验并批量删除库存信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
