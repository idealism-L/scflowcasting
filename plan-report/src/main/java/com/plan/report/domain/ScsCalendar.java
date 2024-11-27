package com.plan.report.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * scs_calendar日历对象 scs_calendar
 *
 * @author ruoyi
 * @date 2024-11-14
 */
@Data
@TableName("scs_calendar")
public class ScsCalendar implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "id")
    private Long id;
    /**
     * 日期
     */
    private Date dayDt;
    /**
     * day_desc
     */
    private String dayDesc;
    /**
     * 周编码
     */
    private Long c445WeekCd;
    /**
     * 周号
     */
    private Long c445WeekNbr;
    /**
     * c445_week_desc
     */
    private String c445WeekDesc;
    /**
     * c445_week_date_range
     */
    private String c445WeekDateRange;
    /**
     * 周开始日期
     */
    private LocalDate c445WeekStartDt;
    /**
     * 周截止日期
     */
    private LocalDate c445WeekEndDt;
    /**
     * 月编码
     */
    private Long c445MonthCd;
    /**
     * 月号
     */
    private Long c445MonthNbr;
    /**
     * c445_month_desc
     */
    private String c445MonthDesc;
    /**
     * c445_month_nm
     */
    private String c445MonthNm;
    /**
     * c445_month_date_range
     */
    private String c445MonthDateRange;
    /**
     * 月开始日期
     */
    private Date c445MonthStartDt;
    /**
     * 月截止日期
     */
    private Date c445MonthEndDt;
    /**
     * c445_quarter_cd
     */
    private Long c445QuarterCd;
    /**
     * c445_quarter_desc
     */
    private String c445QuarterDesc;
    /**
     * c445_quarter_nm
     */
    private String c445QuarterNm;
    /**
     * c445_quarter_date_range
     */
    private String c445QuarterDateRange;
    /**
     * c445_quarter_start_dt
     */
    private Date c445QuarterStartDt;
    /**
     * c445_quarter_end_dt
     */
    private Date c445QuarterEndDt;
    /**
     * c445_semester_cd
     */
    private Long c445SemesterCd;
    /**
     * c445_semester_desc
     */
    private String c445SemesterDesc;
    /**
     * c445_semester_nm
     */
    private String c445SemesterNm;
    /**
     * 年份
     */
    private Long c445YearCd;
    /**
     * c445_year_desc
     */
    private String c445YearDesc;
    /**
     * c445_1py_day_dt
     */
    private Date c445_1pyDayDt;
    /**
     * c445_2py_day_dt
     */
    private Date c445_2pyDayDt;
    /**
     * c445_3py_day_dt
     */
    private Date c445_3pyDayDt;
    /**
     * c445_4py_day_dt
     */
    private Date c445_4pyDayDt;
    /**
     * c445_5py_day_dt
     */
    private Date c445_5pyDayDt;
    /**
     * greg_month_cd
     */
    private Long gregMonthCd;
    /**
     * greg_month_desc
     */
    private String gregMonthDesc;
    /**
     * greg_month_nm
     */
    private String gregMonthNm;
    /**
     * greg_month_day_nbr
     */
    private Long gregMonthDayNbr;
    /**
     * greg_quarter_cd
     */
    private Long gregQuarterCd;
    /**
     * greg_quarter_desc
     */
    private String gregQuarterDesc;
    /**
     * greg_quarter_nm
     */
    private String gregQuarterNm;
    /**
     * greg_quarter_day_nbr
     */
    private Long gregQuarterDayNbr;
    /**
     * greg_semester_cd
     */
    private Long gregSemesterCd;
    /**
     * greg_semester_desc
     */
    private String gregSemesterDesc;
    /**
     * greg_semester_nm
     */
    private String gregSemesterNm;
    /**
     * greg_year_cd
     */
    private Long gregYearCd;
    /**
     * greg_year_desc
     */
    private String gregYearDesc;
    /**
     * c445_month_nm_short
     */
    private String c445MonthNmShort;
    /**
     * c445_week_nm_long
     */
    private String c445WeekNmLong;
    /**
     * greg_quarter_nm_long
     */
    private String gregQuarterNmLong;
    /**
     * greg_month_nm_short
     */
    private String gregMonthNmShort;
    /**
     * greg_month_cd_short
     */
    private String gregMonthCdShort;
    /**
     * Long
     */
    // private String Long;
    /**
     * PER_TAG
     */
    private String perTag;
    /**
     * chinese_week_nbr
     */
    private Long chineseWeekNbr;
    /**
     * chinese_week_desc
     */
    private String chineseWeekDesc;
    /**
     * chinese_week_date_range
     */
    private String chineseWeekDateRange;
    /**
     * chinese_week_start_dt
     */
    private Date chineseWeekStartDt;
    /**
     * chinese_week_end_dt
     */
    private Date chineseWeekEndDt;
    /**
     * day_in_chinese_week
     */
    private Long dayInChineseWeek;
    /**
     * day_name
     */
    private String dayName;
    /**
     * day_in_year
     */
    private String dayInYear;
    /**
     * day_in_quarter
     */
    private Long dayInQuarter;
    /**
     * Daily_Consumption_Days
     */
    private Long dailyConsumptionDays;
    /**
     * Daily_Consumption_Days_PY
     */
    private Long dailyConsumptionDaysPy;
    /**
     * Daily_Consumption_Days_2PY
     */
    private Long dailyConsumptionDays_2py;
    /**
     * Daily_Consumption_Days_MTD
     */
    private Long dailyConsumptionDaysMtd;
    /**
     * Daily_Consumption_Days_MTD_PY
     */
    private Long dailyConsumptionDaysMtdPy;
    /**
     * Daily_Consumption_Days_MTD_2PY
     */
    private Long dailyConsumptionDaysMtd_2py;
    /**
     * Daily_Consumption_Days_QTD
     */
    private Long dailyConsumptionDaysQtd;
    /**
     * Daily_Consumption_Days_QTD_PY
     */
    private Long dailyConsumptionDaysQtdPy;
    /**
     * Daily_Consumption_Days_QTD_2PY
     */
    private Long dailyConsumptionDaysQtd_2py;
    /**
     * Daily_Consumption_Days_WTD
     */
    private Long dailyConsumptionDaysWtd;
    /**
     * Daily_Consumption_Days_WTD_PY
     */
    private Long dailyConsumptionDaysWtdPy;
    /**
     * Daily_Consumption_Days_WTD_2PY
     */
    private Long dailyConsumptionDaysWtd_2py;
    /**
     * Daily_Consumption_Days_YTD
     */
    private Long dailyConsumptionDaysYtd;
    /**
     * Daily_Consumption_Days_YTD_PY
     */
    private Long dailyConsumptionDaysYtdPy;
    /**
     * Daily_Consumption_Days_YTD_2PY
     */
    private Long dailyConsumptionDaysYtd_2py;
    /**
     * Weekly_Consumption_Days
     */
    private Long weeklyConsumptionDays;
    /**
     * Weekly_Consumption_Days_PY
     */
    private Long weeklyConsumptionDaysPy;
    /**
     * Weekly_Consumption_Days_2PY
     */
    private Long weeklyConsumptionDays_2py;
    /**
     * Weekly_Consumption_Days_03MMT
     */
    private Long weeklyConsumptionDays_03mmt;
    /**
     * Weekly_Consumption_Days_03MMT_PY
     */
    private Long weeklyConsumptionDays_03mmtPy;
    /**
     * Weekly_Consumption_Days_03MMT_2PY
     */
    private Long weeklyConsumptionDays_03mmt_2py;
    /**
     * Weekly_Consumption_Days_06MMT
     */
    private Long weeklyConsumptionDays_06mmt;
    /**
     * Weekly_Consumption_Days_06MMT_PY
     */
    private Long weeklyConsumptionDays_06mmtPy;
    /**
     * Weekly_Consumption_Days_06MMT_2PY
     */
    private Long weeklyConsumptionDays_06mmt_2py;
    /**
     * Weekly_Consumption_Days_12MMT
     */
    private Long weeklyConsumptionDays_12mmt;
    /**
     * Weekly_Consumption_Days_12MMT_PY
     */
    private Long weeklyConsumptionDays_12mmtPy;
    /**
     * Weekly_Consumption_Days_12MMT_2PY
     */
    private Long weeklyConsumptionDays_12mmt_2py;
    /**
     * Weekly_Consumption_Days_13WMT
     */
    private Long weeklyConsumptionDays_13wmt;
    /**
     * Weekly_Consumption_Days_13WMT_PY
     */
    private Long weeklyConsumptionDays_13wmtPy;
    /**
     * Weekly_Consumption_Days_13WMT_2PY
     */
    private Long weeklyConsumptionDays_13wmt_2py;
    /**
     * Weekly_Consumption_Days_26WMT
     */
    private Long weeklyConsumptionDays_26wmt;
    /**
     * Weekly_Consumption_Days_26WMT_PY
     */
    private Long weeklyConsumptionDays_26wmtPy;
    /**
     * Weekly_Consumption_Days_26WMT_2PY
     */
    private Long weeklyConsumptionDays_26wmt_2py;
    /**
     * Weekly_Consumption_Days_52WMT
     */
    private Long weeklyConsumptionDays_52wmt;
    /**
     * Weekly_Consumption_Days_52WMT_PY
     */
    private Long weeklyConsumptionDays_52wmtPy;
    /**
     * Weekly_Consumption_Days_52WMT_2PY
     */
    private Long weeklyConsumptionDays_52wmt_2py;
    /**
     * Weekly_Consumption_Days_MTD
     */
    private Long weeklyConsumptionDaysMtd;
    /**
     * Weekly_Consumption_Days_MTD_PY
     */
    private Long weeklyConsumptionDaysMtdPy;
    /**
     * Weekly_Consumption_Days_MTD_2PY
     */
    private Long weeklyConsumptionDaysMtd_2py;
    /**
     * Weekly_Consumption_Days_QTD
     */
    private Long weeklyConsumptionDaysQtd;
    /**
     * Weekly_Consumption_Days_QTD_PY
     */
    private Long weeklyConsumptionDaysQtdPy;
    /**
     * Weekly_Consumption_Days_QTD_2PY
     */
    private Long weeklyConsumptionDaysQtd_2py;
    /**
     * Weekly_Consumption_Days_WTD_PY
     */
    private Long weeklyConsumptionDaysWtdPy;
    /**
     * Weekly_Consumption_Days_WTD_2PY
     */
    private Long weeklyConsumptionDaysWtd_2py;
    /**
     * Weekly_Consumption_Days_YTD
     */
    private Long weeklyConsumptionDaysYtd;
    /**
     * Weekly_Consumption_Days_YTD_PY
     */
    private Long weeklyConsumptionDaysYtdPy;
    /**
     * Weekly_Consumption_Days_YTD_2PY
     */
    private Long weeklyConsumptionDaysYtd_2py;
    /**
     * Monthly_Consumption_Days
     */
    private Long monthlyConsumptionDays;
    /**
     * Monthly_Consumption_Days_PY
     */
    private Long monthlyConsumptionDaysPy;
    /**
     * Monthly_Consumption_Days_2PY
     */
    private Long monthlyConsumptionDays_2py;
    /**
     * Monthly_Consumption_Days_03MMT
     */
    private Long monthlyConsumptionDays_03mmt;
    /**
     * Monthly_Consumption_Days_03MMT_PY
     */
    private Long monthlyConsumptionDays_03mmtPy;
    /**
     * Monthly_Consumption_Days_03MMT_2PY
     */
    private Long monthlyConsumptionDays_03mmt_2py;
    /**
     * Monthly_Consumption_Days_06MMT
     */
    private Long monthlyConsumptionDays_06mmt;
    /**
     * Monthly_Consumption_Days_06MMT_PY
     */
    private Long monthlyConsumptionDays_06mmtPy;
    /**
     * Monthly_Consumption_Days_06MMT_2PY
     */
    private Long monthlyConsumptionDays_06mmt_2py;
    /**
     * Monthly_Consumption_Days_12MMT
     */
    private Long monthlyConsumptionDays_12mmt;
    /**
     * Monthly_Consumption_Days_12MMT_PY
     */
    private Long monthlyConsumptionDays_12mmtPy;
    /**
     * Monthly_Consumption_Days_12MMT_2PY
     */
    private Long monthlyConsumptionDays_12mmt_2py;
    /**
     * Monthly_Consumption_Days_QTD
     */
    private Long monthlyConsumptionDaysQtd;
    /**
     * Monthly_Consumption_Days_QTD_PY
     */
    private Long monthlyConsumptionDaysQtdPy;
    /**
     * Monthly_Consumption_Days_QTD_2PY
     */
    private Long monthlyConsumptionDaysQtd_2py;
    /**
     * Monthly_Consumption_Days_YTD
     */
    private Long monthlyConsumptionDaysYtd;
    /**
     * Monthly_Consumption_Days_YTD_PY
     */
    private Long monthlyConsumptionDaysYtdPy;
    /**
     * Monthly_Consumption_Days_YTD_2PY
     */
    private Long monthlyConsumptionDaysYtd_2py;
    /**
     * Quarterly_Consumption_Days
     */
    private Long quarterlyConsumptionDays;
    /**
     * Quarterly_Consumption_Days_PY
     */
    private Long quarterlyConsumptionDaysPy;
    /**
     * Quarterly_Consumption_Days_2PY
     */
    private Long quarterlyConsumptionDays_2py;
    /**
     * Quarterly_Consumption_Days_YTD
     */
    private Long quarterlyConsumptionDaysYtd;
    /**
     * Quarterly_Consumption_Days_YTD_PY
     */
    private Long quarterlyConsumptionDaysYtdPy;
    /**
     * Quarterly_Consumption_Days_YTD_2PY
     */
    private Long quarterlyConsumptionDaysYtd_2py;
    /**
     * Yearly_Consumption_Days
     */
    private Long yearlyConsumptionDays;
    /**
     * Yearly_Consumption_Days_PY
     */
    private Long yearlyConsumptionDaysPy;
    /**
     * Yearly_Consumption_Days_2PY
     */
    private Long yearlyConsumptionDays_2py;
    /**
     * file_name
     */
    private String fileName;
    /**
     * updated_user
     */
    private String updatedUser;
    /**
     * loaded_time
     */
    private Date loadedTime;

}
