package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * BPP映射业务对象 t_dc_bpp_master
 *
 * @author ruoyi
 * @date 2024-11-06
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class TDcBppMasterBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * BPP编码
     */
    @NotBlank(message = "BPP编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String bppCode;

    /**
     * BPP描述
     */
    @NotBlank(message = "BPP描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String bppDescr;

    /**
     * 大类
     */
    @NotBlank(message = "大类不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uCategory;

    /**
     * 大类描述
     */
    @NotBlank(message = "大类描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uCategoryDescr;

    /**
     * 中类
     */
    @NotBlank(message = "中类不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uSubcategory;

    /**
     * 中类描述
     */
    @NotBlank(message = "中类描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uSubcategoryDescr;

    /**
     * 品牌
     */
    @NotBlank(message = "品牌不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uBrand;

    /**
     * 品牌描述
     */
    @NotBlank(message = "品牌描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uBrandDescr;

    /**
     * 口味
     */
    @NotBlank(message = "口味不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uFlavor;

    /**
     * 口味描述
     */
    @NotBlank(message = "口味描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uFlavorDescr;

    /**
     * 包装
     */
    @NotBlank(message = "包装不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uPackage;

    /**
     * 包装描述
     */
    @NotBlank(message = "包装描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uPackageDescr;

    /**
     * 产品分类
     */
    @NotBlank(message = "产品分类不能为空", groups = { AddGroup.class, EditGroup.class })
    private String beverage;

    /**
     * 状态
     */
    @NotBlank(message = "状态不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uStatus;

    /**
     * bpp_short
     */
    @NotBlank(message = "bpp_short不能为空", groups = { AddGroup.class, EditGroup.class })
    private String bppShort;

    /**
     * 成品与KIT转换率
     */
    @NotNull(message = "成品与KIT转换率不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uFgKitRate;

    /**
     * UC转换率
     */
    @NotNull(message = "UC转换率不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uUcRate;


}