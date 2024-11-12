package com.plan.report.service;

import com.plan.report.domain.ScsLocMap;
import com.plan.report.domain.vo.ScsLocMapVo;
import com.plan.report.domain.bo.ScsLocMapBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_loc_mapService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsLocMapService {

    /**
     * 查询scs_loc_map
     */
    ScsLocMapVo queryById(Long id);

    /**
     * 查询scs_loc_map列表
     */
    TableDataInfo<ScsLocMapVo> queryPageList(ScsLocMapBo bo, PageQuery pageQuery);

    /**
     * 查询scs_loc_map列表
     */
    List<ScsLocMapVo> queryList(ScsLocMapBo bo);

    /**
     * 新增scs_loc_map
     */
    Boolean insertByBo(ScsLocMapBo bo);

    /**
     * 修改scs_loc_map
     */
    Boolean updateByBo(ScsLocMapBo bo);

    /**
     * 校验并批量删除scs_loc_map信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
