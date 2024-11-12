package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.plan.common.annotation.ExcelDictFormat;
import com.plan.common.convert.ExcelDictConvert;
import lombok.Data;

import java.io.Serializable;

/**
 * scs_if_exception_log视图对象 scs_if_exception_log
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Data
@ExcelIgnoreUnannotated
public class ScsIfExceptionLogVo implements Serializable {

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
     * KIT/FG
     */
    @ExcelProperty(value = "KIT/FG")
    private String uItemPattern;

    /**
     * 物料编码
     */
    @ExcelProperty(value = "物料编码")
    private String itemCode;

    /**
     * 地点
     */
    @ExcelProperty(value = "地点")
    private String loc;

    /**
     * 地点代码
     */
    @ExcelProperty(value = "地点代码")
    private String locOwnCode;

    /**
     * 异常信息
     */
    @ExcelProperty(value = "异常信息")
    private String uComment;


}
