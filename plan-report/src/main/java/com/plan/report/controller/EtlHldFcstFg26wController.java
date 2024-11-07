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
import com.plan.report.domain.vo.EtlHldFcstFg26wVo;
import com.plan.report.domain.bo.EtlHldFcstFg26wBo;
import com.plan.report.service.IEtlHldFcstFg26wService;
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
@RequestMapping("/report/hldFcstFg26w")
public class EtlHldFcstFg26wController extends BaseController {

    private final IEtlHldFcstFg26wService iEtlHldFcstFg26wService;

    /**
     * 查询成品销售预测列表
     */
    @SaCheckPermission("report:hldFcstFg26w:list")
    @GetMapping("/list")
    public TableDataInfo<EtlHldFcstFg26wVo> list(EtlHldFcstFg26wBo bo, PageQuery pageQuery) {
        return iEtlHldFcstFg26wService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出成品销售预测列表
     */
    @SaCheckPermission("report:hldFcstFg26w:export")
    @Log(title = "成品销售预测", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(EtlHldFcstFg26wBo bo, HttpServletResponse response) {
        List<EtlHldFcstFg26wVo> list = iEtlHldFcstFg26wService.queryList(bo);
        ExcelUtil.exportExcel(list, "成品销售预测", EtlHldFcstFg26wVo.class, response);
    }

    /**
     * 获取成品销售预测详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:hldFcstFg26w:query")
    @GetMapping("/{id}")
    public R<EtlHldFcstFg26wVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iEtlHldFcstFg26wService.queryById(id));
    }

    /**
     * 新增成品销售预测
     */
    @SaCheckPermission("report:hldFcstFg26w:add")
    @Log(title = "成品销售预测", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody EtlHldFcstFg26wBo bo) {
        return toAjax(iEtlHldFcstFg26wService.insertByBo(bo));
    }

    /**
     * 修改成品销售预测
     */
    @SaCheckPermission("report:hldFcstFg26w:edit")
    @Log(title = "成品销售预测", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody EtlHldFcstFg26wBo bo) {
        return toAjax(iEtlHldFcstFg26wService.updateByBo(bo));
    }

    /**
     * 删除成品销售预测
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:hldFcstFg26w:remove")
    @Log(title = "成品销售预测", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iEtlHldFcstFg26wService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
