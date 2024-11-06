package com.plan.report.service;

import com.plan.report.domain.EtlHldFcstFg26w;
import com.plan.report.domain.vo.EtlHldFcstFg26wVo;
import com.plan.report.domain.bo.EtlHldFcstFg26wBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 成品销售预测Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface IEtlHldFcstFg26wService {

    /**
     * 查询成品销售预测
     */
    EtlHldFcstFg26wVo queryById(Long imMainInsuranceConfigId);

    /**
     * 查询成品销售预测列表
     */
    TableDataInfo<EtlHldFcstFg26wVo> queryPageList(EtlHldFcstFg26wBo bo, PageQuery pageQuery);

    /**
     * 查询成品销售预测列表
     */
    List<EtlHldFcstFg26wVo> queryList(EtlHldFcstFg26wBo bo);

    /**
     * 新增成品销售预测
     */
    Boolean insertByBo(EtlHldFcstFg26wBo bo);

    /**
     * 修改成品销售预测
     */
    Boolean updateByBo(EtlHldFcstFg26wBo bo);

    /**
     * 校验并批量删除成品销售预测信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
