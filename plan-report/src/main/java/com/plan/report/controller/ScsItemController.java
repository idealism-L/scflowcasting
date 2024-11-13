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
import com.plan.report.domain.vo.ScsItemVo;
import com.plan.report.domain.bo.ScsItemBo;
import com.plan.report.service.IScsItemService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_item
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/item")
public class ScsItemController extends BaseController {

    private final IScsItemService iScsItemService;

    /**
     * 查询scs_item列表
     */
    @SaCheckPermission("report:item:list")
    @GetMapping("/list")
    public TableDataInfo<ScsItemVo> list(ScsItemBo bo, PageQuery pageQuery) {
        return iScsItemService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_item列表
     */
    @SaCheckPermission("report:item:export")
    @Log(title = "scs_item", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsItemBo bo, HttpServletResponse response) {
        List<ScsItemVo> list = iScsItemService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_item", ScsItemVo.class, response);
    }

    /**
     * 获取scs_item详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:item:query")
    @GetMapping("/{id}")
    public R<ScsItemVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsItemService.queryById(id));
    }

    /**
     * 新增scs_item
     */
    @SaCheckPermission("report:item:add")
    @Log(title = "scs_item", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsItemBo bo) {
        return toAjax(iScsItemService.insertByBo(bo));
    }

    /**
     * 修改scs_item
     */
    @SaCheckPermission("report:item:edit")
    @Log(title = "scs_item", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsItemBo bo) {
        return toAjax(iScsItemService.updateByBo(bo));
    }

    /**
     * 删除scs_item
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:item:remove")
    @Log(title = "scs_item", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsItemService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}