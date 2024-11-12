package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * scs_bpp_master对象 scs_bpp_master
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_bpp_master")
public class ScsBppMaster extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * BPP代码
     */
    private String bppCode;
    /**
     * BPP描述
     */
    private String bppDescr;
    /**
     * 大类
     */
    private String category;
    /**
     * 大类描述
     */
    private String categoryDescr;
    /**
     * 中类
     */
    private String subcategory;
    /**
     * 中类描述
     */
    private String subcategoryDescr;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 品牌描述
     */
    private String brandDescr;
    /**
     * 口味
     */
    private String flavor;
    /**
     * 口味描述
     */
    private String flavorDescr;
    /**
     * 包装
     */
    private String packAge;
    /**
     * 包装描述
     */
    private String packageDescr;
    /**
     * 产品分类
     */
    private String beverage;
    /**
     * 状态
     */
    private String status;
    /**
     * 成品与KIT转换率
     */
    private BigDecimal fgKitRate;
    /**
     * UC转换率
     */
    private BigDecimal ucRate;
    /**
     * 版本号
     */
    private Long versionNo;

}
