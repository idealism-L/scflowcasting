package com.plan.report.service;

import com.plan.report.domain.SysMailConfig;
import com.plan.report.domain.vo.SysMailConfigVo;
import com.plan.report.domain.bo.SysMailConfigBo;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.core.domain.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 邮件模版sys_mail_configService接口
 *
 * @author ruoyi
 * @date 2024-11-28
 */
public interface ISysMailConfigService {

    /**
     * 查询邮件模版sys_mail_config
     */
    SysMailConfigVo queryById(Long id);

    /**
     * 查询邮件模版sys_mail_config列表
     */
    TableDataInfo<SysMailConfigVo> queryPageList(SysMailConfigBo bo, PageQuery pageQuery);

    /**
     * 查询邮件模版sys_mail_config列表
     */
    List<SysMailConfigVo> queryList(SysMailConfigBo bo);

    /**
     * 新增邮件模版sys_mail_config
     */
    Boolean insertByBo(SysMailConfigBo bo);

    /**
     * 修改邮件模版sys_mail_config
     */
    Boolean updateByBo(SysMailConfigBo bo);

    /**
     * 校验并批量删除邮件模版sys_mail_config信息
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
