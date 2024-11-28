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
import com.plan.report.domain.vo.SysMailConfigVo;
import com.plan.report.domain.bo.SysMailConfigBo;
import com.plan.report.service.ISysMailConfigService;
import com.plan.common.core.page.TableDataInfo;

/**
 * 邮件模版sys_mail_config
 *
 * @author ruoyi
 * @date 2024-11-28
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/report/mailConfig")
public class SysMailConfigController extends BaseController {

    private final ISysMailConfigService iSysMailConfigService;

    /**
     * 查询邮件模版sys_mail_config列表
     */
    @SaCheckPermission("report:mailConfig:list")
    @GetMapping("/list")
    public TableDataInfo<SysMailConfigVo> list(SysMailConfigBo bo, PageQuery pageQuery) {
        return iSysMailConfigService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出邮件模版sys_mail_config列表
     */
    @SaCheckPermission("report:mailConfig:export")
    @Log(title = "邮件模版sys_mail_config", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(SysMailConfigBo bo, HttpServletResponse response) {
        List<SysMailConfigVo> list = iSysMailConfigService.queryList(bo);
        ExcelUtil.exportExcel(list, "邮件模版sys_mail_config", SysMailConfigVo.class, response);
    }

    /**
     * 获取邮件模版sys_mail_config详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("report:mailConfig:query")
    @GetMapping("/{id}")
    public R<SysMailConfigVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(iSysMailConfigService.queryById(id));
    }

    /**
     * 新增邮件模版sys_mail_config
     */
    @SaCheckPermission("report:mailConfig:add")
    @Log(title = "邮件模版sys_mail_config", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody SysMailConfigBo bo) {
        return toAjax(iSysMailConfigService.insertByBo(bo));
    }

    /**
     * 修改邮件模版sys_mail_config
     */
    @SaCheckPermission("report:mailConfig:edit")
    @Log(title = "邮件模版sys_mail_config", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody SysMailConfigBo bo) {
        return toAjax(iSysMailConfigService.updateByBo(bo));
    }

    /**
     * 删除邮件模版sys_mail_config
     *
     * @param ids 主键串
     */
    @SaCheckPermission("report:mailConfig:remove")
    @Log(title = "邮件模版sys_mail_config", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(iSysMailConfigService.deleteWithValidByIds(Arrays.asList(ids), true));
    }
}
