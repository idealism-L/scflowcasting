package com.plan.report.mapper;

import com.plan.report.domain.TDcItem;
import com.plan.report.domain.vo.TDcItemVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * 物料Mapper接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Mapper
public interface TDcItemMapper extends BaseMapperPlus<TDcItemMapper, TDcItem, TDcItemVo> {

}
