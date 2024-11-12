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
import com.plan.report.domain.bo.ScsBppMasterBo;
import com.plan.report.domain.vo.ScsBppMasterVo;
import com.plan.report.service.IScsBppMasterService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

/**
 * scs_bpp_master
 *
 * @author ruoyi
 * @date 2024-11-12
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/bppMaster")
public class ScsBppMasterController extends BaseController {

    private final IScsBppMasterService iScsBppMasterService;

    /**
     * 查询scs_bpp_master列表
     */
    @SaCheckPermission("report:bppMaster:list")
    @GetMapping("/list")
    public TableDataInfo<ScsBppMasterVo> list(ScsBppMasterBo bo, PageQuery pageQuery) {
        return iScsBppMasterService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出scs_bpp_master列表
     */
    @SaCheckPermission("report:bppMaster:export")
    @Log(title = "scs_bpp_master", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(ScsBppMasterBo bo, HttpServletResponse response) {
        List<ScsBppMasterVo> list = iScsBppMasterService.queryList(bo);
        ExcelUtil.exportExcel(list, "scs_bpp_master", ScsBppMasterVo.class, response);
    }

    /**
     * 获取scs_bpp_master详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:bppMaster:query")
    @GetMapping("/{id}")
    public R<ScsBppMasterVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iScsBppMasterService.queryById(id));
    }

    /**
     * 新增scs_bpp_master
     */
    @SaCheckPermission("report:bppMaster:add")
    @Log(title = "scs_bpp_master", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody ScsBppMasterBo bo) {
        return toAjax(iScsBppMasterService.insertByBo(bo));
    }

    /**
     * 修改scs_bpp_master
     */
    @SaCheckPermission("report:bppMaster:edit")
    @Log(title = "scs_bpp_master", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody ScsBppMasterBo bo) {
        return toAjax(iScsBppMasterService.updateByBo(bo));
    }

    /**
     * 删除scs_bpp_master
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:bppMaster:remove")
    @Log(title = "scs_bpp_master", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iScsBppMasterService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
