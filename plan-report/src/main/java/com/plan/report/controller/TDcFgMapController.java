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
import com.plan.report.domain.vo.TDcFgMapVo;
import com.plan.report.domain.bo.TDcFgMapBo;
import com.plan.report.service.ITDcFgMapService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 成品映射
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/dcFgMap")
public class TDcFgMapController extends BaseController {

    private final ITDcFgMapService iTDcFgMapService;

    /**
     * 查询成品映射列表
     */
    @SaCheckPermission("report:dcFgMap:list")
    @GetMapping("/list")
    public TableDataInfo<TDcFgMapVo> list(TDcFgMapBo bo, PageQuery pageQuery) {
        return iTDcFgMapService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出成品映射列表
     */
    @SaCheckPermission("report:dcFgMap:export")
    @Log(title = "成品映射", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(TDcFgMapBo bo, HttpServletResponse response) {
        List<TDcFgMapVo> list = iTDcFgMapService.queryList(bo);
        ExcelUtil.exportExcel(list, "成品映射", TDcFgMapVo.class, response);
    }

    /**
     * 获取成品映射详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:dcFgMap:query")
    @GetMapping("/{id}")
    public R<TDcFgMapVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iTDcFgMapService.queryById(id));
    }

    /**
     * 新增成品映射
     */
    @SaCheckPermission("report:dcFgMap:add")
    @Log(title = "成品映射", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody TDcFgMapBo bo) {
        return toAjax(iTDcFgMapService.insertByBo(bo));
    }

    /**
     * 修改成品映射
     */
    @SaCheckPermission("report:dcFgMap:edit")
    @Log(title = "成品映射", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody TDcFgMapBo bo) {
        return toAjax(iTDcFgMapService.updateByBo(bo));
    }

    /**
     * 删除成品映射
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:dcFgMap:remove")
    @Log(title = "成品映射", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iTDcFgMapService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
