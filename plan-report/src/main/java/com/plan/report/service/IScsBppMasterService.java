package com.plan.report.service;

import com.plan.report.domain.ScsBppMaster;
import com.plan.report.domain.vo.ScsBppMasterVo;
import com.plan.report.domain.bo.ScsBppMasterBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * scs_bpp_masterService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsBppMasterService {

    /**
     * 查询scs_bpp_master
     */
    ScsBppMasterVo queryById(Long id);

    /**
     * 查询scs_bpp_master列表
     */
    TableDataInfo<ScsBppMasterVo> queryPageList(ScsBppMasterBo bo, PageQuery pageQuery);

    /**
     * 查询scs_bpp_master列表
     */
    List<ScsBppMasterVo> queryList(ScsBppMasterBo bo);

    /**
     * 新增scs_bpp_master
     */
    Boolean insertByBo(ScsBppMasterBo bo);

    /**
     * 修改scs_bpp_master
     */
    Boolean updateByBo(ScsBppMasterBo bo);

    /**
     * 校验并批量删除scs_bpp_master信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
