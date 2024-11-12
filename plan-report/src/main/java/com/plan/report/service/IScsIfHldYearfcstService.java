package com.plan.report.service;

import com.plan.report.domain.ScsIfHldYearfcst;
import com.plan.report.domain.vo.ScsIfHldYearfcstVo;
import com.plan.report.domain.bo.ScsIfHldYearfcstBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_if_hld_yearfcstService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsIfHldYearfcstService {

    /**
     * 查询scs_if_hld_yearfcst
     */
    ScsIfHldYearfcstVo queryById(Long id);

    /**
     * 查询scs_if_hld_yearfcst列表
     */
    TableDataInfo<ScsIfHldYearfcstVo> queryPageList(ScsIfHldYearfcstBo bo, PageQuery pageQuery);

    /**
     * 查询scs_if_hld_yearfcst列表
     */
    List<ScsIfHldYearfcstVo> queryList(ScsIfHldYearfcstBo bo);

    /**
     * 新增scs_if_hld_yearfcst
     */
    Boolean insertByBo(ScsIfHldYearfcstBo bo);

    /**
     * 修改scs_if_hld_yearfcst
     */
    Boolean updateByBo(ScsIfHldYearfcstBo bo);

    /**
     * 校验并批量删除scs_if_hld_yearfcst信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
