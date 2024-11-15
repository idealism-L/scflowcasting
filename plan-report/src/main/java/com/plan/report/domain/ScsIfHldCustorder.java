package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_if_hld_custorder对象 scs_if_hld_custorder
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@TableName("scs_if_hld_custorder")
public class ScsIfHldCustorder {

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
     * shipdate
     */
    private Date shipdate;
    /**
     * orderid
     */
    private String orderid;
    /**
     * qty
     */
    private BigDecimal qty;
    /**
     * cust
     */
    private String cust;
    /**
     * fcstsw
     */
    private Long fcstsw;
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
     * u_editdate
     */
    private Date uEditdate;
    /**
     * u_file_name
     */
    private String uFileName;
    /**
     * create_time
     */
    private Date createTime;

}
