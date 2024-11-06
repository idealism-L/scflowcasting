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
import com.plan.report.domain.vo.TFcstKit26wVo;
import com.plan.report.domain.bo.TFcstKit26wBo;
import com.plan.report.service.ITFcstKit26wService;
import com.plan.common.core.page.TableDataInfo;

/**
 * t_fcst_kit_26w
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/fcstKit26w")
public class TFcstKit26wController extends BaseController {

    private final ITFcstKit26wService iTFcstKit26wService;

    /**
     * 查询t_fcst_kit_26w列表
     */
    @SaCheckPermission("report:fcstKit26w:list")
    @GetMapping("/list")
    public TableDataInfo<TFcstKit26wVo> list(TFcstKit26wBo bo, PageQuery pageQuery) {
        return iTFcstKit26wService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出t_fcst_kit_26w列表
     */
    @SaCheckPermission("report:fcstKit26w:export")
    @Log(title = "t_fcst_kit_26w", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(TFcstKit26wBo bo, HttpServletResponse response) {
        List<TFcstKit26wVo> list = iTFcstKit26wService.queryList(bo);
        ExcelUtil.exportExcel(list, "t_fcst_kit_26w", TFcstKit26wVo.class, response);
    }

    /**
     * 获取t_fcst_kit_26w详细信息
     *
     * @param imMainInsuranceConfigId 主键
     */
    @SaCheckPermission("report:fcstKit26w:query")
    @GetMapping("/{imMainInsuranceConfigId}")
    public R<TFcstKit26wVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long imMainInsuranceConfigId) {
        return R.ok(iTFcstKit26wService.queryById(imMainInsuranceConfigId));
    }

    /**
     * 新增t_fcst_kit_26w
     */
    @SaCheckPermission("report:fcstKit26w:add")
    @Log(title = "t_fcst_kit_26w", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody TFcstKit26wBo bo) {
        return toAjax(iTFcstKit26wService.insertByBo(bo));
    }

    /**
     * 修改t_fcst_kit_26w
     */
    @SaCheckPermission("report:fcstKit26w:edit")
    @Log(title = "t_fcst_kit_26w", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody TFcstKit26wBo bo) {
        return toAjax(iTFcstKit26wService.updateByBo(bo));
    }

    /**
     * 删除t_fcst_kit_26w
     *
     * @param imMainInsuranceConfigIds 主键串
     */
    @SaCheckPermission("report:fcstKit26w:remove")
    @Log(title = "t_fcst_kit_26w", businessType = BusinessType.DELETE)
    @DeleteMapping("/{imMainInsuranceConfigIds}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] imMainInsuranceConfigIds) {
        return toAjax(iTFcstKit26wService.deleteWithValidByIds(Arrays.asList(imMainInsuranceConfigIds), true));
    }
}
