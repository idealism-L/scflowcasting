package com.plan.report.mapper;

import com.plan.report.domain.EtlHldInventory;
import com.plan.report.domain.vo.EtlHldInventoryVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存Mapper接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Mapper
public interface EtlHldInventoryMapper extends BaseMapperPlus<EtlHldInventoryMapper, EtlHldInventory, EtlHldInventoryVo> {

    /**
     * 获取数据总行数
     * @return
     */
    Long selectDataCount();
}
