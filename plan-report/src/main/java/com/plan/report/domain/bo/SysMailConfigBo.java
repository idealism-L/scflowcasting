package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
 * 邮件模版sys_mail_config业务对象 sys_mail_config
 *
 * @author ruoyi
 * @date 2024-11-28
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class SysMailConfigBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 模版编码
     */
    @NotBlank(message = "模版编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String code;

    /**
     * 邮件标题
     */
    @NotBlank(message = "邮件标题不能为空", groups = { AddGroup.class, EditGroup.class })
    private String title;

    /**
     * 发件人
     */
    @NotBlank(message = "发件人不能为空", groups = { AddGroup.class, EditGroup.class })
    private String mailFrom;

    /**
     * 收件人
     */
    @NotBlank(message = "收件人不能为空", groups = { AddGroup.class, EditGroup.class })
    private String mailTo;

    /**
     * 抄送人
     */
    @NotBlank(message = "抄送人不能为空", groups = { AddGroup.class, EditGroup.class })
    private String mailCc;

    /**
     * 邮件内容
     */
    @NotBlank(message = "邮件内容不能为空", groups = { AddGroup.class, EditGroup.class })
    private String content;

    /**
     * 版本号
     */
    @NotNull(message = "版本号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long versionNo;


}
