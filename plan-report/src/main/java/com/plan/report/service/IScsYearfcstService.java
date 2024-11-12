package com.plan.report.service;

import com.plan.report.domain.ScsYearfcst;
import com.plan.report.domain.vo.ScsYearfcstVo;
import com.plan.report.domain.bo.ScsYearfcstBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_yearfcstService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsYearfcstService {

    /**
     * 查询scs_yearfcst
     */
    ScsYearfcstVo queryById(Long id);

    /**
     * 查询scs_yearfcst列表
     */
    TableDataInfo<ScsYearfcstVo> queryPageList(ScsYearfcstBo bo, PageQuery pageQuery);

    /**
     * 查询scs_yearfcst列表
     */
    List<ScsYearfcstVo> queryList(ScsYearfcstBo bo);

    /**
     * 新增scs_yearfcst
     */
    Boolean insertByBo(ScsYearfcstBo bo);

    /**
     * 修改scs_yearfcst
     */
    Boolean updateByBo(ScsYearfcstBo bo);

    /**
     * 校验并批量删除scs_yearfcst信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
