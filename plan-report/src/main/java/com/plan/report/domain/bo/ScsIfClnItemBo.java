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
 * scs_if_cln_item业务对象 scs_if_cln_item
 *
 * @author ruoyi
 * @date 2024-11-12
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsIfClnItemBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 物料
     */
    @NotBlank(message = "物料不能为空", groups = { AddGroup.class, EditGroup.class })
    private String item;

    /**
     * 描述
     */
    @NotBlank(message = "描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descr;

    /**
     * 英文描述
     */
    @NotBlank(message = "英文描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uDescrEn;

    /**
     * 简短描述
     */
    @NotBlank(message = "简短描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uDescrShort;

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
     * 子口味
     */
    @NotBlank(message = "子口味不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uSubflavor;

    /**
     * 子口味描述
     */
    @NotBlank(message = "子口味描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uSubflavorDescr;

    /**
     * 包装容量
     */
    @NotBlank(message = "包装容量不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uPackageCap;

    /**
     * 包装容量描述
     */
    @NotBlank(message = "包装容量描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uPackageCapDescr;

    /**
     * SCCL成品或主剂对应的编码
     */
    @NotBlank(message = "SCCL成品或主剂对应的编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uScclCode;

    /**
     * CBL成品对应的编码
     */
    @NotBlank(message = "CBL成品对应的编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uCblCode;

    /**
     * ZH成品对应的编码
     */
    @NotBlank(message = "ZH成品对应的编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uZhCode;

    /**
     * 系列
     */
    @NotBlank(message = "系列不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uFamily;

    /**
     * 规格
     */
    @NotBlank(message = "规格不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uSpec;

    /**
     * 规格描述
     */
    @NotBlank(message = "规格描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uSpecDescr;

    /**
     * 套件/FG
     */
    @NotBlank(message = "套件/FG不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uItemPattern;

    /**
     * 数据来源
     */
    @NotBlank(message = "数据来源不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uCorporation;

    /**
     * 果汁/果肉主剂标识
     */
    @NotBlank(message = "果汁/果肉主剂标识不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uFruitCategory;

    /**
     * 单位
     */
    @NotBlank(message = "单位不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uUom;

    /**
     * 主单位转次单转换系数
     */
    @NotNull(message = "主单位转次单转换系数不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uUomRate1;

    /**
     * 主单位转次单转换系数2
     */
    @NotNull(message = "主单位转次单转换系数2不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uUomRate2;

    /**
     * UC单位量
     */
    @NotNull(message = "UC单位量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uUc;

    /**
     * PC单位量
     */
    @NotNull(message = "PC单位量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uPc;

    /**
     * 成品编码对应CPS的BPP编码
     */
    @NotBlank(message = "成品编码对应CPS的BPP编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uBppCode;

    /**
     * 品牌+风味+包装描盒2
     */
    @NotBlank(message = "品牌+风味+包装描盒2不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uHierarchy2;

    /**
     * 碳酸非碳酸标识
     */
    @NotBlank(message = "碳酸非碳酸标识不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uCarbonic;

    /**
     * ABC分类
     */
    @NotBlank(message = "ABC分类不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uAbc;

    /**
     * 新品标识
     */
    @NotBlank(message = "新品标识不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uNew;

    /**
     * 使用区域
     */
    @NotBlank(message = "使用区域不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uRegion;

    /**
     * 状态
     */
    @NotBlank(message = "状态不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uStatus;

    /**
     * 更新的文件
     */
    @NotBlank(message = "更新的文件不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uFileName;

    /**
     * u_editdate
     */
    @NotNull(message = "u_editdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date uEditdate;


}
