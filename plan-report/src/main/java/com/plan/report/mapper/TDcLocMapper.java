package com.plan.report.mapper;

import com.plan.report.domain.TDcLoc;
import com.plan.report.domain.vo.TDcLocVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * 地点Mapper接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Mapper
public interface TDcLocMapper extends BaseMapperPlus<TDcLocMapper, TDcLoc, TDcLocVo> {

}
