package com.plan.report.mapper;

import com.plan.report.domain.ScsCalendar;
import com.plan.report.domain.vo.ScsCalendarVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * scs_calendar日历Mapper接口
 *
 * @author ruoyi
 * @date 2024-11-14
 */
@Mapper
public interface ScsCalendarMapper extends BaseMapperPlus<ScsCalendarMapper, ScsCalendar, ScsCalendarVo> {

}
