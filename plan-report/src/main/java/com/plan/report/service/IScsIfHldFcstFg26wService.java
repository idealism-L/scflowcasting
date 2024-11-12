package com.plan.report.service;

import com.plan.report.domain.ScsIfHldFcstFg26w;
import com.plan.report.domain.vo.ScsIfHldFcstFg26wVo;
import com.plan.report.domain.bo.ScsIfHldFcstFg26wBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_if_hld_fcst_fg_26wService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsIfHldFcstFg26wService {

    /**
     * 查询scs_if_hld_fcst_fg_26w
     */
    ScsIfHldFcstFg26wVo queryById(Long id);

    /**
     * 查询scs_if_hld_fcst_fg_26w列表
     */
    TableDataInfo<ScsIfHldFcstFg26wVo> queryPageList(ScsIfHldFcstFg26wBo bo, PageQuery pageQuery);

    /**
     * 查询scs_if_hld_fcst_fg_26w列表
     */
    List<ScsIfHldFcstFg26wVo> queryList(ScsIfHldFcstFg26wBo bo);

    /**
     * 新增scs_if_hld_fcst_fg_26w
     */
    Boolean insertByBo(ScsIfHldFcstFg26wBo bo);

    /**
     * 修改scs_if_hld_fcst_fg_26w
     */
    Boolean updateByBo(ScsIfHldFcstFg26wBo bo);

    /**
     * 校验并批量删除scs_if_hld_fcst_fg_26w信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
