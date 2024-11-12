package com.plan.report.service;

import com.plan.report.domain.ScsFlowcastingOutput;
import com.plan.report.domain.vo.ScsFlowcastingOutputVo;
import com.plan.report.domain.bo.ScsFlowcastingOutputBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_flowcasting_outputService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsFlowcastingOutputService {

    /**
     * 查询scs_flowcasting_output
     */
    ScsFlowcastingOutputVo queryById(Long id);

    /**
     * 查询scs_flowcasting_output列表
     */
    TableDataInfo<ScsFlowcastingOutputVo> queryPageList(ScsFlowcastingOutputBo bo, PageQuery pageQuery);

    /**
     * 查询scs_flowcasting_output列表
     */
    List<ScsFlowcastingOutputVo> queryList(ScsFlowcastingOutputBo bo);

    /**
     * 新增scs_flowcasting_output
     */
    Boolean insertByBo(ScsFlowcastingOutputBo bo);

    /**
     * 修改scs_flowcasting_output
     */
    Boolean updateByBo(ScsFlowcastingOutputBo bo);

    /**
     * 校验并批量删除scs_flowcasting_output信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
