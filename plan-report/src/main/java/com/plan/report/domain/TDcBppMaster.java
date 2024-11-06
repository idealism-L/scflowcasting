package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * BPP映射对象 t_dc_bpp_master
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_dc_bpp_master")
public class TDcBppMaster extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "IM_MAIN_INSURANCE_CONFIG_ID")
    private Long imMainInsuranceConfigId;
    /**
     * BPP编码
     */
    private String bppCode;
    /**
     * BPP描述
     */
    private String bppDescr;
    /**
     * 大类
     */
    private String uCategory;
    /**
     * 大类描述
     */
    private String uCategoryDescr;
    /**
     * 中类
     */
    private String uSubcategory;
    /**
     * 中类描述
     */
    private String uSubcategoryDescr;
    /**
     * 品牌
     */
    private String uBrand;
    /**
     * 品牌描述
     */
    private String uBrandDescr;
    /**
     * 口味
     */
    private String uFlavor;
    /**
     * 口味描述
     */
    private String uFlavorDescr;
    /**
     * 包装
     */
    private String uPackage;
    /**
     * 包装描述
     */
    private String uPackageDescr;
    /**
     * 产品分类
     */
    private String beverage;
    /**
     * 状态
     */
    private String uStatus;
    /**
     * bpp_short
     */
    private String bppShort;
    /**
     * 成品与KIT转换率
     */
    private BigDecimal uFgKitRate;
    /**
     * UC转换率
     */
    private BigDecimal uUcRate;

}
