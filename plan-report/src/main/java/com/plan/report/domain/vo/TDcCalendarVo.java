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
 * 日历视图对象 t_dc_calendar
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class TDcCalendarVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * 年份
     */
    @ExcelProperty(value = "年份")
    private String yearNum;

    /**
     * 开始日期
     */
    @ExcelProperty(value = "开始日期")
    private Date startdate;

    /**
     * 周号
     */
    @ExcelProperty(value = "周号")
    private String weekNum;


}
