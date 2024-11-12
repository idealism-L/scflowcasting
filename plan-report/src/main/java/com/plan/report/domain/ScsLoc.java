package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * scs_loc对象 scs_loc
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_loc")
public class ScsLoc extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * 地点
     */
    private String loc;
    /**
     * 地点代码
     */
    private String locOwnCode;
    /**
     * 地点描述
     */
    private String descr;
    /**
     * OU
     */
    private String ou;
    /**
     * OU描述
     */
    private String ouDescr;
    /**
     * 装瓶集团
     */
    private String corporation;
    /**
     * 地点类型
     */
    private String locType;
    /**
     * CPS代码
     */
    private String cpsCode;
    /**
     * 邮件
     */
    private String email;
    /**
     * 版本号
     */
    private Long versionNo;

}
