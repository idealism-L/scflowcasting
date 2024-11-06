package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.plan.common.annotation.ExcelDictFormat;
import com.plan.common.convert.ExcelDictConvert;
import lombok.Data;

import java.io.Serializable;

/**
 * 接口异常信息视图对象 t_log_exception_list
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class TLogExceptionListVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long imMainInsuranceConfigId;

    /**
     * 装瓶集团
     */
    @ExcelProperty(value = "装瓶集团")
    private String corporation;

    /**
     * 上传文件名称
     */
    @ExcelProperty(value = "上传文件名称")
    private String fileName;

    /**
     * 套件/FG
     */
    @ExcelProperty(value = "套件/FG")
    private String uItemPattern;

    /**
     * 物料编码
     */
    @ExcelProperty(value = "物料编码")
    private String item;

    /**
     * 地点
     */
    @ExcelProperty(value = "地点")
    private String loc;

    /**
     * 备注
     */
    @ExcelProperty(value = "备注")
    private String uComment;


}
