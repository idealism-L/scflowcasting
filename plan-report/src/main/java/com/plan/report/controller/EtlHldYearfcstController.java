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
import com.plan.report.domain.vo.EtlHldYearfcstVo;
import com.plan.report.domain.bo.EtlHldYearfcstBo;
import com.plan.report.service.IEtlHldYearfcstService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 年预测
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/hldYearfcst")
public class EtlHldYearfcstController extends BaseController {

    private final IEtlHldYearfcstService iEtlHldYearfcstService;

    /**
     * 查询年预测列表
     */
    @SaCheckPermission("report:hldYearfcst:list")
    @GetMapping("/list")
    public TableDataInfo<EtlHldYearfcstVo> list(EtlHldYearfcstBo bo, PageQuery pageQuery) {
        return iEtlHldYearfcstService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出年预测列表
     */
    @SaCheckPermission("report:hldYearfcst:export")
    @Log(title = "年预测", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(EtlHldYearfcstBo bo, HttpServletResponse response) {
        List<EtlHldYearfcstVo> list = iEtlHldYearfcstService.queryList(bo);
        ExcelUtil.exportExcel(list, "年预测", EtlHldYearfcstVo.class, response);
    }

    /**
     * 获取年预测详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:hldYearfcst:query")
    @GetMapping("/{id}")
    public R<EtlHldYearfcstVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iEtlHldYearfcstService.queryById(id));
    }

    /**
     * 新增年预测
     */
    @SaCheckPermission("report:hldYearfcst:add")
    @Log(title = "年预测", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody EtlHldYearfcstBo bo) {
        return toAjax(iEtlHldYearfcstService.insertByBo(bo));
    }

    /**
     * 修改年预测
     */
    @SaCheckPermission("report:hldYearfcst:edit")
    @Log(title = "年预测", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody EtlHldYearfcstBo bo) {
        return toAjax(iEtlHldYearfcstService.updateByBo(bo));
    }

    /**
     * 删除年预测
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:hldYearfcst:remove")
    @Log(title = "年预测", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iEtlHldYearfcstService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
