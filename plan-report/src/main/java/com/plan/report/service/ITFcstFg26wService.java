package com.plan.report.service;

import com.plan.report.domain.TFcstFg26w;
import com.plan.report.domain.vo.TFcstFg26wVo;
import com.plan.report.domain.bo.TFcstFg26wBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * t_fcst_fg_26wService接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface ITFcstFg26wService {

    /**
     * 查询t_fcst_fg_26w
     */
    TFcstFg26wVo queryById(Long imMainInsuranceConfigId);

    /**
     * 查询t_fcst_fg_26w列表
     */
    TableDataInfo<TFcstFg26wVo> queryPageList(TFcstFg26wBo bo, PageQuery pageQuery);

    /**
     * 查询t_fcst_fg_26w列表
     */
    List<TFcstFg26wVo> queryList(TFcstFg26wBo bo);

    /**
     * 新增t_fcst_fg_26w
     */
    Boolean insertByBo(TFcstFg26wBo bo);

    /**
     * 修改t_fcst_fg_26w
     */
    Boolean updateByBo(TFcstFg26wBo bo);

    /**
     * 校验并批量删除t_fcst_fg_26w信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
