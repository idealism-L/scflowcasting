package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * scs_cps_loc_map对象 scs_cps_loc_map
 *
 * @author ruoyi
 * @date 2024-11-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_cps_loc_map")
public class ScsCpsLocMap extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * 物料编码
     */
    private String item;
    /**
     * 果汁/果肉标识
     */
    private String fruitCategory;
    /**
     * DFU地点
     */
    private String dfuLoc;
    /**
     * SKU地点
     */
    private String skuLoc;
    /**
     * 版本号
     */
    private Long versionNo;

}
