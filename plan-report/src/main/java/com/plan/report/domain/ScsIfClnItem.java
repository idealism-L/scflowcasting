package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_if_cln_item对象 scs_if_cln_item
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@TableName("scs_if_cln_item")
public class ScsIfClnItem {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * 物料
     */
    private String item;
    /**
     * 描述
     */
    private String descr;
    /**
     * 英文描述
     */
    private String uDescrEn;
    /**
     * 简短描述
     */
    private String uDescrShort;
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
     * 子口味
     */
    private String uSubflavor;
    /**
     * 子口味描述
     */
    private String uSubflavorDescr;
    /**
     * 包装容量
     */
    private String uPackageCap;
    /**
     * 包装容量描述
     */
    private String uPackageCapDescr;
    /**
     * SCCL成品或主剂对应的编码
     */
    private String uScclCode;
    /**
     * CBL成品对应的编码
     */
    private String uCblCode;
    /**
     * ZH成品对应的编码
     */
    private String uZhCode;
    /**
     * 系列
     */
    private String uFamily;
    /**
     * 规格
     */
    private String uSpec;
    /**
     * 规格描述
     */
    private String uSpecDescr;
    /**
     * 套件/FG
     */
    private String uItemPattern;
    /**
     * 数据来源
     */
    private String uCorporation;
    /**
     * 果汁/果肉主剂标识
     */
    private String uFruitCategory;
    /**
     * 单位
     */
    private String uUom;
    /**
     * 主单位转次单转换系数
     */
    private BigDecimal uUomRate1;
    /**
     * 主单位转次单转换系数2
     */
    private BigDecimal uUomRate2;
    /**
     * UC单位量
     */
    private BigDecimal uUc;
    /**
     * PC单位量
     */
    private BigDecimal uPc;
    /**
     * 成品编码对应CPS的BPP编码
     */
    private String uBppCode;
    /**
     * 品牌+风味+包装描盒2
     */
    private String uHierarchy2;
    /**
     * 碳酸非碳酸标识
     */
    private String uCarbonic;
    /**
     * ABC分类
     */
    private String uAbc;
    /**
     * 新品标识
     */
    private String uNew;
    /**
     * 使用区域
     */
    private String uRegion;
    /**
     * 状态
     */
    private String uStatus;
    /**
     * 更新的文件
     */
    private String uFileName;
    /**
     * u_editdate
     */
    private Date uEditdate;
    /**
     * create_time
     */
    private Date createTime;

}
