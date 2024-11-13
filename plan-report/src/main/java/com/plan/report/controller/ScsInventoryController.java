package com.plan.report.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.plan.common.annotation.Log;
import com.plan.common.annotation.RepeatSubmit;
import com.plan.common.core.controller.BaseController;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.domain.R;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import com.plan.common.enums.BusinessType;
import com.plan.common.utils.poi.ExcelUtil;
import com.plan.report.domain.bo.ScsInventoryBo;
import com.plan.report.domain.vo.ScsInventoryVo;
import com.plan.report.service.IScsInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

/**
 * scs_inventory
 *
 * @author ruoyi
 * @date 2024-11-13
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/inventory")
public class ScsInventoryController extends BaseController {

    private final IScsInventoryService iScsInventoryService;

    /**
     * 查询scs_inventory列表
     */
    @SaCheckPermission("report:inventory:list")
    @GetMapping("/list")
    public TableDataInfo<ScsInventoryVo> list(ScsInventoryBo bo, PageQuery pageQuery) {
        return iScsInventoryService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_inventory列表
     */
    @SaCheckPermission("report:inventory:export")
    @Log(title = "scs_inventory", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsInventoryBo bo, HttpServletResponse response) {
        List<ScsInventoryVo> list = iScsInventoryService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_inventory", ScsInventoryVo.class, response);
    }

    /**
     * 获取scs_inventory详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:inventory:query")
    @GetMapping("/{id}")
    public R<ScsInventoryVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsInventoryService.queryById(id));
    }

    /**
     * 新增scs_inventory
     */
    @SaCheckPermission("report:inventory:add")
    @Log(title = "scs_inventory", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsInventoryBo bo) {
        return toAjax(iScsInventoryService.insertByBo(bo));
    }

    /**
     * 修改scs_inventory
     */
    @SaCheckPermission("report:inventory:edit")
    @Log(title = "scs_inventory", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsInventoryBo bo) {
        return toAjax(iScsInventoryService.updateByBo(bo));
    }

    /**
     * 删除scs_inventory
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:inventory:remove")
    @Log(title = "scs_inventory", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsInventoryService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
