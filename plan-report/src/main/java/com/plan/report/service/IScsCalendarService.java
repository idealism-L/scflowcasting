package com.plan.report.service;

import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.report.domain.bo.ScsCalendarBo;
import com.plan.report.domain.vo.ScsCalendarVo;

import java.util.Collection;
import java.util.List;

/**
 * scs_calendar日历Service接口
 *
 * @author ruoyi
 * @date 2024-11-14
 */
public interface IScsCalendarService {

    /**
     * 查询scs_calendar日历
     */
    ScsCalendarVo queryById(Long id);

    /**
     * 查询scs_calendar日历列表
     */
    TableDataInfo<ScsCalendarVo> queryPageList(ScsCalendarBo bo, PageQuery pageQuery);

    /**
     * 查询scs_calendar日历列表
     */
    List<ScsCalendarVo> queryList(ScsCalendarBo bo);

    /**
     * 新增scs_calendar日历
     */
    Boolean insertByBo(ScsCalendarBo bo);

    /**
     * 修改scs_calendar日历
     */
    Boolean updateByBo(ScsCalendarBo bo);

    /**
     * 校验并批量删除scs_calendar日历信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
