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
 * scs_if_process_log视图对象 scs_if_process_log
 *
 * @author ruoyi
 * @date 2024-11-13
 */
@Data
@ExcelIgnoreUnannotated
public class ScsIfProcessLogVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;
    /**
     * 装瓶集团
     */
    @ExcelProperty(value = "装瓶集团")
    private String corporation;
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

    /**
     * ETL表名
     */
    @ExcelProperty(value = "ETL表名")
    private String etlTableName;

    /**
     * 区分(KG/KIT)
     */
    @ExcelProperty(value = "区分(KG/KIT)")
    private String itemPattern;

    /**
     * 创建时间
     */
    @ExcelProperty(value = "创建时间")
    private Date createTime;



}
