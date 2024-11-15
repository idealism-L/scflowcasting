package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_if_hld_inventory对象 scs_if_hld_inventory
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@TableName("scs_if_hld_inventory")
public class ScsIfHldInventory {

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
    /**
     * create_time
     */
    private Date createTime;

}
