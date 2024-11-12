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
import com.plan.report.domain.vo.ScsVehicleloadlineVo;
import com.plan.report.domain.bo.ScsVehicleloadlineBo;
import com.plan.report.service.IScsVehicleloadlineService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_vehicleloadline
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/vehicleloadline")
public class ScsVehicleloadlineController extends BaseController {

    private final IScsVehicleloadlineService iScsVehicleloadlineService;

    /**
     * 查询scs_vehicleloadline列表
     */
    @SaCheckPermission("report:vehicleloadline:list")
    @GetMapping("/list")
    public TableDataInfo<ScsVehicleloadlineVo> list(ScsVehicleloadlineBo bo, PageQuery pageQuery) {
        return iScsVehicleloadlineService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_vehicleloadline列表
     */
    @SaCheckPermission("report:vehicleloadline:export")
    @Log(title = "scs_vehicleloadline", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsVehicleloadlineBo bo, HttpServletResponse response) {
        List<ScsVehicleloadlineVo> list = iScsVehicleloadlineService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_vehicleloadline", ScsVehicleloadlineVo.class, response);
    }

    /**
     * 获取scs_vehicleloadline详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:vehicleloadline:query")
    @GetMapping("/{id}")
    public R<ScsVehicleloadlineVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsVehicleloadlineService.queryById(id));
    }

    /**
     * 新增scs_vehicleloadline
     */
    @SaCheckPermission("report:vehicleloadline:add")
    @Log(title = "scs_vehicleloadline", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsVehicleloadlineBo bo) {
        return toAjax(iScsVehicleloadlineService.insertByBo(bo));
    }

    /**
     * 修改scs_vehicleloadline
     */
    @SaCheckPermission("report:vehicleloadline:edit")
    @Log(title = "scs_vehicleloadline", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsVehicleloadlineBo bo) {
        return toAjax(iScsVehicleloadlineService.updateByBo(bo));
    }

    /**
     * 删除scs_vehicleloadline
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:vehicleloadline:remove")
    @Log(title = "scs_vehicleloadline", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsVehicleloadlineService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
