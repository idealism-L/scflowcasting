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
 * scs_if_hld_vehicleloadline视图对象 scs_if_hld_vehicleloadline
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@ExcelIgnoreUnannotated
public class ScsIfHldVehicleloadlineVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * loadid
     */
    @ExcelProperty(value = "loadid")
    private String loadid;

    /**
     * descr
     */
    @ExcelProperty(value = "descr")
    private String descr;

    /**
     * sourcestatus
     */
    @ExcelProperty(value = "sourcestatus")
    private Long sourcestatus;

    /**
     * deststatus
     */
    @ExcelProperty(value = "deststatus")
    private String deststatus0;

    /**
     * item
     */
    @ExcelProperty(value = "item")
    private String item;

    /**
     * source
     */
    @ExcelProperty(value = "source")
    private String source;

    /**
     * dest
     */
    @ExcelProperty(value = "dest")
    private String dest;

    /**
     * qty
     */
    @ExcelProperty(value = "qty")
    private BigDecimal qty;

    /**
     * schedarrivdate
     */
    @ExcelProperty(value = "schedarrivdate")
    private Date availdate;

    /**
     * schedshipdate
     */
    @ExcelProperty(value = "schedshipdate")
    private Date availdate0;

    /**
     * u_item_pattern
     */
    @ExcelProperty(value = "u_item_pattern")
    private String uItemPattern;

    /**
     * u_corporation
     */
    @ExcelProperty(value = "u_corporation")
    private String uCorporation;

    /**
     * u_flag
     */
    @ExcelProperty(value = "u_flag")
    private Long uFlag;

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
    private Date uEditdate;


}
