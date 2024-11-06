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
 * 成品销售预测视图对象 etl_hld_fcst_fg
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class EtlHldFcstFgVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long imMainInsuranceConfigId;

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
