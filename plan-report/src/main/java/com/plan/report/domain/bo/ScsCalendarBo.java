package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * scs_calendar日历业务对象 scs_calendar
 *
 * @author ruoyi
 * @date 2024-11-14
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsCalendarBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 日期
     */
    @NotNull(message = "日期不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date dayDt;

    /**
     * day_desc
     */
    @NotBlank(message = "day_desc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String dayDesc;

    /**
     * 周编码
     */
    @NotNull(message = "周编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long c445WeekCd;

    /**
     * 周号
     */
    @NotNull(message = "周号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long c445WeekNbr;

    /**
     * c445_week_desc
     */
    @NotBlank(message = "c445_week_desc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445WeekDesc;

    /**
     * c445_week_date_range
     */
    @NotBlank(message = "c445_week_date_range不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445WeekDateRange;

    /**
     * 周开始日期
     */
    @NotNull(message = "周开始日期不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date c445WeekStartDt;

    /**
     * 周截止日期
     */
    @NotNull(message = "周截止日期不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date c445WeekEndDt;

    /**
     * 月编码
     */
    @NotNull(message = "月编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long c445MonthCd;

    /**
     * 月号
     */
    @NotNull(message = "月号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long c445MonthNbr;

    /**
     * c445_month_desc
     */
    @NotBlank(message = "c445_month_desc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445MonthDesc;

    /**
     * c445_month_nm
     */
    @NotBlank(message = "c445_month_nm不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445MonthNm;

    /**
     * c445_month_date_range
     */
    @NotBlank(message = "c445_month_date_range不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445MonthDateRange;

    /**
     * 月开始日期
     */
    @NotNull(message = "月开始日期不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date c445MonthStartDt;

    /**
     * 月截止日期
     */
    @NotNull(message = "月截止日期不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date c445MonthEndDt;

    /**
     * c445_quarter_cd
     */
    @NotNull(message = "c445_quarter_cd不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long c445QuarterCd;

    /**
     * c445_quarter_desc
     */
    @NotBlank(message = "c445_quarter_desc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445QuarterDesc;

    /**
     * c445_quarter_nm
     */
    @NotBlank(message = "c445_quarter_nm不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445QuarterNm;

    /**
     * c445_quarter_date_range
     */
    @NotBlank(message = "c445_quarter_date_range不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445QuarterDateRange;

    /**
     * c445_quarter_start_dt
     */
    @NotNull(message = "c445_quarter_start_dt不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date c445QuarterStartDt;

    /**
     * c445_quarter_end_dt
     */
    @NotNull(message = "c445_quarter_end_dt不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date c445QuarterEndDt;

    /**
     * c445_semester_cd
     */
    @NotNull(message = "c445_semester_cd不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long c445SemesterCd;

    /**
     * c445_semester_desc
     */
    @NotBlank(message = "c445_semester_desc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445SemesterDesc;

    /**
     * c445_semester_nm
     */
    @NotBlank(message = "c445_semester_nm不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445SemesterNm;

    /**
     * 年份
     */
    @NotNull(message = "年份不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long c445YearCd;

    /**
     * c445_year_desc
     */
    @NotBlank(message = "c445_year_desc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445YearDesc;

    /**
     * c445_1py_day_dt
     */
    @NotNull(message = "c445_1py_day_dt不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date c4451pyDayDt;

    /**
     * c445_2py_day_dt
     */
    @NotNull(message = "c445_2py_day_dt不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date c4452pyDayDt;

    /**
     * c445_3py_day_dt
     */
    @NotNull(message = "c445_3py_day_dt不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date c4453pyDayDt;

    /**
     * c445_4py_day_dt
     */
    @NotNull(message = "c445_4py_day_dt不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date c4454pyDayDt;

    /**
     * c445_5py_day_dt
     */
    @NotNull(message = "c445_5py_day_dt不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date c4455pyDayDt;

    /**
     * greg_month_cd
     */
    @NotNull(message = "greg_month_cd不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long gregMonthCd;

    /**
     * greg_month_desc
     */
    @NotBlank(message = "greg_month_desc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String gregMonthDesc;

    /**
     * greg_month_nm
     */
    @NotBlank(message = "greg_month_nm不能为空", groups = { AddGroup.class, EditGroup.class })
    private String gregMonthNm;

    /**
     * greg_month_day_nbr
     */
    @NotNull(message = "greg_month_day_nbr不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long gregMonthDayNbr;

    /**
     * greg_quarter_cd
     */
    @NotNull(message = "greg_quarter_cd不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long gregQuarterCd;

    /**
     * greg_quarter_desc
     */
    @NotBlank(message = "greg_quarter_desc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String gregQuarterDesc;

    /**
     * greg_quarter_nm
     */
    @NotBlank(message = "greg_quarter_nm不能为空", groups = { AddGroup.class, EditGroup.class })
    private String gregQuarterNm;

    /**
     * greg_quarter_day_nbr
     */
    @NotNull(message = "greg_quarter_day_nbr不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long gregQuarterDayNbr;

    /**
     * greg_semester_cd
     */
    @NotNull(message = "greg_semester_cd不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long gregSemesterCd;

    /**
     * greg_semester_desc
     */
    @NotBlank(message = "greg_semester_desc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String gregSemesterDesc;

    /**
     * greg_semester_nm
     */
    @NotBlank(message = "greg_semester_nm不能为空", groups = { AddGroup.class, EditGroup.class })
    private String gregSemesterNm;

    /**
     * greg_year_cd
     */
    @NotNull(message = "greg_year_cd不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long gregYearCd;

    /**
     * greg_year_desc
     */
    @NotBlank(message = "greg_year_desc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String gregYearDesc;

    /**
     * c445_month_nm_short
     */
    @NotBlank(message = "c445_month_nm_short不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445MonthNmShort;

    /**
     * c445_week_nm_long
     */
    @NotBlank(message = "c445_week_nm_long不能为空", groups = { AddGroup.class, EditGroup.class })
    private String c445WeekNmLong;

    /**
     * greg_quarter_nm_long
     */
    @NotBlank(message = "greg_quarter_nm_long不能为空", groups = { AddGroup.class, EditGroup.class })
    private String gregQuarterNmLong;

    /**
     * greg_month_nm_short
     */
    @NotBlank(message = "greg_month_nm_short不能为空", groups = { AddGroup.class, EditGroup.class })
    private String gregMonthNmShort;

    /**
     * greg_month_cd_short
     */
    @NotBlank(message = "greg_month_cd_short不能为空", groups = { AddGroup.class, EditGroup.class })
    private String gregMonthCdShort;

    /**
     * Long
     */
    @NotBlank(message = "Long不能为空", groups = { AddGroup.class, EditGroup.class })
    private String Long;

    /**
     * PER_TAG
     */
    @NotBlank(message = "PER_TAG不能为空", groups = { AddGroup.class, EditGroup.class })
    private String perTag;

    /**
     * chinese_week_nbr
     */
    @NotNull(message = "chinese_week_nbr不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long chineseWeekNbr;

    /**
     * chinese_week_desc
     */
    @NotBlank(message = "chinese_week_desc不能为空", groups = { AddGroup.class, EditGroup.class })
    private String chineseWeekDesc;

    /**
     * chinese_week_date_range
     */
    @NotBlank(message = "chinese_week_date_range不能为空", groups = { AddGroup.class, EditGroup.class })
    private String chineseWeekDateRange;

    /**
     * chinese_week_start_dt
     */
    @NotNull(message = "chinese_week_start_dt不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date chineseWeekStartDt;

    /**
     * chinese_week_end_dt
     */
    @NotNull(message = "chinese_week_end_dt不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date chineseWeekEndDt;

    /**
     * day_in_chinese_week
     */
    @NotNull(message = "day_in_chinese_week不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dayInChineseWeek;

    /**
     * day_name
     */
    @NotBlank(message = "day_name不能为空", groups = { AddGroup.class, EditGroup.class })
    private String dayName;

    /**
     * day_in_year
     */
    @NotBlank(message = "day_in_year不能为空", groups = { AddGroup.class, EditGroup.class })
    private String dayInYear;

    /**
     * day_in_quarter
     */
    @NotNull(message = "day_in_quarter不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dayInQuarter;

    /**
     * Daily_Consumption_Days
     */
    @NotNull(message = "Daily_Consumption_Days不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDays;

    /**
     * Daily_Consumption_Days_PY
     */
    @NotNull(message = "Daily_Consumption_Days_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysPy;

    /**
     * Daily_Consumption_Days_2PY
     */
    @NotNull(message = "Daily_Consumption_Days_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDays2py;

    /**
     * Daily_Consumption_Days_MTD
     */
    @NotNull(message = "Daily_Consumption_Days_MTD不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysMtd;

    /**
     * Daily_Consumption_Days_MTD_PY
     */
    @NotNull(message = "Daily_Consumption_Days_MTD_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysMtdPy;

    /**
     * Daily_Consumption_Days_MTD_2PY
     */
    @NotNull(message = "Daily_Consumption_Days_MTD_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysMtd2py;

    /**
     * Daily_Consumption_Days_QTD
     */
    @NotNull(message = "Daily_Consumption_Days_QTD不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysQtd;

    /**
     * Daily_Consumption_Days_QTD_PY
     */
    @NotNull(message = "Daily_Consumption_Days_QTD_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysQtdPy;

    /**
     * Daily_Consumption_Days_QTD_2PY
     */
    @NotNull(message = "Daily_Consumption_Days_QTD_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysQtd2py;

    /**
     * Daily_Consumption_Days_WTD
     */
    @NotNull(message = "Daily_Consumption_Days_WTD不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysWtd;

    /**
     * Daily_Consumption_Days_WTD_PY
     */
    @NotNull(message = "Daily_Consumption_Days_WTD_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysWtdPy;

    /**
     * Daily_Consumption_Days_WTD_2PY
     */
    @NotNull(message = "Daily_Consumption_Days_WTD_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysWtd2py;

    /**
     * Daily_Consumption_Days_YTD
     */
    @NotNull(message = "Daily_Consumption_Days_YTD不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysYtd;

    /**
     * Daily_Consumption_Days_YTD_PY
     */
    @NotNull(message = "Daily_Consumption_Days_YTD_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysYtdPy;

    /**
     * Daily_Consumption_Days_YTD_2PY
     */
    @NotNull(message = "Daily_Consumption_Days_YTD_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long dailyConsumptionDaysYtd2py;

    /**
     * Weekly_Consumption_Days
     */
    @NotNull(message = "Weekly_Consumption_Days不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays;

    /**
     * Weekly_Consumption_Days_PY
     */
    @NotNull(message = "Weekly_Consumption_Days_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDaysPy;

    /**
     * Weekly_Consumption_Days_2PY
     */
    @NotNull(message = "Weekly_Consumption_Days_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays2py;

    /**
     * Weekly_Consumption_Days_03MMT
     */
    @NotNull(message = "Weekly_Consumption_Days_03MMT不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays03mmt;

    /**
     * Weekly_Consumption_Days_03MMT_PY
     */
    @NotNull(message = "Weekly_Consumption_Days_03MMT_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays03mmtPy;

    /**
     * Weekly_Consumption_Days_03MMT_2PY
     */
    @NotNull(message = "Weekly_Consumption_Days_03MMT_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays03mmt2py;

    /**
     * Weekly_Consumption_Days_06MMT
     */
    @NotNull(message = "Weekly_Consumption_Days_06MMT不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays06mmt;

    /**
     * Weekly_Consumption_Days_06MMT_PY
     */
    @NotNull(message = "Weekly_Consumption_Days_06MMT_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays06mmtPy;

    /**
     * Weekly_Consumption_Days_06MMT_2PY
     */
    @NotNull(message = "Weekly_Consumption_Days_06MMT_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays06mmt2py;

    /**
     * Weekly_Consumption_Days_12MMT
     */
    @NotNull(message = "Weekly_Consumption_Days_12MMT不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays12mmt;

    /**
     * Weekly_Consumption_Days_12MMT_PY
     */
    @NotNull(message = "Weekly_Consumption_Days_12MMT_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays12mmtPy;

    /**
     * Weekly_Consumption_Days_12MMT_2PY
     */
    @NotNull(message = "Weekly_Consumption_Days_12MMT_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays12mmt2py;

    /**
     * Weekly_Consumption_Days_13WMT
     */
    @NotNull(message = "Weekly_Consumption_Days_13WMT不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays13wmt;

    /**
     * Weekly_Consumption_Days_13WMT_PY
     */
    @NotNull(message = "Weekly_Consumption_Days_13WMT_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays13wmtPy;

    /**
     * Weekly_Consumption_Days_13WMT_2PY
     */
    @NotNull(message = "Weekly_Consumption_Days_13WMT_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays13wmt2py;

    /**
     * Weekly_Consumption_Days_26WMT
     */
    @NotNull(message = "Weekly_Consumption_Days_26WMT不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays26wmt;

    /**
     * Weekly_Consumption_Days_26WMT_PY
     */
    @NotNull(message = "Weekly_Consumption_Days_26WMT_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays26wmtPy;

    /**
     * Weekly_Consumption_Days_26WMT_2PY
     */
    @NotNull(message = "Weekly_Consumption_Days_26WMT_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays26wmt2py;

    /**
     * Weekly_Consumption_Days_52WMT
     */
    @NotNull(message = "Weekly_Consumption_Days_52WMT不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays52wmt;

    /**
     * Weekly_Consumption_Days_52WMT_PY
     */
    @NotNull(message = "Weekly_Consumption_Days_52WMT_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays52wmtPy;

    /**
     * Weekly_Consumption_Days_52WMT_2PY
     */
    @NotNull(message = "Weekly_Consumption_Days_52WMT_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDays52wmt2py;

    /**
     * Weekly_Consumption_Days_MTD
     */
    @NotNull(message = "Weekly_Consumption_Days_MTD不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDaysMtd;

    /**
     * Weekly_Consumption_Days_MTD_PY
     */
    @NotNull(message = "Weekly_Consumption_Days_MTD_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDaysMtdPy;

    /**
     * Weekly_Consumption_Days_MTD_2PY
     */
    @NotNull(message = "Weekly_Consumption_Days_MTD_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDaysMtd2py;

    /**
     * Weekly_Consumption_Days_QTD
     */
    @NotNull(message = "Weekly_Consumption_Days_QTD不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDaysQtd;

    /**
     * Weekly_Consumption_Days_QTD_PY
     */
    @NotNull(message = "Weekly_Consumption_Days_QTD_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDaysQtdPy;

    /**
     * Weekly_Consumption_Days_QTD_2PY
     */
    @NotNull(message = "Weekly_Consumption_Days_QTD_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDaysQtd2py;

    /**
     * Weekly_Consumption_Days_WTD_PY
     */
    @NotNull(message = "Weekly_Consumption_Days_WTD_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDaysWtdPy;

    /**
     * Weekly_Consumption_Days_WTD_2PY
     */
    @NotNull(message = "Weekly_Consumption_Days_WTD_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDaysWtd2py;

    /**
     * Weekly_Consumption_Days_YTD
     */
    @NotNull(message = "Weekly_Consumption_Days_YTD不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDaysYtd;

    /**
     * Weekly_Consumption_Days_YTD_PY
     */
    @NotNull(message = "Weekly_Consumption_Days_YTD_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDaysYtdPy;

    /**
     * Weekly_Consumption_Days_YTD_2PY
     */
    @NotNull(message = "Weekly_Consumption_Days_YTD_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long weeklyConsumptionDaysYtd2py;

    /**
     * Monthly_Consumption_Days
     */
    @NotNull(message = "Monthly_Consumption_Days不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDays;

    /**
     * Monthly_Consumption_Days_PY
     */
    @NotNull(message = "Monthly_Consumption_Days_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDaysPy;

    /**
     * Monthly_Consumption_Days_2PY
     */
    @NotNull(message = "Monthly_Consumption_Days_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDays2py;

    /**
     * Monthly_Consumption_Days_03MMT
     */
    @NotNull(message = "Monthly_Consumption_Days_03MMT不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDays03mmt;

    /**
     * Monthly_Consumption_Days_03MMT_PY
     */
    @NotNull(message = "Monthly_Consumption_Days_03MMT_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDays03mmtPy;

    /**
     * Monthly_Consumption_Days_03MMT_2PY
     */
    @NotNull(message = "Monthly_Consumption_Days_03MMT_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDays03mmt2py;

    /**
     * Monthly_Consumption_Days_06MMT
     */
    @NotNull(message = "Monthly_Consumption_Days_06MMT不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDays06mmt;

    /**
     * Monthly_Consumption_Days_06MMT_PY
     */
    @NotNull(message = "Monthly_Consumption_Days_06MMT_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDays06mmtPy;

    /**
     * Monthly_Consumption_Days_06MMT_2PY
     */
    @NotNull(message = "Monthly_Consumption_Days_06MMT_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDays06mmt2py;

    /**
     * Monthly_Consumption_Days_12MMT
     */
    @NotNull(message = "Monthly_Consumption_Days_12MMT不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDays12mmt;

    /**
     * Monthly_Consumption_Days_12MMT_PY
     */
    @NotNull(message = "Monthly_Consumption_Days_12MMT_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDays12mmtPy;

    /**
     * Monthly_Consumption_Days_12MMT_2PY
     */
    @NotNull(message = "Monthly_Consumption_Days_12MMT_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDays12mmt2py;

    /**
     * Monthly_Consumption_Days_QTD
     */
    @NotNull(message = "Monthly_Consumption_Days_QTD不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDaysQtd;

    /**
     * Monthly_Consumption_Days_QTD_PY
     */
    @NotNull(message = "Monthly_Consumption_Days_QTD_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDaysQtdPy;

    /**
     * Monthly_Consumption_Days_QTD_2PY
     */
    @NotNull(message = "Monthly_Consumption_Days_QTD_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDaysQtd2py;

    /**
     * Monthly_Consumption_Days_YTD
     */
    @NotNull(message = "Monthly_Consumption_Days_YTD不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDaysYtd;

    /**
     * Monthly_Consumption_Days_YTD_PY
     */
    @NotNull(message = "Monthly_Consumption_Days_YTD_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDaysYtdPy;

    /**
     * Monthly_Consumption_Days_YTD_2PY
     */
    @NotNull(message = "Monthly_Consumption_Days_YTD_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long monthlyConsumptionDaysYtd2py;

    /**
     * Quarterly_Consumption_Days
     */
    @NotNull(message = "Quarterly_Consumption_Days不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long quarterlyConsumptionDays;

    /**
     * Quarterly_Consumption_Days_PY
     */
    @NotNull(message = "Quarterly_Consumption_Days_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long quarterlyConsumptionDaysPy;

    /**
     * Quarterly_Consumption_Days_2PY
     */
    @NotNull(message = "Quarterly_Consumption_Days_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long quarterlyConsumptionDays2py;

    /**
     * Quarterly_Consumption_Days_YTD
     */
    @NotNull(message = "Quarterly_Consumption_Days_YTD不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long quarterlyConsumptionDaysYtd;

    /**
     * Quarterly_Consumption_Days_YTD_PY
     */
    @NotNull(message = "Quarterly_Consumption_Days_YTD_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long quarterlyConsumptionDaysYtdPy;

    /**
     * Quarterly_Consumption_Days_YTD_2PY
     */
    @NotNull(message = "Quarterly_Consumption_Days_YTD_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long quarterlyConsumptionDaysYtd2py;

    /**
     * Yearly_Consumption_Days
     */
    @NotNull(message = "Yearly_Consumption_Days不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long yearlyConsumptionDays;

    /**
     * Yearly_Consumption_Days_PY
     */
    @NotNull(message = "Yearly_Consumption_Days_PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long yearlyConsumptionDaysPy;

    /**
     * Yearly_Consumption_Days_2PY
     */
    @NotNull(message = "Yearly_Consumption_Days_2PY不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long yearlyConsumptionDays2py;

    /**
     * file_name
     */
    @NotBlank(message = "file_name不能为空", groups = { AddGroup.class, EditGroup.class })
    private String fileName;

    /**
     * updated_user
     */
    @NotBlank(message = "updated_user不能为空", groups = { AddGroup.class, EditGroup.class })
    private String updatedUser;

    /**
     * loaded_time
     */
    @NotNull(message = "loaded_time不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date loadedTime;


}
