package com.plan.report.domain.vo;

import java.math.BigDecimal;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.plan.common.annotation.ExcelDictFormat;
import com.plan.common.convert.ExcelDictConvert;
import lombok.Data;

import java.io.Serializable;

/**
 * 成品映射视图对象 t_dc_fg_map
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class TDcFgMapVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long imMainInsuranceConfigId;

    /**
     * 装瓶集团
     */
    @ExcelProperty(value = "装瓶集团")
    private String corporation;

    /**
     * 物料编码
     */
    @ExcelProperty(value = "物料编码")
    private String item;

    /**
     * 物料描述
     */
    @ExcelProperty(value = "物料描述")
    private String itemDescr;

    /**
     * 转换系数
     */
    @ExcelProperty(value = "转换系数")
    private BigDecimal convfactor;

    /**
     * SCCSCM代码
     */
    @ExcelProperty(value = "SCCSCM代码")
    private String kitCode;

    /**
     * 备注
     */
    @ExcelProperty(value = "备注")
    private String uComment;

    /**
     * 有效标志
     */
    @ExcelProperty(value = "有效标志")
    private String uFlag;

    /**
     * 主要成品标志
     */
    @ExcelProperty(value = "主要成品标志")
    private String keyProductionFlag;


}
