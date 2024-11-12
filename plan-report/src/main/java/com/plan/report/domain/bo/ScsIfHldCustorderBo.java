package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_if_hld_custorder业务对象 scs_if_hld_custorder
 *
 * @author ruoyi
 * @date 2024-11-12
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsIfHldCustorderBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * item
     */
    @NotBlank(message = "item不能为空", groups = { AddGroup.class, EditGroup.class })
    private String item;

    /**
     * loc
     */
    @NotBlank(message = "loc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loc;

    /**
     * shipdate
     */
    @NotNull(message = "shipdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date shipdate;

    /**
     * orderid
     */
    @NotBlank(message = "orderid不能为空", groups = { AddGroup.class, EditGroup.class })
    private String orderid;

    /**
     * qty
     */
    @NotNull(message = "qty不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal qty;

    /**
     * cust
     */
    @NotBlank(message = "cust不能为空", groups = { AddGroup.class, EditGroup.class })
    private String cust;

    /**
     * fcstsw
     */
    @NotNull(message = "fcstsw不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long fcstsw;

    /**
     * u_item_pattern
     */
    @NotBlank(message = "u_item_pattern不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uItemPattern;

    /**
     * u_corporation
     */
    @NotBlank(message = "u_corporation不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uCorporation;

    /**
     * u_flag
     */
    @NotNull(message = "u_flag不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long uFlag;

    /**
     * u_comment
     */
    @NotBlank(message = "u_comment不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uComment;

    /**
     * u_editdate
     */
    @NotNull(message = "u_editdate不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date uEditdate;

    /**
     * u_file_name
     */
    @NotBlank(message = "u_file_name不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uFileName;


}
