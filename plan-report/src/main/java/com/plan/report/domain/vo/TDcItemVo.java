package com.plan.report.domain.vo;

import java.math.BigDecimal;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.plan.common.annotation.ExcelDictFormat;
import com.plan.common.convert.ExcelDictConvert;
import lombok.Data;

import java.io.Serializable;

/**
 * 物料视图对象 t_dc_item
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class TDcItemVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * 物料编码
     */
    @ExcelProperty(value = "物料编码")
    private String item;

    /**
     * 描述
     */
    @ExcelProperty(value = "描述")
    private String descr;

    /**
     * 英文描述
     */
    @ExcelProperty(value = "英文描述")
    private String uDescrEn;

    /**
     * 简短描述
     */
    @ExcelProperty(value = "简短描述")
    private String uDescrShort;

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
     * 子口味
     */
    @ExcelProperty(value = "子口味")
    private String uSubflavor;

    /**
     * 子口味描述
     */
    @ExcelProperty(value = "子口味描述")
    private String uSubflavorDescr;

    /**
     * 包装容量
     */
    @ExcelProperty(value = "包装容量")
    private String uPackageCap;

    /**
     * 包装容量描述
     */
    @ExcelProperty(value = "包装容量描述")
    private String uPackageCapDescr;

    /**
     * SCCL成品或主剂对应的编码
     */
    @ExcelProperty(value = "SCCL成品或主剂对应的编码")
    private String uScclCode;

    /**
     * CBL成品对应的编码
     */
    @ExcelProperty(value = "CBL成品对应的编码")
    private String uCblCode;

    /**
     * ZH成品对应的编码
     */
    @ExcelProperty(value = "ZH成品对应的编码")
    private String uZhCode;

    /**
     * 系列
     */
    @ExcelProperty(value = "系列")
    private String uFamily;

    /**
     * 规格
     */
    @ExcelProperty(value = "规格")
    private String uSpec;

    /**
     * 规格描述
     */
    @ExcelProperty(value = "规格描述")
    private String uSpecDescr;

    /**
     * 套件/FG
     */
    @ExcelProperty(value = "套件/FG")
    private String uItemPattern;

    /**
     * 数据来源
     */
    @ExcelProperty(value = "数据来源")
    private String uCorporation;

    /**
     * 果汁/果肉主剂标识
     */
    @ExcelProperty(value = "果汁/果肉主剂标识")
    private String uFruitCategory;

    /**
     * 单位
     */
    @ExcelProperty(value = "单位")
    private String uUom;

    /**
     * 主单位转次单转换系数
     */
    @ExcelProperty(value = "主单位转次单转换系数")
    private BigDecimal uUomRate1;

    /**
     * 主单位转次单转换系数2
     */
    @ExcelProperty(value = "主单位转次单转换系数2")
    private BigDecimal uUomRate2;

    /**
     * UC单位量
     */
    @ExcelProperty(value = "UC单位量")
    private Integer uUc;

    /**
     * PC单位量
     */
    @ExcelProperty(value = "PC单位量")
    private Integer uPc;

    /**
     * 成品编码对应CPS的BPP编码
     */
    @ExcelProperty(value = "成品编码对应CPS的BPP编码")
    private String uBppCode;

    /**
     * 品牌+风味+包装描盒2
     */
    @ExcelProperty(value = "品牌+风味+包装描盒2")
    private String uHierarchy2;

    /**
     * 碳酸非碳酸标识
     */
    @ExcelProperty(value = "碳酸非碳酸标识")
    private String uCarbonic;

    /**
     * ABC分类
     */
    @ExcelProperty(value = "ABC分类")
    private String uAbc;

    /**
     * 新品标识
     */
    @ExcelProperty(value = "新品标识")
    private String uNew;

    /**
     * 使用区域
     */
    @ExcelProperty(value = "使用区域")
    private String uRegion;

    /**
     * 状态
     */
    @ExcelProperty(value = "状态")
    private String uStatus;

    /**
     * 更新的文件
     */
    @ExcelProperty(value = "更新的文件")
    private String uFileName;


}
