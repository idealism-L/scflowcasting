package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * scs_bpp_master视图对象 scs_bpp_master
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@ExcelIgnoreUnannotated
public class ScsBppMasterVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    // @ExcelProperty(value = "ID")
    private Long id;

    /**
     * 物料
     */
    @ExcelProperty(value = "物料")
    private String item;

    /**
     * 物料编码
     */
    @ExcelProperty(value = "物料编码")
    private String itemCode;

    /**
     * 物料描述
     */
    @ExcelProperty(value = "物料描述")
    private String itemDescr;

    /**
     * 物料英文描述
     */
    @ExcelProperty(value = "物料英文描述")
    private String itemDescrEn;

    /**
     * 单位转换
     */
    @ExcelProperty(value = "单位转换")
    private String uomRate1;

    /**
     * 大类代码
     */
    @ExcelProperty(value = "大类代码")
    private String category;

    /**
     * 大类描述
     */
    @ExcelProperty(value = "大类描述")
    private String categoryDescr;

    /**
     * 品牌代码
     */
    @ExcelProperty(value = "品牌代码")
    private String brand;

    /**
     * 口味代码
     */
    @ExcelProperty(value = "口味代码")
    private String flavor;

    /**
     * 包装代码
     */
    @ExcelProperty(value = "包装代码")
    private String packageCode;

    /**
     * 规格代码
     */
    @ExcelProperty(value = "规格代码")
    private String spec;

    /**
     * 规格描述
     */
    @ExcelProperty(value = "规格描述")
    private String specDescr;

    /**
     * PC
     */
    @ExcelProperty(value = "PC")
    private String pc;

    /**
     * UC
     */
    @ExcelProperty(value = "UC")
    private String uc;

    /**
     * HIERARCHY2
     */
    @ExcelProperty(value = "HIERARCHY2")
    private String hierarchy2;

    /**
     * BPP HIERARCHY2
     */
    @ExcelProperty(value = "BPP HIERARCHY2")
    private String bppHierarchy2;

    /**
     * BPP 代码
     */
    @ExcelProperty(value = "BPP 代码")
    private String bppCode;

    /**
     * BPP 大类
     */
    @ExcelProperty(value = "BPP 大类")
    private String bbpCategoryDescr;

    /**
     * BPP 中类
     */
    @ExcelProperty(value = "BPP 中类")
    private String bppSubcategoryDescr;

    /**
     * BPP 品牌
     */
    @ExcelProperty(value = "BPP 品牌")
    private String bbpBrand;

    /**
     * BPP 口味
     */
    @ExcelProperty(value = "BPP 口味")
    private String bbpFlavor;

    /**
     * ABC分类
     */
    @ExcelProperty(value = "ABC分类")
    private String abc;

    /**
     * 新品标识
     */
    @ExcelProperty(value = "新品标识")
    private String uNew;

    /**
     * 状态
     */
    @ExcelProperty(value = "状态")
    private String status;


    /**
     * BPP描述
     */
    // @ExcelProperty(value = "BPP描述")
    private String bppDescr;


    /**
     * 中类
     */
    // @ExcelProperty(value = "中类")
    private String subcategory;


    /**
     * 中类描述
     */
    // @ExcelProperty(value = "中类描述")
    private String subcategoryDescr;


    /**
     * 品牌描述
     */
    // @ExcelProperty(value = "品牌描述")
    private String brandDescr;


    /**
     * 口味描述
     */
    // @ExcelProperty(value = "口味描述")
    private String flavorDescr;


    /**
     * 包装描述
     */
    // @ExcelProperty(value = "包装描述")
    private String packageDescr;

    /**
     * 产品分类
     */
    // @ExcelProperty(value = "产品分类")
    private String beverage;

    /**
     * 成品与KIT转换率
     */
    // @ExcelProperty(value = "成品与KIT转换率")
    private BigDecimal fgKitRate;

    /**
     * UC转换率
     */
    // @ExcelProperty(value = "UC转换率")
    private BigDecimal ucRate;

    /**
     * 版本号
     */
    // @ExcelProperty(value = "版本号")
    private Long versionNo;


}
