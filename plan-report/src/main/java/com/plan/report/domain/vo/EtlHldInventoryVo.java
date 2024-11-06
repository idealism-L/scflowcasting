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
 * 库存视图对象 etl_hld_inventory
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class EtlHldInventoryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long imMainInsuranceConfigId;

    /**
     * 物料编码
     */
    @ExcelProperty(value = "物料编码")
    private String item;

    /**
     * loc
     */
    @ExcelProperty(value = "loc")
    private String loc;

    /**
     * availdate
     */
    @ExcelProperty(value = "availdate")
    private Date availdate;

    /**
     * qty
     */
    @ExcelProperty(value = "qty")
    private BigDecimal qty;

    /**
     * expdate
     */
    @ExcelProperty(value = "expdate")
    private Date expdate;

    /**
     * project
     */
    @ExcelProperty(value = "project")
    private String project;

    /**
     * store
     */
    @ExcelProperty(value = "store")
    private String store;

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
