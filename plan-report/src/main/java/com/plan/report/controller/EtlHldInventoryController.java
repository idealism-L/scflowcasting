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
import com.plan.report.domain.vo.EtlHldInventoryVo;
import com.plan.report.domain.bo.EtlHldInventoryBo;
import com.plan.report.service.IEtlHldInventoryService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 库存
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/hldInventory")
public class EtlHldInventoryController extends BaseController {

    private final IEtlHldInventoryService iEtlHldInventoryService;

    /**
     * 查询库存列表
     */
    @SaCheckPermission("report:hldInventory:list")
    @GetMapping("/list")
    public TableDataInfo<EtlHldInventoryVo> list(EtlHldInventoryBo bo, PageQuery pageQuery) {
        return iEtlHldInventoryService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出库存列表
     */
    @SaCheckPermission("report:hldInventory:export")
    @Log(title = "库存", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(EtlHldInventoryBo bo, HttpServletResponse response) {
        List<EtlHldInventoryVo> list = iEtlHldInventoryService.queryList(bo);
        ExcelUtil.exportExcel(list, "库存", EtlHldInventoryVo.class, response);
    }

    /**
     * 获取库存详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:hldInventory:query")
    @GetMapping("/{id}")
    public R<EtlHldInventoryVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iEtlHldInventoryService.queryById(id));
    }

    /**
     * 新增库存
     */
    @SaCheckPermission("report:hldInventory:add")
    @Log(title = "库存", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody EtlHldInventoryBo bo) {
        return toAjax(iEtlHldInventoryService.insertByBo(bo));
    }

    /**
     * 修改库存
     */
    @SaCheckPermission("report:hldInventory:edit")
    @Log(title = "库存", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody EtlHldInventoryBo bo) {
        return toAjax(iEtlHldInventoryService.updateByBo(bo));
    }

    /**
     * 删除库存
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:hldInventory:remove")
    @Log(title = "库存", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iEtlHldInventoryService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
