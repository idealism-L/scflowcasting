package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_custorder对象 scs_custorder
 *
 * @author ruoyi
 * @date 2024-11-26
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_custorder")
public class ScsCustorder extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
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
     * 发货日期
     */
    private Date shipdate;
    /**
     * 订单ID
     */
    private String orderid;
    /**
     * 数量
     */
    private BigDecimal qty;
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
     * 备注
     */
    private String uComment;
    /**
     * 文件名
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
