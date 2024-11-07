package com.plan.report.controller;

import java.util.List;
import java.util.Arrays;

import lombok.RequiredArgsConstructor;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.*;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import com.plan.common.annotation.RepeatSubmit;
import com.plan.common.annotation.Log;
import com.plan.common.core.controller.BaseController;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.domain.R;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import com.plan.common.enums.BusinessType;
import com.plan.common.utils.poi.ExcelUtil;
import com.plan.report.domain.vo.TLogExceptionListVo;
import com.plan.report.domain.bo.TLogExceptionListBo;
import com.plan.report.service.ITLogExceptionListService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 接口异常信息
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/logExceptionList")
public class TLogExceptionListController extends BaseController {

    private final ITLogExceptionListService iTLogExceptionListService;

    /**
     * 查询接口异常信息列表
     */
    @SaCheckPermission("report:logExceptionList:list")
    @GetMapping("/list")
    public TableDataInfo<TLogExceptionListVo> list(TLogExceptionListBo bo, PageQuery pageQuery) {
        return iTLogExceptionListService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出接口异常信息列表
     */
    @SaCheckPermission("report:logExceptionList:export")
    @Log(title = "接口异常信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(TLogExceptionListBo bo, HttpServletResponse response) {
        List<TLogExceptionListVo> list = iTLogExceptionListService.queryList(bo);
        ExcelUtil.exportExcel(list, "接口异常信息", TLogExceptionListVo.class, response);
    }

    /**
     * 获取接口异常信息详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:logExceptionList:query")
    @GetMapping("/{id}")
    public R<TLogExceptionListVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iTLogExceptionListService.queryById(id));
    }

    /**
     * 新增接口异常信息
     */
    @SaCheckPermission("report:logExceptionList:add")
    @Log(title = "接口异常信息", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody TLogExceptionListBo bo) {
        return toAjax(iTLogExceptionListService.insertByBo(bo));
    }

    /**
     * 修改接口异常信息
     */
    @SaCheckPermission("report:logExceptionList:edit")
    @Log(title = "接口异常信息", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody TLogExceptionListBo bo) {
        return toAjax(iTLogExceptionListService.updateByBo(bo));
    }

    /**
     * 删除接口异常信息
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:logExceptionList:remove")
    @Log(title = "接口异常信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iTLogExceptionListService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
