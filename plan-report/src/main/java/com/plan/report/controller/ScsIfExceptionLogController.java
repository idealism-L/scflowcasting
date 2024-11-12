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
import com.plan.report.domain.vo.ScsIfExceptionLogVo;
import com.plan.report.domain.bo.ScsIfExceptionLogBo;
import com.plan.report.service.IScsIfExceptionLogService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_if_exception_log
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/ifExceptionLog")
public class ScsIfExceptionLogController extends BaseController {

    private final IScsIfExceptionLogService iScsIfExceptionLogService;

    /**
     * 查询scs_if_exception_log列表
     */
    @SaCheckPermission("report:ifExceptionLog:list")
    @GetMapping("/list")
    public TableDataInfo<ScsIfExceptionLogVo> list(ScsIfExceptionLogBo bo, PageQuery pageQuery) {
        return iScsIfExceptionLogService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_if_exception_log列表
     */
    @SaCheckPermission("report:ifExceptionLog:export")
    @Log(title = "scs_if_exception_log", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsIfExceptionLogBo bo, HttpServletResponse response) {
        List<ScsIfExceptionLogVo> list = iScsIfExceptionLogService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_if_exception_log", ScsIfExceptionLogVo.class, response);
    }

    /**
     * 获取scs_if_exception_log详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:ifExceptionLog:query")
    @GetMapping("/{id}")
    public R<ScsIfExceptionLogVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsIfExceptionLogService.queryById(id));
    }

    /**
     * 新增scs_if_exception_log
     */
    @SaCheckPermission("report:ifExceptionLog:add")
    @Log(title = "scs_if_exception_log", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsIfExceptionLogBo bo) {
        return toAjax(iScsIfExceptionLogService.insertByBo(bo));
    }

    /**
     * 修改scs_if_exception_log
     */
    @SaCheckPermission("report:ifExceptionLog:edit")
    @Log(title = "scs_if_exception_log", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsIfExceptionLogBo bo) {
        return toAjax(iScsIfExceptionLogService.updateByBo(bo));
    }

    /**
     * 删除scs_if_exception_log
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:ifExceptionLog:remove")
    @Log(title = "scs_if_exception_log", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsIfExceptionLogService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
