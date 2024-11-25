package com.plan.report.domain.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.plan.common.annotation.ExcelDictFormat;
import com.plan.common.convert.ExcelDictConvert;
import lombok.Data;

import java.io.Serializable;

/**
 * scs_cps_loc_map视图对象 scs_cps_loc_map
 *
 * @author ruoyi
 * @date 2024-11-25
 */
@Data
@ExcelIgnoreUnannotated
public class ScsCpsLocMapVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ExcelProperty(value = "ID")
    private Long id;

    /**
     * 物料编码
     */
    @ExcelProperty(value = "物料编码")
    private String item;

    /**
     * 果汁/果肉标识
     */
    @ExcelProperty(value = "果汁/果肉标识")
    private String fruitCategory;

    /**
     * DFU地点
     */
    @ExcelProperty(value = "DFU地点")
    private String dfuLoc;

    /**
     * SKU地点
     */
    @ExcelProperty(value = "SKU地点")
    private String skuLoc;

    /**
     * 版本号
     */
    @ExcelProperty(value = "版本号")
    private Long versionNo;


}
