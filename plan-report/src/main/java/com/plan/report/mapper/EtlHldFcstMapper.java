package com.plan.report.mapper;

import com.plan.report.domain.EtlHldFcst;
import com.plan.report.domain.vo.EtlHldFcstVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * 销售预测Mapper接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Mapper
public interface EtlHldFcstMapper extends BaseMapperPlus<EtlHldFcstMapper, EtlHldFcst, EtlHldFcstVo> {

}
