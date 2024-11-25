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
import com.plan.report.domain.vo.ScsInventoryHistoryVo;
import com.plan.report.domain.bo.ScsInventoryHistoryBo;
import com.plan.report.service.IScsInventoryHistoryService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_inventory_history
 *
 * @author ruoyi
 * @date 2024-11-25
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/inventoryHistory")
public class ScsInventoryHistoryController extends BaseController {

    private final IScsInventoryHistoryService iScsInventoryHistoryService;

    /**
     * 查询scs_inventory_history列表
     */
    @SaCheckPermission("report:inventoryHistory:list")
    @GetMapping("/list")
    public TableDataInfo<ScsInventoryHistoryVo> list(ScsInventoryHistoryBo bo, PageQuery pageQuery) {
        return iScsInventoryHistoryService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_inventory_history列表
     */
    @SaCheckPermission("report:inventoryHistory:export")
    @Log(title = "scs_inventory_history", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsInventoryHistoryBo bo, HttpServletResponse response) {
        List<ScsInventoryHistoryVo> list = iScsInventoryHistoryService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_inventory_history", ScsInventoryHistoryVo.class, response);
    }

    /**
     * 获取scs_inventory_history详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:inventoryHistory:query")
    @GetMapping("/{id}")
    public R<ScsInventoryHistoryVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsInventoryHistoryService.queryById(id));
    }

    /**
     * 新增scs_inventory_history
     */
    @SaCheckPermission("report:inventoryHistory:add")
    @Log(title = "scs_inventory_history", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsInventoryHistoryBo bo) {
        return toAjax(iScsInventoryHistoryService.insertByBo(bo));
    }

    /**
     * 修改scs_inventory_history
     */
    @SaCheckPermission("report:inventoryHistory:edit")
    @Log(title = "scs_inventory_history", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsInventoryHistoryBo bo) {
        return toAjax(iScsInventoryHistoryService.updateByBo(bo));
    }

    /**
     * 删除scs_inventory_history
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:inventoryHistory:remove")
    @Log(title = "scs_inventory_history", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsInventoryHistoryService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
