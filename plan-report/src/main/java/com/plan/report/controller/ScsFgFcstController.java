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
import com.plan.report.domain.bo.ScsFgFcstBo;
import com.plan.report.domain.vo.ScsFgFcstVo;
import com.plan.report.service.IScsFgFcstService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

/**
 * scs_fg_fcst
 *
 * @author ruoyi
 * @date 2024-11-26
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/fgFcst")
public class ScsFgFcstController extends BaseController {

    private final IScsFgFcstService iScsFgFcstService;

    /**
     * 查询scs_fg_fcst列表
     */
    @SaCheckPermission("report:fgFcst:list")
    @GetMapping("/list")
    public TableDataInfo<ScsFgFcstVo> list(ScsFgFcstBo bo, PageQuery pageQuery) {
        return iScsFgFcstService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_fg_fcst列表
     */
    @SaCheckPermission("report:fgFcst:export")
    @Log(title = "scs_fg_fcst", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsFgFcstBo bo, HttpServletResponse response) {
        List<ScsFgFcstVo> list = iScsFgFcstService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_fg_fcst", ScsFgFcstVo.class, response);
    }

    /**
     * 成品预测（按集团）查询列表
     */
    @SaCheckPermission("report:fgFcst:list")
    @GetMapping("/listCorporation")
    public TableDataInfo<ScsFgFcstVo> listCorporation(ScsFgFcstBo bo, PageQuery pageQuery) {
        return iScsFgFcstService.queryPageListCorporation(bo, pageQuery);
    }

    /**
     * 获取scs_fg_fcst详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:fgFcst:query")
    @GetMapping("/{id}")
    public R<ScsFgFcstVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsFgFcstService.queryById(id));
    }

    /**
     * 新增scs_fg_fcst
     */
    @SaCheckPermission("report:fgFcst:add")
    @Log(title = "scs_fg_fcst", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsFgFcstBo bo) {
        return toAjax(iScsFgFcstService.insertByBo(bo));
    }

    /**
     * 修改scs_fg_fcst
     */
    @SaCheckPermission("report:fgFcst:edit")
    @Log(title = "scs_fg_fcst", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsFgFcstBo bo) {
        return toAjax(iScsFgFcstService.updateByBo(bo));
    }

    /**
     * 删除scs_fg_fcst
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:fgFcst:remove")
    @Log(title = "scs_fg_fcst", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsFgFcstService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
