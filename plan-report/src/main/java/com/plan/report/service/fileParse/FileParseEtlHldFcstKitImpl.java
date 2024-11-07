package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.EtlHldFcstKit;
import com.plan.report.domain.excelModel.EtlHldFcstKitExcelModel;
import com.plan.report.mapper.EtlHldFcstKitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName FileParseEtlHldFcstKitImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:27
 */
@Component("HLD_FCST_KIT.csv")
public class FileParseEtlHldFcstKitImpl extends IFileParseAbstract{

    @Autowired
    private EtlHldFcstKitMapper etlHldFcstKitMapper;

    @Override
    public Class getExcelObjectClass() {
        return EtlHldFcstKitExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<EtlHldFcstKit> itemList = BeanCopyUtils.copyList(list, EtlHldFcstKit.class);
        etlHldFcstKitMapper.insertBatch(itemList);
    }

}
