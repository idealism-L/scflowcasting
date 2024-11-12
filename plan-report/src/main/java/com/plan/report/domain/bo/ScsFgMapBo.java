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
 * scs_fg_map业务对象 scs_fg_map
 *
 * @author ruoyi
 * @date 2024-11-12
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsFgMapBo extends BaseEntity {

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
     * FG ITEM ID
     */
    @NotBlank(message = "FG ITEM ID不能为空", groups = { AddGroup.class, EditGroup.class })
    private String fgItemId;

    /**
     * 生产物料
     */
    @NotBlank(message = "生产物料不能为空", groups = { AddGroup.class, EditGroup.class })
    private String fgItem;

    /**
     * 转换系数
     */
    @NotNull(message = "转换系数不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal convfactor;

    /**
     * 备注
     */
    @NotBlank(message = "备注不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uComment;

    /**
     * 有效标志
     */
    @NotBlank(message = "有效标志不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uFlag;

    /**
     * 主要成品标志
     */
    @NotBlank(message = "主要成品标志不能为空", groups = { AddGroup.class, EditGroup.class })
    private String keyProductionFlag;

    /**
     * 版本号
     */
    @NotNull(message = "版本号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long versionNo;


}
