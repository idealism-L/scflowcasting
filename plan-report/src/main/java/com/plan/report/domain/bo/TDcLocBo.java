package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
 * 地点业务对象 t_dc_loc
 *
 * @author ruoyi
 * @date 2024-11-06
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class TDcLocBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 地点名称
     */
    @NotBlank(message = "地点名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String locName;

    /**
     * 地点代码
     */
    @NotBlank(message = "地点代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loc;

    /**
     * 描述
     */
    @NotBlank(message = "描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descr;

    /**
     * OU
     */
    @NotBlank(message = "OU不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uOu;

    /**
     * OU描述
     */
    @NotBlank(message = "OU描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uOuDescr;

    /**
     * 装瓶集团
     */
    @NotBlank(message = "装瓶集团不能为空", groups = { AddGroup.class, EditGroup.class })
    private String corporation;

    /**
     * 地点类型
     */
    @NotBlank(message = "地点类型不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uLocType;

    /**
     * SCMC代码
     */
    @NotBlank(message = "SCMC代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uScmcCode;

    /**
     * CPS代码
     */
    @NotBlank(message = "CPS代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uCpsCode;

    /**
     * 邮件
     */
    @NotBlank(message = "邮件不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uEmail;

    /**
     * 状态
     */
    @NotBlank(message = "状态不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uStatus;


}
