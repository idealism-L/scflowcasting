package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_flowcasting_output对象 scs_flowcasting_output
 *
 * @author ruoyi
 * @date 2024-11-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_flowcasting_output")
public class ScsFlowcastingOutput extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * item
     */
    private String item;
    /**
     * item_own_code
     */
    private String itemOwnCode;
    /**
     * u_item_pattern
     */
    private String uItemPattern;
    /**
     * u_bpp_code
     */
    private String uBppCode;
    /**
     * u_bpp_brand
     */
    private String uBppBrand;
    /**
     * u_bpp_flavor
     */
    private String uBppFlavor;
    /**
     * u_bpp_category
     */
    private String uBppCategory;
    /**
     * u_bpp_subcategory
     */
    private String uBppSubcategory;
    /**
     * loc
     */
    private String loc;
    /**
     * u_ou
     */
    private String uOu;
    /**
     * u_corporation
     */
    private String uCorporation;
    /**
     * measurename
     */
    private String measurename;
    /**
     * startdate
     */
    private Date startdate;
    /**
     * period1
     */
    private BigDecimal period1;
    /**
     * period2
     */
    private BigDecimal period2;
    /**
     * period3
     */
    private BigDecimal period3;
    /**
     * period4
     */
    private BigDecimal period4;
    /**
     * period5
     */
    private BigDecimal period5;
    /**
     * period6
     */
    private BigDecimal period6;
    /**
     * period7
     */
    private BigDecimal period7;
    /**
     * period8
     */
    private BigDecimal period8;
    /**
     * period9
     */
    private BigDecimal period9;
    /**
     * period10
     */
    private BigDecimal period10;
    /**
     * period11
     */
    private BigDecimal period11;
    /**
     * period12
     */
    private BigDecimal period12;
    /**
     * period13
     */
    private BigDecimal period13;
    /**
     * period14
     */
    private BigDecimal period14;
    /**
     * period15
     */
    private BigDecimal period15;
    /**
     * period16
     */
    private BigDecimal period16;
    /**
     * period17
     */
    private BigDecimal period17;
    /**
     * period18
     */
    private BigDecimal period18;
    /**
     * period19
     */
    private BigDecimal period19;
    /**
     * period20
     */
    private BigDecimal period20;
    /**
     * period21
     */
    private BigDecimal period21;
    /**
     * period22
     */
    private BigDecimal period22;
    /**
     * period23
     */
    private BigDecimal period23;
    /**
     * period24
     */
    private BigDecimal period24;
    /**
     * period25
     */
    private BigDecimal period25;
    /**
     * period26
     */
    private BigDecimal period26;
    /**
     * report_date
     */
    private Date reportDate;

}
