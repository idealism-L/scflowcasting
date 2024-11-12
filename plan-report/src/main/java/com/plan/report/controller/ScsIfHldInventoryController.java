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
import com.plan.report.domain.vo.ScsIfHldInventoryVo;
import com.plan.report.domain.bo.ScsIfHldInventoryBo;
import com.plan.report.service.IScsIfHldInventoryService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_if_hld_inventory
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/ifHldInventory")
public class ScsIfHldInventoryController extends BaseController {

    private final IScsIfHldInventoryService iScsIfHldInventoryService;

    /**
     * 查询scs_if_hld_inventory列表
     */
    @SaCheckPermission("report:ifHldInventory:list")
    @GetMapping("/list")
    public TableDataInfo<ScsIfHldInventoryVo> list(ScsIfHldInventoryBo bo, PageQuery pageQuery) {
        return iScsIfHldInventoryService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_if_hld_inventory列表
     */
    @SaCheckPermission("report:ifHldInventory:export")
    @Log(title = "scs_if_hld_inventory", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsIfHldInventoryBo bo, HttpServletResponse response) {
        List<ScsIfHldInventoryVo> list = iScsIfHldInventoryService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_if_hld_inventory", ScsIfHldInventoryVo.class, response);
    }

    /**
     * 获取scs_if_hld_inventory详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:ifHldInventory:query")
    @GetMapping("/{id}")
    public R<ScsIfHldInventoryVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsIfHldInventoryService.queryById(id));
    }

    /**
     * 新增scs_if_hld_inventory
     */
    @SaCheckPermission("report:ifHldInventory:add")
    @Log(title = "scs_if_hld_inventory", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsIfHldInventoryBo bo) {
        return toAjax(iScsIfHldInventoryService.insertByBo(bo));
    }

    /**
     * 修改scs_if_hld_inventory
     */
    @SaCheckPermission("report:ifHldInventory:edit")
    @Log(title = "scs_if_hld_inventory", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsIfHldInventoryBo bo) {
        return toAjax(iScsIfHldInventoryService.updateByBo(bo));
    }

    /**
     * 删除scs_if_hld_inventory
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:ifHldInventory:remove")
    @Log(title = "scs_if_hld_inventory", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsIfHldInventoryService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
