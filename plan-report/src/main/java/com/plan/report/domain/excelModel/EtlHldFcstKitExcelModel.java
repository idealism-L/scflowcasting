package com.plan.report.domain.excelModel;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 主剂需求预测视图对象 etl_hld_fcst_kit
 *
 * @author xu_yijun
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class EtlHldFcstKitExcelModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * u_corporation
     */
    @ExcelProperty(value = "U_CORPORATION")
    private String uCorporation;

    /**
     * dmdunit
     */
    @ExcelProperty(value = "DMDUNIT")
    private String dmdunit;

    /**
     * dmdgroup
     */
    @ExcelProperty(value = "DMDGROUP")
    private String dmdgroup;

    /**
     * loc
     */
    @ExcelProperty(value = "LOC")
    private String loc;

    /**
     * 开始日期
     */
    @ExcelProperty(value = "STARTDATE")
    private Date startdate;

    /**
     * u_oh
     */
    @ExcelProperty(value = "U_OH")
    private String uOh;

    /**
     * u_w1
     */
    @ExcelProperty(value = "U_W1")
    private BigDecimal uW1;

    /**
     * u_w2
     */
    @ExcelProperty(value = "U_W2")
    private BigDecimal uW2;

    /**
     * u_w3
     */
    @ExcelProperty(value = "U_W3")
    private BigDecimal uW3;

    /**
     * u_w4
     */
    @ExcelProperty(value = "U_W4")
    private BigDecimal uW4;

    /**
     * u_w5
     */
    @ExcelProperty(value = "U_W5")
    private BigDecimal uW5;

    /**
     * u_w6
     */
    @ExcelProperty(value = "U_W6")
    private BigDecimal uW6;

    /**
     * u_w7
     */
    @ExcelProperty(value = "U_W7")
    private BigDecimal uW7;

    /**
     * u_w8
     */
    @ExcelProperty(value = "U_W8")
    private BigDecimal uW8;

    /**
     * u_w9
     */
    @ExcelProperty(value = "U_W9")
    private BigDecimal uW9;

    /**
     * u_w10
     */
    @ExcelProperty(value = "U_W10")
    private BigDecimal uW10;

    /**
     * u_w11
     */
    @ExcelProperty(value = "U_W11")
    private BigDecimal uW11;

    /**
     * u_w12
     */
    @ExcelProperty(value = "U_W12")
    private BigDecimal uW12;

    /**
     * u_w13
     */
    @ExcelProperty(value = "U_W13")
    private BigDecimal uW13;

    /**
     * u_m1
     */
    @ExcelProperty(value = "U_M1")
    private BigDecimal uM1;

    /**
     * u_m2
     */
    @ExcelProperty(value = "U_M2")
    private BigDecimal uM2;

    /**
     * u_m3
     */
    @ExcelProperty(value = "U_M3")
    private BigDecimal uM3;

    /**
     * u_m4
     */
    @ExcelProperty(value = "U_M4")
    private BigDecimal uM4;

    /**
     * u_flag
     */
    @ExcelProperty(value = "U_FLAG")
    private String uFlag;

    /**
     * u_comment
     */
    @ExcelProperty(value = "U_COMMENT")
    private String uComment;

    /**
     * u_filename
     */
    @ExcelProperty(value = "U_FILENAME")
    private String uFilename;

    /**
     * u_editdate
     */
    @ExcelProperty(value = "U_EDITDATE")
    private String uEditdate;


}
