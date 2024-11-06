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
import com.plan.report.domain.vo.EtlHldVehicleloadlineVo;
import com.plan.report.domain.bo.EtlHldVehicleloadlineBo;
import com.plan.report.service.IEtlHldVehicleloadlineService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 在途
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/hldVehicleloadline")
public class EtlHldVehicleloadlineController extends BaseController {

    private final IEtlHldVehicleloadlineService iEtlHldVehicleloadlineService;

    /**
     * 查询在途列表
     */
    @SaCheckPermission("report:hldVehicleloadline:list")
    @GetMapping("/list")
    public TableDataInfo<EtlHldVehicleloadlineVo> list(EtlHldVehicleloadlineBo bo, PageQuery pageQuery) {
        return iEtlHldVehicleloadlineService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出在途列表
     */
    @SaCheckPermission("report:hldVehicleloadline:export")
    @Log(title = "在途", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(EtlHldVehicleloadlineBo bo, HttpServletResponse response) {
        List<EtlHldVehicleloadlineVo> list = iEtlHldVehicleloadlineService.queryList(bo);
        ExcelUtil.exportExcel(list, "在途", EtlHldVehicleloadlineVo.class, response);
    }

    /**
     * 获取在途详细信息
     *
     * @param imMainInsuranceConfigId 主键
     */
    @SaCheckPermission("report:hldVehicleloadline:query")
    @GetMapping("/{imMainInsuranceConfigId}")
    public R<EtlHldVehicleloadlineVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long imMainInsuranceConfigId) {
        return R.ok(iEtlHldVehicleloadlineService.queryById(imMainInsuranceConfigId));
    }

    /**
     * 新增在途
     */
    @SaCheckPermission("report:hldVehicleloadline:add")
    @Log(title = "在途", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody EtlHldVehicleloadlineBo bo) {
        return toAjax(iEtlHldVehicleloadlineService.insertByBo(bo));
    }

    /**
     * 修改在途
     */
    @SaCheckPermission("report:hldVehicleloadline:edit")
    @Log(title = "在途", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody EtlHldVehicleloadlineBo bo) {
        return toAjax(iEtlHldVehicleloadlineService.updateByBo(bo));
    }

    /**
     * 删除在途
     *
     * @param imMainInsuranceConfigIds 主键串
     */
    @SaCheckPermission("report:hldVehicleloadline:remove")
    @Log(title = "在途", businessType = BusinessType.DELETE)
    @DeleteMapping("/{imMainInsuranceConfigIds}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] imMainInsuranceConfigIds) {
        return toAjax(iEtlHldVehicleloadlineService.deleteWithValidByIds(Arrays.asList(imMainInsuranceConfigIds), true));
    }
}
