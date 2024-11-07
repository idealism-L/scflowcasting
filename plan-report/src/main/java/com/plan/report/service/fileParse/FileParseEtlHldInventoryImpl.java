package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.EtlHldInventory;
import com.plan.report.domain.excelModel.EtlHldInventoryExcelModel;
import com.plan.report.mapper.EtlHldInventoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName FileParseEtlHldInventoryImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:29
 */
@Component("HLD_INVENTORY.csv")
public class FileParseEtlHldInventoryImpl extends IFileParseAbstract{

    @Autowired
    private EtlHldInventoryMapper etlHldInventoryMapper;

    @Override
    public Class getExcelObjectClass() {
        return EtlHldInventoryExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<EtlHldInventory> itemList = BeanCopyUtils.copyList(list, EtlHldInventory.class);
        if(etlHldInventoryMapper.selectDataCount() > 0){
            return;
        }
        etlHldInventoryMapper.insertBatch(itemList);
    }
}
