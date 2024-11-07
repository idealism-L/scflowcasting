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
 * 成品销售预测视图对象 etl_hld_fcst_fg_26w
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class EtlHldFcstFg26wVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * u_corporation
     */
    @ExcelProperty(value = "u_corporation")
    private String uCorporation;

    /**
     * dmdunit
     */
    @ExcelProperty(value = "dmdunit")
    private String dmdunit;

    /**
     * dmdgroup
     */
    @ExcelProperty(value = "dmdgroup")
    private String dmdgroup;

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
     * u_oh
     */
    @ExcelProperty(value = "u_oh")
    private String uOh;

    /**
     * u_w1
     */
    @ExcelProperty(value = "u_w1")
    private BigDecimal uW1;

    /**
     * u_w2
     */
    @ExcelProperty(value = "u_w2")
    private BigDecimal uW2;

    /**
     * u_w3
     */
    @ExcelProperty(value = "u_w3")
    private BigDecimal uW3;

    /**
     * u_w4
     */
    @ExcelProperty(value = "u_w4")
    private BigDecimal uW4;

    /**
     * u_w5
     */
    @ExcelProperty(value = "u_w5")
    private BigDecimal uW5;

    /**
     * u_w6
     */
    @ExcelProperty(value = "u_w6")
    private BigDecimal uW6;

    /**
     * u_w7
     */
    @ExcelProperty(value = "u_w7")
    private BigDecimal uW7;

    /**
     * u_w8
     */
    @ExcelProperty(value = "u_w8")
    private BigDecimal uW8;

    /**
     * u_w9
     */
    @ExcelProperty(value = "u_w9")
    private BigDecimal uW9;

    /**
     * u_w10
     */
    @ExcelProperty(value = "u_w10")
    private BigDecimal uW10;

    /**
     * u_w11
     */
    @ExcelProperty(value = "u_w11")
    private BigDecimal uW11;

    /**
     * u_w12
     */
    @ExcelProperty(value = "u_w12")
    private BigDecimal uW12;

    /**
     * u_w13
     */
    @ExcelProperty(value = "u_w13")
    private BigDecimal uW13;

    /**
     * u_w14
     */
    @ExcelProperty(value = "u_w14")
    private BigDecimal uW14;

    /**
     * u_w15
     */
    @ExcelProperty(value = "u_w15")
    private BigDecimal uW15;

    /**
     * u_w16
     */
    @ExcelProperty(value = "u_w16")
    private BigDecimal uW16;

    /**
     * u_w17
     */
    @ExcelProperty(value = "u_w17")
    private BigDecimal uW17;

    /**
     * u_w18
     */
    @ExcelProperty(value = "u_w18")
    private BigDecimal uW18;

    /**
     * u_w19
     */
    @ExcelProperty(value = "u_w19")
    private BigDecimal uW19;

    /**
     * u_w20
     */
    @ExcelProperty(value = "u_w20")
    private BigDecimal uW20;

    /**
     * u_w21
     */
    @ExcelProperty(value = "u_w21")
    private BigDecimal uW21;

    /**
     * u_w22
     */
    @ExcelProperty(value = "u_w22")
    private BigDecimal uW22;

    /**
     * u_w23
     */
    @ExcelProperty(value = "u_w23")
    private BigDecimal uW23;

    /**
     * u_w24
     */
    @ExcelProperty(value = "u_w24")
    private BigDecimal uW24;

    /**
     * u_w25
     */
    @ExcelProperty(value = "u_w25")
    private BigDecimal uW25;

    /**
     * u_w26
     */
    @ExcelProperty(value = "u_w26")
    private BigDecimal uW26;

    /**
     * u_flag
     */
    @ExcelProperty(value = "u_flag")
    private String uFlag;

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
    private String uEditdate;


}
