package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 年预测对象 etl_hld_yearfcst
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("etl_hld_yearfcst")
public class EtlHldYearfcst extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * 物料编码
     */
    private String item;
    /**
     * loc
     */
    private String loc;
    /**
     * startdate
     */
    private Date startdate;
    /**
     * u_m1
     */
    private BigDecimal uM1;
    /**
     * u_m2
     */
    private BigDecimal uM2;
    /**
     * u_m3
     */
    private BigDecimal uM3;
    /**
     * u_m4
     */
    private BigDecimal uM4;
    /**
     * u_m5
     */
    private BigDecimal uM5;
    /**
     * u_m6
     */
    private BigDecimal uM6;
    /**
     * u_m7
     */
    private BigDecimal uM7;
    /**
     * u_m8
     */
    private BigDecimal uM8;
    /**
     * u_m9
     */
    private BigDecimal uM9;
    /**
     * u_m10
     */
    private BigDecimal uM10;
    /**
     * u_m11
     */
    private BigDecimal uM11;
    /**
     * u_m12
     */
    private BigDecimal uM12;
    /**
     * u_m13
     */
    private BigDecimal uM13;
    /**
     * u_m14
     */
    private BigDecimal uM14;
    /**
     * u_m15
     */
    private BigDecimal uM15;
    /**
     * u_m16
     */
    private BigDecimal uM16;
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