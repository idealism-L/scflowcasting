package com.plan.report.service;

import com.plan.report.domain.TDcCalendar;
import com.plan.report.domain.vo.TDcCalendarVo;
import com.plan.report.domain.bo.TDcCalendarBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 日历Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface ITDcCalendarService {

    /**
     * 查询日历
     */
    TDcCalendarVo queryById(Long id);

    /**
     * 查询日历列表
     */
    TableDataInfo<TDcCalendarVo> queryPageList(TDcCalendarBo bo, PageQuery pageQuery);

    /**
     * 查询日历列表
     */
    List<TDcCalendarVo> queryList(TDcCalendarBo bo);

    /**
     * 新增日历
     */
    Boolean insertByBo(TDcCalendarBo bo);

    /**
     * 修改日历
     */
    Boolean updateByBo(TDcCalendarBo bo);

    /**
     * 校验并批量删除日历信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
