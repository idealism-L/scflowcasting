package com.plan.report.service;

import com.plan.report.domain.ScsIfClnItem;
import com.plan.report.domain.vo.ScsIfClnItemVo;
import com.plan.report.domain.bo.ScsIfClnItemBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_if_cln_itemService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsIfClnItemService {

    /**
     * 查询scs_if_cln_item
     */
    ScsIfClnItemVo queryById(Long id);

    /**
     * 查询scs_if_cln_item列表
     */
    TableDataInfo<ScsIfClnItemVo> queryPageList(ScsIfClnItemBo bo, PageQuery pageQuery);

    /**
     * 查询scs_if_cln_item列表
     */
    List<ScsIfClnItemVo> queryList(ScsIfClnItemBo bo);

    /**
     * 新增scs_if_cln_item
     */
    Boolean insertByBo(ScsIfClnItemBo bo);

    /**
     * 修改scs_if_cln_item
     */
    Boolean updateByBo(ScsIfClnItemBo bo);

    /**
     * 校验并批量删除scs_if_cln_item信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
