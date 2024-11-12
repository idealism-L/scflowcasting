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
 * scs_if_hld_custorder视图对象 scs_if_hld_custorder
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@ExcelIgnoreUnannotated
public class ScsIfHldCustorderVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * item
     */
    @ExcelProperty(value = "item")
    private String item;

    /**
     * loc
     */
    @ExcelProperty(value = "loc")
    private String loc;

    /**
     * shipdate
     */
    @ExcelProperty(value = "shipdate")
    private Date shipdate;

    /**
     * orderid
     */
    @ExcelProperty(value = "orderid")
    private String orderid;

    /**
     * qty
     */
    @ExcelProperty(value = "qty")
    private BigDecimal qty;

    /**
     * cust
     */
    @ExcelProperty(value = "cust")
    private String cust;

    /**
     * fcstsw
     */
    @ExcelProperty(value = "fcstsw")
    private Long fcstsw;

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
     * u_editdate
     */
    @ExcelProperty(value = "u_editdate")
    private Date uEditdate;

    /**
     * u_file_name
     */
    @ExcelProperty(value = "u_file_name")
    private String uFileName;


}
