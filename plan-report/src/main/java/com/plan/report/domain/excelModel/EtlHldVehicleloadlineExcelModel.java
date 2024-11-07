package com.plan.report.domain.excelModel;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 在途视图对象 etl_hld_vehicleloadline
 *
 * @author xu_yijun
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class EtlHldVehicleloadlineExcelModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * loadid
     */
    @ExcelProperty(value = "LOADID")
    private String loadid;

    /**
     * descr
     */
    @ExcelProperty(value = "DESCR")
    private String descr;

    /**
     * sourcestatus
     */
    @ExcelProperty(value = "SOURCESTATUS")
    private String sourcestatus;

    /**
     * deststatus
     */
    @ExcelProperty(value = "DESTSTATUS")
    private String deststatus0;

    /**
     * item
     */
    @ExcelProperty(value = "ITEM")
    private String item;

    /**
     * source
     */
    @ExcelProperty(value = "SOURCE")
    private String source;

    /**
     * dest
     */
    @ExcelProperty(value = "DEST")
    private String dest;

    /**
     * qty
     */
    @ExcelProperty(value = "QTY")
    private BigDecimal qty;

    /**
     * schedarrivdate
     */
    @ExcelProperty(value = "SCHEDARRIVDATE")
    private Date availdate;

    /**
     * schedshipdate
     */
    @ExcelProperty(value = "SCHEDSHIPDATE")
    private Date availdate0;

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
