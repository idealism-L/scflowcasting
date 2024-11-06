package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 地点对象 t_dc_loc
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_dc_loc")
public class TDcLoc extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "IM_MAIN_INSURANCE_CONFIG_ID")
    private Long imMainInsuranceConfigId;
    /**
     * 地点名称
     */
    private String locName;
    /**
     * 地点代码
     */
    private String loc;
    /**
     * 描述
     */
    private String descr;
    /**
     * OU
     */
    private String uOu;
    /**
     * OU描述
     */
    private String uOuDescr;
    /**
     * 装瓶集团
     */
    private String corporation;
    /**
     * 地点类型
     */
    private String uLocType;
    /**
     * SCMC代码
     */
    private String uScmcCode;
    /**
     * CPS代码
     */
    private String uCpsCode;
    /**
     * 邮件
     */
    private String uEmail;
    /**
     * 状态
     */
    private String uStatus;

}
