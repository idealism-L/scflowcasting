package com.plan.report.service;

import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.report.domain.ScsLoc;
import com.plan.report.domain.bo.ScsLocBo;
import com.plan.report.domain.vo.ScsLocVo;

import java.util.Collection;
import java.util.List;

/**
 * scs_locService接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
public interface IScsLocService {

    /**
     * 查询scs_loc
     */
    ScsLocVo queryById(Long id);

    /**
     * 查询scs_loc列表
     */
    TableDataInfo<ScsLocVo> queryPageList(ScsLocBo bo, PageQuery pageQuery);


    /**
     * 根据集团查地点
     */
    List<String> listByCorporation(ScsLocBo bo);

    /**
     * 查询scs_loc列表
     */
    List<ScsLocVo> queryList(ScsLocBo bo);

    /**
     * 新增scs_loc
     */
    Boolean insertByBo(ScsLocBo bo);

    /**
     * 修改scs_loc
     */
    Boolean updateByBo(ScsLocBo bo);

    /**
     * 校验并批量删除scs_loc信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);

    List<ScsLoc> checkUnique(ScsLocBo bo);
}
