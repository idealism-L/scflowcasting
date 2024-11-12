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
import com.plan.report.domain.vo.ScsLocMapVo;
import com.plan.report.domain.bo.ScsLocMapBo;
import com.plan.report.service.IScsLocMapService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_loc_map
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/locMap")
public class ScsLocMapController extends BaseController {

    private final IScsLocMapService iScsLocMapService;

    /**
     * 查询scs_loc_map列表
     */
    @SaCheckPermission("report:locMap:list")
    @GetMapping("/list")
    public TableDataInfo<ScsLocMapVo> list(ScsLocMapBo bo, PageQuery pageQuery) {
        return iScsLocMapService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_loc_map列表
     */
    @SaCheckPermission("report:locMap:export")
    @Log(title = "scs_loc_map", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsLocMapBo bo, HttpServletResponse response) {
        List<ScsLocMapVo> list = iScsLocMapService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_loc_map", ScsLocMapVo.class, response);
    }

    /**
     * 获取scs_loc_map详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:locMap:query")
    @GetMapping("/{id}")
    public R<ScsLocMapVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsLocMapService.queryById(id));
    }

    /**
     * 新增scs_loc_map
     */
    @SaCheckPermission("report:locMap:add")
    @Log(title = "scs_loc_map", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsLocMapBo bo) {
        return toAjax(iScsLocMapService.insertByBo(bo));
    }

    /**
     * 修改scs_loc_map
     */
    @SaCheckPermission("report:locMap:edit")
    @Log(title = "scs_loc_map", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsLocMapBo bo) {
        return toAjax(iScsLocMapService.updateByBo(bo));
    }

    /**
     * 删除scs_loc_map
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:locMap:remove")
    @Log(title = "scs_loc_map", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsLocMapService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
