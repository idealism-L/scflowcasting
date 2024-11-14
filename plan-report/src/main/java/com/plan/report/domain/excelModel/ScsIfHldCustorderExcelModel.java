package com.plan.report.domain.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName ScsIfHldCustorderExcelModel
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/14 11:23
 */
@Data
public class ScsIfHldCustorderExcelModel {

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
     * shipdate
     */
    @ExcelProperty(value = "SHIPDATE")
    private Date shipdate;

    /**
     * orderid
     */
    @ExcelProperty(value = "ORDERID")
    private String orderid;

    /**
     * qty
     */
    @ExcelProperty(value = "QTY")
    private BigDecimal qty;

    /**
     * cust
     */
    @ExcelProperty(value = "CUST")
    private String cust;

    /**
     * fcstsw
     */
    @ExcelProperty(value = "FcstSw")
    private Long fcstsw;

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
     * u_editdate
     */
    @ExcelProperty(value = "U_EDITDATE")
    private Date uEditdate;

    /**
     * u_file_name
     */
    @ExcelProperty(value = "U_FILE_NAME")
    private String uFileName;


}
