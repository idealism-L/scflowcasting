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
 * scs_kit_map业务对象 scs_kit_map
 *
 * @author ruoyi
 * @date 2024-11-12
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsKitMapBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * ITEM ID
     */
    @NotNull(message = "ITEM ID不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long itemId;

    /**
     * 物料
     */
    @NotBlank(message = "物料不能为空", groups = { AddGroup.class, EditGroup.class })
    private String item;

    /**
     * 地点ID
     */
    @NotNull(message = "地点ID不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long locId;

    /**
     * 地点
     */
    @NotBlank(message = "地点不能为空", groups = { AddGroup.class, EditGroup.class })
    private String locCode;

    /**
     * KIT ITEM ID
     */
    @NotNull(message = "KIT ITEM ID不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long kitItemId;

    /**
     * KIT物料
     */
    @NotBlank(message = "KIT物料不能为空", groups = { AddGroup.class, EditGroup.class })
    private String kitItem;

    /**
     * 转换系数
     */
    @NotNull(message = "转换系数不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal convfactor;

    /**
     * 成品HIERARCHY
     */
    @NotBlank(message = "成品HIERARCHY不能为空", groups = { AddGroup.class, EditGroup.class })
    private String productHierarchy;

    /**
     * 有效标志
     */
    @NotBlank(message = "有效标志不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uFlag;

    /**
     * 备注
     */
    @NotBlank(message = "备注不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uComment;

    /**
     * 版本号
     */
    @NotNull(message = "版本号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long versionNo;

    // 查询条件
    /**
     * 装瓶集团
     */
    private String corporation;

    /**
     * 物料编码
     */
    private String itemCode;

    /**
     * Kit代码
     */
    private String kitCode;
}
