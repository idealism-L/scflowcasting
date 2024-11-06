package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 在途对象 etl_hld_vehicleloadline
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("etl_hld_vehicleloadline")
public class EtlHldVehicleloadline extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "IM_MAIN_INSURANCE_CONFIG_ID")
    private Long imMainInsuranceConfigId;
    /**
     * loadid
     */
    private String loadid;
    /**
     * descr
     */
    private String descr;
    /**
     * sourcestatus
     */
    private String sourcestatus;
    /**
     * deststatus
     */
    private String deststatus0;
    /**
     * item
     */
    private String item;
    /**
     * source
     */
    private String source;
    /**
     * dest
     */
    private String dest;
    /**
     * qty
     */
    private BigDecimal qty;
    /**
     * schedarrivdate
     */
    private Date availdate;
    /**
     * schedshipdate
     */
    private Date availdate0;
    /**
     * u_item_pattern
     */
    private String uItemPattern;
    /**
     * u_corporation
     */
    private String uCorporation;
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
