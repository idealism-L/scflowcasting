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
import com.plan.report.domain.vo.EtlHldFcstKitVo;
import com.plan.report.domain.bo.EtlHldFcstKitBo;
import com.plan.report.service.IEtlHldFcstKitService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 主剂需求预测
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/hldFcstKit")
public class EtlHldFcstKitController extends BaseController {

    private final IEtlHldFcstKitService iEtlHldFcstKitService;

    /**
     * 查询主剂需求预测列表
     */
    @SaCheckPermission("report:hldFcstKit:list")
    @GetMapping("/list")
    public TableDataInfo<EtlHldFcstKitVo> list(EtlHldFcstKitBo bo, PageQuery pageQuery) {
        return iEtlHldFcstKitService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出主剂需求预测列表
     */
    @SaCheckPermission("report:hldFcstKit:export")
    @Log(title = "主剂需求预测", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(EtlHldFcstKitBo bo, HttpServletResponse response) {
        List<EtlHldFcstKitVo> list = iEtlHldFcstKitService.queryList(bo);
        ExcelUtil.exportExcel(list, "主剂需求预测", EtlHldFcstKitVo.class, response);
    }

    /**
     * 获取主剂需求预测详细信息
     *
     * @param imMainInsuranceConfigId 主键
     */
    @SaCheckPermission("report:hldFcstKit:query")
    @GetMapping("/{imMainInsuranceConfigId}")
    public R<EtlHldFcstKitVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long imMainInsuranceConfigId) {
        return R.ok(iEtlHldFcstKitService.queryById(imMainInsuranceConfigId));
    }

    /**
     * 新增主剂需求预测
     */
    @SaCheckPermission("report:hldFcstKit:add")
    @Log(title = "主剂需求预测", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody EtlHldFcstKitBo bo) {
        return toAjax(iEtlHldFcstKitService.insertByBo(bo));
    }

    /**
     * 修改主剂需求预测
     */
    @SaCheckPermission("report:hldFcstKit:edit")
    @Log(title = "主剂需求预测", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody EtlHldFcstKitBo bo) {
        return toAjax(iEtlHldFcstKitService.updateByBo(bo));
    }

    /**
     * 删除主剂需求预测
     *
     * @param imMainInsuranceConfigIds 主键串
     */
    @SaCheckPermission("report:hldFcstKit:remove")
    @Log(title = "主剂需求预测", businessType = BusinessType.DELETE)
    @DeleteMapping("/{imMainInsuranceConfigIds}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] imMainInsuranceConfigIds) {
        return toAjax(iEtlHldFcstKitService.deleteWithValidByIds(Arrays.asList(imMainInsuranceConfigIds), true));
    }
}
