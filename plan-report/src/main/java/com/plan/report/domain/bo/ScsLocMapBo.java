package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
 * scs_loc_map业务对象 scs_loc_map
 *
 * @author ruoyi
 * @date 2024-11-12
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsLocMapBo extends BaseEntity {

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
     * u_code_type
     */
    @NotBlank(message = "u_code_type不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uCodeType;

    /**
     * 区域代码
     */
    @NotBlank(message = "区域代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uOriginalCode;

    /**
     * 地点
     */
    @NotBlank(message = "地点不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loc;

    /**
     * u_own_code
     */
    @NotBlank(message = "u_own_code不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uOwnCode;

    /**
     * 版本号
     */
    @NotNull(message = "版本号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long versionNo;


}
