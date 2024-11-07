package com.plan.report.mapper;

import com.plan.report.domain.TDcCalendar;
import com.plan.report.domain.vo.TDcCalendarVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * 日历Mapper接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Mapper
public interface TDcCalendarMapper extends BaseMapperPlus<TDcCalendarMapper, TDcCalendar, TDcCalendarVo> {

}
