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
 * 成品映射业务对象 t_dc_fg_map
 *
 * @author ruoyi
 * @date 2024-11-06
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class TDcFgMapBo extends BaseEntity {

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
     * 转换系数
     */
    @NotNull(message = "转换系数不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal convfactor;

    /**
     * SCCSCM代码
     */
    @NotBlank(message = "SCCSCM代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String kitCode;

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


}
