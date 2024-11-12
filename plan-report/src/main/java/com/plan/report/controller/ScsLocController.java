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
import com.plan.report.domain.vo.ScsLocVo;
import com.plan.report.domain.bo.ScsLocBo;
import com.plan.report.service.IScsLocService;
import com.plan.common.core.page.TableDataInfo;

/**
 * scs_loc
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/loc")
public class ScsLocController extends BaseController {

    private final IScsLocService iScsLocService;

    /**
     * 查询scs_loc列表
     */
    @SaCheckPermission("report:loc:list")
    @GetMapping("/list")
    public TableDataInfo<ScsLocVo> list(ScsLocBo bo, PageQuery pageQuery) {
        return iScsLocService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_loc列表
     */
    @SaCheckPermission("report:loc:export")
    @Log(title = "scs_loc", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsLocBo bo, HttpServletResponse response) {
        List<ScsLocVo> list = iScsLocService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_loc", ScsLocVo.class, response);
    }

    /**
     * 获取scs_loc详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:loc:query")
    @GetMapping("/{id}")
    public R<ScsLocVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsLocService.queryById(id));
    }

    /**
     * 新增scs_loc
     */
    @SaCheckPermission("report:loc:add")
    @Log(title = "scs_loc", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsLocBo bo) {
        return toAjax(iScsLocService.insertByBo(bo));
    }

    /**
     * 修改scs_loc
     */
    @SaCheckPermission("report:loc:edit")
    @Log(title = "scs_loc", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsLocBo bo) {
        return toAjax(iScsLocService.updateByBo(bo));
    }

    /**
     * 删除scs_loc
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:loc:remove")
    @Log(title = "scs_loc", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsLocService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
