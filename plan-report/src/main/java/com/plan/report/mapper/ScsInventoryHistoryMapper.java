package com.plan.report.mapper;

import com.plan.report.domain.ScsInventoryHistory;
import com.plan.report.domain.vo.ScsInventoryHistoryVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * scs_inventory_historyMapper接口
 *
 * @author ruoyi
 * @date 2024-11-13
 */
@Mapper
public interface ScsInventoryHistoryMapper extends BaseMapperPlus<ScsInventoryHistoryMapper, ScsInventoryHistory, ScsInventoryHistoryVo> {

}
