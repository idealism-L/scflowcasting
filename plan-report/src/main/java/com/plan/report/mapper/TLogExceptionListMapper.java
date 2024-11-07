package com.plan.report.mapper;

import com.plan.report.domain.TLogExceptionList;
import com.plan.report.domain.vo.TLogExceptionListVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * 接口异常信息Mapper接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Mapper
public interface TLogExceptionListMapper extends BaseMapperPlus<TLogExceptionListMapper, TLogExceptionList, TLogExceptionListVo> {

}
