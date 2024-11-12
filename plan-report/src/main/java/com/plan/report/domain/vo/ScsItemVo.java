package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * scs_item视图对象 scs_item
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@ExcelIgnoreUnannotated
public class ScsItemVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * 物料
     */
    @ExcelProperty(value = "物料")
    private String item;

    /**
     * 装瓶集团
     */
    @ExcelProperty(value = "装瓶集团")
    private String corporation;

    /**
     * KIT/FG
     */
    @ExcelProperty(value = "KIT/FG")
    private String itemPattern;

    /**
     * 物料编码
     */
    @ExcelProperty(value = "物料编码")
    private String itemCode;

    /**
     * 物料描述
     */
    @ExcelProperty(value = "物料描述")
    private String descr;

    /**
     * 英文描述
     */
    @ExcelProperty(value = "英文描述")
    private String descrEn;

    /**
     * 简短描述
     */
    @ExcelProperty(value = "简短描述")
    private String descrShort;

    /**
     * 大类
     */
    @ExcelProperty(value = "大类")
    private String category;

    /**
     * 大类描述
     */
    @ExcelProperty(value = "大类描述")
    private String categoryDescr;

    /**
     * 中类
     */
    @ExcelProperty(value = "中类")
    private String subcategory;

    /**
     * 中类描述
     */
    @ExcelProperty(value = "中类描述")
    private String subcategoryDescr;

    /**
     * 品牌代码
     */
    @ExcelProperty(value = "品牌代码")
    private String brand;

    /**
     * 品牌描述
     */
    @ExcelProperty(value = "品牌描述")
    private String brandDescr;

    /**
     * 口味代码
     */
    @ExcelProperty(value = "口味代码")
    private String flavor;

    /**
     * 口味描述
     */
    @ExcelProperty(value = "口味描述")
    private String flavorDescr;

    /**
     * 包装代码
     */
    @ExcelProperty(value = "包装代码")
    private String packAge;

    /**
     * 包装描述
     */
    @ExcelProperty(value = "包装描述")
    private String packageDescr;

    /**
     * 子口味
     */
    @ExcelProperty(value = "子口味")
    private String subflavor;

    /**
     * 子口味描述
     */
    @ExcelProperty(value = "子口味描述")
    private String subflavorDescr;

    /**
     * 包装容量
     */
    @ExcelProperty(value = "包装容量")
    private String packageCap;

    /**
     * 包装容量描述
     */
    @ExcelProperty(value = "包装容量描述")
    private String packageCapDescr;

    /**
     * SCCL成品或主剂对应的编码
     */
    @ExcelProperty(value = "SCCL成品或主剂对应的编码")
    private String scclCode;

    /**
     * CBL成品对应的编码
     */
    @ExcelProperty(value = "CBL成品对应的编码")
    private String cblCode;

    /**
     * ZH成品对应的编码
     */
    @ExcelProperty(value = "ZH成品对应的编码")
    private String zhCode;

    /**
     * FAMILY
     */
    @ExcelProperty(value = "FAMILY")
    private String family;

    /**
     * 规格
     */
    @ExcelProperty(value = "规格")
    private String spec;

    /**
     * 规格描述
     */
    @ExcelProperty(value = "规格描述")
    private String specDescr;

    /**
     * 果汁/果肉标识
     */
    @ExcelProperty(value = "果汁/果肉标识")
    private String fruitCategory;

    /**
     * 单位
     */
    @ExcelProperty(value = "单位")
    private String uom;

    /**
     * 主单位转次单转换系数
     */
    @ExcelProperty(value = "主单位转次单转换系数")
    private BigDecimal uomRate1;

    /**
     * 主单位转次单转换系数2
     */
    @ExcelProperty(value = "主单位转次单转换系数2")
    private BigDecimal uomRate2;

    /**
     * UC单位量
     */
    @ExcelProperty(value = "UC单位量")
    private BigDecimal uc;

    /**
     * PC单位量
     */
    @ExcelProperty(value = "PC单位量")
    private BigDecimal pc;

    /**
     * BPP代码
     */
    @ExcelProperty(value = "BPP代码")
    private String bppCode;

    /**
     * hierarchy2
     */
    @ExcelProperty(value = "hierarchy2")
    private String hierarchy2;

    /**
     * 碳酸非碳酸标识
     */
    @ExcelProperty(value = "碳酸非碳酸标识")
    private String carbonic;

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
     * 区域
     */
    @ExcelProperty(value = "区域")
    private String region;

    /**
     * 状态
     */
    @ExcelProperty(value = "状态")
    private String status;

    /**
     * 更新的文件
     */
    @ExcelProperty(value = "更新的文件")
    private String fileName;

    /**
     * 版本号
     */
    @ExcelProperty(value = "版本号")
    private Long versionNo;


}
