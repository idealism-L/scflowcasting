package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
 * scs_if_exception_log业务对象 scs_if_exception_log
 *
 * @author ruoyi
 * @date 2024-11-12
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsIfExceptionLogBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 装瓶集团
     */
    @NotBlank(message = "装瓶集团不能为空", groups = { AddGroup.class, EditGroup.class })
    private String corporation;

    /**
     * 上传文件名称
     */
    @NotBlank(message = "上传文件名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String fileName;

    /**
     * ETL表名
     */
    @NotBlank(message = "ETL表名不能为空", groups = { AddGroup.class, EditGroup.class })
    private String etlTableName;

    /**
     * KIT/FG
     */
    @NotBlank(message = "KIT/FG不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uItemPattern;

    /**
     * 物料编码
     */
    @NotBlank(message = "物料编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String itemCode;

    /**
     * 地点
     */
    @NotBlank(message = "地点不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loc;

    /**
     * 地点代码
     */
    @NotBlank(message = "地点代码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String locOwnCode;

    /**
     * 异常信息
     */
    @NotBlank(message = "异常信息不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uComment;


}
