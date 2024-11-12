package com.plan.report.service;

import com.plan.report.domain.ScsFgMap;
import com.plan.report.domain.vo.ScsFgMapVo;
import com.plan.report.domain.bo.ScsFgMapBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_fg_mapService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsFgMapService {

    /**
     * 查询scs_fg_map
     */
    ScsFgMapVo queryById(Long id);

    /**
     * 查询scs_fg_map列表
     */
    TableDataInfo<ScsFgMapVo> queryPageList(ScsFgMapBo bo, PageQuery pageQuery);

    /**
     * 查询scs_fg_map列表
     */
    List<ScsFgMapVo> queryList(ScsFgMapBo bo);

    /**
     * 新增scs_fg_map
     */
    Boolean insertByBo(ScsFgMapBo bo);

    /**
     * 修改scs_fg_map
     */
    Boolean updateByBo(ScsFgMapBo bo);

    /**
     * 校验并批量删除scs_fg_map信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
