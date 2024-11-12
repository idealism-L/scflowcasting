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
 * scs_if_hld_vehicleloadline业务对象 scs_if_hld_vehicleloadline
 *
 * @author ruoyi
 * @date 2024-11-12
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsIfHldVehicleloadlineBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * loadid
     */
    @NotBlank(message = "loadid不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loadid;

    /**
     * descr
     */
    @NotBlank(message = "descr不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descr;

    /**
     * sourcestatus
     */
    @NotNull(message = "sourcestatus不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long sourcestatus;

    /**
     * deststatus
     */
    @NotBlank(message = "deststatus不能为空", groups = { AddGroup.class, EditGroup.class })
    private String deststatus0;

    /**
     * item
     */
    @NotBlank(message = "item不能为空", groups = { AddGroup.class, EditGroup.class })
    private String item;

    /**
     * source
     */
    @NotBlank(message = "source不能为空", groups = { AddGroup.class, EditGroup.class })
    private String source;

    /**
     * dest
     */
    @NotBlank(message = "dest不能为空", groups = { AddGroup.class, EditGroup.class })
    private String dest;

    /**
     * qty
     */
    @NotNull(message = "qty不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal qty;

    /**
     * schedarrivdate
     */
    @NotNull(message = "schedarrivdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date availdate;

    /**
     * schedshipdate
     */
    @NotNull(message = "schedshipdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date availdate0;

    /**
     * u_item_pattern
     */
    @NotBlank(message = "u_item_pattern不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uItemPattern;

    /**
     * u_corporation
     */
    @NotBlank(message = "u_corporation不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uCorporation;

    /**
     * u_flag
     */
    @NotNull(message = "u_flag不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long uFlag;

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
    @NotNull(message = "u_editdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date uEditdate;


}
