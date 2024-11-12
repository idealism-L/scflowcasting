package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_if_hld_vehicleloadline对象 scs_if_hld_vehicleloadline
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_if_hld_vehicleloadline")
public class ScsIfHldVehicleloadline extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * loadid
     */
    private String loadid;
    /**
     * descr
     */
    private String descr;
    /**
     * sourcestatus
     */
    private Long sourcestatus;
    /**
     * deststatus
     */
    private String deststatus0;
    /**
     * item
     */
    private String item;
    /**
     * source
     */
    private String source;
    /**
     * dest
     */
    private String dest;
    /**
     * qty
     */
    private BigDecimal qty;
    /**
     * schedarrivdate
     */
    private Date availdate;
    /**
     * schedshipdate
     */
    private Date availdate0;
    /**
     * u_item_pattern
     */
    private String uItemPattern;
    /**
     * u_corporation
     */
    private String uCorporation;
    /**
     * u_flag
     */
    private Long uFlag;
    /**
     * u_comment
     */
    private String uComment;
    /**
     * u_filename
     */
    private String uFilename;
    /**
     * u_editdate
     */
    private Date uEditdate;

}
