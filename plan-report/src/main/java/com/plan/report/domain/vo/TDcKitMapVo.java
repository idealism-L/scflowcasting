package com.plan.report.domain.vo;

import java.math.BigDecimal;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.plan.common.annotation.ExcelDictFormat;
import com.plan.common.convert.ExcelDictConvert;
import lombok.Data;

import java.io.Serializable;

/**
 * 溶剂映射视图对象 t_dc_kit_map
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class TDcKitMapVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

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
     * 地点代码
     */
    @ExcelProperty(value = "地点代码")
    private String loc;

    /**
     * 地点描述
     */
    @ExcelProperty(value = "地点描述")
    private String locDescr;

    /**
     * KIT代码
     */
    @ExcelProperty(value = "KIT代码")
    private String kitCode;

    /**
     * KIT描述
     */
    @ExcelProperty(value = "KIT描述")
    private String kitDescr;

    /**
     * 转化率
     */
    @ExcelProperty(value = "转化率")
    private BigDecimal convfactor;

    /**
     * 成品HIERARCHY
     */
    @ExcelProperty(value = "成品HIERARCHY")
    private String productHierarchy;

    /**
     * 备注
     */
    @ExcelProperty(value = "备注")
    private String uComment;


}
