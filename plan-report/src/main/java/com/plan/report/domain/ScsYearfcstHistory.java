package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_yearfcst_history对象 scs_yearfcst_history
 *
 * @author ruoyi
 * @date 2024-11-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_yearfcst_history")
public class ScsYearfcstHistory extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * 来源ID
     */
    private Long parentId;
    /**
     * 物料编码
     */
    private String itemCode;
    /**
     * 物料
     */
    private String item;
    /**
     * 物料描述
     */
    private String descr;
    /**
     * 英文描述
     */
    private String descrEn;
    /**
     * 地点
     */
    private String loc;
    /**
     * 单位
     */
    private String uom;
    /**
     * 起始日期
     */
    private Date startdate;
    /**
     * 开始日期+文件名(固定部分)
     */
    private String fileBatch;
    /**
     * 1月
     */
    private BigDecimal uM1;
    /**
     * 2月
     */
    private BigDecimal uM2;
    /**
     * 3月
     */
    private BigDecimal uM3;
    /**
     * 4月
     */
    private BigDecimal uM4;
    /**
     * 5月
     */
    private BigDecimal uM5;
    /**
     * 6月
     */
    private BigDecimal uM6;
    /**
     * 7月
     */
    private BigDecimal uM7;
    /**
     * 8月
     */
    private BigDecimal uM8;
    /**
     * 9月
     */
    private BigDecimal uM9;
    /**
     * 10月
     */
    private BigDecimal uM10;
    /**
     * 11月
     */
    private BigDecimal uM11;
    /**
     * 12月
     */
    private BigDecimal uM12;
    /**
     * 13月
     */
    private BigDecimal uM13;
    /**
     * 14月
     */
    private BigDecimal uM14;
    /**
     * 15月
     */
    private BigDecimal uM15;
    /**
     * 16月
     */
    private BigDecimal uM16;
    /**
     * 物料区分
     */
    private String itemPattern;
    /**
     * 装瓶集团
     */
    private String corporation;
    /**
     * 物料集团
     */
    private String itemCorporation;
    /**
     * 有效标识
     */
    private String uFlag;
    /**
     * 备注说明
     */
    private String uComment;
    /**
     * 来源文件名
     */
    private String fileName;
    /**
     * 文件上传时间
     */
    private Date editdate;
    /**
     * 版本号
     */
    private Long versionNo;

}
