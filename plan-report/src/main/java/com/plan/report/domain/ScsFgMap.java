package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * scs_fg_map对象 scs_fg_map
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_fg_map")
public class ScsFgMap extends BaseEntity {

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
     * FG ITEM ID
     */
    private String fgItemId;
    /**
     * 生产物料
     */
    private String fgItem;
    /**
     * 转换系数
     */
    private BigDecimal convfactor;
    /**
     * 备注
     */
    private String uComment;
    /**
     * 有效标志
     */
    private String uFlag;
    /**
     * 主要成品标志
     */
    private String keyProductionFlag;
    /**
     * 版本号
     */
    private Long versionNo;

}
