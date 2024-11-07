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
 * 库存业务对象 etl_hld_inventory
 *
 * @author ruoyi
 * @date 2024-11-06
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class EtlHldInventoryBo extends BaseEntity {

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
     * loc
     */
    @NotBlank(message = "loc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loc;

    /**
     * availdate
     */
    @NotNull(message = "availdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date availdate;

    /**
     * qty
     */
    @NotNull(message = "qty不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal qty;

    /**
     * expdate
     */
    @NotNull(message = "expdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date expdate;

    /**
     * project
     */
    @NotBlank(message = "project不能为空", groups = { AddGroup.class, EditGroup.class })
    private String project;

    /**
     * store
     */
    @NotBlank(message = "store不能为空", groups = { AddGroup.class, EditGroup.class })
    private String store;

    /**
     * u_flag
     */
    @NotBlank(message = "u_flag不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uFlag;

    /**
     * u_comment
     */
    @NotBlank(message = "u_comment不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uComment;

    /**
     * u_filename
     */
    @NotBlank(message = "u_filename不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uFilename;

    /**
     * u_editdate
     */
    @NotBlank(message = "u_editdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uEditdate;


}
