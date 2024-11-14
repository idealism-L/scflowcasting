package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * scs_calendar日历视图对象 scs_calendar
 *
 * @author ruoyi
 * @date 2024-11-14
 */
@Data
@ExcelIgnoreUnannotated
public class ScsCalendarVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * 日期
     */
    @ExcelProperty(value = "日期")
    private Date dayDt;

    /**
     * day_desc
     */
    @ExcelProperty(value = "day_desc")
    private String dayDesc;

    /**
     * 周编码
     */
    @ExcelProperty(value = "周编码")
    private Long c445WeekCd;

    /**
     * 周号
     */
    @ExcelProperty(value = "周号")
    private Long c445WeekNbr;

    /**
     * c445_week_desc
     */
    @ExcelProperty(value = "c445_week_desc")
    private String c445WeekDesc;

    /**
     * c445_week_date_range
     */
    @ExcelProperty(value = "c445_week_date_range")
    private String c445WeekDateRange;

    /**
     * 周开始日期
     */
    @ExcelProperty(value = "周开始日期")
    private Date c445WeekStartDt;

    /**
     * 周截止日期
     */
    @ExcelProperty(value = "周截止日期")
    private Date c445WeekEndDt;

    /**
     * 月编码
     */
    @ExcelProperty(value = "月编码")
    private Long c445MonthCd;

    /**
     * 月号
     */
    @ExcelProperty(value = "月号")
    private Long c445MonthNbr;

    /**
     * c445_month_desc
     */
    @ExcelProperty(value = "c445_month_desc")
    private String c445MonthDesc;

    /**
     * c445_month_nm
     */
    @ExcelProperty(value = "c445_month_nm")
    private String c445MonthNm;

    /**
     * c445_month_date_range
     */
    @ExcelProperty(value = "c445_month_date_range")
    private String c445MonthDateRange;

    /**
     * 月开始日期
     */
    @ExcelProperty(value = "月开始日期")
    private Date c445MonthStartDt;

    /**
     * 月截止日期
     */
    @ExcelProperty(value = "月截止日期")
    private Date c445MonthEndDt;

    /**
     * c445_quarter_cd
     */
    @ExcelProperty(value = "c445_quarter_cd")
    private Long c445QuarterCd;

    /**
     * c445_quarter_desc
     */
    @ExcelProperty(value = "c445_quarter_desc")
    private String c445QuarterDesc;

    /**
     * c445_quarter_nm
     */
    @ExcelProperty(value = "c445_quarter_nm")
    private String c445QuarterNm;

    /**
     * c445_quarter_date_range
     */
    @ExcelProperty(value = "c445_quarter_date_range")
    private String c445QuarterDateRange;

    /**
     * c445_quarter_start_dt
     */
    @ExcelProperty(value = "c445_quarter_start_dt")
    private Date c445QuarterStartDt;

    /**
     * c445_quarter_end_dt
     */
    @ExcelProperty(value = "c445_quarter_end_dt")
    private Date c445QuarterEndDt;

    /**
     * c445_semester_cd
     */
    @ExcelProperty(value = "c445_semester_cd")
    private Long c445SemesterCd;

    /**
     * c445_semester_desc
     */
    @ExcelProperty(value = "c445_semester_desc")
    private String c445SemesterDesc;

    /**
     * c445_semester_nm
     */
    @ExcelProperty(value = "c445_semester_nm")
    private String c445SemesterNm;

    /**
     * 年份
     */
    @ExcelProperty(value = "年份")
    private Long c445YearCd;

    /**
     * c445_year_desc
     */
    @ExcelProperty(value = "c445_year_desc")
    private String c445YearDesc;

    /**
     * c445_1py_day_dt
     */
    @ExcelProperty(value = "c445_1py_day_dt")
    private Date c4451pyDayDt;

    /**
     * c445_2py_day_dt
     */
    @ExcelProperty(value = "c445_2py_day_dt")
    private Date c4452pyDayDt;

    /**
     * c445_3py_day_dt
     */
    @ExcelProperty(value = "c445_3py_day_dt")
    private Date c4453pyDayDt;

    /**
     * c445_4py_day_dt
     */
    @ExcelProperty(value = "c445_4py_day_dt")
    private Date c4454pyDayDt;

    /**
     * c445_5py_day_dt
     */
    @ExcelProperty(value = "c445_5py_day_dt")
    private Date c4455pyDayDt;

    /**
     * greg_month_cd
     */
    @ExcelProperty(value = "greg_month_cd")
    private Long gregMonthCd;

    /**
     * greg_month_desc
     */
    @ExcelProperty(value = "greg_month_desc")
    private String gregMonthDesc;

    /**
     * greg_month_nm
     */
    @ExcelProperty(value = "greg_month_nm")
    private String gregMonthNm;

    /**
     * greg_month_day_nbr
     */
    @ExcelProperty(value = "greg_month_day_nbr")
    private Long gregMonthDayNbr;

    /**
     * greg_quarter_cd
     */
    @ExcelProperty(value = "greg_quarter_cd")
    private Long gregQuarterCd;

    /**
     * greg_quarter_desc
     */
    @ExcelProperty(value = "greg_quarter_desc")
    private String gregQuarterDesc;

    /**
     * greg_quarter_nm
     */
    @ExcelProperty(value = "greg_quarter_nm")
    private String gregQuarterNm;

    /**
     * greg_quarter_day_nbr
     */
    @ExcelProperty(value = "greg_quarter_day_nbr")
    private Long gregQuarterDayNbr;

    /**
     * greg_semester_cd
     */
    @ExcelProperty(value = "greg_semester_cd")
    private Long gregSemesterCd;

    /**
     * greg_semester_desc
     */
    @ExcelProperty(value = "greg_semester_desc")
    private String gregSemesterDesc;

    /**
     * greg_semester_nm
     */
    @ExcelProperty(value = "greg_semester_nm")
    private String gregSemesterNm;

    /**
     * greg_year_cd
     */
    @ExcelProperty(value = "greg_year_cd")
    private Long gregYearCd;

    /**
     * greg_year_desc
     */
    @ExcelProperty(value = "greg_year_desc")
    private String gregYearDesc;

    /**
     * c445_month_nm_short
     */
    @ExcelProperty(value = "c445_month_nm_short")
    private String c445MonthNmShort;

    /**
     * c445_week_nm_long
     */
    @ExcelProperty(value = "c445_week_nm_long")
    private String c445WeekNmLong;

    /**
     * greg_quarter_nm_long
     */
    @ExcelProperty(value = "greg_quarter_nm_long")
    private String gregQuarterNmLong;

    /**
     * greg_month_nm_short
     */
    @ExcelProperty(value = "greg_month_nm_short")
    private String gregMonthNmShort;

    /**
     * greg_month_cd_short
     */
    @ExcelProperty(value = "greg_month_cd_short")
    private String gregMonthCdShort;

    /**
     * Long
     */
    @ExcelProperty(value = "Long")
    private String Long;

    /**
     * PER_TAG
     */
    @ExcelProperty(value = "PER_TAG")
    private String perTag;

    /**
     * chinese_week_nbr
     */
    @ExcelProperty(value = "chinese_week_nbr")
    private Long chineseWeekNbr;

    /**
     * chinese_week_desc
     */
    @ExcelProperty(value = "chinese_week_desc")
    private String chineseWeekDesc;

    /**
     * chinese_week_date_range
     */
    @ExcelProperty(value = "chinese_week_date_range")
    private String chineseWeekDateRange;

    /**
     * chinese_week_start_dt
     */
    @ExcelProperty(value = "chinese_week_start_dt")
    private Date chineseWeekStartDt;

    /**
     * chinese_week_end_dt
     */
    @ExcelProperty(value = "chinese_week_end_dt")
    private Date chineseWeekEndDt;

    /**
     * day_in_chinese_week
     */
    @ExcelProperty(value = "day_in_chinese_week")
    private Long dayInChineseWeek;

    /**
     * day_name
     */
    @ExcelProperty(value = "day_name")
    private String dayName;

    /**
     * day_in_year
     */
    @ExcelProperty(value = "day_in_year")
    private String dayInYear;

    /**
     * day_in_quarter
     */
    @ExcelProperty(value = "day_in_quarter")
    private Long dayInQuarter;

    /**
     * Daily_Consumption_Days
     */
    @ExcelProperty(value = "Daily_Consumption_Days")
    private Long dailyConsumptionDays;

    /**
     * Daily_Consumption_Days_PY
     */
    @ExcelProperty(value = "Daily_Consumption_Days_PY")
    private Long dailyConsumptionDaysPy;

    /**
     * Daily_Consumption_Days_2PY
     */
    @ExcelProperty(value = "Daily_Consumption_Days_2PY")
    private Long dailyConsumptionDays2py;

    /**
     * Daily_Consumption_Days_MTD
     */
    @ExcelProperty(value = "Daily_Consumption_Days_MTD")
    private Long dailyConsumptionDaysMtd;

    /**
     * Daily_Consumption_Days_MTD_PY
     */
    @ExcelProperty(value = "Daily_Consumption_Days_MTD_PY")
    private Long dailyConsumptionDaysMtdPy;

    /**
     * Daily_Consumption_Days_MTD_2PY
     */
    @ExcelProperty(value = "Daily_Consumption_Days_MTD_2PY")
    private Long dailyConsumptionDaysMtd2py;

    /**
     * Daily_Consumption_Days_QTD
     */
    @ExcelProperty(value = "Daily_Consumption_Days_QTD")
    private Long dailyConsumptionDaysQtd;

    /**
     * Daily_Consumption_Days_QTD_PY
     */
    @ExcelProperty(value = "Daily_Consumption_Days_QTD_PY")
    private Long dailyConsumptionDaysQtdPy;

    /**
     * Daily_Consumption_Days_QTD_2PY
     */
    @ExcelProperty(value = "Daily_Consumption_Days_QTD_2PY")
    private Long dailyConsumptionDaysQtd2py;

    /**
     * Daily_Consumption_Days_WTD
     */
    @ExcelProperty(value = "Daily_Consumption_Days_WTD")
    private Long dailyConsumptionDaysWtd;

    /**
     * Daily_Consumption_Days_WTD_PY
     */
    @ExcelProperty(value = "Daily_Consumption_Days_WTD_PY")
    private Long dailyConsumptionDaysWtdPy;

    /**
     * Daily_Consumption_Days_WTD_2PY
     */
    @ExcelProperty(value = "Daily_Consumption_Days_WTD_2PY")
    private Long dailyConsumptionDaysWtd2py;

    /**
     * Daily_Consumption_Days_YTD
     */
    @ExcelProperty(value = "Daily_Consumption_Days_YTD")
    private Long dailyConsumptionDaysYtd;

    /**
     * Daily_Consumption_Days_YTD_PY
     */
    @ExcelProperty(value = "Daily_Consumption_Days_YTD_PY")
    private Long dailyConsumptionDaysYtdPy;

    /**
     * Daily_Consumption_Days_YTD_2PY
     */
    @ExcelProperty(value = "Daily_Consumption_Days_YTD_2PY")
    private Long dailyConsumptionDaysYtd2py;

    /**
     * Weekly_Consumption_Days
     */
    @ExcelProperty(value = "Weekly_Consumption_Days")
    private Long weeklyConsumptionDays;

    /**
     * Weekly_Consumption_Days_PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_PY")
    private Long weeklyConsumptionDaysPy;

    /**
     * Weekly_Consumption_Days_2PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_2PY")
    private Long weeklyConsumptionDays2py;

    /**
     * Weekly_Consumption_Days_03MMT
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_03MMT")
    private Long weeklyConsumptionDays03mmt;

    /**
     * Weekly_Consumption_Days_03MMT_PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_03MMT_PY")
    private Long weeklyConsumptionDays03mmtPy;

    /**
     * Weekly_Consumption_Days_03MMT_2PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_03MMT_2PY")
    private Long weeklyConsumptionDays03mmt2py;

    /**
     * Weekly_Consumption_Days_06MMT
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_06MMT")
    private Long weeklyConsumptionDays06mmt;

    /**
     * Weekly_Consumption_Days_06MMT_PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_06MMT_PY")
    private Long weeklyConsumptionDays06mmtPy;

    /**
     * Weekly_Consumption_Days_06MMT_2PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_06MMT_2PY")
    private Long weeklyConsumptionDays06mmt2py;

    /**
     * Weekly_Consumption_Days_12MMT
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_12MMT")
    private Long weeklyConsumptionDays12mmt;

    /**
     * Weekly_Consumption_Days_12MMT_PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_12MMT_PY")
    private Long weeklyConsumptionDays12mmtPy;

    /**
     * Weekly_Consumption_Days_12MMT_2PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_12MMT_2PY")
    private Long weeklyConsumptionDays12mmt2py;

    /**
     * Weekly_Consumption_Days_13WMT
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_13WMT")
    private Long weeklyConsumptionDays13wmt;

    /**
     * Weekly_Consumption_Days_13WMT_PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_13WMT_PY")
    private Long weeklyConsumptionDays13wmtPy;

    /**
     * Weekly_Consumption_Days_13WMT_2PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_13WMT_2PY")
    private Long weeklyConsumptionDays13wmt2py;

    /**
     * Weekly_Consumption_Days_26WMT
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_26WMT")
    private Long weeklyConsumptionDays26wmt;

    /**
     * Weekly_Consumption_Days_26WMT_PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_26WMT_PY")
    private Long weeklyConsumptionDays26wmtPy;

    /**
     * Weekly_Consumption_Days_26WMT_2PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_26WMT_2PY")
    private Long weeklyConsumptionDays26wmt2py;

    /**
     * Weekly_Consumption_Days_52WMT
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_52WMT")
    private Long weeklyConsumptionDays52wmt;

    /**
     * Weekly_Consumption_Days_52WMT_PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_52WMT_PY")
    private Long weeklyConsumptionDays52wmtPy;

    /**
     * Weekly_Consumption_Days_52WMT_2PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_52WMT_2PY")
    private Long weeklyConsumptionDays52wmt2py;

    /**
     * Weekly_Consumption_Days_MTD
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_MTD")
    private Long weeklyConsumptionDaysMtd;

    /**
     * Weekly_Consumption_Days_MTD_PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_MTD_PY")
    private Long weeklyConsumptionDaysMtdPy;

    /**
     * Weekly_Consumption_Days_MTD_2PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_MTD_2PY")
    private Long weeklyConsumptionDaysMtd2py;

    /**
     * Weekly_Consumption_Days_QTD
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_QTD")
    private Long weeklyConsumptionDaysQtd;

    /**
     * Weekly_Consumption_Days_QTD_PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_QTD_PY")
    private Long weeklyConsumptionDaysQtdPy;

    /**
     * Weekly_Consumption_Days_QTD_2PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_QTD_2PY")
    private Long weeklyConsumptionDaysQtd2py;

    /**
     * Weekly_Consumption_Days_WTD_PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_WTD_PY")
    private Long weeklyConsumptionDaysWtdPy;

    /**
     * Weekly_Consumption_Days_WTD_2PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_WTD_2PY")
    private Long weeklyConsumptionDaysWtd2py;

    /**
     * Weekly_Consumption_Days_YTD
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_YTD")
    private Long weeklyConsumptionDaysYtd;

    /**
     * Weekly_Consumption_Days_YTD_PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_YTD_PY")
    private Long weeklyConsumptionDaysYtdPy;

    /**
     * Weekly_Consumption_Days_YTD_2PY
     */
    @ExcelProperty(value = "Weekly_Consumption_Days_YTD_2PY")
    private Long weeklyConsumptionDaysYtd2py;

    /**
     * Monthly_Consumption_Days
     */
    @ExcelProperty(value = "Monthly_Consumption_Days")
    private Long monthlyConsumptionDays;

    /**
     * Monthly_Consumption_Days_PY
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_PY")
    private Long monthlyConsumptionDaysPy;

    /**
     * Monthly_Consumption_Days_2PY
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_2PY")
    private Long monthlyConsumptionDays2py;

    /**
     * Monthly_Consumption_Days_03MMT
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_03MMT")
    private Long monthlyConsumptionDays03mmt;

    /**
     * Monthly_Consumption_Days_03MMT_PY
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_03MMT_PY")
    private Long monthlyConsumptionDays03mmtPy;

    /**
     * Monthly_Consumption_Days_03MMT_2PY
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_03MMT_2PY")
    private Long monthlyConsumptionDays03mmt2py;

    /**
     * Monthly_Consumption_Days_06MMT
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_06MMT")
    private Long monthlyConsumptionDays06mmt;

    /**
     * Monthly_Consumption_Days_06MMT_PY
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_06MMT_PY")
    private Long monthlyConsumptionDays06mmtPy;

    /**
     * Monthly_Consumption_Days_06MMT_2PY
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_06MMT_2PY")
    private Long monthlyConsumptionDays06mmt2py;

    /**
     * Monthly_Consumption_Days_12MMT
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_12MMT")
    private Long monthlyConsumptionDays12mmt;

    /**
     * Monthly_Consumption_Days_12MMT_PY
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_12MMT_PY")
    private Long monthlyConsumptionDays12mmtPy;

    /**
     * Monthly_Consumption_Days_12MMT_2PY
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_12MMT_2PY")
    private Long monthlyConsumptionDays12mmt2py;

    /**
     * Monthly_Consumption_Days_QTD
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_QTD")
    private Long monthlyConsumptionDaysQtd;

    /**
     * Monthly_Consumption_Days_QTD_PY
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_QTD_PY")
    private Long monthlyConsumptionDaysQtdPy;

    /**
     * Monthly_Consumption_Days_QTD_2PY
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_QTD_2PY")
    private Long monthlyConsumptionDaysQtd2py;

    /**
     * Monthly_Consumption_Days_YTD
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_YTD")
    private Long monthlyConsumptionDaysYtd;

    /**
     * Monthly_Consumption_Days_YTD_PY
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_YTD_PY")
    private Long monthlyConsumptionDaysYtdPy;

    /**
     * Monthly_Consumption_Days_YTD_2PY
     */
    @ExcelProperty(value = "Monthly_Consumption_Days_YTD_2PY")
    private Long monthlyConsumptionDaysYtd2py;

    /**
     * Quarterly_Consumption_Days
     */
    @ExcelProperty(value = "Quarterly_Consumption_Days")
    private Long quarterlyConsumptionDays;

    /**
     * Quarterly_Consumption_Days_PY
     */
    @ExcelProperty(value = "Quarterly_Consumption_Days_PY")
    private Long quarterlyConsumptionDaysPy;

    /**
     * Quarterly_Consumption_Days_2PY
     */
    @ExcelProperty(value = "Quarterly_Consumption_Days_2PY")
    private Long quarterlyConsumptionDays2py;

    /**
     * Quarterly_Consumption_Days_YTD
     */
    @ExcelProperty(value = "Quarterly_Consumption_Days_YTD")
    private Long quarterlyConsumptionDaysYtd;

    /**
     * Quarterly_Consumption_Days_YTD_PY
     */
    @ExcelProperty(value = "Quarterly_Consumption_Days_YTD_PY")
    private Long quarterlyConsumptionDaysYtdPy;

    /**
     * Quarterly_Consumption_Days_YTD_2PY
     */
    @ExcelProperty(value = "Quarterly_Consumption_Days_YTD_2PY")
    private Long quarterlyConsumptionDaysYtd2py;

    /**
     * Yearly_Consumption_Days
     */
    @ExcelProperty(value = "Yearly_Consumption_Days")
    private Long yearlyConsumptionDays;

    /**
     * Yearly_Consumption_Days_PY
     */
    @ExcelProperty(value = "Yearly_Consumption_Days_PY")
    private Long yearlyConsumptionDaysPy;

    /**
     * Yearly_Consumption_Days_2PY
     */
    @ExcelProperty(value = "Yearly_Consumption_Days_2PY")
    private Long yearlyConsumptionDays2py;

    /**
     * file_name
     */
    @ExcelProperty(value = "file_name")
    private String fileName;

    /**
     * updated_user
     */
    @ExcelProperty(value = "updated_user")
    private String updatedUser;

    /**
     * loaded_time
     */
    @ExcelProperty(value = "loaded_time")
    private Date loadedTime;


}
