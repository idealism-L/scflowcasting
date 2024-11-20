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
 * scs_inventory业务对象 scs_inventory
 *
 * @author ruoyi
 * @date 2024-11-20
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsInventoryBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 来源ID
     */
    @NotNull(message = "来源ID不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long parentId;

    /**
     * 装瓶集团
     */
    @NotBlank(message = "装瓶集团不能为空", groups = { AddGroup.class, EditGroup.class })
    private String corporation;

    /**
     * 物料集团
     */
    @NotBlank(message = "物料集团不能为空", groups = { AddGroup.class, EditGroup.class })
    private String kitCorporation;

    /**
     * 物料编码
     */
    @NotBlank(message = "物料编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String itemCode;

    /**
     * 物料描述
     */
    @NotBlank(message = "物料描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descr;

    /**
     * 英文描述
     */
    @NotBlank(message = "英文描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descrEn;

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
     * 地点
     */
    @NotBlank(message = "地点不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loc;

    /**
     * 地点代码
     */
    @NotBlank(message = "地点代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String locOwnCode;

    /**
     * 可用日期
     */
    @NotNull(message = "可用日期不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date availdate;

    /**
     * SCCL物料编码
     */
    @NotBlank(message = "SCCL物料编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String scclItemCode;

    /**
     * 数量
     */
    @NotNull(message = "数量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal qty;

    /**
     * 失效日期
     */
    @NotNull(message = "失效日期不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date expdate;

    /**
     * 物料区分
     */
    @NotBlank(message = "物料区分不能为空", groups = { AddGroup.class, EditGroup.class })
    private String itemPattern;

    /**
     * 有效标识
     */
    @NotBlank(message = "有效标识不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uFlag;

    /**
     * 备注说明
     */
    @NotBlank(message = "备注说明不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uComment;

    /**
     * 来源文件名
     */
    @NotBlank(message = "来源文件名不能为空", groups = { AddGroup.class, EditGroup.class })
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
