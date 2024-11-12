package com.plan.report.service;

import com.plan.report.domain.ScsIfHldFcstKit;
import com.plan.report.domain.vo.ScsIfHldFcstKitVo;
import com.plan.report.domain.bo.ScsIfHldFcstKitBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_if_hld_fcst_kitService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsIfHldFcstKitService {

    /**
     * 查询scs_if_hld_fcst_kit
     */
    ScsIfHldFcstKitVo queryById(Long id);

    /**
     * 查询scs_if_hld_fcst_kit列表
     */
    TableDataInfo<ScsIfHldFcstKitVo> queryPageList(ScsIfHldFcstKitBo bo, PageQuery pageQuery);

    /**
     * 查询scs_if_hld_fcst_kit列表
     */
    List<ScsIfHldFcstKitVo> queryList(ScsIfHldFcstKitBo bo);

    /**
     * 新增scs_if_hld_fcst_kit
     */
    Boolean insertByBo(ScsIfHldFcstKitBo bo);

    /**
     * 修改scs_if_hld_fcst_kit
     */
    Boolean updateByBo(ScsIfHldFcstKitBo bo);

    /**
     * 校验并批量删除scs_if_hld_fcst_kit信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
