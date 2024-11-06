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
import com.plan.report.domain.vo.TDcItemVo;
import com.plan.report.domain.bo.TDcItemBo;
import com.plan.report.service.ITDcItemService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 物料
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/dcItem")
public class TDcItemController extends BaseController {

    private final ITDcItemService iTDcItemService;

    /**
     * 查询物料列表
     */
    @SaCheckPermission("report:dcItem:list")
    @GetMapping("/list")
    public TableDataInfo<TDcItemVo> list(TDcItemBo bo, PageQuery pageQuery) {
        return iTDcItemService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出物料列表
     */
    @SaCheckPermission("report:dcItem:export")
    @Log(title = "物料", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(TDcItemBo bo, HttpServletResponse response) {
        List<TDcItemVo> list = iTDcItemService.queryList(bo);
        ExcelUtil.exportExcel(list, "物料", TDcItemVo.class, response);
    }

    /**
     * 获取物料详细信息
     *
     * @param imMainInsuranceConfigId 主键
     */
    @SaCheckPermission("report:dcItem:query")
    @GetMapping("/{imMainInsuranceConfigId}")
    public R<TDcItemVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long imMainInsuranceConfigId) {
        return R.ok(iTDcItemService.queryById(imMainInsuranceConfigId));
    }

    /**
     * 新增物料
     */
    @SaCheckPermission("report:dcItem:add")
    @Log(title = "物料", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody TDcItemBo bo) {
        return toAjax(iTDcItemService.insertByBo(bo));
    }

    /**
     * 修改物料
     */
    @SaCheckPermission("report:dcItem:edit")
    @Log(title = "物料", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody TDcItemBo bo) {
        return toAjax(iTDcItemService.updateByBo(bo));
    }

    /**
     * 删除物料
     *
     * @param imMainInsuranceConfigIds 主键串
     */
    @SaCheckPermission("report:dcItem:remove")
    @Log(title = "物料", businessType = BusinessType.DELETE)
    @DeleteMapping("/{imMainInsuranceConfigIds}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] imMainInsuranceConfigIds) {
        return toAjax(iTDcItemService.deleteWithValidByIds(Arrays.asList(imMainInsuranceConfigIds), true));
    }
}
