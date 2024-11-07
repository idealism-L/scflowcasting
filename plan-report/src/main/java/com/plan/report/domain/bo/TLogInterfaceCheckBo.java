package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 预测接口检查业务对象 t_log_interface_check
 *
 * @author ruoyi
 * @date 2024-11-06
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class TLogInterfaceCheckBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 上传文件时间
     */
    @NotNull(message = "上传文件时间不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date fileTime;

    /**
     * 上传文件名称
     */
    @NotBlank(message = "上传文件名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String fileName;


}
