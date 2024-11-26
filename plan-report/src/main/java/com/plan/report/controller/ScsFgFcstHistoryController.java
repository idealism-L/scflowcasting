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
import com.plan.report.domain.vo.ScsFgFcstHistoryVo;
import com.plan.report.domain.bo.ScsFgFcstHistoryBo;
import com.plan.report.service.IScsFgFcstHistoryService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_fg_fcst_history
 *
 * @author ruoyi
 * @date 2024-11-26
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/fgFcstHistory")
public class ScsFgFcstHistoryController extends BaseController {

    private final IScsFgFcstHistoryService iScsFgFcstHistoryService;

    /**
     * 查询scs_fg_fcst_history列表
     */
    @SaCheckPermission("report:fgFcstHistory:list")
    @GetMapping("/list")
    public TableDataInfo<ScsFgFcstHistoryVo> list(ScsFgFcstHistoryBo bo, PageQuery pageQuery) {
        return iScsFgFcstHistoryService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_fg_fcst_history列表
     */
    @SaCheckPermission("report:fgFcstHistory:export")
    @Log(title = "scs_fg_fcst_history", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsFgFcstHistoryBo bo, HttpServletResponse response) {
        List<ScsFgFcstHistoryVo> list = iScsFgFcstHistoryService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_fg_fcst_history", ScsFgFcstHistoryVo.class, response);
    }

    /**
     * 获取scs_fg_fcst_history详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:fgFcstHistory:query")
    @GetMapping("/{id}")
    public R<ScsFgFcstHistoryVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsFgFcstHistoryService.queryById(id));
    }

    /**
     * 新增scs_fg_fcst_history
     */
    @SaCheckPermission("report:fgFcstHistory:add")
    @Log(title = "scs_fg_fcst_history", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsFgFcstHistoryBo bo) {
        return toAjax(iScsFgFcstHistoryService.insertByBo(bo));
    }

    /**
     * 修改scs_fg_fcst_history
     */
    @SaCheckPermission("report:fgFcstHistory:edit")
    @Log(title = "scs_fg_fcst_history", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsFgFcstHistoryBo bo) {
        return toAjax(iScsFgFcstHistoryService.updateByBo(bo));
    }

    /**
     * 删除scs_fg_fcst_history
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:fgFcstHistory:remove")
    @Log(title = "scs_fg_fcst_history", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsFgFcstHistoryService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
