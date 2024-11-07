package com.plan.report.service;

import com.plan.report.domain.TDcLoc;
import com.plan.report.domain.vo.TDcLocVo;
import com.plan.report.domain.bo.TDcLocBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 地点Service接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
public interface ITDcLocService {

    /**
     * 查询地点
     */
    TDcLocVo queryById(Long id);

    /**
     * 查询地点列表
     */
    TableDataInfo<TDcLocVo> queryPageList(TDcLocBo bo, PageQuery pageQuery);

    /**
     * 查询地点列表
     */
    List<TDcLocVo> queryList(TDcLocBo bo);

    /**
     * 新增地点
     */
    Boolean insertByBo(TDcLocBo bo);

    /**
     * 修改地点
     */
    Boolean updateByBo(TDcLocBo bo);

    /**
     * 校验并批量删除地点信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
