package com.plan.report.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.report.domain.ScsCalendar;
import com.plan.report.domain.bo.ScsCalendarBo;
import com.plan.report.domain.vo.ScsCalendarVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * scs_calendar日历Mapper接口
 *
 * @author ruoyi
 * @date 2024-11-14
 */
@Mapper
public interface ScsCalendarMapper extends BaseMapperPlus<ScsCalendarMapper, ScsCalendar, ScsCalendarVo> {

    Page<ScsCalendarVo> selectListVoPage(Page<Object> build, @Param("param") ScsCalendarBo bo);

    List<ScsCalendarVo> selectListVo(@Param("param") ScsCalendarBo bo);
}
