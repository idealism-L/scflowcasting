package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_if_hld_inventory对象 scs_if_hld_inventory
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_if_hld_inventory")
public class ScsIfHldInventory extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * item
     */
    private String item;
    /**
     * loc
     */
    private String loc;
    /**
     * availdate
     */
    private Date availdate;
    /**
     * qty
     */
    private BigDecimal qty;
    /**
     * expdate
     */
    private Date expdate;
    /**
     * project
     */
    private String project;
    /**
     * store
     */
    private String store;
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
