package com.plan.report.mapper;

import com.plan.report.domain.EtlHldFcstFg26w;
import com.plan.report.domain.vo.EtlHldFcstFg26wVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成品销售预测Mapper接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Mapper
public interface EtlHldFcstFg26wMapper extends BaseMapperPlus<EtlHldFcstFg26wMapper, EtlHldFcstFg26w, EtlHldFcstFg26wVo> {

    /**
     * 获取数据总行数
     * @return
     */
    Long selectDataCount();
}
