package com.plan.report.domain.vo;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.plan.common.annotation.ExcelDictFormat;
import com.plan.common.convert.ExcelDictConvert;
import lombok.Data;

import java.io.Serializable;

/**
 * scs_flowcasting_output视图对象 scs_flowcasting_output
 *
 * @author ruoyi
 * @date 2024-11-20
 */
@Data
@ExcelIgnoreUnannotated
public class ScsFlowcastingOutputVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * item
     */
    @ExcelProperty(value = "item")
    private String item;

    /**
     * item_own_code
     */
    @ExcelProperty(value = "item_own_code")
    private String itemOwnCode;

    /**
     * u_item_pattern
     */
    @ExcelProperty(value = "u_item_pattern")
    private String uItemPattern;

    /**
     * u_bpp_code
     */
    @ExcelProperty(value = "u_bpp_code")
    private String uBppCode;

    /**
     * u_bpp_brand
     */
    @ExcelProperty(value = "u_bpp_brand")
    private String uBppBrand;

    /**
     * u_bpp_flavor
     */
    @ExcelProperty(value = "u_bpp_flavor")
    private String uBppFlavor;

    /**
     * u_bpp_category
     */
    @ExcelProperty(value = "u_bpp_category")
    private String uBppCategory;

    /**
     * u_bpp_subcategory
     */
    @ExcelProperty(value = "u_bpp_subcategory")
    private String uBppSubcategory;

    /**
     * loc
     */
    @ExcelProperty(value = "loc")
    private String loc;

    /**
     * u_ou
     */
    @ExcelProperty(value = "u_ou")
    private String uOu;

    /**
     * u_corporation
     */
    @ExcelProperty(value = "u_corporation")
    private String uCorporation;

    /**
     * measurename
     */
    @ExcelProperty(value = "measurename")
    private String measurename;

    /**
     * startdate
     */
    @ExcelProperty(value = "startdate")
    private Date startdate;

    /**
     * period1
     */
    @ExcelProperty(value = "period1")
    private BigDecimal period1;

    /**
     * period2
     */
    @ExcelProperty(value = "period2")
    private BigDecimal period2;

    /**
     * period3
     */
    @ExcelProperty(value = "period3")
    private BigDecimal period3;

    /**
     * period4
     */
    @ExcelProperty(value = "period4")
    private BigDecimal period4;

    /**
     * period5
     */
    @ExcelProperty(value = "period5")
    private BigDecimal period5;

    /**
     * period6
     */
    @ExcelProperty(value = "period6")
    private BigDecimal period6;

    /**
     * period7
     */
    @ExcelProperty(value = "period7")
    private BigDecimal period7;

    /**
     * period8
     */
    @ExcelProperty(value = "period8")
    private BigDecimal period8;

    /**
     * period9
     */
    @ExcelProperty(value = "period9")
    private BigDecimal period9;

    /**
     * period10
     */
    @ExcelProperty(value = "period10")
    private BigDecimal period10;

    /**
     * period11
     */
    @ExcelProperty(value = "period11")
    private BigDecimal period11;

    /**
     * period12
     */
    @ExcelProperty(value = "period12")
    private BigDecimal period12;

    /**
     * period13
     */
    @ExcelProperty(value = "period13")
    private BigDecimal period13;

    /**
     * period14
     */
    @ExcelProperty(value = "period14")
    private BigDecimal period14;

    /**
     * period15
     */
    @ExcelProperty(value = "period15")
    private BigDecimal period15;

    /**
     * period16
     */
    @ExcelProperty(value = "period16")
    private BigDecimal period16;

    /**
     * period17
     */
    @ExcelProperty(value = "period17")
    private BigDecimal period17;

    /**
     * period18
     */
    @ExcelProperty(value = "period18")
    private BigDecimal period18;

    /**
     * period19
     */
    @ExcelProperty(value = "period19")
    private BigDecimal period19;

    /**
     * period20
     */
    @ExcelProperty(value = "period20")
    private BigDecimal period20;

    /**
     * period21
     */
    @ExcelProperty(value = "period21")
    private BigDecimal period21;

    /**
     * period22
     */
    @ExcelProperty(value = "period22")
    private BigDecimal period22;

    /**
     * period23
     */
    @ExcelProperty(value = "period23")
    private BigDecimal period23;

    /**
     * period24
     */
    @ExcelProperty(value = "period24")
    private BigDecimal period24;

    /**
     * period25
     */
    @ExcelProperty(value = "period25")
    private BigDecimal period25;

    /**
     * period26
     */
    @ExcelProperty(value = "period26")
    private BigDecimal period26;

    /**
     * report_date
     */
    @ExcelProperty(value = "report_date")
    private Date reportDate;


}
