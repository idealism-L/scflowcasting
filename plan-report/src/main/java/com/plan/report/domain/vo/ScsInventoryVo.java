package com.plan.report.domain.vo;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.plan.common.annotation.ExcelDictFormat;
import com.plan.common.convert.ExcelDictConvert;
import lombok.Data;

import java.io.Serializable;

/**
 * scs_inventory视图对象 scs_inventory
 *
 * @author ruoyi
 * @date 2024-11-13
 */
@Data
@ExcelIgnoreUnannotated
public class ScsInventoryVo implements Serializable {

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
