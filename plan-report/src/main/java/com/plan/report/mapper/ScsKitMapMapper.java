package com.plan.report.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.report.domain.ScsKitMap;
import com.plan.report.domain.bo.ScsKitMapBo;
import com.plan.report.domain.vo.ScsKitMapVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * scs_kit_mapMapper接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Mapper
public interface ScsKitMapMapper extends BaseMapperPlus<ScsKitMapMapper, ScsKitMap, ScsKitMapVo> {

  Page<ScsKitMapVo> selectListVoPage(Page<Object> build, @Param("param") ScsKitMapBo bo);

    List<ScsKitMapVo> selectListVo(@Param("param") ScsKitMapBo bo);
}
