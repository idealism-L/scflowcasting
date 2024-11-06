package com.plan.report.service;

import com.plan.report.domain.EtlHldFcstFg;
import com.plan.report.domain.vo.EtlHldFcstFgVo;
import com.plan.report.domain.bo.EtlHldFcstFgBo;
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
public interface IEtlHldFcstFgService {

    /**
     * 查询成品销售预测
     */
    EtlHldFcstFgVo queryById(Long imMainInsuranceConfigId);

    /**
     * 查询成品销售预测列表
     */
    TableDataInfo<EtlHldFcstFgVo> queryPageList(EtlHldFcstFgBo bo, PageQuery pageQuery);

    /**
     * 查询成品销售预测列表
     */
    List<EtlHldFcstFgVo> queryList(EtlHldFcstFgBo bo);

    /**
     * 新增成品销售预测
     */
    Boolean insertByBo(EtlHldFcstFgBo bo);

    /**
     * 修改成品销售预测
     */
    Boolean updateByBo(EtlHldFcstFgBo bo);

    /**
     * 校验并批量删除成品销售预测信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
