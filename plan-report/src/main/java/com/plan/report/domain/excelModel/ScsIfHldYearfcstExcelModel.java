package com.plan.report.domain.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName ScsIfHldYearfcstExcelModel
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/14 11:42
 */
@Data
public class ScsIfHldYearfcstExcelModel {

    private static final long serialVersionUID = 1L;

    /**
     * item
     */
    @ExcelProperty(value = "ITEM")
    private String item;

    /**
     * loc
     */
    @ExcelProperty(value = "LOC")
    private String loc;

    /**
     * startdate
     */
    @ExcelProperty(value = "STARTDATE")
    private Date startdate;

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
     * u_m5
     */
    @ExcelProperty(value = "U_M5")
    private BigDecimal uM5;

    /**
     * u_m6
     */
    @ExcelProperty(value = "U_M6")
    private BigDecimal uM6;

    /**
     * u_m7
     */
    @ExcelProperty(value = "U_M7")
    private BigDecimal uM7;

    /**
     * u_m8
     */
    @ExcelProperty(value = "U_M8")
    private BigDecimal uM8;

    /**
     * u_m9
     */
    @ExcelProperty(value = "U_M9")
    private BigDecimal uM9;

    /**
     * u_m10
     */
    @ExcelProperty(value = "U_M10")
    private BigDecimal uM10;

    /**
     * u_m11
     */
    @ExcelProperty(value = "U_M11")
    private BigDecimal uM11;

    /**
     * u_m12
     */
    @ExcelProperty(value = "U_M12")
    private BigDecimal uM12;

    /**
     * u_m13
     */
    @ExcelProperty(value = "U_M13")
    private BigDecimal uM13;

    /**
     * u_m14
     */
    @ExcelProperty(value = "U_M14")
    private BigDecimal uM14;

    /**
     * u_m15
     */
    @ExcelProperty(value = "U_M15")
    private BigDecimal uM15;

    /**
     * u_m16
     */
    @ExcelProperty(value = "U_M16")
    private BigDecimal uM16;

    /**
     * u_item_pattern
     */
    @ExcelProperty(value = "U_ITEM_PATTERN")
    private String uItemPattern;

    /**
     * u_corporation
     */
    @ExcelProperty(value = "U_CORPORATION")
    private String uCorporation;

    /**
     * u_flag
     */
    @ExcelProperty(value = "U_FLAG")
    private Long uFlag;

    /**
     * u_comment
     */
    @ExcelProperty(value = "U_COMMENT")
    private String uComment;

    /**
     * u_filename
     */
    @ExcelProperty(value = "U_FILE_NAME")
    private String uFilename;

    /**
     * u_editdate
     */
    @ExcelProperty(value = "U_EDITDATE")
    private Date uEditdate;


}
