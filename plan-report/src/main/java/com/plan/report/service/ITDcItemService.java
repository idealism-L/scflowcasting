package com.plan.report.service;

import com.plan.report.domain.TDcItem;
import com.plan.report.domain.vo.TDcItemVo;
import com.plan.report.domain.bo.TDcItemBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 物料Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface ITDcItemService {

    /**
     * 查询物料
     */
    TDcItemVo queryById(Long id);

    /**
     * 查询物料列表
     */
    TableDataInfo<TDcItemVo> queryPageList(TDcItemBo bo, PageQuery pageQuery);

    /**
     * 查询物料列表
     */
    List<TDcItemVo> queryList(TDcItemBo bo);

    /**
     * 新增物料
     */
    Boolean insertByBo(TDcItemBo bo);

    /**
     * 修改物料
     */
    Boolean updateByBo(TDcItemBo bo);

    /**
     * 校验并批量删除物料信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
