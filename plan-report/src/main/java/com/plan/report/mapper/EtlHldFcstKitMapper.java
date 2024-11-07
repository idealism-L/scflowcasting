package com.plan.report.mapper;

import com.plan.report.domain.EtlHldFcstKit;
import com.plan.report.domain.vo.EtlHldFcstKitVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Mapper;

/**
 * 主剂需求预测Mapper接口
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Mapper
public interface EtlHldFcstKitMapper extends BaseMapperPlus<EtlHldFcstKitMapper, EtlHldFcstKit, EtlHldFcstKitVo> {

    /**
     * 获取数据总行数
     * @return
     */
    Long selectDataCount();
}
