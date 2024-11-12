package com.plan.report.service;

import com.plan.report.domain.ScsCalendar;
import com.plan.report.domain.vo.ScsCalendarVo;
import com.plan.report.domain.bo.ScsCalendarBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_calendarService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsCalendarService {

    /**
     * 查询scs_calendar
     */
    ScsCalendarVo queryById(Long id);

    /**
     * 查询scs_calendar列表
     */
    TableDataInfo<ScsCalendarVo> queryPageList(ScsCalendarBo bo, PageQuery pageQuery);

    /**
     * 查询scs_calendar列表
     */
    List<ScsCalendarVo> queryList(ScsCalendarBo bo);

    /**
     * 新增scs_calendar
     */
    Boolean insertByBo(ScsCalendarBo bo);

    /**
     * 修改scs_calendar
     */
    Boolean updateByBo(ScsCalendarBo bo);

    /**
     * 校验并批量删除scs_calendar信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
