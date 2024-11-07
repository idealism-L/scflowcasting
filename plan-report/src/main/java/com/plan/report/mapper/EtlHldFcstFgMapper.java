package com.plan.report.mapper;

import com.plan.report.domain.EtlHldFcstFg;
import com.plan.report.domain.vo.EtlHldFcstFgVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成品销售预测Mapper接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Mapper
public interface EtlHldFcstFgMapper extends BaseMapperPlus<EtlHldFcstFgMapper, EtlHldFcstFg, EtlHldFcstFgVo> {

    /**
     * 获取数据总行数
     * @return
     */
    Long selectDataCount();
}
