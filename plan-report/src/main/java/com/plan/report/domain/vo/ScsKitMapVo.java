package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * scs_kit_map视图对象 scs_kit_map
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@ExcelIgnoreUnannotated
public class ScsKitMapVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * ITEM ID
     */
    // @ExcelProperty(value = "ITEM ID")
    private Long itemId;

    /**
     * 物料
     */
    // @ExcelProperty(value = "物料")
    private String item;

    /**
     * 地点ID
     */
    // @ExcelProperty(value = "地点ID")
    private Long locId;

    /**
     * 地点
     */
    // @ExcelProperty(value = "地点")
    private String loc;

    /**
     * KIT ITEM ID
     */
    // @ExcelProperty(value = "KIT ITEM ID")
    private Long kitItemId;

    /**
     * KIT物料
     */
    // @ExcelProperty(value = "KIT物料")
    private String kitItem;

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
    private String itemDescr;

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
     * 地点代码
     */
    @ExcelProperty(value = "地点代码")
    private String locCode;

    /**
     * 地点描述
     */
    @ExcelProperty(value = "地点描述")
    private String locDescr;

    /**
     * 成品HIERARCHY
     */
    @ExcelProperty(value = "成品HIERARCHY")
    private String productHierarchy;

    /**
     * 转换系数
     */
    @ExcelProperty(value = "转换系数")
    private BigDecimal convfactor;

    /**
     * 有效标志
     */
    @ExcelProperty(value = "有效标志")
    private String uFlag;

    /**
     * 备注
     */
    @ExcelProperty(value = "备注")
    private String uComment;

    /**
     * 版本号
     */
    // @ExcelProperty(value = "版本号")
    private Long versionNo;

}
