package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_bpp_master视图对象 scs_bpp_master
 *
 * @author ruoyi
 * @date 2024-11-21
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
     * BPP代码
     */
    @ExcelProperty(value = "BPP代码")
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
    private String category;

    /**
     * 大类描述
     */
    // @ExcelProperty(value = "大类描述")
    private String categoryDescr;

    /**
     * 中类
     */
    @ExcelProperty(value = "中类")
    private String subcategory;

    /**
     * 中类描述
     */
    // @ExcelProperty(value = "中类描述")
    private String subcategoryDescr;

    /**
     * 品牌
     */
    @ExcelProperty(value = "品牌")
    private String brand;

    /**
     * 品牌描述
     */
    // @ExcelProperty(value = "品牌描述")
    private String brandDescr;

    /**
     * 口味
     */
    @ExcelProperty(value = "口味")
    private String flavor;

    /**
     * 口味描述
     */
    // @ExcelProperty(value = "口味描述")
    private String flavorDescr;

    /**
     * 包装
     */
    // @ExcelProperty(value = "包装")
    private String packageCode;

    /**
     * 包装描述
     */
    // @ExcelProperty(value = "包装描述")
    private String packageDescr;

    /**
     * 产品分类
     */
    @ExcelProperty(value = "产品分类")
    private String beverage;

    /**
     * 成品与KIT转换率
     */
    @ExcelProperty(value = "成品与KIT转换率")
    private BigDecimal fgKitRate;

    /**
     * UC转换率
     */
    @ExcelProperty(value = "UC转换率")
    private BigDecimal ucRate;

    /**
     * 状态
     */
    @ExcelProperty(value = "状态")
    private String status;

    /**
     * 创建时间
     */
    @ExcelProperty(value = "修改日期")
    private Date updateTime;

    /**
     * 版本号
     */
    // @ExcelProperty(value = "版本号")
    private Long versionNo;


}
