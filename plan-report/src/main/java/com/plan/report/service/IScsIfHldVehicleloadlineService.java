package com.plan.report.service;

import com.plan.report.domain.ScsIfHldVehicleloadline;
import com.plan.report.domain.vo.ScsIfHldVehicleloadlineVo;
import com.plan.report.domain.bo.ScsIfHldVehicleloadlineBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_if_hld_vehicleloadlineService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsIfHldVehicleloadlineService {

    /**
     * 查询scs_if_hld_vehicleloadline
     */
    ScsIfHldVehicleloadlineVo queryById(Long id);

    /**
     * 查询scs_if_hld_vehicleloadline列表
     */
    TableDataInfo<ScsIfHldVehicleloadlineVo> queryPageList(ScsIfHldVehicleloadlineBo bo, PageQuery pageQuery);

    /**
     * 查询scs_if_hld_vehicleloadline列表
     */
    List<ScsIfHldVehicleloadlineVo> queryList(ScsIfHldVehicleloadlineBo bo);

    /**
     * 新增scs_if_hld_vehicleloadline
     */
    Boolean insertByBo(ScsIfHldVehicleloadlineBo bo);

    /**
     * 修改scs_if_hld_vehicleloadline
     */
    Boolean updateByBo(ScsIfHldVehicleloadlineBo bo);

    /**
     * 校验并批量删除scs_if_hld_vehicleloadline信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
