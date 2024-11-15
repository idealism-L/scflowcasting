package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * scs_item对象 scs_item
 *
 * @author ruoyi
 * @date 2024-11-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_item")
public class ScsItem extends BaseEntity {

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
     * 装瓶集团
     */
    private String corporation;
    /**
     * KIT/FG
     */
    private String itemPattern;
    /**
     * 物料编码
     */
    private String itemCode;
    /**
     * 物料描述
     */
    private String descr;
    /**
     * 英文描述
     */
    private String descrEn;
    /**
     * 简短描述
     */
    private String descrShort;
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
     * 品牌代码
     */
    private String brand;
    /**
     * 品牌描述
     */
    private String brandDescr;
    /**
     * 口味代码
     */
    private String flavor;
    /**
     * 口味描述
     */
    private String flavorDescr;
    /**
     * 包装代码
     */
    private String packageCode;
    /**
     * 包装描述
     */
    private String packageDescr;
    /**
     * 子口味
     */
    private String subflavor;
    /**
     * 子口味描述
     */
    private String subflavorDescr;
    /**
     * 包装容量
     */
    private String packageCap;
    /**
     * 包装容量描述
     */
    private String packageCapDescr;
    /**
     * SCCL成品或主剂对应的编码
     */
    private String scclCode;
    /**
     * CBL成品对应的编码
     */
    private String cblCode;
    /**
     * ZH成品对应的编码
     */
    private String zhCode;
    /**
     * FAMILY
     */
    private String family;
    /**
     * 规格
     */
    private String spec;
    /**
     * 规格描述
     */
    private String specDescr;
    /**
     * 果汁/果肉标识
     */
    private String fruitCategory;
    /**
     * 单位
     */
    private String uom;
    /**
     * 主单位转次单转换系数
     */
    private BigDecimal uomRate1;
    /**
     * 主单位转次单转换系数2
     */
    private BigDecimal uomRate2;
    /**
     * UC单位量
     */
    private BigDecimal uc;
    /**
     * PC单位量
     */
    private BigDecimal pc;
    /**
     * BPP代码
     */
    private String bppCode;
    /**
     * hierarchy2
     */
    private String hierarchy2;
    /**
     * 碳酸非碳酸标识
     */
    private String carbonic;
    /**
     * ABC分类
     */
    private String abc;
    /**
     * 新品标识
     */
    private String uNew;
    /**
     * 区域
     */
    private String region;
    /**
     * 状态
     */
    private String status;
    /**
     * 更新的文件
     */
    private String fileName;
    /**
     * 版本号
     */
    private Long versionNo;

}
