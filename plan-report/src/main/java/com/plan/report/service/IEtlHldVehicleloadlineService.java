package com.plan.report.service;

import com.plan.report.domain.EtlHldVehicleloadline;
import com.plan.report.domain.vo.EtlHldVehicleloadlineVo;
import com.plan.report.domain.bo.EtlHldVehicleloadlineBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 在途Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface IEtlHldVehicleloadlineService {

    /**
     * 查询在途
     */
    EtlHldVehicleloadlineVo queryById(Long imMainInsuranceConfigId);

    /**
     * 查询在途列表
     */
    TableDataInfo<EtlHldVehicleloadlineVo> queryPageList(EtlHldVehicleloadlineBo bo, PageQuery pageQuery);

    /**
     * 查询在途列表
     */
    List<EtlHldVehicleloadlineVo> queryList(EtlHldVehicleloadlineBo bo);

    /**
     * 新增在途
     */
    Boolean insertByBo(EtlHldVehicleloadlineBo bo);

    /**
     * 修改在途
     */
    Boolean updateByBo(EtlHldVehicleloadlineBo bo);

    /**
     * 校验并批量删除在途信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
