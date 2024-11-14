package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * scs_loc视图对象 scs_loc
 *
 * @author ruoyi
 * @date 2024-11-14
 */
@Data
@ExcelIgnoreUnannotated
public class ScsLocVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * 地点
     */
    @ExcelProperty(value = "地点")
    private String loc;

    /**
     * 地点代码
     */
    @ExcelProperty(value = "地点代码")
    private String locOwnCode;

    /**
     * 地点描述
     */
    @ExcelProperty(value = "地点描述")
    private String descr;

    /**
     * OU
     */
    @ExcelProperty(value = "OU")
    private String ou;

    /**
     * OU描述
     */
    @ExcelProperty(value = "OU描述")
    private String ouDescr;

    /**
     * 装瓶集团
     */
    @ExcelProperty(value = "装瓶集团")
    private String corporation;

    /**
     * 地点类型
     */
    @ExcelProperty(value = "地点类型")
    private String locType;

    /**
     * CPS代码
     */
    @ExcelProperty(value = "CPS代码")
    private String cpsCode;

    /**
     * 邮件
     */
    @ExcelProperty(value = "邮件")
    private String email;

    /**
     * 版本号
     */
    @ExcelProperty(value = "版本号")
    private Long versionNo;


}
