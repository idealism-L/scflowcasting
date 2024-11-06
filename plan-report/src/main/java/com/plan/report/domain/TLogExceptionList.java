package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 接口异常信息对象 t_log_exception_list
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("t_log_exception_list")
public class TLogExceptionList extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "IM_MAIN_INSURANCE_CONFIG_ID")
    private Long imMainInsuranceConfigId;
    /**
     * 装瓶集团
     */
    private String corporation;
    /**
     * 上传文件名称
     */
    private String fileName;
    /**
     * 套件/FG
     */
    private String uItemPattern;
    /**
     * 物料编码
     */
    private String item;
    /**
     * 地点
     */
    private String loc;
    /**
     * 备注
     */
    private String uComment;

}
