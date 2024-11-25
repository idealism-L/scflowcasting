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
import com.plan.report.domain.vo.ScsKitFcstVo;
import com.plan.report.domain.bo.ScsKitFcstBo;
import com.plan.report.service.IScsKitFcstService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_kit_fcst
 *
 * @author ruoyi
 * @date 2024-11-25
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/kitFcst")
public class ScsKitFcstController extends BaseController {

    private final IScsKitFcstService iScsKitFcstService;

    /**
     * 查询scs_kit_fcst列表
     */
    @SaCheckPermission("report:kitFcst:list")
    @GetMapping("/list")
    public TableDataInfo<ScsKitFcstVo> list(ScsKitFcstBo bo, PageQuery pageQuery) {
        return iScsKitFcstService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_kit_fcst列表
     */
    @SaCheckPermission("report:kitFcst:export")
    @Log(title = "scs_kit_fcst", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsKitFcstBo bo, HttpServletResponse response) {
        List<ScsKitFcstVo> list = iScsKitFcstService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_kit_fcst", ScsKitFcstVo.class, response);
    }

    /**
     * 获取scs_kit_fcst详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:kitFcst:query")
    @GetMapping("/{id}")
    public R<ScsKitFcstVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsKitFcstService.queryById(id));
    }

    /**
     * 新增scs_kit_fcst
     */
    @SaCheckPermission("report:kitFcst:add")
    @Log(title = "scs_kit_fcst", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsKitFcstBo bo) {
        return toAjax(iScsKitFcstService.insertByBo(bo));
    }

    /**
     * 修改scs_kit_fcst
     */
    @SaCheckPermission("report:kitFcst:edit")
    @Log(title = "scs_kit_fcst", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsKitFcstBo bo) {
        return toAjax(iScsKitFcstService.updateByBo(bo));
    }

    /**
     * 删除scs_kit_fcst
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:kitFcst:remove")
    @Log(title = "scs_kit_fcst", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsKitFcstService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
