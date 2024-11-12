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
import com.plan.report.domain.vo.ScsIfHldFcstFgVo;
import com.plan.report.domain.bo.ScsIfHldFcstFgBo;
import com.plan.report.service.IScsIfHldFcstFgService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_if_hld_fcst_fg
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/ifHldFcstFg")
public class ScsIfHldFcstFgController extends BaseController {

    private final IScsIfHldFcstFgService iScsIfHldFcstFgService;

    /**
     * 查询scs_if_hld_fcst_fg列表
     */
    @SaCheckPermission("report:ifHldFcstFg:list")
    @GetMapping("/list")
    public TableDataInfo<ScsIfHldFcstFgVo> list(ScsIfHldFcstFgBo bo, PageQuery pageQuery) {
        return iScsIfHldFcstFgService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_if_hld_fcst_fg列表
     */
    @SaCheckPermission("report:ifHldFcstFg:export")
    @Log(title = "scs_if_hld_fcst_fg", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsIfHldFcstFgBo bo, HttpServletResponse response) {
        List<ScsIfHldFcstFgVo> list = iScsIfHldFcstFgService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_if_hld_fcst_fg", ScsIfHldFcstFgVo.class, response);
    }

    /**
     * 获取scs_if_hld_fcst_fg详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:ifHldFcstFg:query")
    @GetMapping("/{id}")
    public R<ScsIfHldFcstFgVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsIfHldFcstFgService.queryById(id));
    }

    /**
     * 新增scs_if_hld_fcst_fg
     */
    @SaCheckPermission("report:ifHldFcstFg:add")
    @Log(title = "scs_if_hld_fcst_fg", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsIfHldFcstFgBo bo) {
        return toAjax(iScsIfHldFcstFgService.insertByBo(bo));
    }

    /**
     * 修改scs_if_hld_fcst_fg
     */
    @SaCheckPermission("report:ifHldFcstFg:edit")
    @Log(title = "scs_if_hld_fcst_fg", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsIfHldFcstFgBo bo) {
        return toAjax(iScsIfHldFcstFgService.updateByBo(bo));
    }

    /**
     * 删除scs_if_hld_fcst_fg
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:ifHldFcstFg:remove")
    @Log(title = "scs_if_hld_fcst_fg", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsIfHldFcstFgService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
