package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 库存对象 etl_hld_inventory
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("etl_hld_inventory")
public class EtlHldInventory extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "IM_MAIN_INSURANCE_CONFIG_ID")
    private Long imMainInsuranceConfigId;
    /**
     * 物料编码
     */
    private String item;
    /**
     * loc
     */
    private String loc;
    /**
     * availdate
     */
    private Date availdate;
    /**
     * qty
     */
    private BigDecimal qty;
    /**
     * expdate
     */
    private Date expdate;
    /**
     * project
     */
    private String project;
    /**
     * store
     */
    private String store;
    /**
     * u_flag
     */
    private String uFlag;
    /**
     * u_comment
     */
    private String uComment;
    /**
     * u_filename
     */
    private String uFilename;
    /**
     * u_editdate
     */
    private String uEditdate;

}
