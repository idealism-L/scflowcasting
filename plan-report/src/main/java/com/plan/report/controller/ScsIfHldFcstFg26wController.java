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
import com.plan.report.domain.vo.ScsIfHldFcstFg26wVo;
import com.plan.report.domain.bo.ScsIfHldFcstFg26wBo;
import com.plan.report.service.IScsIfHldFcstFg26wService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_if_hld_fcst_fg_26w
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/ifHldFcstFg26w")
public class ScsIfHldFcstFg26wController extends BaseController {

    private final IScsIfHldFcstFg26wService iScsIfHldFcstFg26wService;

    /**
     * 查询scs_if_hld_fcst_fg_26w列表
     */
    @SaCheckPermission("report:ifHldFcstFg26w:list")
    @GetMapping("/list")
    public TableDataInfo<ScsIfHldFcstFg26wVo> list(ScsIfHldFcstFg26wBo bo, PageQuery pageQuery) {
        return iScsIfHldFcstFg26wService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_if_hld_fcst_fg_26w列表
     */
    @SaCheckPermission("report:ifHldFcstFg26w:export")
    @Log(title = "scs_if_hld_fcst_fg_26w", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsIfHldFcstFg26wBo bo, HttpServletResponse response) {
        List<ScsIfHldFcstFg26wVo> list = iScsIfHldFcstFg26wService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_if_hld_fcst_fg_26w", ScsIfHldFcstFg26wVo.class, response);
    }

    /**
     * 获取scs_if_hld_fcst_fg_26w详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:ifHldFcstFg26w:query")
    @GetMapping("/{id}")
    public R<ScsIfHldFcstFg26wVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsIfHldFcstFg26wService.queryById(id));
    }

    /**
     * 新增scs_if_hld_fcst_fg_26w
     */
    @SaCheckPermission("report:ifHldFcstFg26w:add")
    @Log(title = "scs_if_hld_fcst_fg_26w", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsIfHldFcstFg26wBo bo) {
        return toAjax(iScsIfHldFcstFg26wService.insertByBo(bo));
    }

    /**
     * 修改scs_if_hld_fcst_fg_26w
     */
    @SaCheckPermission("report:ifHldFcstFg26w:edit")
    @Log(title = "scs_if_hld_fcst_fg_26w", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsIfHldFcstFg26wBo bo) {
        return toAjax(iScsIfHldFcstFg26wService.updateByBo(bo));
    }

    /**
     * 删除scs_if_hld_fcst_fg_26w
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:ifHldFcstFg26w:remove")
    @Log(title = "scs_if_hld_fcst_fg_26w", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsIfHldFcstFg26wService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
