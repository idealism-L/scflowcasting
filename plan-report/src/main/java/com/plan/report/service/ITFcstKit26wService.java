package com.plan.report.service;

import com.plan.report.domain.TFcstKit26w;
import com.plan.report.domain.vo.TFcstKit26wVo;
import com.plan.report.domain.bo.TFcstKit26wBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * t_fcst_kit_26wService接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface ITFcstKit26wService {

    /**
     * 查询t_fcst_kit_26w
     */
    TFcstKit26wVo queryById(Long imMainInsuranceConfigId);

    /**
     * 查询t_fcst_kit_26w列表
     */
    TableDataInfo<TFcstKit26wVo> queryPageList(TFcstKit26wBo bo, PageQuery pageQuery);

    /**
     * 查询t_fcst_kit_26w列表
     */
    List<TFcstKit26wVo> queryList(TFcstKit26wBo bo);

    /**
     * 新增t_fcst_kit_26w
     */
    Boolean insertByBo(TFcstKit26wBo bo);

    /**
     * 修改t_fcst_kit_26w
     */
    Boolean updateByBo(TFcstKit26wBo bo);

    /**
     * 校验并批量删除t_fcst_kit_26w信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
