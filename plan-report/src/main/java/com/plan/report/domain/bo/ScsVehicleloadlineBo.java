package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_vehicleloadline业务对象 scs_vehicleloadline
 *
 * @author ruoyi
 * @date 2024-11-20
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsVehicleloadlineBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 物料编码
     */
    @NotBlank(message = "物料编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String itemCode;

    /**
     * 描述
     */
    @NotBlank(message = "描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descr;

    /**
     * 英文描述
     */
    @NotBlank(message = "英文描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descrEn;

    /**
     * 收货集团
     */
    @NotBlank(message = "收货集团不能为空", groups = { AddGroup.class, EditGroup.class })
    private String corporation;

    /**
     * 地点
     */
    @NotBlank(message = "地点不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loc;

    /**
     * BPP品牌
     */
    @NotBlank(message = "BPP品牌不能为空", groups = { AddGroup.class, EditGroup.class })
    private String bppBrand;

    /**
     * BPP口味
     */
    @NotBlank(message = "BPP口味不能为空", groups = { AddGroup.class, EditGroup.class })
    private String bppFlavor;

    /**
     * 到货日期
     */
    @NotNull(message = "到货日期不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date schedarrivdate;

    /**
     * 实际在途（scs_if_hld_vehicleloadline.sourcestatus=3 并且在scs_if_hld_custorder中订单号+地点+物料相同的量）
     */
    @NotNull(message = "实际在途（scs_if_hld_vehicleloadline.sourcestatus=3 并且在scs_if_hld_custorder中订单号+地点+物料相同的量）不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal actualQty;

    /**
     * 计划在途（scs_if_hld_vehicleloadline.sourcestatus=1的数量）
     */
    @NotNull(message = "计划在途（scs_if_hld_vehicleloadline.sourcestatus=1的数量）不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal planQty;

    /**
     * 实际在途(SU)
     */
    @NotNull(message = "实际在途(SU)不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal suQty;

    /**
     * 实际在途(UC)
     */
    @NotNull(message = "实际在途(UC)不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal ucQty;

    /**
     * 文件名
     */
    @NotBlank(message = "文件名不能为空", groups = { AddGroup.class, EditGroup.class })
    private String fileName;

    /**
     * 文件上传时间
     */
    @NotNull(message = "文件上传时间不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date editdate;

    /**
     * 版本号
     */
    @NotNull(message = "版本号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long versionNo;


}
