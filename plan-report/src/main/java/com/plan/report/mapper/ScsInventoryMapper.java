package com.plan.report.mapper;

import com.plan.report.domain.ScsInventory;
import com.plan.report.domain.vo.ScsInventoryVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * scs_inventoryMapper接口
 *
 * @author ruoyi
 * @date 2024-11-13
 */
@Mapper
public interface ScsInventoryMapper extends BaseMapperPlus<ScsInventoryMapper, ScsInventory, ScsInventoryVo> {

}
