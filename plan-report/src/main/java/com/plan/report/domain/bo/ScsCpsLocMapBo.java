package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
 * scs_cps_loc_map业务对象 scs_cps_loc_map
 *
 * @author ruoyi
 * @date 2024-11-25
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsCpsLocMapBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 物料编码
     */
    @NotBlank(message = "物料编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String item;

    /**
     * 果汁/果肉标识
     */
    @NotBlank(message = "果汁/果肉标识不能为空", groups = { AddGroup.class, EditGroup.class })
    private String fruitCategory;

    /**
     * DFU地点
     */
    @NotBlank(message = "DFU地点不能为空", groups = { AddGroup.class, EditGroup.class })
    private String dfuLoc;

    /**
     * SKU地点
     */
    @NotBlank(message = "SKU地点不能为空", groups = { AddGroup.class, EditGroup.class })
    private String skuLoc;

    /**
     * 版本号
     */
    @NotNull(message = "版本号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long versionNo;


}
