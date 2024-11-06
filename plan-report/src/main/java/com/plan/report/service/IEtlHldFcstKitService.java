package com.plan.report.service;

import com.plan.report.domain.EtlHldFcstKit;
import com.plan.report.domain.vo.EtlHldFcstKitVo;
import com.plan.report.domain.bo.EtlHldFcstKitBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 主剂需求预测Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface IEtlHldFcstKitService {

    /**
     * 查询主剂需求预测
     */
    EtlHldFcstKitVo queryById(Long imMainInsuranceConfigId);

    /**
     * 查询主剂需求预测列表
     */
    TableDataInfo<EtlHldFcstKitVo> queryPageList(EtlHldFcstKitBo bo, PageQuery pageQuery);

    /**
     * 查询主剂需求预测列表
     */
    List<EtlHldFcstKitVo> queryList(EtlHldFcstKitBo bo);

    /**
     * 新增主剂需求预测
     */
    Boolean insertByBo(EtlHldFcstKitBo bo);

    /**
     * 修改主剂需求预测
     */
    Boolean updateByBo(EtlHldFcstKitBo bo);

    /**
     * 校验并批量删除主剂需求预测信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
