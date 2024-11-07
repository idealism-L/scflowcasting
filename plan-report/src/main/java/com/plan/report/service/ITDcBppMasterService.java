package com.plan.report.service;

import com.plan.report.domain.TDcBppMaster;
import com.plan.report.domain.vo.TDcBppMasterVo;
import com.plan.report.domain.bo.TDcBppMasterBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * BPP映射Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface ITDcBppMasterService {

    /**
     * 查询BPP映射
     */
    TDcBppMasterVo queryById(Long id);

    /**
     * 查询BPP映射列表
     */
    TableDataInfo<TDcBppMasterVo> queryPageList(TDcBppMasterBo bo, PageQuery pageQuery);

    /**
     * 查询BPP映射列表
     */
    List<TDcBppMasterVo> queryList(TDcBppMasterBo bo);

    /**
     * 新增BPP映射
     */
    Boolean insertByBo(TDcBppMasterBo bo);

    /**
     * 修改BPP映射
     */
    Boolean updateByBo(TDcBppMasterBo bo);

    /**
     * 校验并批量删除BPP映射信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
