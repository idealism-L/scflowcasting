package com.plan.report.service;

import com.plan.report.domain.ScsVehicleloadline;
import com.plan.report.domain.vo.ScsVehicleloadlineVo;
import com.plan.report.domain.bo.ScsVehicleloadlineBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_vehicleloadlineService接口
 *
 * @author ruoyi
 * @date 2024-11-26
 */
public interface IScsVehicleloadlineService {

    /**
     * 查询scs_vehicleloadline
     */
    ScsVehicleloadlineVo queryById(Long id);

    /**
     * 查询scs_vehicleloadline列表
     */
    TableDataInfo<ScsVehicleloadlineVo> queryPageList(ScsVehicleloadlineBo bo, PageQuery pageQuery);

    /**
     * 查询scs_vehicleloadline列表
     */
    List<ScsVehicleloadlineVo> queryList(ScsVehicleloadlineBo bo);

    /**
     * 新增scs_vehicleloadline
     */
    Boolean insertByBo(ScsVehicleloadlineBo bo);

    /**
     * 修改scs_vehicleloadline
     */
    Boolean updateByBo(ScsVehicleloadlineBo bo);

    /**
     * 校验并批量删除scs_vehicleloadline信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
