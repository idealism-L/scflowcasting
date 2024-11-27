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
import com.plan.report.domain.vo.ScsYearfcstHistoryVo;
import com.plan.report.domain.bo.ScsYearfcstHistoryBo;
import com.plan.report.service.IScsYearfcstHistoryService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_yearfcst_history
 *
 * @author ruoyi
 * @date 2024-11-26
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/yearfcstHistory")
public class ScsYearfcstHistoryController extends BaseController {

    private final IScsYearfcstHistoryService iScsYearfcstHistoryService;

    /**
     * 查询scs_yearfcst_history列表
     */
    @SaCheckPermission("report:yearfcstHistory:list")
    @GetMapping("/list")
    public TableDataInfo<ScsYearfcstHistoryVo> list(ScsYearfcstHistoryBo bo, PageQuery pageQuery) {
        return iScsYearfcstHistoryService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_yearfcst_history列表
     */
    @SaCheckPermission("report:yearfcstHistory:export")
    @Log(title = "scs_yearfcst_history", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsYearfcstHistoryBo bo, HttpServletResponse response) {
        List<ScsYearfcstHistoryVo> list = iScsYearfcstHistoryService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_yearfcst_history", ScsYearfcstHistoryVo.class, response);
    }

    /**
     * 获取scs_yearfcst_history详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:yearfcstHistory:query")
    @GetMapping("/{id}")
    public R<ScsYearfcstHistoryVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsYearfcstHistoryService.queryById(id));
    }

    /**
     * 新增scs_yearfcst_history
     */
    @SaCheckPermission("report:yearfcstHistory:add")
    @Log(title = "scs_yearfcst_history", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsYearfcstHistoryBo bo) {
        return toAjax(iScsYearfcstHistoryService.insertByBo(bo));
    }

    /**
     * 修改scs_yearfcst_history
     */
    @SaCheckPermission("report:yearfcstHistory:edit")
    @Log(title = "scs_yearfcst_history", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsYearfcstHistoryBo bo) {
        return toAjax(iScsYearfcstHistoryService.updateByBo(bo));
    }

    /**
     * 删除scs_yearfcst_history
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:yearfcstHistory:remove")
    @Log(title = "scs_yearfcst_history", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsYearfcstHistoryService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
