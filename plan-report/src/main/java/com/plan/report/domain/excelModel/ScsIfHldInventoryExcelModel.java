package com.plan.report.domain.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName ScsIfHldInventoryExcelModel
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/14 11:39
 */
@Data
public class ScsIfHldInventoryExcelModel {

    private static final long serialVersionUID = 1L;

    /**
     * item
     */
    @ExcelProperty(value = "Item")
    private String item;

    /**
     * loc
     */
    @ExcelProperty(value = "Loc")
    private String loc;

    /**
     * availdate
     */
    @ExcelProperty(value = "AvailDate")
    private Date availdate;

    /**
     * qty
     */
    @ExcelProperty(value = "Qty")
    private BigDecimal qty;

    /**
     * expdate
     */
    @ExcelProperty(value = "ExpDate")
    private Date expdate;

    /**
     * project
     */
    @ExcelProperty(value = "Project")
    private String project;

    /**
     * store
     */
    @ExcelProperty(value = "Store")
    private String store;

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
