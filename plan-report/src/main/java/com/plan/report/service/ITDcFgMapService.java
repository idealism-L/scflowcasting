package com.plan.report.service;

import com.plan.report.domain.TDcFgMap;
import com.plan.report.domain.vo.TDcFgMapVo;
import com.plan.report.domain.bo.TDcFgMapBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 成品映射Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface ITDcFgMapService {

    /**
     * 查询成品映射
     */
    TDcFgMapVo queryById(Long imMainInsuranceConfigId);

    /**
     * 查询成品映射列表
     */
    TableDataInfo<TDcFgMapVo> queryPageList(TDcFgMapBo bo, PageQuery pageQuery);

    /**
     * 查询成品映射列表
     */
    List<TDcFgMapVo> queryList(TDcFgMapBo bo);

    /**
     * 新增成品映射
     */
    Boolean insertByBo(TDcFgMapBo bo);

    /**
     * 修改成品映射
     */
    Boolean updateByBo(TDcFgMapBo bo);

    /**
     * 校验并批量删除成品映射信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
