package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 邮件模版sys_mail_config视图对象 sys_mail_config
 *
 * @author ruoyi
 * @date 2024-11-28
 */
@Data
@ExcelIgnoreUnannotated
public class SysMailConfigVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * 模版编码
     */
    @ExcelProperty(value = "模版编码")
    private String code;

    /**
     * 邮件标题
     */
    @ExcelProperty(value = "邮件标题")
    private String title;

    /**
     * 发件人
     */
    @ExcelProperty(value = "发件人")
    private String mailFrom;

    /**
     * 收件人
     */
    @ExcelProperty(value = "收件人")
    private String mailTo;

    /**
     * 抄送人
     */
    @ExcelProperty(value = "抄送人")
    private String mailCc;

    /**
     * 邮件内容
     */
    @ExcelProperty(value = "邮件内容")
    private String content;

    /**
     * 版本号
     */
    @ExcelProperty(value = "版本号")
    private Long versionNo;


}
