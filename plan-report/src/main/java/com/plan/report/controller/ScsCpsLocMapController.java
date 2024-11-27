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
import com.plan.report.domain.vo.ScsCpsLocMapVo;
import com.plan.report.domain.bo.ScsCpsLocMapBo;
import com.plan.report.service.IScsCpsLocMapService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_cps_loc_map
 *
 * @author ruoyi
 * @date 2024-11-25
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/cpsLocMap")
public class ScsCpsLocMapController extends BaseController {

    private final IScsCpsLocMapService iScsCpsLocMapService;

    /**
     * 查询scs_cps_loc_map列表
     */
    @SaCheckPermission("report:cpsLocMap:list")
    @GetMapping("/list")
    public TableDataInfo<ScsCpsLocMapVo> list(ScsCpsLocMapBo bo, PageQuery pageQuery) {
        return iScsCpsLocMapService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_cps_loc_map列表
     */
    @SaCheckPermission("report:cpsLocMap:export")
    @Log(title = "scs_cps_loc_map", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsCpsLocMapBo bo, HttpServletResponse response) {
        List<ScsCpsLocMapVo> list = iScsCpsLocMapService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_cps_loc_map", ScsCpsLocMapVo.class, response);
    }

    /**
     * 获取scs_cps_loc_map详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:cpsLocMap:query")
    @GetMapping("/{id}")
    public R<ScsCpsLocMapVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsCpsLocMapService.queryById(id));
    }

    /**
     * 新增scs_cps_loc_map
     */
    @SaCheckPermission("report:cpsLocMap:add")
    @Log(title = "scs_cps_loc_map", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsCpsLocMapBo bo) {
        return toAjax(iScsCpsLocMapService.insertByBo(bo));
    }

    /**
     * 修改scs_cps_loc_map
     */
    @SaCheckPermission("report:cpsLocMap:edit")
    @Log(title = "scs_cps_loc_map", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsCpsLocMapBo bo) {
        return toAjax(iScsCpsLocMapService.updateByBo(bo));
    }

    /**
     * 删除scs_cps_loc_map
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:cpsLocMap:remove")
    @Log(title = "scs_cps_loc_map", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsCpsLocMapService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
