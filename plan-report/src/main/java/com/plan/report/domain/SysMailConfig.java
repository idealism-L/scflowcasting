package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.plan.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 邮件模版sys_mail_config对象 sys_mail_config
 *
 * @author ruoyi
 * @date 2024-11-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("sys_mail_config")
public class SysMailConfig extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * 模版编码
     */
    private String code;
    /**
     * 邮件标题
     */
    private String title;
    /**
     * 发件人
     */
    private String mailFrom;
    /**
     * 收件人
     */
    private String mailTo;
    /**
     * 抄送人
     */
    private String mailCc;
    /**
     * 邮件内容
     */
    private String content;
    /**
     * 版本号
     */
    private Long versionNo;

}
