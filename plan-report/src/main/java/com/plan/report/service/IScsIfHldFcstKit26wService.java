package com.plan.report.service;

import com.plan.report.domain.ScsIfHldFcstKit26w;
import com.plan.report.domain.vo.ScsIfHldFcstKit26wVo;
import com.plan.report.domain.bo.ScsIfHldFcstKit26wBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_if_hld_fcst_kit_26wService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsIfHldFcstKit26wService {

    /**
     * 查询scs_if_hld_fcst_kit_26w
     */
    ScsIfHldFcstKit26wVo queryById(Long id);

    /**
     * 查询scs_if_hld_fcst_kit_26w列表
     */
    TableDataInfo<ScsIfHldFcstKit26wVo> queryPageList(ScsIfHldFcstKit26wBo bo, PageQuery pageQuery);

    /**
     * 查询scs_if_hld_fcst_kit_26w列表
     */
    List<ScsIfHldFcstKit26wVo> queryList(ScsIfHldFcstKit26wBo bo);

    /**
     * 新增scs_if_hld_fcst_kit_26w
     */
    Boolean insertByBo(ScsIfHldFcstKit26wBo bo);

    /**
     * 修改scs_if_hld_fcst_kit_26w
     */
    Boolean updateByBo(ScsIfHldFcstKit26wBo bo);

    /**
     * 校验并批量删除scs_if_hld_fcst_kit_26w信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
