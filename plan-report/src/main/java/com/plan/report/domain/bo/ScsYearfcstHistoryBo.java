package com.plan.report.domain.bo;

import com.plan.common.core.domain.BaseEntity;
import com.plan.common.core.validate.AddGroup;
import com.plan.common.core.validate.EditGroup;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * scs_yearfcst_history业务对象 scs_yearfcst_history
 *
 * @author ruoyi
 * @date 2024-11-26
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ScsYearfcstHistoryBo extends BaseEntity {

    /**
     * ID
     */
    @NotNull(message = "ID不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 来源ID
     */
    @NotNull(message = "来源ID不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long parentId;

    /**
     * 物料编码
     */
    @NotBlank(message = "物料编码不能为空", groups = { AddGroup.class, EditGroup.class })
    private String itemCode;

    /**
     * 物料
     */
    @NotBlank(message = "物料不能为空", groups = { AddGroup.class, EditGroup.class })
    private String item;

    /**
     * 物料描述
     */
    @NotBlank(message = "物料描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descr;

    /**
     * 英文描述
     */
    @NotBlank(message = "英文描述不能为空", groups = { AddGroup.class, EditGroup.class })
    private String descrEn;

    /**
     * 地点
     */
    @NotBlank(message = "地点不能为空", groups = { AddGroup.class, EditGroup.class })
    private String loc;

    /**
     * 单位
     */
    @NotBlank(message = "单位不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uom;

    /**
     * 起始日期
     */
    @NotNull(message = "起始日期不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date startdate;

    /**
     * 开始日期+文件名(固定部分)
     */
    @NotBlank(message = "开始日期+文件名(固定部分)不能为空", groups = { AddGroup.class, EditGroup.class })
    private String fileBatch;

    /**
     * 1月
     */
    @NotNull(message = "1月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM1;

    /**
     * 2月
     */
    @NotNull(message = "2月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM2;

    /**
     * 3月
     */
    @NotNull(message = "3月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM3;

    /**
     * 4月
     */
    @NotNull(message = "4月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM4;

    /**
     * 5月
     */
    @NotNull(message = "5月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM5;

    /**
     * 6月
     */
    @NotNull(message = "6月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM6;

    /**
     * 7月
     */
    @NotNull(message = "7月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM7;

    /**
     * 8月
     */
    @NotNull(message = "8月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM8;

    /**
     * 9月
     */
    @NotNull(message = "9月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM9;

    /**
     * 10月
     */
    @NotNull(message = "10月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM10;

    /**
     * 11月
     */
    @NotNull(message = "11月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM11;

    /**
     * 12月
     */
    @NotNull(message = "12月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM12;

    /**
     * 13月
     */
    @NotNull(message = "13月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM13;

    /**
     * 14月
     */
    @NotNull(message = "14月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM14;

    /**
     * 15月
     */
    @NotNull(message = "15月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM15;

    /**
     * 16月
     */
    @NotNull(message = "16月不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal uM16;

    /**
     * 物料区分
     */
    @NotBlank(message = "物料区分不能为空", groups = { AddGroup.class, EditGroup.class })
    private String itemPattern;

    /**
     * 装瓶集团
     */
    @NotBlank(message = "装瓶集团不能为空", groups = { AddGroup.class, EditGroup.class })
    private String corporation;

    /**
     * 物料集团
     */
    @NotBlank(message = "物料集团不能为空", groups = { AddGroup.class, EditGroup.class })
    private String itemCorporation;

    /**
     * 有效标识
     */
    @NotBlank(message = "有效标识不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uFlag;

    /**
     * 备注说明
     */
    @NotBlank(message = "备注说明不能为空", groups = { AddGroup.class, EditGroup.class })
    private String uComment;

    /**
     * 来源文件名
     */
    @NotBlank(message = "来源文件名不能为空", groups = { AddGroup.class, EditGroup.class })
    private String fileName;

    /**
     * 文件上传时间
     */
    @NotNull(message = "文件上传时间不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date editdate;

    /**
     * 版本号
     */
    @NotNull(message = "版本号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long versionNo;


}
