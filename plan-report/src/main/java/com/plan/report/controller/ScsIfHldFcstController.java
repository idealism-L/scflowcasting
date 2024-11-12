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
import com.plan.report.domain.vo.ScsIfHldFcstVo;
import com.plan.report.domain.bo.ScsIfHldFcstBo;
import com.plan.report.service.IScsIfHldFcstService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_if_hld_fcst
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/ifHldFcst")
public class ScsIfHldFcstController extends BaseController {

    private final IScsIfHldFcstService iScsIfHldFcstService;

    /**
     * 查询scs_if_hld_fcst列表
     */
    @SaCheckPermission("report:ifHldFcst:list")
    @GetMapping("/list")
    public TableDataInfo<ScsIfHldFcstVo> list(ScsIfHldFcstBo bo, PageQuery pageQuery) {
        return iScsIfHldFcstService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_if_hld_fcst列表
     */
    @SaCheckPermission("report:ifHldFcst:export")
    @Log(title = "scs_if_hld_fcst", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsIfHldFcstBo bo, HttpServletResponse response) {
        List<ScsIfHldFcstVo> list = iScsIfHldFcstService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_if_hld_fcst", ScsIfHldFcstVo.class, response);
    }

    /**
     * 获取scs_if_hld_fcst详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:ifHldFcst:query")
    @GetMapping("/{id}")
    public R<ScsIfHldFcstVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsIfHldFcstService.queryById(id));
    }

    /**
     * 新增scs_if_hld_fcst
     */
    @SaCheckPermission("report:ifHldFcst:add")
    @Log(title = "scs_if_hld_fcst", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsIfHldFcstBo bo) {
        return toAjax(iScsIfHldFcstService.insertByBo(bo));
    }

    /**
     * 修改scs_if_hld_fcst
     */
    @SaCheckPermission("report:ifHldFcst:edit")
    @Log(title = "scs_if_hld_fcst", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsIfHldFcstBo bo) {
        return toAjax(iScsIfHldFcstService.updateByBo(bo));
    }

    /**
     * 删除scs_if_hld_fcst
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:ifHldFcst:remove")
    @Log(title = "scs_if_hld_fcst", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsIfHldFcstService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
