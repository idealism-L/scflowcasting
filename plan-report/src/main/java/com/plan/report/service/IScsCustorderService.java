package com.plan.report.service;

import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.report.domain.bo.ScsCustorderBo;
import com.plan.report.domain.vo.ScsCustorderVo;

import java.util.Collection;
import java.util.List;

/**
 * scs_custorderService接口
 *
 * @author ruoyi
 * @date 2024-11-26
 */
public interface IScsCustorderService {

    /**
     * 查询scs_custorder
     */
    ScsCustorderVo queryById(Long id);

    /**
     * 查询scs_custorder列表
     */
    TableDataInfo<ScsCustorderVo> queryPageList(ScsCustorderBo bo, PageQuery pageQuery);

    /**
     * 查询scs_custorder列表
     */
    List<ScsCustorderVo> queryList(ScsCustorderBo bo);

    /**
     * 新增scs_custorder
     */
    Boolean insertByBo(ScsCustorderBo bo);

    /**
     * 修改scs_custorder
     */
    Boolean updateByBo(ScsCustorderBo bo);

    /**
     * 校验并批量删除scs_custorder信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
