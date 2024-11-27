package com.plan.report.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.report.domain.ScsFgMap;
import com.plan.report.domain.bo.ScsFgMapBo;
import com.plan.report.domain.vo.ScsFgMapVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * scs_fg_mapMapper接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Mapper
public interface ScsFgMapMapper extends BaseMapperPlus<ScsFgMapMapper, ScsFgMap, ScsFgMapVo> {

  Page<ScsFgMapVo> selectListVoPage(Page<Object> build, @Param("param") ScsFgMapBo bo);

    List<ScsFgMapVo> selectListVo(@Param("param") ScsFgMapBo bo);
}
