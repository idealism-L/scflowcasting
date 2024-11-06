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
import com.plan.report.domain.vo.EtlHldFcstVo;
import com.plan.report.domain.bo.EtlHldFcstBo;
import com.plan.report.service.IEtlHldFcstService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 销售预测
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/hldFcst")
public class EtlHldFcstController extends BaseController {

    private final IEtlHldFcstService iEtlHldFcstService;

    /**
     * 查询销售预测列表
     */
    @SaCheckPermission("report:hldFcst:list")
    @GetMapping("/list")
    public TableDataInfo<EtlHldFcstVo> list(EtlHldFcstBo bo, PageQuery pageQuery) {
        return iEtlHldFcstService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出销售预测列表
     */
    @SaCheckPermission("report:hldFcst:export")
    @Log(title = "销售预测", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(EtlHldFcstBo bo, HttpServletResponse response) {
        List<EtlHldFcstVo> list = iEtlHldFcstService.queryList(bo);
        ExcelUtil.exportExcel(list, "销售预测", EtlHldFcstVo.class, response);
    }

    /**
     * 获取销售预测详细信息
     *
     * @param imMainInsuranceConfigId 主键
     */
    @SaCheckPermission("report:hldFcst:query")
    @GetMapping("/{imMainInsuranceConfigId}")
    public R<EtlHldFcstVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long imMainInsuranceConfigId) {
        return R.ok(iEtlHldFcstService.queryById(imMainInsuranceConfigId));
    }

    /**
     * 新增销售预测
     */
    @SaCheckPermission("report:hldFcst:add")
    @Log(title = "销售预测", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody EtlHldFcstBo bo) {
        return toAjax(iEtlHldFcstService.insertByBo(bo));
    }

    /**
     * 修改销售预测
     */
    @SaCheckPermission("report:hldFcst:edit")
    @Log(title = "销售预测", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody EtlHldFcstBo bo) {
        return toAjax(iEtlHldFcstService.updateByBo(bo));
    }

    /**
     * 删除销售预测
     *
     * @param imMainInsuranceConfigIds 主键串
     */
    @SaCheckPermission("report:hldFcst:remove")
    @Log(title = "销售预测", businessType = BusinessType.DELETE)
    @DeleteMapping("/{imMainInsuranceConfigIds}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] imMainInsuranceConfigIds) {
        return toAjax(iEtlHldFcstService.deleteWithValidByIds(Arrays.asList(imMainInsuranceConfigIds), true));
    }
}
