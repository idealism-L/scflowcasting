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
import com.plan.report.domain.vo.TFcstFg26wVo;
import com.plan.report.domain.bo.TFcstFg26wBo;
import com.plan.report.service.ITFcstFg26wService;
import com.plan.common.core.page.TableDataInfo;

/**
 * t_fcst_fg_26w
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/fcstFg26w")
public class TFcstFg26wController extends BaseController {

    private final ITFcstFg26wService iTFcstFg26wService;

    /**
     * 查询t_fcst_fg_26w列表
     */
    @SaCheckPermission("report:fcstFg26w:list")
    @GetMapping("/list")
    public TableDataInfo<TFcstFg26wVo> list(TFcstFg26wBo bo, PageQuery pageQuery) {
        return iTFcstFg26wService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出t_fcst_fg_26w列表
     */
    @SaCheckPermission("report:fcstFg26w:export")
    @Log(title = "t_fcst_fg_26w", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(TFcstFg26wBo bo, HttpServletResponse response) {
        List<TFcstFg26wVo> list = iTFcstFg26wService.queryList(bo);
        ExcelUtil.exportExcel(list, "t_fcst_fg_26w", TFcstFg26wVo.class, response);
    }

    /**
     * 获取t_fcst_fg_26w详细信息
     *
     * @param imMainInsuranceConfigId 主键
     */
    @SaCheckPermission("report:fcstFg26w:query")
    @GetMapping("/{imMainInsuranceConfigId}")
    public R<TFcstFg26wVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long imMainInsuranceConfigId) {
        return R.ok(iTFcstFg26wService.queryById(imMainInsuranceConfigId));
    }

    /**
     * 新增t_fcst_fg_26w
     */
    @SaCheckPermission("report:fcstFg26w:add")
    @Log(title = "t_fcst_fg_26w", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody TFcstFg26wBo bo) {
        return toAjax(iTFcstFg26wService.insertByBo(bo));
    }

    /**
     * 修改t_fcst_fg_26w
     */
    @SaCheckPermission("report:fcstFg26w:edit")
    @Log(title = "t_fcst_fg_26w", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody TFcstFg26wBo bo) {
        return toAjax(iTFcstFg26wService.updateByBo(bo));
    }

    /**
     * 删除t_fcst_fg_26w
     *
     * @param imMainInsuranceConfigIds 主键串
     */
    @SaCheckPermission("report:fcstFg26w:remove")
    @Log(title = "t_fcst_fg_26w", businessType = BusinessType.DELETE)
    @DeleteMapping("/{imMainInsuranceConfigIds}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] imMainInsuranceConfigIds) {
        return toAjax(iTFcstFg26wService.deleteWithValidByIds(Arrays.asList(imMainInsuranceConfigIds), true));
    }
}
