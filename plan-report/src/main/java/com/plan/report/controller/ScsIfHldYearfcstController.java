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
import com.plan.report.domain.vo.ScsIfHldYearfcstVo;
import com.plan.report.domain.bo.ScsIfHldYearfcstBo;
import com.plan.report.service.IScsIfHldYearfcstService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_if_hld_yearfcst
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/ifHldYearfcst")
public class ScsIfHldYearfcstController extends BaseController {

    private final IScsIfHldYearfcstService iScsIfHldYearfcstService;

    /**
     * 查询scs_if_hld_yearfcst列表
     */
    @SaCheckPermission("report:ifHldYearfcst:list")
    @GetMapping("/list")
    public TableDataInfo<ScsIfHldYearfcstVo> list(ScsIfHldYearfcstBo bo, PageQuery pageQuery) {
        return iScsIfHldYearfcstService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_if_hld_yearfcst列表
     */
    @SaCheckPermission("report:ifHldYearfcst:export")
    @Log(title = "scs_if_hld_yearfcst", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsIfHldYearfcstBo bo, HttpServletResponse response) {
        List<ScsIfHldYearfcstVo> list = iScsIfHldYearfcstService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_if_hld_yearfcst", ScsIfHldYearfcstVo.class, response);
    }

    /**
     * 获取scs_if_hld_yearfcst详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:ifHldYearfcst:query")
    @GetMapping("/{id}")
    public R<ScsIfHldYearfcstVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsIfHldYearfcstService.queryById(id));
    }

    /**
     * 新增scs_if_hld_yearfcst
     */
    @SaCheckPermission("report:ifHldYearfcst:add")
    @Log(title = "scs_if_hld_yearfcst", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsIfHldYearfcstBo bo) {
        return toAjax(iScsIfHldYearfcstService.insertByBo(bo));
    }

    /**
     * 修改scs_if_hld_yearfcst
     */
    @SaCheckPermission("report:ifHldYearfcst:edit")
    @Log(title = "scs_if_hld_yearfcst", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsIfHldYearfcstBo bo) {
        return toAjax(iScsIfHldYearfcstService.updateByBo(bo));
    }

    /**
     * 删除scs_if_hld_yearfcst
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:ifHldYearfcst:remove")
    @Log(title = "scs_if_hld_yearfcst", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsIfHldYearfcstService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
