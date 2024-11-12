package com.plan.report.service;

import com.plan.report.domain.ScsIfHldFcstFg;
import com.plan.report.domain.vo.ScsIfHldFcstFgVo;
import com.plan.report.domain.bo.ScsIfHldFcstFgBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_if_hld_fcst_fgService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsIfHldFcstFgService {

    /**
     * 查询scs_if_hld_fcst_fg
     */
    ScsIfHldFcstFgVo queryById(Long id);

    /**
     * 查询scs_if_hld_fcst_fg列表
     */
    TableDataInfo<ScsIfHldFcstFgVo> queryPageList(ScsIfHldFcstFgBo bo, PageQuery pageQuery);

    /**
     * 查询scs_if_hld_fcst_fg列表
     */
    List<ScsIfHldFcstFgVo> queryList(ScsIfHldFcstFgBo bo);

    /**
     * 新增scs_if_hld_fcst_fg
     */
    Boolean insertByBo(ScsIfHldFcstFgBo bo);

    /**
     * 修改scs_if_hld_fcst_fg
     */
    Boolean updateByBo(ScsIfHldFcstFgBo bo);

    /**
     * 校验并批量删除scs_if_hld_fcst_fg信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
