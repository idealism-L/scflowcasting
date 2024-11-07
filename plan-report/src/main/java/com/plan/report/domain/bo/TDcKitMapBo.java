package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 溶剂映射业务对象 t_dc_kit_map
 *
 * @author ruoyi
 * @date 2024-11-06
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class TDcKitMapBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 装瓶集团
     */
    @NotBlank(message = "装瓶集团不能为空", groups = { AddGroup.class, EditGroup.class })
    private String corporation;

    /**
     * 物料编码
     */
    @NotBlank(message = "物料编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String item;

    /**
     * 物料描述
     */
    @NotBlank(message = "物料描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String itemDescr;

    /**
     * 地点代码
     */
    @NotBlank(message = "地点代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loc;

    /**
     * 地点描述
     */
    @NotBlank(message = "地点描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String locDescr;

    /**
     * KIT代码
     */
    @NotBlank(message = "KIT代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String kitCode;

    /**
     * KIT描述
     */
    @NotBlank(message = "KIT描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String kitDescr;

    /**
     * 转化率
     */
    @NotNull(message = "转化率不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal convfactor;

    /**
     * 成品HIERARCHY
     */
    @NotBlank(message = "成品HIERARCHY不能为空", groups = { AddGroup.class, EditGroup.class })
    private String productHierarchy;

    /**
     * 备注
     */
    @NotBlank(message = "备注不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uComment;


}
