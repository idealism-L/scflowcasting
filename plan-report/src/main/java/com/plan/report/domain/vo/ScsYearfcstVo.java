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
 * scs_yearfcst视图对象 scs_yearfcst
 *
 * @author ruoyi
 * @date 2024-11-26
 */
@Data
@ExcelIgnoreUnannotated
public class ScsYearfcstVo implements Serializable {

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
     * 地点
     */
    @ExcelProperty(value = "地点")
    private String loc;

    /**
     * 单位
     */
    @ExcelProperty(value = "单位")
    private String uom;

    /**
     * 起始日期
     */
    @ExcelProperty(value = "起始日期")
    private Date startdate;

    /**
     * 开始日期+文件名(固定部分)
     */
    @ExcelProperty(value = "开始日期+文件名(固定部分)")
    private String fileBatch;

    /**
     * 1月
     */
    @ExcelProperty(value = "1月")
    private BigDecimal uM1;

    /**
     * 2月
     */
    @ExcelProperty(value = "2月")
    private BigDecimal uM2;

    /**
     * 3月
     */
    @ExcelProperty(value = "3月")
    private BigDecimal uM3;

    /**
     * 4月
     */
    @ExcelProperty(value = "4月")
    private BigDecimal uM4;

    /**
     * 5月
     */
    @ExcelProperty(value = "5月")
    private BigDecimal uM5;

    /**
     * 6月
     */
    @ExcelProperty(value = "6月")
    private BigDecimal uM6;

    /**
     * 7月
     */
    @ExcelProperty(value = "7月")
    private BigDecimal uM7;

    /**
     * 8月
     */
    @ExcelProperty(value = "8月")
    private BigDecimal uM8;

    /**
     * 9月
     */
    @ExcelProperty(value = "9月")
    private BigDecimal uM9;

    /**
     * 10月
     */
    @ExcelProperty(value = "10月")
    private BigDecimal uM10;

    /**
     * 11月
     */
    @ExcelProperty(value = "11月")
    private BigDecimal uM11;

    /**
     * 12月
     */
    @ExcelProperty(value = "12月")
    private BigDecimal uM12;

    /**
     * 13月
     */
    @ExcelProperty(value = "13月")
    private BigDecimal uM13;

    /**
     * 14月
     */
    @ExcelProperty(value = "14月")
    private BigDecimal uM14;

    /**
     * 15月
     */
    @ExcelProperty(value = "15月")
    private BigDecimal uM15;

    /**
     * 16月
     */
    @ExcelProperty(value = "16月")
    private BigDecimal uM16;

    /**
     * 物料区分
     */
    @ExcelProperty(value = "物料区分")
    private String itemPattern;

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
