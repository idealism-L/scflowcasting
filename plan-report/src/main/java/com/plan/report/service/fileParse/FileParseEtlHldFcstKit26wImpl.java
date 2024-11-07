package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.EtlHldFcstKit26w;
import com.plan.report.domain.excelModel.EtlHldFcstKit26wExcelModel;
import com.plan.report.mapper.EtlHldFcstKit26wMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName FileParseEtlHldFcstKit26wImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:25
 */
@Component("HLD_FCST_KIT_26W.csv")
public class FileParseEtlHldFcstKit26wImpl extends IFileParseAbstract{

    @Autowired
    private EtlHldFcstKit26wMapper etlHldFcstKit26wMapper;

    @Override
    public Class getExcelObjectClass() {
        return EtlHldFcstKit26wExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<EtlHldFcstKit26w> itemList = BeanCopyUtils.copyList(list, EtlHldFcstKit26w.class);
        if(etlHldFcstKit26wMapper.selectDataCount() > 0){
            return;
        }
        etlHldFcstKit26wMapper.insertBatch(itemList);
    }
}
