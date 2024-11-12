package com.plan.report.service;

import com.plan.report.domain.ScsIfHldCustorder;
import com.plan.report.domain.vo.ScsIfHldCustorderVo;
import com.plan.report.domain.bo.ScsIfHldCustorderBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_if_hld_custorderService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsIfHldCustorderService {

    /**
     * 查询scs_if_hld_custorder
     */
    ScsIfHldCustorderVo queryById(Long id);

    /**
     * 查询scs_if_hld_custorder列表
     */
    TableDataInfo<ScsIfHldCustorderVo> queryPageList(ScsIfHldCustorderBo bo, PageQuery pageQuery);

    /**
     * 查询scs_if_hld_custorder列表
     */
    List<ScsIfHldCustorderVo> queryList(ScsIfHldCustorderBo bo);

    /**
     * 新增scs_if_hld_custorder
     */
    Boolean insertByBo(ScsIfHldCustorderBo bo);

    /**
     * 修改scs_if_hld_custorder
     */
    Boolean updateByBo(ScsIfHldCustorderBo bo);

    /**
     * 校验并批量删除scs_if_hld_custorder信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
