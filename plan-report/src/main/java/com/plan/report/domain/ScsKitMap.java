package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * scs_kit_map对象 scs_kit_map
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_kit_map")
public class ScsKitMap extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * ITEM ID
     */
    private Long itemId;
    /**
     * 物料
     */
    private String item;
    /**
     * 地点ID
     */
    private Long locId;
    /**
     * 地点
     */
    private String loc;
    /**
     * KIT ITEM ID
     */
    private Long kitItemId;
    /**
     * KIT物料
     */
    private String kitItem;
    /**
     * 转换系数
     */
    private BigDecimal convfactor;
    /**
     * 成品HIERARCHY
     */
    private String productHierarchy;
    /**
     * 有效标志
     */
    private String uFlag;
    /**
     * 备注
     */
    private String uComment;
    /**
     * 版本号
     */
    private Long versionNo;

}
