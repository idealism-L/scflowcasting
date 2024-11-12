package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_if_hld_fcst_fg对象 scs_if_hld_fcst_fg
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_if_hld_fcst_fg")
public class ScsIfHldFcstFg extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
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
     * startdate
     */
    private Date startdate;
    /**
     * u_oh
     */
    private BigDecimal uOh;
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
     * u_flag
     */
    private Long uFlag;
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
    private Date uEditdate;

}
