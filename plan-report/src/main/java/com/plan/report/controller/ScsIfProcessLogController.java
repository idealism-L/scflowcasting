package com.plan.report.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.plan.common.annotation.Log;
import com.plan.common.annotation.RepeatSubmit;
import com.plan.common.core.controller.BaseController;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.domain.R;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import com.plan.common.enums.BusinessType;
import com.plan.common.utils.poi.ExcelUtil;
import com.plan.report.domain.bo.ScsIfProcessLogBo;
import com.plan.report.domain.vo.ScsIfProcessLogVo;
import com.plan.report.service.IScsIfProcessLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

/**
 * scs_if_process_log
 *
 * @author ruoyi
 * @date 2024-11-13
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/ifProcessLog")
public class ScsIfProcessLogController extends BaseController {

    private final IScsIfProcessLogService iScsIfProcessLogService;

    /**
     * 查询scs_if_process_log列表
     */
    @SaCheckPermission("report:ifProcessLog:list")
    @GetMapping("/list")
    public TableDataInfo<ScsIfProcessLogVo> list(ScsIfProcessLogBo bo, PageQuery pageQuery) {
        return iScsIfProcessLogService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_if_process_log列表
     */
    @SaCheckPermission("report:ifProcessLog:export")
    @Log(title = "scs_if_process_log", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsIfProcessLogBo bo, HttpServletResponse response) {
        List<ScsIfProcessLogVo> list = iScsIfProcessLogService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_if_process_log", ScsIfProcessLogVo.class, response);
    }

    /**
     * 获取scs_if_process_log详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:ifProcessLog:query")
    @GetMapping("/{id}")
    public R<ScsIfProcessLogVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsIfProcessLogService.queryById(id));
    }

    /**
     * 新增scs_if_process_log
     */
    @SaCheckPermission("report:ifProcessLog:add")
    @Log(title = "scs_if_process_log", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsIfProcessLogBo bo) {
        return toAjax(iScsIfProcessLogService.insertByBo(bo));
    }

    /**
     * 修改scs_if_process_log
     */
    @SaCheckPermission("report:ifProcessLog:edit")
    @Log(title = "scs_if_process_log", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsIfProcessLogBo bo) {
        return toAjax(iScsIfProcessLogService.updateByBo(bo));
    }

    /**
     * 删除scs_if_process_log
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:ifProcessLog:remove")
    @Log(title = "scs_if_process_log", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsIfProcessLogService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
