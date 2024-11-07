package com.plan.report.service;

import com.plan.report.domain.EtlHldFcstKit26w;
import com.plan.report.domain.vo.EtlHldFcstKit26wVo;
import com.plan.report.domain.bo.EtlHldFcstKit26wBo;
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
public interface IEtlHldFcstKit26wService {

    /**
     * 查询主剂需求预测
     */
    EtlHldFcstKit26wVo queryById(Long id);

    /**
     * 查询主剂需求预测列表
     */
    TableDataInfo<EtlHldFcstKit26wVo> queryPageList(EtlHldFcstKit26wBo bo, PageQuery pageQuery);

    /**
     * 查询主剂需求预测列表
     */
    List<EtlHldFcstKit26wVo> queryList(EtlHldFcstKit26wBo bo);

    /**
     * 新增主剂需求预测
     */
    Boolean insertByBo(EtlHldFcstKit26wBo bo);

    /**
     * 修改主剂需求预测
     */
    Boolean updateByBo(EtlHldFcstKit26wBo bo);

    /**
     * 校验并批量删除主剂需求预测信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
