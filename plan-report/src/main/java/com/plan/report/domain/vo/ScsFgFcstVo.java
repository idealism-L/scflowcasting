package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * scs_fg_fcst视图对象 scs_fg_fcst
 *
 * @author ruoyi
 * @date 2024-11-26
 */
@Data
@ExcelIgnoreUnannotated
public class ScsFgFcstVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    // @ExcelProperty(value = "ID")
    private Long id;

    /**
     * 物料编码
     */
    // @ExcelProperty(value = "物料编码")
    private String itemCode;

    /**
     * 物料描述
     */
    // @ExcelProperty(value = "物料描述")
    private String descr;

    /**
     * 装瓶集团
     */
    // @ExcelProperty(value = "装瓶集团")
    private String corporation;

    private String totFcstPC;

    /**
     * 日期数量Map
     */
    private Map<String, BigDecimal> quantities = new HashMap<>();

    /**
     * 总量
     */
    private BigDecimal totalQty;

    /**
     * 来源ID
     */
    // @ExcelProperty(value = "来源ID")
    private Long parentId;

    /**
     * 物料集团
     */
    // @ExcelProperty(value = "物料集团")
    private String itemCorporation;

    /**
     * 物料
     */
    // @ExcelProperty(value = "物料")
    private String item;


    /**
     * 英文描述
     */
    // @ExcelProperty(value = "英文描述")
    private String descrEn;

    /**
     * dmdgroup
     */
    // @ExcelProperty(value = "dmdgroup")
    private String dmdgroup;

    /**
     * 开始日期
     */
    // @ExcelProperty(value = "开始日期")
    private Date startdate;

    /**
     * 地点
     */
    // @ExcelProperty(value = "地点")
    private String loc;

    /**
     * 数量
     */
    // @ExcelProperty(value = "数量")
    private BigDecimal qty;

    /**
     * 有效标识
     */
    // @ExcelProperty(value = "有效标识")
    private String uFlag;

    /**
     * 说明
     */
    // @ExcelProperty(value = "说明")
    private String uComment;

    /**
     * 开始日期+文件名(固定部分)
     */
    // @ExcelProperty(value = "开始日期+文件名(固定部分)")
    private String fileBatch;

    /**
     * 来源文件名
     */
    // @ExcelProperty(value = "来源文件名")
    private String fileName;

    /**
     * 文件上传时间
     */
    // @ExcelProperty(value = "文件上传时间")
    private Date editdate;

    /**
     * 版本号
     */
    // @ExcelProperty(value = "版本号")
    private Long versionNo;

    public void setTotalQty() {
        BigDecimal totalQty = BigDecimal.ZERO;
        for (BigDecimal quantity : quantities.values()) {
            totalQty = totalQty.add(quantity);
        }
        this.totalQty = totalQty;
    }

    /**
     * 去掉多余的零并确保不使用科学计数法
     */
    public void stripTrailingZerosToString() {
        for (Map.Entry<String, BigDecimal> entry : quantities.entrySet()) {
            entry.setValue(new BigDecimal(entry.getValue().stripTrailingZeros().toPlainString()));
        }
        if (totalQty != null) {
            totalQty = new BigDecimal(totalQty.stripTrailingZeros().toPlainString());
        }
    }


}
