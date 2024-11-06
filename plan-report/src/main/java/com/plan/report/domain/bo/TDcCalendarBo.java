package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 日历业务对象 t_dc_calendar
 *
 * @author ruoyi
 * @date 2024-11-06
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class TDcCalendarBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long imMainInsuranceConfigId;

    /**
     * 年份
     */
    @NotBlank(message = "年份不能为空", groups = { AddGroup.class, EditGroup.class })
    private String yearNum;

    /**
     * 开始日期
     */
    @NotNull(message = "开始日期不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date startdate;

    /**
     * 周号
     */
    @NotBlank(message = "周号不能为空", groups = { AddGroup.class, EditGroup.class })
    private String weekNum;


}
