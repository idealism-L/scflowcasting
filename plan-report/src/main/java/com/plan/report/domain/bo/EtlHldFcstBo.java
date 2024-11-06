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
 * 销售预测业务对象 etl_hld_fcst
 *
 * @author ruoyi
 * @date 2024-11-06
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class EtlHldFcstBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long imMainInsuranceConfigId;

    /**
     * dmdunit
     */
    @NotBlank(message = "dmdunit不能为空", groups = { AddGroup.class, EditGroup.class })
    private String dmdunit;

    /**
     * dmdgroup
     */
    @NotBlank(message = "dmdgroup不能为空", groups = { AddGroup.class, EditGroup.class })
    private String dmdgroup;

    /**
     * loc
     */
    @NotBlank(message = "loc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loc;

    /**
     * model
     */
    @NotBlank(message = "model不能为空", groups = { AddGroup.class, EditGroup.class })
    private String model;

    /**
     * startdate
     */
    @NotNull(message = "startdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date startdate;

    /**
     * dur
     */
    @NotBlank(message = "dur不能为空", groups = { AddGroup.class, EditGroup.class })
    private String dur;

    /**
     * qty
     */
    @NotNull(message = "qty不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal qty;

    /**
     * type
     */
    @NotBlank(message = "type不能为空", groups = { AddGroup.class, EditGroup.class })
    private String type;

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
