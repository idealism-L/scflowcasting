package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.EtlHldYearfcst;
import com.plan.report.domain.excelModel.EtlHldYearfcstExcelModel;
import com.plan.report.mapper.EtlHldYearfcstMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName FileParseEtlHldYearfcstImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:34
 */
@Component("HLD_YEARFCST.csv")
public class FileParseEtlHldYearFcstImpl extends IFileParseAbstract{

    @Autowired
    private EtlHldYearfcstMapper etlHldYearfcstMapper;

    @Override
    public Class getExcelObjectClass() {
        return EtlHldYearfcstExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<EtlHldYearfcst> itemList = BeanCopyUtils.copyList(list, EtlHldYearfcst.class);
        etlHldYearfcstMapper.insertBatch(itemList);
    }
}
