package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_inventory_history视图对象 scs_inventory_history
 *
 * @author ruoyi
 * @date 2024-11-28
 */
@Data
@ExcelIgnoreUnannotated
public class ScsInventoryHistoryVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * 来源ID
     */
    @ExcelProperty(value = "来源ID")
    private Long parentId;

    /**
     * 装瓶集团
     */
    @ExcelProperty(value = "装瓶集团")
    private String corporation;

    /**
     * 物料集团
     */
    @ExcelProperty(value = "物料集团")
    private String itemCorporation;

    /**
     * 物料编码
     */
    @ExcelProperty(value = "物料编码")
    private String itemCode;

    /**
     * 物料
     */
    @ExcelProperty(value = "物料")
    private String item;

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
     * BPP大类
     */
    @ExcelProperty(value = "BPP大类")
    private String bppCategory;

    /**
     * BPP品牌
     */
    @ExcelProperty(value = "BPP品牌")
    private String bppBrand;

    /**
     * BPP口味
     */
    @ExcelProperty(value = "BPP口味")
    private String bppFlavor;

    /**
     * 开始日期+文件名(固定部分)
     */
    @ExcelProperty(value = "开始日期+文件名(固定部分)")
    private String fileBatch;

    /**
     * 地点
     */
    @ExcelProperty(value = "地点")
    private String loc;

    /**
     * 地点代码
     */
    @ExcelProperty(value = "地点代码")
    private String locOwnCode;

    /**
     * 可用日期
     */
    @ExcelProperty(value = "可用日期")
    private Date availdate;

    /**
     * SCCL物料编码
     */
    @ExcelProperty(value = "SCCL物料编码")
    private String scclItemCode;

    /**
     * 数量
     */
    @ExcelProperty(value = "数量")
    private BigDecimal qty;

    /**
     * 失效日期
     */
    @ExcelProperty(value = "失效日期")
    private Date expdate;

    /**
     * 物料区分
     */
    @ExcelProperty(value = "物料区分")
    private String itemPattern;

    /**
     * 有效标识
     */
    @ExcelProperty(value = "有效标识")
    private String uFlag;

    /**
     * 备注说明
     */
    @ExcelProperty(value = "备注说明")
    private String uComment;

    /**
     * 来源文件名
     */
    @ExcelProperty(value = "来源文件名")
    private String fileName;

    /**
     * 文件上传时间
     */
    @ExcelProperty(value = "文件上传时间")
    private Date editdate;

    /**
     * 版本号
     */
    @ExcelProperty(value = "版本号")
    private Long versionNo;


}
