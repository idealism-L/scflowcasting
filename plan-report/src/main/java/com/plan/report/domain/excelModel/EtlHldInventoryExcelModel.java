package com.plan.report.domain.excelModel;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 库存视图对象 etl_hld_inventory
 *
 * @author xu_yijun
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class EtlHldInventoryExcelModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物料编码
     */
    @ExcelProperty(value = "ITEM")
    private String item;

    /**
     * loc
     */
    @ExcelProperty(value = "LOC")
    private String loc;

    /**
     * availdate
     */
    @ExcelProperty(value = "AVAILDATE")
    private Date availdate;

    /**
     * qty
     */
    @ExcelProperty(value = "QTY")
    private BigDecimal qty;

    /**
     * expdate
     */
    @ExcelProperty(value = "EXPDATE")
    private Date expdate;

    /**
     * project
     */
    @ExcelProperty(value = "PROJECT")
    private String project;

    /**
     * store
     */
    @ExcelProperty(value = "STORE")
    private String store;

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
