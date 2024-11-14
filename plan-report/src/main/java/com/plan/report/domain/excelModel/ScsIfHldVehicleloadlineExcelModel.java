package com.plan.report.domain.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName ScsIfHldVehicleloadlineExcelModel
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/14 11:40
 */
@Data
public class ScsIfHldVehicleloadlineExcelModel {

    private static final long serialVersionUID = 1L;

    /**
     * loadid
     */
    @ExcelProperty(value = "LoadID")
    private String loadid;

    /**
     * descr
     */
    @ExcelProperty(value = "Descr")
    private String descr;

    /**
     * sourcestatus
     */
    @ExcelProperty(value = "SourceStatus")
    private Long sourcestatus;

    /**
     * deststatus
     */
    @ExcelProperty(value = "DestStatus")
    private String deststatus0;

    /**
     * item
     */
    @ExcelProperty(value = "Item")
    private String item;

    /**
     * source
     */
    @ExcelProperty(value = "Source")
    private String source;

    /**
     * dest
     */
    @ExcelProperty(value = "Dest")
    private String dest;

    /**
     * qty
     */
    @ExcelProperty(value = "Qty")
    private BigDecimal qty;

    /**
     * schedarrivdate
     */
    @ExcelProperty(value = "SchedArrivDate")
    private Date availdate;

    /**
     * schedshipdate
     */
    @ExcelProperty(value = "SchedShipDate")
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
