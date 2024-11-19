package com.plan.report.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.report.domain.ScsBppMaster;
import com.plan.report.domain.bo.ScsBppMasterBo;
import com.plan.report.domain.vo.ScsBppMasterVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * scs_bpp_masterMapper接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Mapper
public interface ScsBppMasterMapper extends BaseMapperPlus<ScsBppMasterMapper, ScsBppMaster, ScsBppMasterVo> {

    Page<ScsBppMasterVo> selectListVoPage(Page<Object> build, @Param("param") ScsBppMasterBo bo);

    List<ScsBppMasterVo> selectListVo(@Param("param") ScsBppMasterBo bo);
}
