package com.plan.report.service;

import com.plan.report.domain.ScsItem;
import com.plan.report.domain.vo.ScsItemVo;
import com.plan.report.domain.bo.ScsItemBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_itemService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsItemService {

    /**
     * 查询scs_item
     */
    ScsItemVo queryById(Long id);

    /**
     * 查询scs_item列表
     */
    TableDataInfo<ScsItemVo> queryPageList(ScsItemBo bo, PageQuery pageQuery);

    /**
     * 查询scs_item列表
     */
    List<ScsItemVo> queryList(ScsItemBo bo);

    /**
     * 新增scs_item
     */
    Boolean insertByBo(ScsItemBo bo);

    /**
     * 修改scs_item
     */
    Boolean updateByBo(ScsItemBo bo);

    /**
     * 校验并批量删除scs_item信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
