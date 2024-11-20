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
import com.plan.report.domain.vo.ScsYearfcstVo;
import com.plan.report.domain.bo.ScsYearfcstBo;
import com.plan.report.service.IScsYearfcstService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_yearfcst
 *
 * @author ruoyi
 * @date 2024-11-20
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/yearfcst")
public class ScsYearfcstController extends BaseController {

    private final IScsYearfcstService iScsYearfcstService;

    /**
     * 查询scs_yearfcst列表
     */
    @SaCheckPermission("report:yearfcst:list")
    @GetMapping("/list")
    public TableDataInfo<ScsYearfcstVo> list(ScsYearfcstBo bo, PageQuery pageQuery) {
        return iScsYearfcstService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_yearfcst列表
     */
    @SaCheckPermission("report:yearfcst:export")
    @Log(title = "scs_yearfcst", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsYearfcstBo bo, HttpServletResponse response) {
        List<ScsYearfcstVo> list = iScsYearfcstService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_yearfcst", ScsYearfcstVo.class, response);
    }

    /**
     * 获取scs_yearfcst详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:yearfcst:query")
    @GetMapping("/{id}")
    public R<ScsYearfcstVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsYearfcstService.queryById(id));
    }

    /**
     * 新增scs_yearfcst
     */
    @SaCheckPermission("report:yearfcst:add")
    @Log(title = "scs_yearfcst", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsYearfcstBo bo) {
        return toAjax(iScsYearfcstService.insertByBo(bo));
    }

    /**
     * 修改scs_yearfcst
     */
    @SaCheckPermission("report:yearfcst:edit")
    @Log(title = "scs_yearfcst", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsYearfcstBo bo) {
        return toAjax(iScsYearfcstService.updateByBo(bo));
    }

    /**
     * 删除scs_yearfcst
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:yearfcst:remove")
    @Log(title = "scs_yearfcst", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsYearfcstService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
