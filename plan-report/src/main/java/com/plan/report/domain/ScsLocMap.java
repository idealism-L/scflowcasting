package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * scs_loc_map对象 scs_loc_map
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_loc_map")
public class ScsLocMap extends BaseEntity {

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
     * u_code_type
     */
    private String uCodeType;
    /**
     * 区域代码
     */
    private String uOriginalCode;
    /**
     * 地点
     */
    private String loc;
    /**
     * u_own_code
     */
    private String uOwnCode;
    /**
     * 版本号
     */
    private Long versionNo;

}
