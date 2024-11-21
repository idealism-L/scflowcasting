package com.plan.report.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.report.domain.ScsItem;
import com.plan.report.domain.bo.ScsItemFgBo;
import com.plan.report.domain.vo.ScsItemFgVo;
import com.plan.report.domain.vo.ScsItemVo;
import com.plan.common.core.mapper.BaseMapperPlus;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * scs_itemMapper接口
 *
 * @author ruoyi
 * @date 2024-11-15
 */
public interface ScsItemMapper extends BaseMapperPlus<ScsItemMapper, ScsItem, ScsItemVo> {

  Page<ScsItemFgVo> selectListFgVoPage(Page<Object> build, @Param("param") ScsItemFgBo bo);

    List<ScsItemFgVo> selectListFgVo(@Param("param") ScsItemFgBo bo);
}
