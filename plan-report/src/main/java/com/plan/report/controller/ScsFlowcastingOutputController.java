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
import com.plan.report.domain.vo.ScsFlowcastingOutputVo;
import com.plan.report.domain.bo.ScsFlowcastingOutputBo;
import com.plan.report.service.IScsFlowcastingOutputService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_flowcasting_output
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/flowcastingOutput")
public class ScsFlowcastingOutputController extends BaseController {

    private final IScsFlowcastingOutputService iScsFlowcastingOutputService;

    /**
     * 查询scs_flowcasting_output列表
     */
    @SaCheckPermission("report:flowcastingOutput:list")
    @GetMapping("/list")
    public TableDataInfo<ScsFlowcastingOutputVo> list(ScsFlowcastingOutputBo bo, PageQuery pageQuery) {
        return iScsFlowcastingOutputService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_flowcasting_output列表
     */
    @SaCheckPermission("report:flowcastingOutput:export")
    @Log(title = "scs_flowcasting_output", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsFlowcastingOutputBo bo, HttpServletResponse response) {
        List<ScsFlowcastingOutputVo> list = iScsFlowcastingOutputService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_flowcasting_output", ScsFlowcastingOutputVo.class, response);
    }

    /**
     * 获取scs_flowcasting_output详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:flowcastingOutput:query")
    @GetMapping("/{id}")
    public R<ScsFlowcastingOutputVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsFlowcastingOutputService.queryById(id));
    }

    /**
     * 新增scs_flowcasting_output
     */
    @SaCheckPermission("report:flowcastingOutput:add")
    @Log(title = "scs_flowcasting_output", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsFlowcastingOutputBo bo) {
        return toAjax(iScsFlowcastingOutputService.insertByBo(bo));
    }

    /**
     * 修改scs_flowcasting_output
     */
    @SaCheckPermission("report:flowcastingOutput:edit")
    @Log(title = "scs_flowcasting_output", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsFlowcastingOutputBo bo) {
        return toAjax(iScsFlowcastingOutputService.updateByBo(bo));
    }

    /**
     * 删除scs_flowcasting_output
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:flowcastingOutput:remove")
    @Log(title = "scs_flowcasting_output", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsFlowcastingOutputService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
