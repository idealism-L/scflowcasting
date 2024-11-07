package com.plan.report.domain.vo;

import java.math.BigDecimal;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.plan.common.annotation.ExcelDictFormat;
import com.plan.common.convert.ExcelDictConvert;
import lombok.Data;

import java.io.Serializable;

/**
 * BPP映射视图对象 t_dc_bpp_master
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class TDcBppMasterVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * BPP编码
     */
    @ExcelProperty(value = "BPP编码")
    private String bppCode;

    /**
     * BPP描述
     */
    @ExcelProperty(value = "BPP描述")
    private String bppDescr;

    /**
     * 大类
     */
    @ExcelProperty(value = "大类")
    private String uCategory;

    /**
     * 大类描述
     */
    @ExcelProperty(value = "大类描述")
    private String uCategoryDescr;

    /**
     * 中类
     */
    @ExcelProperty(value = "中类")
    private String uSubcategory;

    /**
     * 中类描述
     */
    @ExcelProperty(value = "中类描述")
    private String uSubcategoryDescr;

    /**
     * 品牌
     */
    @ExcelProperty(value = "品牌")
    private String uBrand;

    /**
     * 品牌描述
     */
    @ExcelProperty(value = "品牌描述")
    private String uBrandDescr;

    /**
     * 口味
     */
    @ExcelProperty(value = "口味")
    private String uFlavor;

    /**
     * 口味描述
     */
    @ExcelProperty(value = "口味描述")
    private String uFlavorDescr;

    /**
     * 包装
     */
    @ExcelProperty(value = "包装")
    private String uPackage;

    /**
     * 包装描述
     */
    @ExcelProperty(value = "包装描述")
    private String uPackageDescr;

    /**
     * 产品分类
     */
    @ExcelProperty(value = "产品分类")
    private String beverage;

    /**
     * 状态
     */
    @ExcelProperty(value = "状态")
    private String uStatus;

    /**
     * bpp_short
     */
    @ExcelProperty(value = "bpp_short")
    private String bppShort;

    /**
     * 成品与KIT转换率
     */
    @ExcelProperty(value = "成品与KIT转换率")
    private BigDecimal uFgKitRate;

    /**
     * UC转换率
     */
    @ExcelProperty(value = "UC转换率")
    private BigDecimal uUcRate;


}
