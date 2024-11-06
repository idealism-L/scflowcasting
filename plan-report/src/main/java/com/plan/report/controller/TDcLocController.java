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
import com.plan.report.domain.vo.TDcLocVo;
import com.plan.report.domain.bo.TDcLocBo;
import com.plan.report.service.ITDcLocService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 地点
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/dcLoc")
public class TDcLocController extends BaseController {

    private final ITDcLocService iTDcLocService;

    /**
     * 查询地点列表
     */
    @SaCheckPermission("report:dcLoc:list")
    @GetMapping("/list")
    public TableDataInfo<TDcLocVo> list(TDcLocBo bo, PageQuery pageQuery) {
        return iTDcLocService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出地点列表
     */
    @SaCheckPermission("report:dcLoc:export")
    @Log(title = "地点", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(TDcLocBo bo, HttpServletResponse response) {
        List<TDcLocVo> list = iTDcLocService.queryList(bo);
        ExcelUtil.exportExcel(list, "地点", TDcLocVo.class, response);
    }

    /**
     * 获取地点详细信息
     *
     * @param imMainInsuranceConfigId 主键
     */
    @SaCheckPermission("report:dcLoc:query")
    @GetMapping("/{imMainInsuranceConfigId}")
    public R<TDcLocVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long imMainInsuranceConfigId) {
        return R.ok(iTDcLocService.queryById(imMainInsuranceConfigId));
    }

    /**
     * 新增地点
     */
    @SaCheckPermission("report:dcLoc:add")
    @Log(title = "地点", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody TDcLocBo bo) {
        return toAjax(iTDcLocService.insertByBo(bo));
    }

    /**
     * 修改地点
     */
    @SaCheckPermission("report:dcLoc:edit")
    @Log(title = "地点", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody TDcLocBo bo) {
        return toAjax(iTDcLocService.updateByBo(bo));
    }

    /**
     * 删除地点
     *
     * @param imMainInsuranceConfigIds 主键串
     */
    @SaCheckPermission("report:dcLoc:remove")
    @Log(title = "地点", businessType = BusinessType.DELETE)
    @DeleteMapping("/{imMainInsuranceConfigIds}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] imMainInsuranceConfigIds) {
        return toAjax(iTDcLocService.deleteWithValidByIds(Arrays.asList(imMainInsuranceConfigIds), true));
    }
}
