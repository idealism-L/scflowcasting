package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 溶剂映射对象 t_dc_kit_map
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_dc_kit_map")
public class TDcKitMap extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "IM_MAIN_INSURANCE_CONFIG_ID")
    private Long imMainInsuranceConfigId;
    /**
     * 装瓶集团
     */
    private String corporation;
    /**
     * 物料编码
     */
    private String item;
    /**
     * 物料描述
     */
    private String itemDescr;
    /**
     * 地点代码
     */
    private String loc;
    /**
     * 地点描述
     */
    private String locDescr;
    /**
     * KIT代码
     */
    private String kitCode;
    /**
     * KIT描述
     */
    private String kitDescr;
    /**
     * 转化率
     */
    private BigDecimal convfactor;
    /**
     * 成品HIERARCHY
     */
    private String productHierarchy;
    /**
     * 备注
     */
    private String uComment;

}
