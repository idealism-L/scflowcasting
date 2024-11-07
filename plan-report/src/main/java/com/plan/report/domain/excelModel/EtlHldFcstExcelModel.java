package com.plan.report.domain.excelModel;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 销售预测视图对象 etl_hld_fcst
 *
 * @author xu_yijun
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class EtlHldFcstExcelModel implements Serializable {

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
    private String uitempattern;

    /**
     * u_corporation
     */
    @ExcelProperty(value = "U_CORPORATION")
    private String ucorporation;

    /**
     * u_flag
     */
    @ExcelProperty(value = "U_FLAG")
    private String uflag;

    /**
     * u_comment
     */
    @ExcelProperty(value = "U_COMMENT")
    private String ucomment;

    /**
     * u_filename
     */
    @ExcelProperty(value = "U_FILENAME")
    private String ufilename;

    /**
     * u_editdate
     */
    @ExcelProperty(value = "U_EDITDATE")
    private String ueditdate;


}
