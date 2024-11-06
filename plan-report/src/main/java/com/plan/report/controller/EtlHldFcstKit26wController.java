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
import com.plan.report.domain.vo.EtlHldFcstKit26wVo;
import com.plan.report.domain.bo.EtlHldFcstKit26wBo;
import com.plan.report.service.IEtlHldFcstKit26wService;
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
@RequestMapping("/report/hldFcstKit26w")
public class EtlHldFcstKit26wController extends BaseController {

    private final IEtlHldFcstKit26wService iEtlHldFcstKit26wService;

    /**
     * 查询主剂需求预测列表
     */
    @SaCheckPermission("report:hldFcstKit26w:list")
    @GetMapping("/list")
    public TableDataInfo<EtlHldFcstKit26wVo> list(EtlHldFcstKit26wBo bo, PageQuery pageQuery) {
        return iEtlHldFcstKit26wService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出主剂需求预测列表
     */
    @SaCheckPermission("report:hldFcstKit26w:export")
    @Log(title = "主剂需求预测", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(EtlHldFcstKit26wBo bo, HttpServletResponse response) {
        List<EtlHldFcstKit26wVo> list = iEtlHldFcstKit26wService.queryList(bo);
        ExcelUtil.exportExcel(list, "主剂需求预测", EtlHldFcstKit26wVo.class, response);
    }

    /**
     * 获取主剂需求预测详细信息
     *
     * @param imMainInsuranceConfigId 主键
     */
    @SaCheckPermission("report:hldFcstKit26w:query")
    @GetMapping("/{imMainInsuranceConfigId}")
    public R<EtlHldFcstKit26wVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long imMainInsuranceConfigId) {
        return R.ok(iEtlHldFcstKit26wService.queryById(imMainInsuranceConfigId));
    }

    /**
     * 新增主剂需求预测
     */
    @SaCheckPermission("report:hldFcstKit26w:add")
    @Log(title = "主剂需求预测", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody EtlHldFcstKit26wBo bo) {
        return toAjax(iEtlHldFcstKit26wService.insertByBo(bo));
    }

    /**
     * 修改主剂需求预测
     */
    @SaCheckPermission("report:hldFcstKit26w:edit")
    @Log(title = "主剂需求预测", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody EtlHldFcstKit26wBo bo) {
        return toAjax(iEtlHldFcstKit26wService.updateByBo(bo));
    }

    /**
     * 删除主剂需求预测
     *
     * @param imMainInsuranceConfigIds 主键串
     */
    @SaCheckPermission("report:hldFcstKit26w:remove")
    @Log(title = "主剂需求预测", businessType = BusinessType.DELETE)
    @DeleteMapping("/{imMainInsuranceConfigIds}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] imMainInsuranceConfigIds) {
        return toAjax(iEtlHldFcstKit26wService.deleteWithValidByIds(Arrays.asList(imMainInsuranceConfigIds), true));
    }
}
