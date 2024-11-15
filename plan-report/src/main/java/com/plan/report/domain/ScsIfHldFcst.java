package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_if_hld_fcst对象 scs_if_hld_fcst
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@TableName("scs_if_hld_fcst")
public class ScsIfHldFcst {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * dmdunit
     */
    private String dmdunit;
    /**
     * dmdgroup
     */
    private String dmdgroup;
    /**
     * loc
     */
    private String loc;
    /**
     * model
     */
    private String model;
    /**
     * startdate
     */
    private Date startdate;
    /**
     * dur
     */
    private String dur;
    /**
     * qty
     */
    private BigDecimal qty;
    /**
     * type
     */
    private String type;
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
    /**
     * create_time
     */
    private Date createTime;

}
