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
 * scs_if_hld_fcst_fg业务对象 scs_if_hld_fcst_fg
 *
 * @author ruoyi
 * @date 2024-11-12
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsIfHldFcstFgBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * u_corporation
     */
    @NotBlank(message = "u_corporation不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uCorporation;

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
     * startdate
     */
    @NotNull(message = "startdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date startdate;

    /**
     * u_oh
     */
    @NotNull(message = "u_oh不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uOh;

    /**
     * u_w1
     */
    @NotNull(message = "u_w1不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW1;

    /**
     * u_w2
     */
    @NotNull(message = "u_w2不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW2;

    /**
     * u_w3
     */
    @NotNull(message = "u_w3不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW3;

    /**
     * u_w4
     */
    @NotNull(message = "u_w4不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW4;

    /**
     * u_w5
     */
    @NotNull(message = "u_w5不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW5;

    /**
     * u_w6
     */
    @NotNull(message = "u_w6不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW6;

    /**
     * u_w7
     */
    @NotNull(message = "u_w7不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW7;

    /**
     * u_w8
     */
    @NotNull(message = "u_w8不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW8;

    /**
     * u_w9
     */
    @NotNull(message = "u_w9不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW9;

    /**
     * u_w10
     */
    @NotNull(message = "u_w10不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW10;

    /**
     * u_w11
     */
    @NotNull(message = "u_w11不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW11;

    /**
     * u_w12
     */
    @NotNull(message = "u_w12不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW12;

    /**
     * u_w13
     */
    @NotNull(message = "u_w13不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW13;

    /**
     * u_m1
     */
    @NotNull(message = "u_m1不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM1;

    /**
     * u_m2
     */
    @NotNull(message = "u_m2不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM2;

    /**
     * u_m3
     */
    @NotNull(message = "u_m3不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM3;

    /**
     * u_m4
     */
    @NotNull(message = "u_m4不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM4;

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
