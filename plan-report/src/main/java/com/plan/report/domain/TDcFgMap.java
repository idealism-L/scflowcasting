package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 成品映射对象 t_dc_fg_map
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_dc_fg_map")
public class TDcFgMap extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * 装瓶集团
     */
    private String corporation;
    /**
     * 物料编码
     */
    private String item;
    /**
     * 物料描述
     */
    private String itemDescr;
    /**
     * 转换系数
     */
    private BigDecimal convfactor;
    /**
     * SCCSCM代码
     */
    private String kitCode;
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

}
