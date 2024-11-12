package com.plan.report.service;

import com.plan.report.domain.ScsIfHldFcst;
import com.plan.report.domain.vo.ScsIfHldFcstVo;
import com.plan.report.domain.bo.ScsIfHldFcstBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_if_hld_fcstService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsIfHldFcstService {

    /**
     * 查询scs_if_hld_fcst
     */
    ScsIfHldFcstVo queryById(Long id);

    /**
     * 查询scs_if_hld_fcst列表
     */
    TableDataInfo<ScsIfHldFcstVo> queryPageList(ScsIfHldFcstBo bo, PageQuery pageQuery);

    /**
     * 查询scs_if_hld_fcst列表
     */
    List<ScsIfHldFcstVo> queryList(ScsIfHldFcstBo bo);

    /**
     * 新增scs_if_hld_fcst
     */
    Boolean insertByBo(ScsIfHldFcstBo bo);

    /**
     * 修改scs_if_hld_fcst
     */
    Boolean updateByBo(ScsIfHldFcstBo bo);

    /**
     * 校验并批量删除scs_if_hld_fcst信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
