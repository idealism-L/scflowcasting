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
import com.plan.report.domain.bo.ScsCustorderBo;
import com.plan.report.domain.vo.ScsCustorderVo;
import com.plan.report.service.IScsCustorderService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

/**
 * scs_custorder
 *
 * @author ruoyi
 * @date 2024-11-26
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/custorder")
public class ScsCustorderController extends BaseController {

    private final IScsCustorderService iScsCustorderService;

    /**
     * 查询scs_custorder列表
     */
    @SaCheckPermission("report:custorder:list")
    @GetMapping("/list")
    public TableDataInfo<ScsCustorderVo> list(ScsCustorderBo bo, PageQuery pageQuery) {
        return iScsCustorderService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_custorder列表
     */
    @SaCheckPermission("report:custorder:export")
    @Log(title = "scs_custorder", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsCustorderBo bo, HttpServletResponse response) {
        List<ScsCustorderVo> list = iScsCustorderService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_custorder", ScsCustorderVo.class, response);
    }

    /**
     * 获取scs_custorder详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:custorder:query")
    @GetMapping("/{id}")
    public R<ScsCustorderVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsCustorderService.queryById(id));
    }

    /**
     * 新增scs_custorder
     */
    @SaCheckPermission("report:custorder:add")
    @Log(title = "scs_custorder", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsCustorderBo bo) {
        return toAjax(iScsCustorderService.insertByBo(bo));
    }

    /**
     * 修改scs_custorder
     */
    @SaCheckPermission("report:custorder:edit")
    @Log(title = "scs_custorder", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsCustorderBo bo) {
        return toAjax(iScsCustorderService.updateByBo(bo));
    }

    /**
     * 删除scs_custorder
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:custorder:remove")
    @Log(title = "scs_custorder", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsCustorderService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
