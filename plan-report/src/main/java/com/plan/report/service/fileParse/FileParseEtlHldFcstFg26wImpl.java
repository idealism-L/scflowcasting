package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.EtlHldFcstFg26w;
import com.plan.report.domain.excelModel.EtlHldFcstFg26wExcelModel;
import com.plan.report.mapper.EtlHldFcstFg26wMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName FileParseEtlHldFcstFg26wImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:20
 */
@Component("HLD_FCST_FG_26W.csv")
public class FileParseEtlHldFcstFg26wImpl extends IFileParseAbstract{

    @Autowired
    private EtlHldFcstFg26wMapper etlHldFcstFg26wMapper;

    @Override
    public Class getExcelObjectClass() {
        return EtlHldFcstFg26wExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<EtlHldFcstFg26w> itemList = BeanCopyUtils.copyList(list, EtlHldFcstFg26w.class);
        etlHldFcstFg26wMapper.insertBatch(itemList);
    }
}
