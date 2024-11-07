package com.plan.report.service;

import com.plan.report.domain.EtlHldYearfcst;
import com.plan.report.domain.vo.EtlHldYearfcstVo;
import com.plan.report.domain.bo.EtlHldYearfcstBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 年预测Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface IEtlHldYearfcstService {

    /**
     * 查询年预测
     */
    EtlHldYearfcstVo queryById(Long id);

    /**
     * 查询年预测列表
     */
    TableDataInfo<EtlHldYearfcstVo> queryPageList(EtlHldYearfcstBo bo, PageQuery pageQuery);

    /**
     * 查询年预测列表
     */
    List<EtlHldYearfcstVo> queryList(EtlHldYearfcstBo bo);

    /**
     * 新增年预测
     */
    Boolean insertByBo(EtlHldYearfcstBo bo);

    /**
     * 修改年预测
     */
    Boolean updateByBo(EtlHldYearfcstBo bo);

    /**
     * 校验并批量删除年预测信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
