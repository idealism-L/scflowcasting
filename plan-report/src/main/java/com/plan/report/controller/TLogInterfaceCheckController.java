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
import com.plan.report.domain.vo.TLogInterfaceCheckVo;
import com.plan.report.domain.bo.TLogInterfaceCheckBo;
import com.plan.report.service.ITLogInterfaceCheckService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 预测接口检查
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/logInterfaceCheck")
public class TLogInterfaceCheckController extends BaseController {

    private final ITLogInterfaceCheckService iTLogInterfaceCheckService;

    /**
     * 查询预测接口检查列表
     */
    @SaCheckPermission("report:logInterfaceCheck:list")
    @GetMapping("/list")
    public TableDataInfo<TLogInterfaceCheckVo> list(TLogInterfaceCheckBo bo, PageQuery pageQuery) {
        return iTLogInterfaceCheckService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出预测接口检查列表
     */
    @SaCheckPermission("report:logInterfaceCheck:export")
    @Log(title = "预测接口检查", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(TLogInterfaceCheckBo bo, HttpServletResponse response) {
        List<TLogInterfaceCheckVo> list = iTLogInterfaceCheckService.queryList(bo);
        ExcelUtil.exportExcel(list, "预测接口检查", TLogInterfaceCheckVo.class, response);
    }

    /**
     * 获取预测接口检查详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:logInterfaceCheck:query")
    @GetMapping("/{id}")
    public R<TLogInterfaceCheckVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iTLogInterfaceCheckService.queryById(id));
    }

    /**
     * 新增预测接口检查
     */
    @SaCheckPermission("report:logInterfaceCheck:add")
    @Log(title = "预测接口检查", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody TLogInterfaceCheckBo bo) {
        return toAjax(iTLogInterfaceCheckService.insertByBo(bo));
    }

    /**
     * 修改预测接口检查
     */
    @SaCheckPermission("report:logInterfaceCheck:edit")
    @Log(title = "预测接口检查", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody TLogInterfaceCheckBo bo) {
        return toAjax(iTLogInterfaceCheckService.updateByBo(bo));
    }

    /**
     * 删除预测接口检查
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:logInterfaceCheck:remove")
    @Log(title = "预测接口检查", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iTLogInterfaceCheckService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
