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
import com.plan.report.domain.vo.ScsKitFcstHistoryVo;
import com.plan.report.domain.bo.ScsKitFcstHistoryBo;
import com.plan.report.service.IScsKitFcstHistoryService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_kit_fcst_history
 *
 * @author ruoyi
 * @date 2024-11-25
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/kitFcstHistory")
public class ScsKitFcstHistoryController extends BaseController {

    private final IScsKitFcstHistoryService iScsKitFcstHistoryService;

    /**
     * 查询scs_kit_fcst_history列表
     */
    @SaCheckPermission("report:kitFcstHistory:list")
    @GetMapping("/list")
    public TableDataInfo<ScsKitFcstHistoryVo> list(ScsKitFcstHistoryBo bo, PageQuery pageQuery) {
        return iScsKitFcstHistoryService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_kit_fcst_history列表
     */
    @SaCheckPermission("report:kitFcstHistory:export")
    @Log(title = "scs_kit_fcst_history", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsKitFcstHistoryBo bo, HttpServletResponse response) {
        List<ScsKitFcstHistoryVo> list = iScsKitFcstHistoryService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_kit_fcst_history", ScsKitFcstHistoryVo.class, response);
    }

    /**
     * 获取scs_kit_fcst_history详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:kitFcstHistory:query")
    @GetMapping("/{id}")
    public R<ScsKitFcstHistoryVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsKitFcstHistoryService.queryById(id));
    }

    /**
     * 新增scs_kit_fcst_history
     */
    @SaCheckPermission("report:kitFcstHistory:add")
    @Log(title = "scs_kit_fcst_history", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsKitFcstHistoryBo bo) {
        return toAjax(iScsKitFcstHistoryService.insertByBo(bo));
    }

    /**
     * 修改scs_kit_fcst_history
     */
    @SaCheckPermission("report:kitFcstHistory:edit")
    @Log(title = "scs_kit_fcst_history", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsKitFcstHistoryBo bo) {
        return toAjax(iScsKitFcstHistoryService.updateByBo(bo));
    }

    /**
     * 删除scs_kit_fcst_history
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:kitFcstHistory:remove")
    @Log(title = "scs_kit_fcst_history", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsKitFcstHistoryService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
