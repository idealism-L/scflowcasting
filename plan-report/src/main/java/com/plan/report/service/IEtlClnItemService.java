package com.plan.report.service;

import com.plan.report.domain.EtlClnItem;
import com.plan.report.domain.vo.EtlClnItemVo;
import com.plan.report.domain.bo.EtlClnItemBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 物料编码Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface IEtlClnItemService {

    /**
     * 查询物料编码
     */
    EtlClnItemVo queryById(Long imMainInsuranceConfigId);

    /**
     * 查询物料编码列表
     */
    TableDataInfo<EtlClnItemVo> queryPageList(EtlClnItemBo bo, PageQuery pageQuery);

    /**
     * 查询物料编码列表
     */
    List<EtlClnItemVo> queryList(EtlClnItemBo bo);

    /**
     * 新增物料编码
     */
    Boolean insertByBo(EtlClnItemBo bo);

    /**
     * 修改物料编码
     */
    Boolean updateByBo(EtlClnItemBo bo);

    /**
     * 校验并批量删除物料编码信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
