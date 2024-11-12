package com.plan.report.domain.vo;

import java.math.BigDecimal;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.plan.common.annotation.ExcelDictFormat;
import com.plan.common.convert.ExcelDictConvert;
import lombok.Data;

import java.io.Serializable;

/**
 * scs_fg_map视图对象 scs_fg_map
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@ExcelIgnoreUnannotated
public class ScsFgMapVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * ITEM ID
     */
    @ExcelProperty(value = "ITEM ID")
    private Long itemId;

    /**
     * 物料
     */
    @ExcelProperty(value = "物料")
    private String item;

    /**
     * FG ITEM ID
     */
    @ExcelProperty(value = "FG ITEM ID")
    private String fgItemId;

    /**
     * 生产物料
     */
    @ExcelProperty(value = "生产物料")
    private String fgItem;

    /**
     * 转换系数
     */
    @ExcelProperty(value = "转换系数")
    private BigDecimal convfactor;

    /**
     * 备注
     */
    @ExcelProperty(value = "备注")
    private String uComment;

    /**
     * 有效标志
     */
    @ExcelProperty(value = "有效标志")
    private String uFlag;

    /**
     * 主要成品标志
     */
    @ExcelProperty(value = "主要成品标志")
    private String keyProductionFlag;

    /**
     * 版本号
     */
    @ExcelProperty(value = "版本号")
    private Long versionNo;


}
