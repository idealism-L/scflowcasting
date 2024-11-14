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
import com.plan.report.domain.bo.ScsCalendarBo;
import com.plan.report.domain.vo.ScsCalendarVo;
import com.plan.report.service.IScsCalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

/**
 * scs_calendar日历
 *
 * @author ruoyi
 * @date 2024-11-14
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/calendar")
public class ScsCalendarController extends BaseController {

    private final IScsCalendarService iScsCalendarService;

    /**
     * 查询scs_calendar日历列表
     */
    @SaCheckPermission("report:calendar:list")
    @GetMapping("/list")
    public TableDataInfo<ScsCalendarVo> list(ScsCalendarBo bo, PageQuery pageQuery) {
        return iScsCalendarService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_calendar日历列表
     */
    @SaCheckPermission("report:calendar:export")
    @Log(title = "scs_calendar日历", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsCalendarBo bo, HttpServletResponse response) {
        List<ScsCalendarVo> list = iScsCalendarService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_calendar日历", ScsCalendarVo.class, response);
    }

    /**
     * 获取scs_calendar日历详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:calendar:query")
    @GetMapping("/{id}")
    public R<ScsCalendarVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsCalendarService.queryById(id));
    }

    /**
     * 新增scs_calendar日历
     */
    @SaCheckPermission("report:calendar:add")
    @Log(title = "scs_calendar日历", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsCalendarBo bo) {
        return toAjax(iScsCalendarService.insertByBo(bo));
    }

    /**
     * 修改scs_calendar日历
     */
    @SaCheckPermission("report:calendar:edit")
    @Log(title = "scs_calendar日历", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsCalendarBo bo) {
        return toAjax(iScsCalendarService.updateByBo(bo));
    }

    /**
     * 删除scs_calendar日历
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:calendar:remove")
    @Log(title = "scs_calendar日历", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsCalendarService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
