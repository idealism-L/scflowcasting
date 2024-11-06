package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 销售预测对象 etl_hld_fcst
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("etl_hld_fcst")
public class EtlHldFcst extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "IM_MAIN_INSURANCE_CONFIG_ID")
    private Long imMainInsuranceConfigId;
    /**
     * dmdunit
     */
    private String dmdunit;
    /**
     * dmdgroup
     */
    private String dmdgroup;
    /**
     * loc
     */
    private String loc;
    /**
     * model
     */
    private String model;
    /**
     * startdate
     */
    private Date startdate;
    /**
     * dur
     */
    private String dur;
    /**
     * qty
     */
    private BigDecimal qty;
    /**
     * type
     */
    private String type;
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
