package com.plan.report.service;

import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.report.domain.bo.ScsFgFcstBo;
import com.plan.report.domain.vo.ScsFgFcstVo;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * scs_fg_fcstService接口
 *
 * @author ruoyi
 * @date 2024-11-26
 */
public interface IScsFgFcstService {

    /**
     * 查询scs_fg_fcst
     */
    ScsFgFcstVo queryById(Long id);

    /**
     * 查询scs_fg_fcst列表
     */
    TableDataInfo<ScsFgFcstVo> queryPageList(ScsFgFcstBo bo, PageQuery pageQuery);

    /**
     * 查询scs_fg_fcst列表
     */
    List<ScsFgFcstVo> queryList(ScsFgFcstBo bo);

    TableDataInfo<ScsFgFcstVo> queryPageListCorporation(ScsFgFcstBo bo, PageQuery pageQuery);

    /**
     * 新增scs_fg_fcst
     */
    Boolean insertByBo(ScsFgFcstBo bo);

    /**
     * 修改scs_fg_fcst
     */
    Boolean updateByBo(ScsFgFcstBo bo);

    /**
     * 校验并批量删除scs_fg_fcst信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);

    List<Map<String, Object>> getCorporationExportData(ScsFgFcstBo bo);
}
