package com.plan.demo.mapper;

import com.plan.common.annotation.DataColumn;
import com.plan.common.annotation.DataPermission;
import com.plan.common.core.mapper.BaseMapperPlus;
import com.plan.demo.domain.TestTree;
import com.plan.demo.domain.vo.TestTreeVo;

/**
 * 测试树表Mapper接口
 *
 * @author Lion Li
 * @date 2021-07-26
 */
@DataPermission({
    @DataColumn(key = "deptName", value = "dept_id"),
    @DataColumn(key = "userName", value = "user_id")
})
public interface TestTreeMapper extends BaseMapperPlus<TestTreeMapper, TestTree, TestTreeVo> {

}
