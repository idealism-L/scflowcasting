package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
 * scs_loc业务对象 scs_loc
 *
 * @author ruoyi
 * @date 2024-11-12
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsLocBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

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
     * 地点描述
     */
    @NotBlank(message = "地点描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descr;

    /**
     * OU
     */
    @NotBlank(message = "OU不能为空", groups = { AddGroup.class, EditGroup.class })
    private String ou;

    /**
     * OU描述
     */
    @NotBlank(message = "OU描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String ouDescr;

    /**
     * 装瓶集团
     */
    @NotBlank(message = "装瓶集团不能为空", groups = { AddGroup.class, EditGroup.class })
    private String corporation;

    /**
     * 地点类型
     */
    @NotBlank(message = "地点类型不能为空", groups = { AddGroup.class, EditGroup.class })
    private String locType;

    /**
     * CPS代码
     */
    @NotBlank(message = "CPS代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String cpsCode;

    /**
     * 邮件
     */
    @NotBlank(message = "邮件不能为空", groups = { AddGroup.class, EditGroup.class })
    private String email;

    /**
     * 版本号
     */
    @NotNull(message = "版本号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long versionNo;


}
