package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.plan.common.annotation.ExcelDictFormat;
import com.plan.common.convert.ExcelDictConvert;
import lombok.Data;

import java.io.Serializable;

/**
 * 地点视图对象 t_dc_loc
 *
 * @author ruoyi
 * @date 2024-11-06
 */
@Data
@ExcelIgnoreUnannotated
public class TDcLocVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * 地点名称
     */
    @ExcelProperty(value = "地点名称")
    private String locName;

    /**
     * 地点代码
     */
    @ExcelProperty(value = "地点代码")
    private String loc;

    /**
     * 描述
     */
    @ExcelProperty(value = "描述")
    private String descr;

    /**
     * OU
     */
    @ExcelProperty(value = "OU")
    private String uOu;

    /**
     * OU描述
     */
    @ExcelProperty(value = "OU描述")
    private String uOuDescr;

    /**
     * 装瓶集团
     */
    @ExcelProperty(value = "装瓶集团")
    private String corporation;

    /**
     * 地点类型
     */
    @ExcelProperty(value = "地点类型")
    private String uLocType;

    /**
     * SCMC代码
     */
    @ExcelProperty(value = "SCMC代码")
    private String uScmcCode;

    /**
     * CPS代码
     */
    @ExcelProperty(value = "CPS代码")
    private String uCpsCode;

    /**
     * 邮件
     */
    @ExcelProperty(value = "邮件")
    private String uEmail;

    /**
     * 状态
     */
    @ExcelProperty(value = "状态")
    private String uStatus;


}
