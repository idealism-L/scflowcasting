package com.plan.report.mapper;

import com.plan.report.domain.ScsItem;
import com.plan.report.domain.vo.ScsItemVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * scs_itemMapper接口
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Mapper
public interface ScsItemMapper extends BaseMapperPlus<ScsItemMapper, ScsItem, ScsItemVo> {

}
