package com.plan.report.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.mapper.BaseMapperPlus;
import com.plan.report.domain.ScsFgFcst;
import com.plan.report.domain.bo.ScsFgFcstBo;
import com.plan.report.domain.vo.ScsFgFcstVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * scs_fg_fcstMapper接口
 *
 * @author ruoyi
 * @date 2024-11-26
 */
public interface ScsFgFcstMapper extends BaseMapperPlus<ScsFgFcstMapper, ScsFgFcst, ScsFgFcstVo> {

    String getStartDate(@Param("bo") ScsFgFcstBo bo);

    Page<Map<String, Object>> listCorporation(Page<Object> build, @Param("bo") ScsFgFcstBo bo, @Param("startDates") List<String> startDates);

    List<Map<String, Object>> getTotal(@Param("bo") ScsFgFcstBo bo, @Param("startDates") List<String> dates);
}

