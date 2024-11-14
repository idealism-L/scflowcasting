package com.plan.report.domain.excelModel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName ScsIfClnItemExcelModel
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/14 11:17
 */
@Data
public class ScsIfClnItemExcelModel {

    private static final long serialVersionUID = 1L;

    /**
     * 物料
     */
    @ExcelProperty(value = "Item")
    private String item;

    /**
     * 描述
     */
    @ExcelProperty(value = "Descr")
    private String descr;

    /**
     * 英文描述
     */
    @ExcelProperty(value = "U_DESCR_EN")
    private String uDescrEn;

    /**
     * 简短描述
     */
    @ExcelProperty(value = "U_DESCR_SHORT")
    private String uDescrShort;

    /**
     * 大类
     */
    @ExcelProperty(value = "U_CATEGORY")
    private String uCategory;

    /**
     * 大类描述
     */
    @ExcelProperty(value = "U_CATEGORY_DESCR")
    private String uCategoryDescr;

    /**
     * 中类
     */
    @ExcelProperty(value = "U_SUBCATEGORY")
    private String uSubcategory;

    /**
     * 中类描述
     */
    @ExcelProperty(value = "U_SUBCATEGORY_DESCR")
    private String uSubcategoryDescr;

    /**
     * 品牌
     */
    @ExcelProperty(value = "U_BRAND")
    private String uBrand;

    /**
     * 品牌描述
     */
    @ExcelProperty(value = "U_BRAND_DESCR")
    private String uBrandDescr;

    /**
     * 口味
     */
    @ExcelProperty(value = "U_FLAVOR")
    private String uFlavor;

    /**
     * 口味描述
     */
    @ExcelProperty(value = "U_FLAVOR_DESCR")
    private String uFlavorDescr;

    /**
     * 包装
     */
    @ExcelProperty(value = "U_PACKAGE")
    private String uPackage;

    /**
     * 包装描述
     */
    @ExcelProperty(value = "U_PACKAGE_DESCR")
    private String uPackageDescr;

    /**
     * 子口味
     */
    @ExcelProperty(value = "U_SUBFLAVOR")
    private String uSubflavor;

    /**
     * 子口味描述
     */
    @ExcelProperty(value = "U_SUBFLAVOR_DESCR")
    private String uSubflavorDescr;

    /**
     * 包装容量
     */
    @ExcelProperty(value = "U_PACKAGE_CAP")
    private String uPackageCap;

    /**
     * 包装容量描述
     */
    @ExcelProperty(value = "U_PACKAGE_CAP_DESCR")
    private String uPackageCapDescr;

    /**
     * SCCL成品或主剂对应的编码
     */
    @ExcelProperty(value = "U_SCCL_CODE")
    private String uScclCode;

    /**
     * CBL成品对应的编码
     */
    @ExcelProperty(value = "U_CBL_CODE")
    private String uCblCode;

    /**
     * ZH成品对应的编码
     */
    @ExcelProperty(value = "U_ZH_CODE")
    private String uZhCode;

    /**
     * 系列
     */
    @ExcelProperty(value = "U_FAMILY")
    private String uFamily;

    /**
     * 规格
     */
    @ExcelProperty(value = "U_SPEC")
    private String uSpec;

    /**
     * 规格描述
     */
    @ExcelProperty(value = "U_SPEC_DESCR")
    private String uSpecDescr;

    /**
     * 套件/FG
     */
    @ExcelProperty(value = "U_ITEM_PATTERN")
    private String uItemPattern;

    /**
     * 数据来源
     */
    @ExcelProperty(value = "U_CORPORATION")
    private String uCorporation;

    /**
     * 果汁/果肉主剂标识
     */
    @ExcelProperty(value = "U_FRUIT_CATEGORY")
    private String uFruitCategory;

    /**
     * 单位
     */
    @ExcelProperty(value = "U_UOM")
    private String uUom;

    /**
     * 主单位转次单转换系数
     */
    @ExcelProperty(value = "U_UOM_RATE1")
    private BigDecimal uUomRate1;

    /**
     * 主单位转次单转换系数2
     */
    @ExcelProperty(value = "U_UOM_RATE2")
    private BigDecimal uUomRate2;

    /**
     * UC单位量
     */
    @ExcelProperty(value = "U_UC")
    private BigDecimal uUc;

    /**
     * PC单位量
     */
    @ExcelProperty(value = "U_PC")
    private BigDecimal uPc;

    /**
     * 成品编码对应CPS的BPP编码
     */
    @ExcelProperty(value = "U_BPP_CODE")
    private String uBppCode;

    /**
     * 品牌+风味+包装描盒2
     */
    @ExcelProperty(value = "U_HIERARCHY2")
    private String uHierarchy2;

    /**
     * 碳酸非碳酸标识
     */
    @ExcelProperty(value = "U_CARBONIC")
    private String uCarbonic;

    /**
     * ABC分类
     */
    @ExcelProperty(value = "U_ABC")
    private String uAbc;

    /**
     * 新品标识
     */
    @ExcelProperty(value = "U_NEW")
    private String uNew;

    /**
     * 使用区域
     */
    @ExcelProperty(value = "U_REGION")
    private String uRegion;

    /**
     * 状态
     */
    @ExcelProperty(value = "U_STATUS")
    private String uStatus;

    /**
     * 更新的文件
     */
    @ExcelProperty(value = "U_FILE_NAME")
    private String uFileName;

    /**
     * u_editdate
     */
    @ExcelProperty(value = "U_EDITDATE")
    private Date uEditdate;
    /**
     * u_createdate
     */
    @ExcelProperty(value = "U_CREATEDATE")
    private Date uCreatedate;


}
