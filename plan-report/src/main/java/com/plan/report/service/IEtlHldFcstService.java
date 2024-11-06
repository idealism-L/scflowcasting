package com.plan.report.service;

import com.plan.report.domain.EtlHldFcst;
import com.plan.report.domain.vo.EtlHldFcstVo;
import com.plan.report.domain.bo.EtlHldFcstBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 销售预测Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface IEtlHldFcstService {

    /**
     * 查询销售预测
     */
    EtlHldFcstVo queryById(Long imMainInsuranceConfigId);

    /**
     * 查询销售预测列表
     */
    TableDataInfo<EtlHldFcstVo> queryPageList(EtlHldFcstBo bo, PageQuery pageQuery);

    /**
     * 查询销售预测列表
     */
    List<EtlHldFcstVo> queryList(EtlHldFcstBo bo);

    /**
     * 新增销售预测
     */
    Boolean insertByBo(EtlHldFcstBo bo);

    /**
     * 修改销售预测
     */
    Boolean updateByBo(EtlHldFcstBo bo);

    /**
     * 校验并批量删除销售预测信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
