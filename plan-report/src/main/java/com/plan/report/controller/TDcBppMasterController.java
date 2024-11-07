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
import com.plan.report.domain.vo.TDcBppMasterVo;
import com.plan.report.domain.bo.TDcBppMasterBo;
import com.plan.report.service.ITDcBppMasterService;
import com.plan.common.core.page.TableDataInfo;

/**
 * BPP映射
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/dcBppMaster")
public class TDcBppMasterController extends BaseController {

    private final ITDcBppMasterService iTDcBppMasterService;

    /**
     * 查询BPP映射列表
     */
    @SaCheckPermission("report:dcBppMaster:list")
    @GetMapping("/list")
    public TableDataInfo<TDcBppMasterVo> list(TDcBppMasterBo bo, PageQuery pageQuery) {
        return iTDcBppMasterService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出BPP映射列表
     */
    @SaCheckPermission("report:dcBppMaster:export")
    @Log(title = "BPP映射", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(TDcBppMasterBo bo, HttpServletResponse response) {
        List<TDcBppMasterVo> list = iTDcBppMasterService.queryList(bo);
        ExcelUtil.exportExcel(list, "BPP映射", TDcBppMasterVo.class, response);
    }

    /**
     * 获取BPP映射详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:dcBppMaster:query")
    @GetMapping("/{id}")
    public R<TDcBppMasterVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iTDcBppMasterService.queryById(id));
    }

    /**
     * 新增BPP映射
     */
    @SaCheckPermission("report:dcBppMaster:add")
    @Log(title = "BPP映射", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody TDcBppMasterBo bo) {
        return toAjax(iTDcBppMasterService.insertByBo(bo));
    }

    /**
     * 修改BPP映射
     */
    @SaCheckPermission("report:dcBppMaster:edit")
    @Log(title = "BPP映射", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody TDcBppMasterBo bo) {
        return toAjax(iTDcBppMasterService.updateByBo(bo));
    }

    /**
     * 删除BPP映射
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:dcBppMaster:remove")
    @Log(title = "BPP映射", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iTDcBppMasterService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
