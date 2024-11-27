package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * scs_if_exception_log对象 scs_if_exception_log
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scs_if_exception_log")
public class ScsIfExceptionLog extends BaseEntity {

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
     * 上传文件名称
     */
    private String fileName;

    /**
     * ETL表名
     */
    private String etlTableName;
    /**
     * KIT/FG
     */
    private String itemPattern;
    /**
     * 物料编码
     */
    private String itemCode;
    /**
     * 地点
     */
    private String loc;
    /**
     * 地点代码
     */
    private String locOwnCode;
    /**
     * 异常信息
     */
    private String uComment;

}
