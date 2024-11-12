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
import com.plan.report.domain.vo.ScsIfHldCustorderVo;
import com.plan.report.domain.bo.ScsIfHldCustorderBo;
import com.plan.report.service.IScsIfHldCustorderService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_if_hld_custorder
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/ifHldCustorder")
public class ScsIfHldCustorderController extends BaseController {

    private final IScsIfHldCustorderService iScsIfHldCustorderService;

    /**
     * 查询scs_if_hld_custorder列表
     */
    @SaCheckPermission("report:ifHldCustorder:list")
    @GetMapping("/list")
    public TableDataInfo<ScsIfHldCustorderVo> list(ScsIfHldCustorderBo bo, PageQuery pageQuery) {
        return iScsIfHldCustorderService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_if_hld_custorder列表
     */
    @SaCheckPermission("report:ifHldCustorder:export")
    @Log(title = "scs_if_hld_custorder", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsIfHldCustorderBo bo, HttpServletResponse response) {
        List<ScsIfHldCustorderVo> list = iScsIfHldCustorderService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_if_hld_custorder", ScsIfHldCustorderVo.class, response);
    }

    /**
     * 获取scs_if_hld_custorder详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:ifHldCustorder:query")
    @GetMapping("/{id}")
    public R<ScsIfHldCustorderVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsIfHldCustorderService.queryById(id));
    }

    /**
     * 新增scs_if_hld_custorder
     */
    @SaCheckPermission("report:ifHldCustorder:add")
    @Log(title = "scs_if_hld_custorder", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsIfHldCustorderBo bo) {
        return toAjax(iScsIfHldCustorderService.insertByBo(bo));
    }

    /**
     * 修改scs_if_hld_custorder
     */
    @SaCheckPermission("report:ifHldCustorder:edit")
    @Log(title = "scs_if_hld_custorder", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsIfHldCustorderBo bo) {
        return toAjax(iScsIfHldCustorderService.updateByBo(bo));
    }

    /**
     * 删除scs_if_hld_custorder
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:ifHldCustorder:remove")
    @Log(title = "scs_if_hld_custorder", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsIfHldCustorderService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
