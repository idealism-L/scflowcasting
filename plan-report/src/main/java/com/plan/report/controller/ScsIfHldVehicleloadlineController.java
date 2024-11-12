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
import com.plan.report.domain.vo.ScsIfHldVehicleloadlineVo;
import com.plan.report.domain.bo.ScsIfHldVehicleloadlineBo;
import com.plan.report.service.IScsIfHldVehicleloadlineService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_if_hld_vehicleloadline
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/ifHldVehicleloadline")
public class ScsIfHldVehicleloadlineController extends BaseController {

    private final IScsIfHldVehicleloadlineService iScsIfHldVehicleloadlineService;

    /**
     * 查询scs_if_hld_vehicleloadline列表
     */
    @SaCheckPermission("report:ifHldVehicleloadline:list")
    @GetMapping("/list")
    public TableDataInfo<ScsIfHldVehicleloadlineVo> list(ScsIfHldVehicleloadlineBo bo, PageQuery pageQuery) {
        return iScsIfHldVehicleloadlineService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_if_hld_vehicleloadline列表
     */
    @SaCheckPermission("report:ifHldVehicleloadline:export")
    @Log(title = "scs_if_hld_vehicleloadline", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsIfHldVehicleloadlineBo bo, HttpServletResponse response) {
        List<ScsIfHldVehicleloadlineVo> list = iScsIfHldVehicleloadlineService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_if_hld_vehicleloadline", ScsIfHldVehicleloadlineVo.class, response);
    }

    /**
     * 获取scs_if_hld_vehicleloadline详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:ifHldVehicleloadline:query")
    @GetMapping("/{id}")
    public R<ScsIfHldVehicleloadlineVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsIfHldVehicleloadlineService.queryById(id));
    }

    /**
     * 新增scs_if_hld_vehicleloadline
     */
    @SaCheckPermission("report:ifHldVehicleloadline:add")
    @Log(title = "scs_if_hld_vehicleloadline", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsIfHldVehicleloadlineBo bo) {
        return toAjax(iScsIfHldVehicleloadlineService.insertByBo(bo));
    }

    /**
     * 修改scs_if_hld_vehicleloadline
     */
    @SaCheckPermission("report:ifHldVehicleloadline:edit")
    @Log(title = "scs_if_hld_vehicleloadline", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsIfHldVehicleloadlineBo bo) {
        return toAjax(iScsIfHldVehicleloadlineService.updateByBo(bo));
    }

    /**
     * 删除scs_if_hld_vehicleloadline
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:ifHldVehicleloadline:remove")
    @Log(title = "scs_if_hld_vehicleloadline", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsIfHldVehicleloadlineService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
