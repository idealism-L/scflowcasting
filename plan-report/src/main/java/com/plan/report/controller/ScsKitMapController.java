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
import com.plan.report.domain.bo.ScsKitMapBo;
import com.plan.report.domain.vo.ScsKitMapVo;
import com.plan.report.service.IScsKitMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

/**
 * scs_kit_map
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/kitMap")
public class ScsKitMapController extends BaseController {

    private final IScsKitMapService iScsKitMapService;

    /**
     * 查询scs_kit_map列表
     */
    @SaCheckPermission("report:kitMap:list")
    @GetMapping("/list")
    public TableDataInfo<ScsKitMapVo> list(ScsKitMapBo bo, PageQuery pageQuery) {
        return iScsKitMapService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_kit_map列表
     */
    @SaCheckPermission("report:kitMap:export")
    @Log(title = "scs_kit_map", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsKitMapBo bo, HttpServletResponse response) {
        List<ScsKitMapVo> list = iScsKitMapService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_kit_map", ScsKitMapVo.class, response);
    }

    /**
     * 导出scs_kit_map异常系数
     */
    @SaCheckPermission("report:kitMap:export")
    @Log(title = "scs_kit_map", businessType = BusinessType.EXPORT)
    @PostMapping("/exportError")
    public void exportError(ScsKitMapBo bo, HttpServletResponse response) {
        List<ScsKitMapVo> list = iScsKitMapService.queryErrorList(bo);
        ExcelUtil.exportExcel(list, "scs_kit_map_error", ScsKitMapVo.class, response);
    }

    /**
     * 获取scs_kit_map详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:kitMap:query")
    @GetMapping("/{id}")
    public R<ScsKitMapVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsKitMapService.queryById(id));
    }

    /**
     * 新增scs_kit_map
     */
    @SaCheckPermission("report:kitMap:add")
    @Log(title = "scs_kit_map", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsKitMapBo bo) {
        return toAjax(iScsKitMapService.insertByBo(bo));
    }

    /**
     * 修改scs_kit_map
     */
    @SaCheckPermission("report:kitMap:edit")
    @Log(title = "scs_kit_map", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsKitMapBo bo) {
        return toAjax(iScsKitMapService.updateByBo(bo));
    }

    /**
     * 删除scs_kit_map
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:kitMap:remove")
    @Log(title = "scs_kit_map", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsKitMapService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
