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
 * 销售预测视图对象 etl_hld_fcst
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class EtlHldFcstVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long imMainInsuranceConfigId;

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
     * model
     */
    @ExcelProperty(value = "model")
    private String model;

    /**
     * startdate
     */
    @ExcelProperty(value = "startdate")
    private Date startdate;

    /**
     * dur
     */
    @ExcelProperty(value = "dur")
    private String dur;

    /**
     * qty
     */
    @ExcelProperty(value = "qty")
    private BigDecimal qty;

    /**
     * type
     */
    @ExcelProperty(value = "type")
    private String type;

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
