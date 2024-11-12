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
import com.plan.report.domain.vo.ScsIfHldFcstKitVo;
import com.plan.report.domain.bo.ScsIfHldFcstKitBo;
import com.plan.report.service.IScsIfHldFcstKitService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_if_hld_fcst_kit
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/ifHldFcstKit")
public class ScsIfHldFcstKitController extends BaseController {

    private final IScsIfHldFcstKitService iScsIfHldFcstKitService;

    /**
     * 查询scs_if_hld_fcst_kit列表
     */
    @SaCheckPermission("report:ifHldFcstKit:list")
    @GetMapping("/list")
    public TableDataInfo<ScsIfHldFcstKitVo> list(ScsIfHldFcstKitBo bo, PageQuery pageQuery) {
        return iScsIfHldFcstKitService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_if_hld_fcst_kit列表
     */
    @SaCheckPermission("report:ifHldFcstKit:export")
    @Log(title = "scs_if_hld_fcst_kit", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsIfHldFcstKitBo bo, HttpServletResponse response) {
        List<ScsIfHldFcstKitVo> list = iScsIfHldFcstKitService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_if_hld_fcst_kit", ScsIfHldFcstKitVo.class, response);
    }

    /**
     * 获取scs_if_hld_fcst_kit详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:ifHldFcstKit:query")
    @GetMapping("/{id}")
    public R<ScsIfHldFcstKitVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsIfHldFcstKitService.queryById(id));
    }

    /**
     * 新增scs_if_hld_fcst_kit
     */
    @SaCheckPermission("report:ifHldFcstKit:add")
    @Log(title = "scs_if_hld_fcst_kit", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsIfHldFcstKitBo bo) {
        return toAjax(iScsIfHldFcstKitService.insertByBo(bo));
    }

    /**
     * 修改scs_if_hld_fcst_kit
     */
    @SaCheckPermission("report:ifHldFcstKit:edit")
    @Log(title = "scs_if_hld_fcst_kit", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsIfHldFcstKitBo bo) {
        return toAjax(iScsIfHldFcstKitService.updateByBo(bo));
    }

    /**
     * 删除scs_if_hld_fcst_kit
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:ifHldFcstKit:remove")
    @Log(title = "scs_if_hld_fcst_kit", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsIfHldFcstKitService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
