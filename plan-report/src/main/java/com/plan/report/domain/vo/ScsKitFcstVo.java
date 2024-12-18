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
 * scs_kit_fcst视图对象 scs_kit_fcst
 *
 * @author ruoyi
 * @date 2024-11-26
 */
@Data
@ExcelIgnoreUnannotated
public class ScsKitFcstVo implements Serializable {

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
     * dmdgroup
     */
    @ExcelProperty(value = "dmdgroup")
    private String dmdgroup;

    /**
     * 开始日期
     */
    @ExcelProperty(value = "开始日期")
    private Date startdate;

    /**
     * 地点
     */
    @ExcelProperty(value = "地点")
    private String loc;

    /**
     * sku地点
     */
    @ExcelProperty(value = "sku地点")
    private String skuLoc;

    /**
     * 数量
     */
    @ExcelProperty(value = "数量")
    private BigDecimal qty;

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
     * 开始日期+文件名(固定部分)
     */
    @ExcelProperty(value = "开始日期+文件名(固定部分)")
    private String fileBatch;

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
