package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_vehicleloadline对象 scs_vehicleloadline
 *
 * @author ruoyi
 * @date 2024-11-20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_vehicleloadline")
public class ScsVehicleloadline extends BaseEntity {

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
     * 描述
     */
    private String descr;
    /**
     * 英文描述
     */
    private String descrEn;
    /**
     * 收货集团
     */
    private String corporation;
    /**
     * 地点
     */
    private String loc;
    /**
     * BPP品牌
     */
    private String bppBrand;
    /**
     * BPP口味
     */
    private String bppFlavor;
    /**
     * 到货日期
     */
    private Date schedarrivdate;
    /**
     * 实际在途（scs_if_hld_vehicleloadline.sourcestatus=3 并且在scs_if_hld_custorder中订单号+地点+物料相同的量）
     */
    private BigDecimal actualQty;
    /**
     * 计划在途（scs_if_hld_vehicleloadline.sourcestatus=1的数量）
     */
    private BigDecimal planQty;
    /**
     * 实际在途(SU)
     */
    private BigDecimal suQty;
    /**
     * 实际在途(UC)
     */
    private BigDecimal ucQty;
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
