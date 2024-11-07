package com.plan.report.service.fileParse;

import com.plan.common.excel.ExcelResult;
import com.plan.common.model.BaseResultModel;
import com.plan.common.model.ResultModel;
import com.plan.common.utils.StringUtils;
import com.plan.common.utils.poi.ExcelUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName IFileParseAbstract
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 9:41
 */
@Service
public abstract class IFileParseAbstract implements IFileParseService{

    public abstract Class getExcelObjectClass();

    public abstract void saveFileData(List list);

    @Override
    public ResultModel fileParse(InputStream inputStream, String fileName) {
        Class clazz = this.getExcelObjectClass();
        if(Objects.isNull(clazz)){
            return BaseResultModel.getDefaultErrorModel("FileParseJobHandler：未找到文件对应实体类：" + fileName);
        }
        ExcelResult excelResult = ExcelUtil.importExcel(inputStream, clazz, false);
        if (!CollectionUtils.isEmpty(excelResult.getErrorList())) {
            return BaseResultModel.getDefaultErrorModel("FileParseJobHandler：数据解析异常：" + StringUtils.join(excelResult.getErrorList(),","));
        }
        this.saveFileData(excelResult.getList());
        return BaseResultModel.getDefaultModel();
    }
}
