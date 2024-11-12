package com.plan.report.service;

import com.plan.report.domain.ScsKitMap;
import com.plan.report.domain.vo.ScsKitMapVo;
import com.plan.report.domain.bo.ScsKitMapBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_kit_mapService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsKitMapService {

    /**
     * 查询scs_kit_map
     */
    ScsKitMapVo queryById(Long id);

    /**
     * 查询scs_kit_map列表
     */
    TableDataInfo<ScsKitMapVo> queryPageList(ScsKitMapBo bo, PageQuery pageQuery);

    /**
     * 查询scs_kit_map列表
     */
    List<ScsKitMapVo> queryList(ScsKitMapBo bo);

    /**
     * 新增scs_kit_map
     */
    Boolean insertByBo(ScsKitMapBo bo);

    /**
     * 修改scs_kit_map
     */
    Boolean updateByBo(ScsKitMapBo bo);

    /**
     * 校验并批量删除scs_kit_map信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
