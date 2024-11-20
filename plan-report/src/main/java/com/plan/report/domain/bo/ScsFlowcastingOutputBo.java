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
 * scs_flowcasting_output业务对象 scs_flowcasting_output
 *
 * @author ruoyi
 * @date 2024-11-20
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsFlowcastingOutputBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * item
     */
    @NotBlank(message = "item不能为空", groups = { AddGroup.class, EditGroup.class })
    private String item;

    /**
     * item_own_code
     */
    @NotBlank(message = "item_own_code不能为空", groups = { AddGroup.class, EditGroup.class })
    private String itemOwnCode;

    /**
     * u_item_pattern
     */
    @NotBlank(message = "u_item_pattern不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uItemPattern;

    /**
     * u_bpp_code
     */
    @NotBlank(message = "u_bpp_code不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uBppCode;

    /**
     * u_bpp_brand
     */
    @NotBlank(message = "u_bpp_brand不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uBppBrand;

    /**
     * u_bpp_flavor
     */
    @NotBlank(message = "u_bpp_flavor不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uBppFlavor;

    /**
     * u_bpp_category
     */
    @NotBlank(message = "u_bpp_category不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uBppCategory;

    /**
     * u_bpp_subcategory
     */
    @NotBlank(message = "u_bpp_subcategory不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uBppSubcategory;

    /**
     * loc
     */
    @NotBlank(message = "loc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loc;

    /**
     * u_ou
     */
    @NotBlank(message = "u_ou不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uOu;

    /**
     * u_corporation
     */
    @NotBlank(message = "u_corporation不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uCorporation;

    /**
     * measurename
     */
    @NotBlank(message = "measurename不能为空", groups = { AddGroup.class, EditGroup.class })
    private String measurename;

    /**
     * startdate
     */
    @NotNull(message = "startdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date startdate;

    /**
     * period1
     */
    @NotNull(message = "period1不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period1;

    /**
     * period2
     */
    @NotNull(message = "period2不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period2;

    /**
     * period3
     */
    @NotNull(message = "period3不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period3;

    /**
     * period4
     */
    @NotNull(message = "period4不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period4;

    /**
     * period5
     */
    @NotNull(message = "period5不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period5;

    /**
     * period6
     */
    @NotNull(message = "period6不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period6;

    /**
     * period7
     */
    @NotNull(message = "period7不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period7;

    /**
     * period8
     */
    @NotNull(message = "period8不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period8;

    /**
     * period9
     */
    @NotNull(message = "period9不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period9;

    /**
     * period10
     */
    @NotNull(message = "period10不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period10;

    /**
     * period11
     */
    @NotNull(message = "period11不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period11;

    /**
     * period12
     */
    @NotNull(message = "period12不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period12;

    /**
     * period13
     */
    @NotNull(message = "period13不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period13;

    /**
     * period14
     */
    @NotNull(message = "period14不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period14;

    /**
     * period15
     */
    @NotNull(message = "period15不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period15;

    /**
     * period16
     */
    @NotNull(message = "period16不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period16;

    /**
     * period17
     */
    @NotNull(message = "period17不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period17;

    /**
     * period18
     */
    @NotNull(message = "period18不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period18;

    /**
     * period19
     */
    @NotNull(message = "period19不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period19;

    /**
     * period20
     */
    @NotNull(message = "period20不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period20;

    /**
     * period21
     */
    @NotNull(message = "period21不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period21;

    /**
     * period22
     */
    @NotNull(message = "period22不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period22;

    /**
     * period23
     */
    @NotNull(message = "period23不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period23;

    /**
     * period24
     */
    @NotNull(message = "period24不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period24;

    /**
     * period25
     */
    @NotNull(message = "period25不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period25;

    /**
     * period26
     */
    @NotNull(message = "period26不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal period26;

    /**
     * report_date
     */
    @NotNull(message = "report_date不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date reportDate;


}
