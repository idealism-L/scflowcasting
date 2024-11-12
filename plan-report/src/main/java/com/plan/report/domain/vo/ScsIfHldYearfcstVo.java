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
 * scs_if_hld_yearfcst视图对象 scs_if_hld_yearfcst
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@ExcelIgnoreUnannotated
public class ScsIfHldYearfcstVo implements Serializable {

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
     * loc
     */
    @ExcelProperty(value = "loc")
    private String loc;

    /**
     * startdate
     */
    @ExcelProperty(value = "startdate")
    private Date startdate;

    /**
     * u_m1
     */
    @ExcelProperty(value = "u_m1")
    private BigDecimal uM1;

    /**
     * u_m2
     */
    @ExcelProperty(value = "u_m2")
    private BigDecimal uM2;

    /**
     * u_m3
     */
    @ExcelProperty(value = "u_m3")
    private BigDecimal uM3;

    /**
     * u_m4
     */
    @ExcelProperty(value = "u_m4")
    private BigDecimal uM4;

    /**
     * u_m5
     */
    @ExcelProperty(value = "u_m5")
    private BigDecimal uM5;

    /**
     * u_m6
     */
    @ExcelProperty(value = "u_m6")
    private BigDecimal uM6;

    /**
     * u_m7
     */
    @ExcelProperty(value = "u_m7")
    private BigDecimal uM7;

    /**
     * u_m8
     */
    @ExcelProperty(value = "u_m8")
    private BigDecimal uM8;

    /**
     * u_m9
     */
    @ExcelProperty(value = "u_m9")
    private BigDecimal uM9;

    /**
     * u_m10
     */
    @ExcelProperty(value = "u_m10")
    private BigDecimal uM10;

    /**
     * u_m11
     */
    @ExcelProperty(value = "u_m11")
    private BigDecimal uM11;

    /**
     * u_m12
     */
    @ExcelProperty(value = "u_m12")
    private BigDecimal uM12;

    /**
     * u_m13
     */
    @ExcelProperty(value = "u_m13")
    private BigDecimal uM13;

    /**
     * u_m14
     */
    @ExcelProperty(value = "u_m14")
    private BigDecimal uM14;

    /**
     * u_m15
     */
    @ExcelProperty(value = "u_m15")
    private BigDecimal uM15;

    /**
     * u_m16
     */
    @ExcelProperty(value = "u_m16")
    private BigDecimal uM16;

    /**
     * u_item_pattern
     */
    @ExcelProperty(value = "u_item_pattern")
    private String uItemPattern;

    /**
     * u_corporation
     */
    @ExcelProperty(value = "u_corporation")
    private String uCorporation;

    /**
     * u_flag
     */
    @ExcelProperty(value = "u_flag")
    private Long uFlag;

    /**
     * u_comment
     */
    @ExcelProperty(value = "u_comment")
    private String uComment;

    /**
     * u_filename
     */
    @ExcelProperty(value = "u_filename")
    private String uFilename;

    /**
     * u_editdate
     */
    @ExcelProperty(value = "u_editdate")
    private Date uEditdate;


}
