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
import com.plan.report.domain.vo.ScsIfClnItemVo;
import com.plan.report.domain.bo.ScsIfClnItemBo;
import com.plan.report.service.IScsIfClnItemService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_if_cln_item
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/ifClnItem")
public class ScsIfClnItemController extends BaseController {

    private final IScsIfClnItemService iScsIfClnItemService;

    /**
     * 查询scs_if_cln_item列表
     */
    @SaCheckPermission("report:ifClnItem:list")
    @GetMapping("/list")
    public TableDataInfo<ScsIfClnItemVo> list(ScsIfClnItemBo bo, PageQuery pageQuery) {
        return iScsIfClnItemService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_if_cln_item列表
     */
    @SaCheckPermission("report:ifClnItem:export")
    @Log(title = "scs_if_cln_item", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsIfClnItemBo bo, HttpServletResponse response) {
        List<ScsIfClnItemVo> list = iScsIfClnItemService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_if_cln_item", ScsIfClnItemVo.class, response);
    }

    /**
     * 获取scs_if_cln_item详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:ifClnItem:query")
    @GetMapping("/{id}")
    public R<ScsIfClnItemVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsIfClnItemService.queryById(id));
    }

    /**
     * 新增scs_if_cln_item
     */
    @SaCheckPermission("report:ifClnItem:add")
    @Log(title = "scs_if_cln_item", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsIfClnItemBo bo) {
        return toAjax(iScsIfClnItemService.insertByBo(bo));
    }

    /**
     * 修改scs_if_cln_item
     */
    @SaCheckPermission("report:ifClnItem:edit")
    @Log(title = "scs_if_cln_item", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsIfClnItemBo bo) {
        return toAjax(iScsIfClnItemService.updateByBo(bo));
    }

    /**
     * 删除scs_if_cln_item
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:ifClnItem:remove")
    @Log(title = "scs_if_cln_item", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsIfClnItemService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
