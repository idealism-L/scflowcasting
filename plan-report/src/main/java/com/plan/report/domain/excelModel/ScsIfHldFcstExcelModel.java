package com.plan.report.domain.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName ScsIfHldFcstExcelModel
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/14 11:37
 */
@Data
public class ScsIfHldFcstExcelModel {

    private static final long serialVersionUID = 1L;

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
     * model
     */
    @ExcelProperty(value = "MODEL")
    private String model;

    /**
     * startdate
     */
    @ExcelProperty(value = "STARTDATE")
    private Date startdate;

    /**
     * dur
     */
    @ExcelProperty(value = "DUR")
    private String dur;

    /**
     * qty
     */
    @ExcelProperty(value = "QTY")
    private BigDecimal qty;

    /**
     * type
     */
    @ExcelProperty(value = "TYPE")
    private String type;

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
    @ExcelProperty(value = "U_FILENAME")
    private String uFilename;

    /**
     * u_editdate
     */
    @ExcelProperty(value = "U_EDITDATE")
    private Date uEditdate;


}
