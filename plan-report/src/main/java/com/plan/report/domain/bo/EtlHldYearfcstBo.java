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
 * 年预测业务对象 etl_hld_yearfcst
 *
 * @author ruoyi
 * @date 2024-11-06
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class EtlHldYearfcstBo extends BaseEntity {

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
     * startdate
     */
    @NotNull(message = "startdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date startdate;

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
     * u_m5
     */
    @NotNull(message = "u_m5不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM5;

    /**
     * u_m6
     */
    @NotNull(message = "u_m6不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM6;

    /**
     * u_m7
     */
    @NotNull(message = "u_m7不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM7;

    /**
     * u_m8
     */
    @NotNull(message = "u_m8不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM8;

    /**
     * u_m9
     */
    @NotNull(message = "u_m9不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM9;

    /**
     * u_m10
     */
    @NotNull(message = "u_m10不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM10;

    /**
     * u_m11
     */
    @NotNull(message = "u_m11不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM11;

    /**
     * u_m12
     */
    @NotNull(message = "u_m12不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM12;

    /**
     * u_m13
     */
    @NotNull(message = "u_m13不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM13;

    /**
     * u_m14
     */
    @NotNull(message = "u_m14不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM14;

    /**
     * u_m15
     */
    @NotNull(message = "u_m15不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM15;

    /**
     * u_m16
     */
    @NotNull(message = "u_m16不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM16;

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
