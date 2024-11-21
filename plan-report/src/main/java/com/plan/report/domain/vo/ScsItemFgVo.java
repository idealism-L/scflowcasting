package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 成品主文件视图对象
 *
 * @author ruoyi
 * @date 2024-11-15
 */
@Data
@ExcelIgnoreUnannotated
public class ScsItemFgVo implements Serializable {

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
}
