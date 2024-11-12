package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_kit_fcst对象 scs_kit_fcst
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_kit_fcst")
public class ScsKitFcst extends BaseEntity {

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
     * 物料编码
     */
    private String itemCode;
    /**
     * dmdgroup
     */
    private String dmdgroup;
    /**
     * 开始日期
     */
    private Date startdate;
    /**
     * 地点
     */
    private String loc;
    /**
     * 数量
     */
    private BigDecimal qty;
    /**
     * 有效标识
     */
    private String uFlag;
    /**
     * 备注说明
     */
    private String uComment;
    /**
     * 来源文件名
     */
    private String fileName;
    /**
     * 文件上传时间
     */
    private Date editdate;
    /**
     * 版本号
     */
    private Long versionNo;

}
