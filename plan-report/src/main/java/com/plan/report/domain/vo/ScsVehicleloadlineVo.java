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
 * scs_vehicleloadline视图对象 scs_vehicleloadline
 *
 * @author ruoyi
 * @date 2024-11-26
 */
@Data
@ExcelIgnoreUnannotated
public class ScsVehicleloadlineVo implements Serializable {

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
    private String itemCode;

    /**
     * 物料
     */
    @ExcelProperty(value = "物料")
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
    private String descrEn;

    /**
     * 收货集团
     */
    @ExcelProperty(value = "收货集团")
    private String corporation;

    /**
     * 物料集团
     */
    @ExcelProperty(value = "物料集团")
    private String itemCorporation;

    /**
     * 地点
     */
    @ExcelProperty(value = "地点")
    private String loc;

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
     * 到货日期
     */
    @ExcelProperty(value = "到货日期")
    private Date schedarrivdate;

    /**
     * 实际在途（scs_if_hld_vehicleloadline.sourcestatus=3 并且在scs_if_hld_custorder中订单号+地点+物料相同的量）
     */
    @ExcelProperty(value = "实际在途", converter = ExcelDictConvert.class)
    @ExcelDictFormat(readConverterExp = "s=cs_if_hld_vehicleloadline.sourcestatus=3,并=且在scs_if_hld_custorder中订单号+地点+物料相同的量")
    private BigDecimal actualQty;

    /**
     * 计划在途（scs_if_hld_vehicleloadline.sourcestatus=1的数量）
     */
    @ExcelProperty(value = "计划在途", converter = ExcelDictConvert.class)
    @ExcelDictFormat(readConverterExp = "s=cs_if_hld_vehicleloadline.sourcestatus=1的数量")
    private BigDecimal planQty;

    /**
     * 实际在途(SU)
     */
    @ExcelProperty(value = "实际在途(SU)")
    private BigDecimal suQty;

    /**
     * 实际在途(UC)
     */
    @ExcelProperty(value = "实际在途(UC)")
    private BigDecimal ucQty;

    /**
     * 文件名
     */
    @ExcelProperty(value = "文件名")
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
