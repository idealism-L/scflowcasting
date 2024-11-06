package com.plan.report.service;

import com.plan.report.domain.TDcKitMap;
import com.plan.report.domain.vo.TDcKitMapVo;
import com.plan.report.domain.bo.TDcKitMapBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 溶剂映射Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface ITDcKitMapService {

    /**
     * 查询溶剂映射
     */
    TDcKitMapVo queryById(Long imMainInsuranceConfigId);

    /**
     * 查询溶剂映射列表
     */
    TableDataInfo<TDcKitMapVo> queryPageList(TDcKitMapBo bo, PageQuery pageQuery);

    /**
     * 查询溶剂映射列表
     */
    List<TDcKitMapVo> queryList(TDcKitMapBo bo);

    /**
     * 新增溶剂映射
     */
    Boolean insertByBo(TDcKitMapBo bo);

    /**
     * 修改溶剂映射
     */
    Boolean updateByBo(TDcKitMapBo bo);

    /**
     * 校验并批量删除溶剂映射信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
