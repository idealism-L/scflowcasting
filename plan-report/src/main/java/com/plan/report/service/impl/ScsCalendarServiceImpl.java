package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.ScsCalendar;
import com.plan.report.domain.bo.ScsCalendarBo;
import com.plan.report.domain.vo.ScsCalendarVo;
import com.plan.report.mapper.ScsCalendarMapper;
import com.plan.report.service.IScsCalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_calendar日历Service业务层处理
 *
 * @author ruoyi
 * @date 2024-11-14
 */
@RequiredArgsConstructor
@Service
public class ScsCalendarServiceImpl implements IScsCalendarService {

    private final ScsCalendarMapper baseMapper;

    /**
     * 查询scs_calendar日历
     */
    @Override
    public ScsCalendarVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询scs_calendar日历列表
     */
    @Override
    public TableDataInfo<ScsCalendarVo> queryPageList(ScsCalendarBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<ScsCalendar> lqw = buildQueryWrapper(bo);
        Page<ScsCalendarVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询scs_calendar日历列表
     */
    @Override
    public List<ScsCalendarVo> queryList(ScsCalendarBo bo) {
        LambdaQueryWrapper<ScsCalendar> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<ScsCalendar> buildQueryWrapper(ScsCalendarBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<ScsCalendar> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getDayDt() != null, ScsCalendar::getDayDt, bo.getDayDt());
        lqw.eq(StringUtils.isNotBlank(bo.getDayDesc()), ScsCalendar::getDayDesc, bo.getDayDesc());
        lqw.eq(bo.getC445WeekCd() != null, ScsCalendar::getC445WeekCd, bo.getC445WeekCd());
        lqw.eq(bo.getC445WeekNbr() != null, ScsCalendar::getC445WeekNbr, bo.getC445WeekNbr());
        lqw.eq(StringUtils.isNotBlank(bo.getC445WeekDesc()), ScsCalendar::getC445WeekDesc, bo.getC445WeekDesc());
        lqw.eq(StringUtils.isNotBlank(bo.getC445WeekDateRange()), ScsCalendar::getC445WeekDateRange, bo.getC445WeekDateRange());
        lqw.eq(bo.getC445WeekStartDt() != null, ScsCalendar::getC445WeekStartDt, bo.getC445WeekStartDt());
        lqw.eq(bo.getC445WeekEndDt() != null, ScsCalendar::getC445WeekEndDt, bo.getC445WeekEndDt());
        lqw.eq(bo.getC445MonthCd() != null, ScsCalendar::getC445MonthCd, bo.getC445MonthCd());
        lqw.eq(bo.getC445MonthNbr() != null, ScsCalendar::getC445MonthNbr, bo.getC445MonthNbr());
        lqw.eq(StringUtils.isNotBlank(bo.getC445MonthDesc()), ScsCalendar::getC445MonthDesc, bo.getC445MonthDesc());
        lqw.eq(StringUtils.isNotBlank(bo.getC445MonthNm()), ScsCalendar::getC445MonthNm, bo.getC445MonthNm());
        lqw.eq(StringUtils.isNotBlank(bo.getC445MonthDateRange()), ScsCalendar::getC445MonthDateRange, bo.getC445MonthDateRange());
        lqw.eq(bo.getC445MonthStartDt() != null, ScsCalendar::getC445MonthStartDt, bo.getC445MonthStartDt());
        lqw.eq(bo.getC445MonthEndDt() != null, ScsCalendar::getC445MonthEndDt, bo.getC445MonthEndDt());
        lqw.eq(bo.getC445QuarterCd() != null, ScsCalendar::getC445QuarterCd, bo.getC445QuarterCd());
        lqw.eq(StringUtils.isNotBlank(bo.getC445QuarterDesc()), ScsCalendar::getC445QuarterDesc, bo.getC445QuarterDesc());
        lqw.eq(StringUtils.isNotBlank(bo.getC445QuarterNm()), ScsCalendar::getC445QuarterNm, bo.getC445QuarterNm());
        lqw.eq(StringUtils.isNotBlank(bo.getC445QuarterDateRange()), ScsCalendar::getC445QuarterDateRange, bo.getC445QuarterDateRange());
        lqw.eq(bo.getC445QuarterStartDt() != null, ScsCalendar::getC445QuarterStartDt, bo.getC445QuarterStartDt());
        lqw.eq(bo.getC445QuarterEndDt() != null, ScsCalendar::getC445QuarterEndDt, bo.getC445QuarterEndDt());
        lqw.eq(bo.getC445SemesterCd() != null, ScsCalendar::getC445SemesterCd, bo.getC445SemesterCd());
        lqw.eq(StringUtils.isNotBlank(bo.getC445SemesterDesc()), ScsCalendar::getC445SemesterDesc, bo.getC445SemesterDesc());
        lqw.eq(StringUtils.isNotBlank(bo.getC445SemesterNm()), ScsCalendar::getC445SemesterNm, bo.getC445SemesterNm());
        lqw.eq(bo.getC445YearCd() != null, ScsCalendar::getC445YearCd, bo.getC445YearCd());
        lqw.eq(StringUtils.isNotBlank(bo.getC445YearDesc()), ScsCalendar::getC445YearDesc, bo.getC445YearDesc());
        lqw.eq(bo.getC4451pyDayDt() != null, ScsCalendar::getC4451pyDayDt, bo.getC4451pyDayDt());
        lqw.eq(bo.getC4452pyDayDt() != null, ScsCalendar::getC4452pyDayDt, bo.getC4452pyDayDt());
        lqw.eq(bo.getC4453pyDayDt() != null, ScsCalendar::getC4453pyDayDt, bo.getC4453pyDayDt());
        lqw.eq(bo.getC4454pyDayDt() != null, ScsCalendar::getC4454pyDayDt, bo.getC4454pyDayDt());
        lqw.eq(bo.getC4455pyDayDt() != null, ScsCalendar::getC4455pyDayDt, bo.getC4455pyDayDt());
        lqw.eq(bo.getGregMonthCd() != null, ScsCalendar::getGregMonthCd, bo.getGregMonthCd());
        lqw.eq(StringUtils.isNotBlank(bo.getGregMonthDesc()), ScsCalendar::getGregMonthDesc, bo.getGregMonthDesc());
        lqw.eq(StringUtils.isNotBlank(bo.getGregMonthNm()), ScsCalendar::getGregMonthNm, bo.getGregMonthNm());
        lqw.eq(bo.getGregMonthDayNbr() != null, ScsCalendar::getGregMonthDayNbr, bo.getGregMonthDayNbr());
        lqw.eq(bo.getGregQuarterCd() != null, ScsCalendar::getGregQuarterCd, bo.getGregQuarterCd());
        lqw.eq(StringUtils.isNotBlank(bo.getGregQuarterDesc()), ScsCalendar::getGregQuarterDesc, bo.getGregQuarterDesc());
        lqw.eq(StringUtils.isNotBlank(bo.getGregQuarterNm()), ScsCalendar::getGregQuarterNm, bo.getGregQuarterNm());
        lqw.eq(bo.getGregQuarterDayNbr() != null, ScsCalendar::getGregQuarterDayNbr, bo.getGregQuarterDayNbr());
        lqw.eq(bo.getGregSemesterCd() != null, ScsCalendar::getGregSemesterCd, bo.getGregSemesterCd());
        lqw.eq(StringUtils.isNotBlank(bo.getGregSemesterDesc()), ScsCalendar::getGregSemesterDesc, bo.getGregSemesterDesc());
        lqw.eq(StringUtils.isNotBlank(bo.getGregSemesterNm()), ScsCalendar::getGregSemesterNm, bo.getGregSemesterNm());
        lqw.eq(bo.getGregYearCd() != null, ScsCalendar::getGregYearCd, bo.getGregYearCd());
        lqw.eq(StringUtils.isNotBlank(bo.getGregYearDesc()), ScsCalendar::getGregYearDesc, bo.getGregYearDesc());
        lqw.eq(StringUtils.isNotBlank(bo.getC445MonthNmShort()), ScsCalendar::getC445MonthNmShort, bo.getC445MonthNmShort());
        lqw.eq(StringUtils.isNotBlank(bo.getC445WeekNmLong()), ScsCalendar::getC445WeekNmLong, bo.getC445WeekNmLong());
        lqw.eq(StringUtils.isNotBlank(bo.getGregQuarterNmLong()), ScsCalendar::getGregQuarterNmLong, bo.getGregQuarterNmLong());
        lqw.eq(StringUtils.isNotBlank(bo.getGregMonthNmShort()), ScsCalendar::getGregMonthNmShort, bo.getGregMonthNmShort());
        lqw.eq(StringUtils.isNotBlank(bo.getGregMonthCdShort()), ScsCalendar::getGregMonthCdShort, bo.getGregMonthCdShort());
        lqw.eq(StringUtils.isNotBlank(bo.getLong()), ScsCalendar::getLong, bo.getLong());
        lqw.eq(StringUtils.isNotBlank(bo.getPerTag()), ScsCalendar::getPerTag, bo.getPerTag());
        lqw.eq(bo.getChineseWeekNbr() != null, ScsCalendar::getChineseWeekNbr, bo.getChineseWeekNbr());
        lqw.eq(StringUtils.isNotBlank(bo.getChineseWeekDesc()), ScsCalendar::getChineseWeekDesc, bo.getChineseWeekDesc());
        lqw.eq(StringUtils.isNotBlank(bo.getChineseWeekDateRange()), ScsCalendar::getChineseWeekDateRange, bo.getChineseWeekDateRange());
        lqw.eq(bo.getChineseWeekStartDt() != null, ScsCalendar::getChineseWeekStartDt, bo.getChineseWeekStartDt());
        lqw.eq(bo.getChineseWeekEndDt() != null, ScsCalendar::getChineseWeekEndDt, bo.getChineseWeekEndDt());
        lqw.eq(bo.getDayInChineseWeek() != null, ScsCalendar::getDayInChineseWeek, bo.getDayInChineseWeek());
        lqw.like(StringUtils.isNotBlank(bo.getDayName()), ScsCalendar::getDayName, bo.getDayName());
        lqw.eq(StringUtils.isNotBlank(bo.getDayInYear()), ScsCalendar::getDayInYear, bo.getDayInYear());
        lqw.eq(bo.getDayInQuarter() != null, ScsCalendar::getDayInQuarter, bo.getDayInQuarter());
        lqw.eq(bo.getDailyConsumptionDays() != null, ScsCalendar::getDailyConsumptionDays, bo.getDailyConsumptionDays());
        lqw.eq(bo.getDailyConsumptionDaysPy() != null, ScsCalendar::getDailyConsumptionDaysPy, bo.getDailyConsumptionDaysPy());
        lqw.eq(bo.getDailyConsumptionDays2py() != null, ScsCalendar::getDailyConsumptionDays2py, bo.getDailyConsumptionDays2py());
        lqw.eq(bo.getDailyConsumptionDaysMtd() != null, ScsCalendar::getDailyConsumptionDaysMtd, bo.getDailyConsumptionDaysMtd());
        lqw.eq(bo.getDailyConsumptionDaysMtdPy() != null, ScsCalendar::getDailyConsumptionDaysMtdPy, bo.getDailyConsumptionDaysMtdPy());
        lqw.eq(bo.getDailyConsumptionDaysMtd2py() != null, ScsCalendar::getDailyConsumptionDaysMtd2py, bo.getDailyConsumptionDaysMtd2py());
        lqw.eq(bo.getDailyConsumptionDaysQtd() != null, ScsCalendar::getDailyConsumptionDaysQtd, bo.getDailyConsumptionDaysQtd());
        lqw.eq(bo.getDailyConsumptionDaysQtdPy() != null, ScsCalendar::getDailyConsumptionDaysQtdPy, bo.getDailyConsumptionDaysQtdPy());
        lqw.eq(bo.getDailyConsumptionDaysQtd2py() != null, ScsCalendar::getDailyConsumptionDaysQtd2py, bo.getDailyConsumptionDaysQtd2py());
        lqw.eq(bo.getDailyConsumptionDaysWtd() != null, ScsCalendar::getDailyConsumptionDaysWtd, bo.getDailyConsumptionDaysWtd());
        lqw.eq(bo.getDailyConsumptionDaysWtdPy() != null, ScsCalendar::getDailyConsumptionDaysWtdPy, bo.getDailyConsumptionDaysWtdPy());
        lqw.eq(bo.getDailyConsumptionDaysWtd2py() != null, ScsCalendar::getDailyConsumptionDaysWtd2py, bo.getDailyConsumptionDaysWtd2py());
        lqw.eq(bo.getDailyConsumptionDaysYtd() != null, ScsCalendar::getDailyConsumptionDaysYtd, bo.getDailyConsumptionDaysYtd());
        lqw.eq(bo.getDailyConsumptionDaysYtdPy() != null, ScsCalendar::getDailyConsumptionDaysYtdPy, bo.getDailyConsumptionDaysYtdPy());
        lqw.eq(bo.getDailyConsumptionDaysYtd2py() != null, ScsCalendar::getDailyConsumptionDaysYtd2py, bo.getDailyConsumptionDaysYtd2py());
        lqw.eq(bo.getWeeklyConsumptionDays() != null, ScsCalendar::getWeeklyConsumptionDays, bo.getWeeklyConsumptionDays());
        lqw.eq(bo.getWeeklyConsumptionDaysPy() != null, ScsCalendar::getWeeklyConsumptionDaysPy, bo.getWeeklyConsumptionDaysPy());
        lqw.eq(bo.getWeeklyConsumptionDays2py() != null, ScsCalendar::getWeeklyConsumptionDays2py, bo.getWeeklyConsumptionDays2py());
        lqw.eq(bo.getWeeklyConsumptionDays03mmt() != null, ScsCalendar::getWeeklyConsumptionDays03mmt, bo.getWeeklyConsumptionDays03mmt());
        lqw.eq(bo.getWeeklyConsumptionDays03mmtPy() != null, ScsCalendar::getWeeklyConsumptionDays03mmtPy, bo.getWeeklyConsumptionDays03mmtPy());
        lqw.eq(bo.getWeeklyConsumptionDays03mmt2py() != null, ScsCalendar::getWeeklyConsumptionDays03mmt2py, bo.getWeeklyConsumptionDays03mmt2py());
        lqw.eq(bo.getWeeklyConsumptionDays06mmt() != null, ScsCalendar::getWeeklyConsumptionDays06mmt, bo.getWeeklyConsumptionDays06mmt());
        lqw.eq(bo.getWeeklyConsumptionDays06mmtPy() != null, ScsCalendar::getWeeklyConsumptionDays06mmtPy, bo.getWeeklyConsumptionDays06mmtPy());
        lqw.eq(bo.getWeeklyConsumptionDays06mmt2py() != null, ScsCalendar::getWeeklyConsumptionDays06mmt2py, bo.getWeeklyConsumptionDays06mmt2py());
        lqw.eq(bo.getWeeklyConsumptionDays12mmt() != null, ScsCalendar::getWeeklyConsumptionDays12mmt, bo.getWeeklyConsumptionDays12mmt());
        lqw.eq(bo.getWeeklyConsumptionDays12mmtPy() != null, ScsCalendar::getWeeklyConsumptionDays12mmtPy, bo.getWeeklyConsumptionDays12mmtPy());
        lqw.eq(bo.getWeeklyConsumptionDays12mmt2py() != null, ScsCalendar::getWeeklyConsumptionDays12mmt2py, bo.getWeeklyConsumptionDays12mmt2py());
        lqw.eq(bo.getWeeklyConsumptionDays13wmt() != null, ScsCalendar::getWeeklyConsumptionDays13wmt, bo.getWeeklyConsumptionDays13wmt());
        lqw.eq(bo.getWeeklyConsumptionDays13wmtPy() != null, ScsCalendar::getWeeklyConsumptionDays13wmtPy, bo.getWeeklyConsumptionDays13wmtPy());
        lqw.eq(bo.getWeeklyConsumptionDays13wmt2py() != null, ScsCalendar::getWeeklyConsumptionDays13wmt2py, bo.getWeeklyConsumptionDays13wmt2py());
        lqw.eq(bo.getWeeklyConsumptionDays26wmt() != null, ScsCalendar::getWeeklyConsumptionDays26wmt, bo.getWeeklyConsumptionDays26wmt());
        lqw.eq(bo.getWeeklyConsumptionDays26wmtPy() != null, ScsCalendar::getWeeklyConsumptionDays26wmtPy, bo.getWeeklyConsumptionDays26wmtPy());
        lqw.eq(bo.getWeeklyConsumptionDays26wmt2py() != null, ScsCalendar::getWeeklyConsumptionDays26wmt2py, bo.getWeeklyConsumptionDays26wmt2py());
        lqw.eq(bo.getWeeklyConsumptionDays52wmt() != null, ScsCalendar::getWeeklyConsumptionDays52wmt, bo.getWeeklyConsumptionDays52wmt());
        lqw.eq(bo.getWeeklyConsumptionDays52wmtPy() != null, ScsCalendar::getWeeklyConsumptionDays52wmtPy, bo.getWeeklyConsumptionDays52wmtPy());
        lqw.eq(bo.getWeeklyConsumptionDays52wmt2py() != null, ScsCalendar::getWeeklyConsumptionDays52wmt2py, bo.getWeeklyConsumptionDays52wmt2py());
        lqw.eq(bo.getWeeklyConsumptionDaysMtd() != null, ScsCalendar::getWeeklyConsumptionDaysMtd, bo.getWeeklyConsumptionDaysMtd());
        lqw.eq(bo.getWeeklyConsumptionDaysMtdPy() != null, ScsCalendar::getWeeklyConsumptionDaysMtdPy, bo.getWeeklyConsumptionDaysMtdPy());
        lqw.eq(bo.getWeeklyConsumptionDaysMtd2py() != null, ScsCalendar::getWeeklyConsumptionDaysMtd2py, bo.getWeeklyConsumptionDaysMtd2py());
        lqw.eq(bo.getWeeklyConsumptionDaysQtd() != null, ScsCalendar::getWeeklyConsumptionDaysQtd, bo.getWeeklyConsumptionDaysQtd());
        lqw.eq(bo.getWeeklyConsumptionDaysQtdPy() != null, ScsCalendar::getWeeklyConsumptionDaysQtdPy, bo.getWeeklyConsumptionDaysQtdPy());
        lqw.eq(bo.getWeeklyConsumptionDaysQtd2py() != null, ScsCalendar::getWeeklyConsumptionDaysQtd2py, bo.getWeeklyConsumptionDaysQtd2py());
        lqw.eq(bo.getWeeklyConsumptionDaysWtdPy() != null, ScsCalendar::getWeeklyConsumptionDaysWtdPy, bo.getWeeklyConsumptionDaysWtdPy());
        lqw.eq(bo.getWeeklyConsumptionDaysWtd2py() != null, ScsCalendar::getWeeklyConsumptionDaysWtd2py, bo.getWeeklyConsumptionDaysWtd2py());
        lqw.eq(bo.getWeeklyConsumptionDaysYtd() != null, ScsCalendar::getWeeklyConsumptionDaysYtd, bo.getWeeklyConsumptionDaysYtd());
        lqw.eq(bo.getWeeklyConsumptionDaysYtdPy() != null, ScsCalendar::getWeeklyConsumptionDaysYtdPy, bo.getWeeklyConsumptionDaysYtdPy());
        lqw.eq(bo.getWeeklyConsumptionDaysYtd2py() != null, ScsCalendar::getWeeklyConsumptionDaysYtd2py, bo.getWeeklyConsumptionDaysYtd2py());
        lqw.eq(bo.getMonthlyConsumptionDays() != null, ScsCalendar::getMonthlyConsumptionDays, bo.getMonthlyConsumptionDays());
        lqw.eq(bo.getMonthlyConsumptionDaysPy() != null, ScsCalendar::getMonthlyConsumptionDaysPy, bo.getMonthlyConsumptionDaysPy());
        lqw.eq(bo.getMonthlyConsumptionDays2py() != null, ScsCalendar::getMonthlyConsumptionDays2py, bo.getMonthlyConsumptionDays2py());
        lqw.eq(bo.getMonthlyConsumptionDays03mmt() != null, ScsCalendar::getMonthlyConsumptionDays03mmt, bo.getMonthlyConsumptionDays03mmt());
        lqw.eq(bo.getMonthlyConsumptionDays03mmtPy() != null, ScsCalendar::getMonthlyConsumptionDays03mmtPy, bo.getMonthlyConsumptionDays03mmtPy());
        lqw.eq(bo.getMonthlyConsumptionDays03mmt2py() != null, ScsCalendar::getMonthlyConsumptionDays03mmt2py, bo.getMonthlyConsumptionDays03mmt2py());
        lqw.eq(bo.getMonthlyConsumptionDays06mmt() != null, ScsCalendar::getMonthlyConsumptionDays06mmt, bo.getMonthlyConsumptionDays06mmt());
        lqw.eq(bo.getMonthlyConsumptionDays06mmtPy() != null, ScsCalendar::getMonthlyConsumptionDays06mmtPy, bo.getMonthlyConsumptionDays06mmtPy());
        lqw.eq(bo.getMonthlyConsumptionDays06mmt2py() != null, ScsCalendar::getMonthlyConsumptionDays06mmt2py, bo.getMonthlyConsumptionDays06mmt2py());
        lqw.eq(bo.getMonthlyConsumptionDays12mmt() != null, ScsCalendar::getMonthlyConsumptionDays12mmt, bo.getMonthlyConsumptionDays12mmt());
        lqw.eq(bo.getMonthlyConsumptionDays12mmtPy() != null, ScsCalendar::getMonthlyConsumptionDays12mmtPy, bo.getMonthlyConsumptionDays12mmtPy());
        lqw.eq(bo.getMonthlyConsumptionDays12mmt2py() != null, ScsCalendar::getMonthlyConsumptionDays12mmt2py, bo.getMonthlyConsumptionDays12mmt2py());
        lqw.eq(bo.getMonthlyConsumptionDaysQtd() != null, ScsCalendar::getMonthlyConsumptionDaysQtd, bo.getMonthlyConsumptionDaysQtd());
        lqw.eq(bo.getMonthlyConsumptionDaysQtdPy() != null, ScsCalendar::getMonthlyConsumptionDaysQtdPy, bo.getMonthlyConsumptionDaysQtdPy());
        lqw.eq(bo.getMonthlyConsumptionDaysQtd2py() != null, ScsCalendar::getMonthlyConsumptionDaysQtd2py, bo.getMonthlyConsumptionDaysQtd2py());
        lqw.eq(bo.getMonthlyConsumptionDaysYtd() != null, ScsCalendar::getMonthlyConsumptionDaysYtd, bo.getMonthlyConsumptionDaysYtd());
        lqw.eq(bo.getMonthlyConsumptionDaysYtdPy() != null, ScsCalendar::getMonthlyConsumptionDaysYtdPy, bo.getMonthlyConsumptionDaysYtdPy());
        lqw.eq(bo.getMonthlyConsumptionDaysYtd2py() != null, ScsCalendar::getMonthlyConsumptionDaysYtd2py, bo.getMonthlyConsumptionDaysYtd2py());
        lqw.eq(bo.getQuarterlyConsumptionDays() != null, ScsCalendar::getQuarterlyConsumptionDays, bo.getQuarterlyConsumptionDays());
        lqw.eq(bo.getQuarterlyConsumptionDaysPy() != null, ScsCalendar::getQuarterlyConsumptionDaysPy, bo.getQuarterlyConsumptionDaysPy());
        lqw.eq(bo.getQuarterlyConsumptionDays2py() != null, ScsCalendar::getQuarterlyConsumptionDays2py, bo.getQuarterlyConsumptionDays2py());
        lqw.eq(bo.getQuarterlyConsumptionDaysYtd() != null, ScsCalendar::getQuarterlyConsumptionDaysYtd, bo.getQuarterlyConsumptionDaysYtd());
        lqw.eq(bo.getQuarterlyConsumptionDaysYtdPy() != null, ScsCalendar::getQuarterlyConsumptionDaysYtdPy, bo.getQuarterlyConsumptionDaysYtdPy());
        lqw.eq(bo.getQuarterlyConsumptionDaysYtd2py() != null, ScsCalendar::getQuarterlyConsumptionDaysYtd2py, bo.getQuarterlyConsumptionDaysYtd2py());
        lqw.eq(bo.getYearlyConsumptionDays() != null, ScsCalendar::getYearlyConsumptionDays, bo.getYearlyConsumptionDays());
        lqw.eq(bo.getYearlyConsumptionDaysPy() != null, ScsCalendar::getYearlyConsumptionDaysPy, bo.getYearlyConsumptionDaysPy());
        lqw.eq(bo.getYearlyConsumptionDays2py() != null, ScsCalendar::getYearlyConsumptionDays2py, bo.getYearlyConsumptionDays2py());
        lqw.like(StringUtils.isNotBlank(bo.getFileName()), ScsCalendar::getFileName, bo.getFileName());
        lqw.eq(StringUtils.isNotBlank(bo.getUpdatedUser()), ScsCalendar::getUpdatedUser, bo.getUpdatedUser());
        lqw.eq(bo.getLoadedTime() != null, ScsCalendar::getLoadedTime, bo.getLoadedTime());
        return lqw;
    }

    /**
     * 新增scs_calendar日历
     */
    @Override
    public Boolean insertByBo(ScsCalendarBo bo) {
        ScsCalendar add = BeanUtil.toBean(bo, ScsCalendar.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改scs_calendar日历
     */
    @Override
    public Boolean updateByBo(ScsCalendarBo bo) {
        ScsCalendar update = BeanUtil.toBean(bo, ScsCalendar.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(ScsCalendar entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除scs_calendar日历
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
