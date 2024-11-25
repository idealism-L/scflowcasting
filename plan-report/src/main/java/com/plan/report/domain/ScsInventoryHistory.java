package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_inventory_history对象 scs_inventory_history
 *
 * @author ruoyi
 * @date 2024-11-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_inventory_history")
public class ScsInventoryHistory extends BaseEntity {

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
     * 装瓶集团
     */
    private String corporation;
    /**
     * 物料集团
     */
    private String itemCorporation;
    /**
     * 物料编码
     */
    private String itemCode;
    /**
     * 物料描述
     */
    private String descr;
    /**
     * 英文描述
     */
    private String descrEn;
    /**
     * BPP品牌
     */
    private String bppBrand;
    /**
     * BPP口味
     */
    private String bppFlavor;
    /**
     * 开始日期+文件名(固定部分)
     */
    private String fileBatch;
    /**
     * 地点
     */
    private String loc;
    /**
     * 地点代码
     */
    private String locOwnCode;
    /**
     * 可用日期
     */
    private Date availdate;
    /**
     * SCCL物料编码
     */
    private String scclItemCode;
    /**
     * 数量
     */
    private BigDecimal qty;
    /**
     * 失效日期
     */
    private Date expdate;
    /**
     * 物料区分
     */
    private String itemPattern;
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
