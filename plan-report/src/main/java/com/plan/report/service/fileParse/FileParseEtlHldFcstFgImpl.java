package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.EtlHldFcstFg;
import com.plan.report.domain.excelModel.EtlHldFcstFgExcelModel;
import com.plan.report.mapper.EtlHldFcstFgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName FileParseEtlHldFcstFgImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:23
 */
@Component("HLD_FCST_FG.csv")
public class FileParseEtlHldFcstFgImpl extends IFileParseAbstract{

    @Autowired
    private EtlHldFcstFgMapper etlHldFcstFgMapper;

    @Override
    public Class getExcelObjectClass() {
        return EtlHldFcstFgExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<EtlHldFcstFg> itemList = BeanCopyUtils.copyList(list, EtlHldFcstFg.class);
        etlHldFcstFgMapper.insertBatch(itemList);
    }
}
