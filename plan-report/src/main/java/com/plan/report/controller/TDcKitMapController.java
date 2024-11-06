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
import com.plan.report.domain.vo.TDcKitMapVo;
import com.plan.report.domain.bo.TDcKitMapBo;
import com.plan.report.service.ITDcKitMapService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 溶剂映射
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/dcKitMap")
public class TDcKitMapController extends BaseController {

    private final ITDcKitMapService iTDcKitMapService;

    /**
     * 查询溶剂映射列表
     */
    @SaCheckPermission("report:dcKitMap:list")
    @GetMapping("/list")
    public TableDataInfo<TDcKitMapVo> list(TDcKitMapBo bo, PageQuery pageQuery) {
        return iTDcKitMapService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出溶剂映射列表
     */
    @SaCheckPermission("report:dcKitMap:export")
    @Log(title = "溶剂映射", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(TDcKitMapBo bo, HttpServletResponse response) {
        List<TDcKitMapVo> list = iTDcKitMapService.queryList(bo);
        ExcelUtil.exportExcel(list, "溶剂映射", TDcKitMapVo.class, response);
    }

    /**
     * 获取溶剂映射详细信息
     *
     * @param imMainInsuranceConfigId 主键
     */
    @SaCheckPermission("report:dcKitMap:query")
    @GetMapping("/{imMainInsuranceConfigId}")
    public R<TDcKitMapVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long imMainInsuranceConfigId) {
        return R.ok(iTDcKitMapService.queryById(imMainInsuranceConfigId));
    }

    /**
     * 新增溶剂映射
     */
    @SaCheckPermission("report:dcKitMap:add")
    @Log(title = "溶剂映射", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody TDcKitMapBo bo) {
        return toAjax(iTDcKitMapService.insertByBo(bo));
    }

    /**
     * 修改溶剂映射
     */
    @SaCheckPermission("report:dcKitMap:edit")
    @Log(title = "溶剂映射", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody TDcKitMapBo bo) {
        return toAjax(iTDcKitMapService.updateByBo(bo));
    }

    /**
     * 删除溶剂映射
     *
     * @param imMainInsuranceConfigIds 主键串
     */
    @SaCheckPermission("report:dcKitMap:remove")
    @Log(title = "溶剂映射", businessType = BusinessType.DELETE)
    @DeleteMapping("/{imMainInsuranceConfigIds}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] imMainInsuranceConfigIds) {
        return toAjax(iTDcKitMapService.deleteWithValidByIds(Arrays.asList(imMainInsuranceConfigIds), true));
    }
}
