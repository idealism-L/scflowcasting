package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_fg_fcst_history视图对象 scs_fg_fcst_history
 *
 * @author ruoyi
 * @date 2024-11-13
 */
@Data
@ExcelIgnoreUnannotated
public class ScsFgFcstHistoryVo implements Serializable {

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
     * 说明
     */
    @ExcelProperty(value = "说明")
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
