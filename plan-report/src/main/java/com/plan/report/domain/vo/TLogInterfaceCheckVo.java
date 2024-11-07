package com.plan.report.domain.vo;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.plan.common.annotation.ExcelDictFormat;
import com.plan.common.convert.ExcelDictConvert;
import lombok.Data;

import java.io.Serializable;

/**
 * 预测接口检查视图对象 t_log_interface_check
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class TLogInterfaceCheckVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * 上传文件时间
     */
    @ExcelProperty(value = "上传文件时间")
    private Date fileTime;

    /**
     * 上传文件名称
     */
    @ExcelProperty(value = "上传文件名称")
    private String fileName;


}
