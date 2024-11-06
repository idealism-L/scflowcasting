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
import com.plan.report.domain.bo.EtlClnItemBo;
import com.plan.report.domain.vo.EtlClnItemVo;
import com.plan.report.service.IEtlClnItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

/**
 * 物料编码
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/clnItem")
public class EtlClnItemController extends BaseController {

    private final IEtlClnItemService iEtlClnItemService;

    /**
     * 查询物料编码列表
     */
    @SaCheckPermission("report:clnItem:list")
    @GetMapping("/list")
    public TableDataInfo<EtlClnItemVo> list(EtlClnItemBo bo, PageQuery pageQuery) {
        return iEtlClnItemService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出物料编码列表
     */
    @SaCheckPermission("report:clnItem:export")
    @Log(title = "物料编码", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(EtlClnItemBo bo, HttpServletResponse response) {
        List<EtlClnItemVo> list = iEtlClnItemService.queryList(bo);
        ExcelUtil.exportExcel(list, "物料编码", EtlClnItemVo.class, response);
    }

    /**
     * 获取物料编码详细信息
     *
     * @param imMainInsuranceConfigId 主键
     */
    @SaCheckPermission("report:clnItem:query")
    @GetMapping("/{imMainInsuranceConfigId}")
    public R<EtlClnItemVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long imMainInsuranceConfigId) {
        return R.ok(iEtlClnItemService.queryById(imMainInsuranceConfigId));
    }

    /**
     * 新增物料编码
     */
    @SaCheckPermission("report:clnItem:add")
    @Log(title = "物料编码", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody EtlClnItemBo bo) {
        return toAjax(iEtlClnItemService.insertByBo(bo));
    }

    /**
     * 修改物料编码
     */
    @SaCheckPermission("report:clnItem:edit")
    @Log(title = "物料编码", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody EtlClnItemBo bo) {
        return toAjax(iEtlClnItemService.updateByBo(bo));
    }

    /**
     * 删除物料编码
     *
     * @param imMainInsuranceConfigIds 主键串
     */
    @SaCheckPermission("report:clnItem:remove")
    @Log(title = "物料编码", businessType = BusinessType.DELETE)
    @DeleteMapping("/{imMainInsuranceConfigIds}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] imMainInsuranceConfigIds) {
        return toAjax(iEtlClnItemService.deleteWithValidByIds(Arrays.asList(imMainInsuranceConfigIds), true));
    }
}
