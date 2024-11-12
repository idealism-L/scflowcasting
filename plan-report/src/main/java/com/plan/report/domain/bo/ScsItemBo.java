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
 * scs_item业务对象 scs_item
 *
 * @author ruoyi
 * @date 2024-11-12
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsItemBo extends BaseEntity {

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
     * 装瓶集团
     */
    @NotBlank(message = "装瓶集团不能为空", groups = { AddGroup.class, EditGroup.class })
    private String corporation;

    /**
     * KIT/FG
     */
    @NotBlank(message = "KIT/FG不能为空", groups = { AddGroup.class, EditGroup.class })
    private String itemPattern;

    /**
     * 物料编码
     */
    @NotBlank(message = "物料编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String itemCode;

    /**
     * 物料描述
     */
    @NotBlank(message = "物料描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descr;

    /**
     * 英文描述
     */
    @NotBlank(message = "英文描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descrEn;

    /**
     * 简短描述
     */
    @NotBlank(message = "简短描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descrShort;

    /**
     * 大类
     */
    @NotBlank(message = "大类不能为空", groups = { AddGroup.class, EditGroup.class })
    private String category;

    /**
     * 大类描述
     */
    @NotBlank(message = "大类描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String categoryDescr;

    /**
     * 中类
     */
    @NotBlank(message = "中类不能为空", groups = { AddGroup.class, EditGroup.class })
    private String subcategory;

    /**
     * 中类描述
     */
    @NotBlank(message = "中类描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String subcategoryDescr;

    /**
     * 品牌代码
     */
    @NotBlank(message = "品牌代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String brand;

    /**
     * 品牌描述
     */
    @NotBlank(message = "品牌描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String brandDescr;

    /**
     * 口味代码
     */
    @NotBlank(message = "口味代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String flavor;

    /**
     * 口味描述
     */
    @NotBlank(message = "口味描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String flavorDescr;

    /**
     * 包装代码
     */
    @NotBlank(message = "包装代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String packAge;

    /**
     * 包装描述
     */
    @NotBlank(message = "包装描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String packageDescr;

    /**
     * 子口味
     */
    @NotBlank(message = "子口味不能为空", groups = { AddGroup.class, EditGroup.class })
    private String subflavor;

    /**
     * 子口味描述
     */
    @NotBlank(message = "子口味描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String subflavorDescr;

    /**
     * 包装容量
     */
    @NotBlank(message = "包装容量不能为空", groups = { AddGroup.class, EditGroup.class })
    private String packageCap;

    /**
     * 包装容量描述
     */
    @NotBlank(message = "包装容量描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String packageCapDescr;

    /**
     * SCCL成品或主剂对应的编码
     */
    @NotBlank(message = "SCCL成品或主剂对应的编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String scclCode;

    /**
     * CBL成品对应的编码
     */
    @NotBlank(message = "CBL成品对应的编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String cblCode;

    /**
     * ZH成品对应的编码
     */
    @NotBlank(message = "ZH成品对应的编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String zhCode;

    /**
     * FAMILY
     */
    @NotBlank(message = "FAMILY不能为空", groups = { AddGroup.class, EditGroup.class })
    private String family;

    /**
     * 规格
     */
    @NotBlank(message = "规格不能为空", groups = { AddGroup.class, EditGroup.class })
    private String spec;

    /**
     * 规格描述
     */
    @NotBlank(message = "规格描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String specDescr;

    /**
     * 果汁/果肉标识
     */
    @NotBlank(message = "果汁/果肉标识不能为空", groups = { AddGroup.class, EditGroup.class })
    private String fruitCategory;

    /**
     * 单位
     */
    @NotBlank(message = "单位不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uom;

    /**
     * 主单位转次单转换系数
     */
    @NotNull(message = "主单位转次单转换系数不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uomRate1;

    /**
     * 主单位转次单转换系数2
     */
    @NotNull(message = "主单位转次单转换系数2不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uomRate2;

    /**
     * UC单位量
     */
    @NotNull(message = "UC单位量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uc;

    /**
     * PC单位量
     */
    @NotNull(message = "PC单位量不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal pc;

    /**
     * BPP代码
     */
    @NotBlank(message = "BPP代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String bppCode;

    /**
     * hierarchy2
     */
    @NotBlank(message = "hierarchy2不能为空", groups = { AddGroup.class, EditGroup.class })
    private String hierarchy2;

    /**
     * 碳酸非碳酸标识
     */
    @NotBlank(message = "碳酸非碳酸标识不能为空", groups = { AddGroup.class, EditGroup.class })
    private String carbonic;

    /**
     * ABC分类
     */
    @NotBlank(message = "ABC分类不能为空", groups = { AddGroup.class, EditGroup.class })
    private String abc;

    /**
     * 新品标识
     */
    @NotBlank(message = "新品标识不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uNew;

    /**
     * 区域
     */
    @NotBlank(message = "区域不能为空", groups = { AddGroup.class, EditGroup.class })
    private String region;

    /**
     * 状态
     */
    @NotBlank(message = "状态不能为空", groups = { AddGroup.class, EditGroup.class })
    private String status;

    /**
     * 更新的文件
     */
    @NotBlank(message = "更新的文件不能为空", groups = { AddGroup.class, EditGroup.class })
    private String fileName;

    /**
     * 版本号
     */
    @NotNull(message = "版本号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long versionNo;


}
