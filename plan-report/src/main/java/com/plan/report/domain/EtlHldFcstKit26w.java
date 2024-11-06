package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 主剂需求预测对象 etl_hld_fcst_kit_26w
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("etl_hld_fcst_kit_26w")
public class EtlHldFcstKit26w extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "IM_MAIN_INSURANCE_CONFIG_ID")
    private Long imMainInsuranceConfigId;
    /**
     * u_corporation
     */
    private String uCorporation;
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
     * 开始日期
     */
    private Date startdate;
    /**
     * u_oh
     */
    private String uOh;
    /**
     * u_w1
     */
    private BigDecimal uW1;
    /**
     * u_w2
     */
    private BigDecimal uW2;
    /**
     * u_w3
     */
    private BigDecimal uW3;
    /**
     * u_w4
     */
    private BigDecimal uW4;
    /**
     * u_w5
     */
    private BigDecimal uW5;
    /**
     * u_w6
     */
    private BigDecimal uW6;
    /**
     * u_w7
     */
    private BigDecimal uW7;
    /**
     * u_w8
     */
    private BigDecimal uW8;
    /**
     * u_w9
     */
    private BigDecimal uW9;
    /**
     * u_w10
     */
    private BigDecimal uW10;
    /**
     * u_w11
     */
    private BigDecimal uW11;
    /**
     * u_w12
     */
    private BigDecimal uW12;
    /**
     * u_w13
     */
    private BigDecimal uW13;
    /**
     * u_w14
     */
    private BigDecimal uW14;
    /**
     * u_w15
     */
    private BigDecimal uW15;
    /**
     * u_w16
     */
    private BigDecimal uW16;
    /**
     * u_w17
     */
    private BigDecimal uW17;
    /**
     * u_w18
     */
    private BigDecimal uW18;
    /**
     * u_w19
     */
    private BigDecimal uW19;
    /**
     * u_w20
     */
    private BigDecimal uW20;
    /**
     * u_w21
     */
    private BigDecimal uW21;
    /**
     * u_w22
     */
    private BigDecimal uW22;
    /**
     * u_w23
     */
    private BigDecimal uW23;
    /**
     * u_w24
     */
    private BigDecimal uW24;
    /**
     * u_w25
     */
    private BigDecimal uW25;
    /**
     * u_w26
     */
    private BigDecimal uW26;
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
