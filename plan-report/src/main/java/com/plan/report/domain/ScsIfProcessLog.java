package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * scs_if_process_log对象 scs_if_process_log
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_if_process_log")
public class ScsIfProcessLog extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * 上传文件时间
     */
    private Date fileTime;
    /**
     * 上传文件名称
     */
    private String fileName;
    /**
     * ETL表名
     */
    private String etlTableName;

}
