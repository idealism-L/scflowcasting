package com.plan.report.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.plan.common.core.domain.PageQuery;
import com.plan.common.core.page.TableDataInfo;
import com.plan.common.utils.StringUtils;
import com.plan.report.domain.SysMailConfig;
import com.plan.report.domain.bo.SysMailConfigBo;
import com.plan.report.domain.vo.SysMailConfigVo;
import com.plan.report.mapper.SysMailConfigMapper;
import com.plan.report.service.ISysMailConfigService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 邮件模版sys_mail_configService业务层处理
 *
 * @author ruoyi
 * @date 2024-11-28
 */
@RequiredArgsConstructor
@Service
public class SysMailConfigServiceImpl implements ISysMailConfigService {

    private final SysMailConfigMapper baseMapper;

    /**
     * 查询邮件模版sys_mail_config
     */
    @Override
    public SysMailConfigVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 查询邮件模版sys_mail_config列表
     */
    @Override
    public TableDataInfo<SysMailConfigVo> queryPageList(SysMailConfigBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<SysMailConfig> lqw = buildQueryWrapper(bo);
        Page<SysMailConfigVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询邮件模版sys_mail_config列表
     */
    @Override
    public List<SysMailConfigVo> queryList(SysMailConfigBo bo) {
        LambdaQueryWrapper<SysMailConfig> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<SysMailConfig> buildQueryWrapper(SysMailConfigBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<SysMailConfig> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getCode()), SysMailConfig::getCode, bo.getCode());
        lqw.eq(StringUtils.isNotBlank(bo.getTitle()), SysMailConfig::getTitle, bo.getTitle());
        lqw.eq(StringUtils.isNotBlank(bo.getMailFrom()), SysMailConfig::getMailFrom, bo.getMailFrom());
        lqw.eq(StringUtils.isNotBlank(bo.getMailTo()), SysMailConfig::getMailTo, bo.getMailTo());
        lqw.eq(StringUtils.isNotBlank(bo.getMailCc()), SysMailConfig::getMailCc, bo.getMailCc());
        lqw.eq(StringUtils.isNotBlank(bo.getContent()), SysMailConfig::getContent, bo.getContent());
        lqw.eq(bo.getVersionNo() != null, SysMailConfig::getVersionNo, bo.getVersionNo());
        return lqw;
    }

    /**
     * 新增邮件模版sys_mail_config
     */
    @Override
    public Boolean insertByBo(SysMailConfigBo bo) {
        SysMailConfig add = BeanUtil.toBean(bo, SysMailConfig.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改邮件模版sys_mail_config
     */
    @Override
    public Boolean updateByBo(SysMailConfigBo bo) {
        SysMailConfig update = BeanUtil.toBean(bo, SysMailConfig.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(SysMailConfig entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 批量删除邮件模版sys_mail_config
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteBatchIds(ids) > 0;
    }
}
