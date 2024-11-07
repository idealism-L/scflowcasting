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
import com.plan.report.domain.vo.EtlHldFcstFgVo;
import com.plan.report.domain.bo.EtlHldFcstFgBo;
import com.plan.report.service.IEtlHldFcstFgService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 成品销售预测
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/hldFcstFg")
public class EtlHldFcstFgController extends BaseController {

    private final IEtlHldFcstFgService iEtlHldFcstFgService;

    /**
     * 查询成品销售预测列表
     */
    @SaCheckPermission("report:hldFcstFg:list")
    @GetMapping("/list")
    public TableDataInfo<EtlHldFcstFgVo> list(EtlHldFcstFgBo bo, PageQuery pageQuery) {
        return iEtlHldFcstFgService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出成品销售预测列表
     */
    @SaCheckPermission("report:hldFcstFg:export")
    @Log(title = "成品销售预测", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(EtlHldFcstFgBo bo, HttpServletResponse response) {
        List<EtlHldFcstFgVo> list = iEtlHldFcstFgService.queryList(bo);
        ExcelUtil.exportExcel(list, "成品销售预测", EtlHldFcstFgVo.class, response);
    }

    /**
     * 获取成品销售预测详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:hldFcstFg:query")
    @GetMapping("/{id}")
    public R<EtlHldFcstFgVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iEtlHldFcstFgService.queryById(id));
    }

    /**
     * 新增成品销售预测
     */
    @SaCheckPermission("report:hldFcstFg:add")
    @Log(title = "成品销售预测", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody EtlHldFcstFgBo bo) {
        return toAjax(iEtlHldFcstFgService.insertByBo(bo));
    }

    /**
     * 修改成品销售预测
     */
    @SaCheckPermission("report:hldFcstFg:edit")
    @Log(title = "成品销售预测", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody EtlHldFcstFgBo bo) {
        return toAjax(iEtlHldFcstFgService.updateByBo(bo));
    }

    /**
     * 删除成品销售预测
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:hldFcstFg:remove")
    @Log(title = "成品销售预测", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iEtlHldFcstFgService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
