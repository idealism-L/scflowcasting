package com.plan.report.service;

import com.plan.report.domain.ScsKitFcst;
import com.plan.report.domain.vo.ScsKitFcstVo;
import com.plan.report.domain.bo.ScsKitFcstBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_kit_fcstService接口
 *
 * @author ruoyi
 * @date 2024-11-13
 */
public interface IScsKitFcstService {

    /**
     * 查询scs_kit_fcst
     */
    ScsKitFcstVo queryById(Long id);

    /**
     * 查询scs_kit_fcst列表
     */
    TableDataInfo<ScsKitFcstVo> queryPageList(ScsKitFcstBo bo, PageQuery pageQuery);

    /**
     * 查询scs_kit_fcst列表
     */
    List<ScsKitFcstVo> queryList(ScsKitFcstBo bo);

    /**
     * 新增scs_kit_fcst
     */
    Boolean insertByBo(ScsKitFcstBo bo);

    /**
     * 修改scs_kit_fcst
     */
    Boolean updateByBo(ScsKitFcstBo bo);

    /**
     * 校验并批量删除scs_kit_fcst信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
