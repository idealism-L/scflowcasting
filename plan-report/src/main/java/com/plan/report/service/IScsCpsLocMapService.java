package com.plan.report.service;

import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.report.domain.bo.ScsCpsLocMapBo;
import com.plan.report.domain.vo.ScsCpsLocMapVo;

import java.util.Collection;
import java.util.List;

/**
 * scs_cps_loc_mapService接口
 *
 * @author ruoyi
 * @date 2024-11-25
 */
public interface IScsCpsLocMapService {

    /**
     * 查询scs_cps_loc_map
     */
    ScsCpsLocMapVo queryById(Long id);

    /**
     * 查询scs_cps_loc_map列表
     */
    TableDataInfo<ScsCpsLocMapVo> queryPageList(ScsCpsLocMapBo bo, PageQuery pageQuery);

    /**
     * 查询scs_cps_loc_map列表
     */
    List<ScsCpsLocMapVo> queryList(ScsCpsLocMapBo bo);

    /**
     * 新增scs_cps_loc_map
     */
    Boolean insertByBo(ScsCpsLocMapBo bo);

    /**
     * 修改scs_cps_loc_map
     */
    Boolean updateByBo(ScsCpsLocMapBo bo);

    /**
     * 校验并批量删除scs_cps_loc_map信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
