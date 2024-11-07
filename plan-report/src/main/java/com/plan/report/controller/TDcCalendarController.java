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
import com.plan.report.domain.vo.TDcCalendarVo;
import com.plan.report.domain.bo.TDcCalendarBo;
import com.plan.report.service.ITDcCalendarService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 日历
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/dcCalendar")
public class TDcCalendarController extends BaseController {

    private final ITDcCalendarService iTDcCalendarService;

    /**
     * 查询日历列表
     */
    @SaCheckPermission("report:dcCalendar:list")
    @GetMapping("/list")
    public TableDataInfo<TDcCalendarVo> list(TDcCalendarBo bo, PageQuery pageQuery) {
        return iTDcCalendarService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出日历列表
     */
    @SaCheckPermission("report:dcCalendar:export")
    @Log(title = "日历", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(TDcCalendarBo bo, HttpServletResponse response) {
        List<TDcCalendarVo> list = iTDcCalendarService.queryList(bo);
        ExcelUtil.exportExcel(list, "日历", TDcCalendarVo.class, response);
    }

    /**
     * 获取日历详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:dcCalendar:query")
    @GetMapping("/{id}")
    public R<TDcCalendarVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iTDcCalendarService.queryById(id));
    }

    /**
     * 新增日历
     */
    @SaCheckPermission("report:dcCalendar:add")
    @Log(title = "日历", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody TDcCalendarBo bo) {
        return toAjax(iTDcCalendarService.insertByBo(bo));
    }

    /**
     * 修改日历
     */
    @SaCheckPermission("report:dcCalendar:edit")
    @Log(title = "日历", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody TDcCalendarBo bo) {
        return toAjax(iTDcCalendarService.updateByBo(bo));
    }

    /**
     * 删除日历
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:dcCalendar:remove")
    @Log(title = "日历", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iTDcCalendarService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
