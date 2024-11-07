package com.plan.report.mapper;

import com.plan.report.domain.EtlClnItem;
import com.plan.report.domain.vo.EtlClnItemVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * 物料编码Mapper接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Mapper
public interface EtlClnItemMapper extends BaseMapperPlus<EtlClnItemMapper, EtlClnItem, EtlClnItemVo> {

}
