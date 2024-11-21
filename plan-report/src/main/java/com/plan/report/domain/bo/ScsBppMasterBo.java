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
 * scs_bpp_master业务对象 scs_bpp_master
 *
 * @author ruoyi
 * @date 2024-11-21
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsBppMasterBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * BPP代码
     */
    @NotBlank(message = "BPP代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String bppCode;

    /**
     * BPP描述
     */
    // @NotBlank(message = "BPP描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String bppDescr;

    /**
     * 大类
     */
    @NotBlank(message = "大类不能为空", groups = { AddGroup.class, EditGroup.class })
    private String category;

    /**
     * 大类描述
     */
    // @NotBlank(message = "大类描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String categoryDescr;

    /**
     * 中类
     */
    // @NotBlank(message = "中类不能为空", groups = { AddGroup.class, EditGroup.class })
    private String subcategory;

    /**
     * 中类描述
     */
    // @NotBlank(message = "中类描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String subcategoryDescr;

    /**
     * 品牌
     */
    // @NotBlank(message = "品牌不能为空", groups = { AddGroup.class, EditGroup.class })
    private String brand;

    /**
     * 品牌描述
     */
    // @NotBlank(message = "品牌描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String brandDescr;

    /**
     * 口味
     */
    // @NotBlank(message = "口味不能为空", groups = { AddGroup.class, EditGroup.class })
    private String flavor;

    /**
     * 口味描述
     */
    // @NotBlank(message = "口味描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String flavorDescr;

    /**
     * 包装
     */
    // @NotBlank(message = "包装不能为空", groups = { AddGroup.class, EditGroup.class })
    private String packageCode;

    /**
     * 包装描述
     */
    // @NotBlank(message = "包装描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String packageDescr;

    /**
     * 产品分类
     */
    // @NotBlank(message = "产品分类不能为空", groups = { AddGroup.class, EditGroup.class })
    private String beverage;

    /**
     * 状态
     */
    // @NotBlank(message = "状态不能为空", groups = { AddGroup.class, EditGroup.class })
    private String status;

    /**
     * 成品与KIT转换率
     */
    @NotNull(message = "成品与KIT转换率不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal fgKitRate;

    /**
     * UC转换率
     */
    @NotNull(message = "UC转换率不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal ucRate;

    /**
     * 版本号
     */
    // @NotNull(message = "版本号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long versionNo;


    /**
     * ids 用于导出选中的table数据
     */
    private Long[] ids;
}
