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
 * scs_if_hld_fcst_kit_26w业务对象 scs_if_hld_fcst_kit_26w
 *
 * @author ruoyi
 * @date 2024-11-12
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsIfHldFcstKit26wBo extends BaseEntity {

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
     * u_w14
     */
    @NotNull(message = "u_w14不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW14;

    /**
     * u_w15
     */
    @NotNull(message = "u_w15不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW15;

    /**
     * u_w16
     */
    @NotNull(message = "u_w16不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW16;

    /**
     * u_w17
     */
    @NotNull(message = "u_w17不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW17;

    /**
     * u_w18
     */
    @NotNull(message = "u_w18不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW18;

    /**
     * u_w19
     */
    @NotNull(message = "u_w19不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW19;

    /**
     * u_w20
     */
    @NotNull(message = "u_w20不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW20;

    /**
     * u_w21
     */
    @NotNull(message = "u_w21不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW21;

    /**
     * u_w22
     */
    @NotNull(message = "u_w22不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW22;

    /**
     * u_w23
     */
    @NotNull(message = "u_w23不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW23;

    /**
     * u_w24
     */
    @NotNull(message = "u_w24不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW24;

    /**
     * u_w25
     */
    @NotNull(message = "u_w25不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW25;

    /**
     * u_w26
     */
    @NotNull(message = "u_w26不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uW26;

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
