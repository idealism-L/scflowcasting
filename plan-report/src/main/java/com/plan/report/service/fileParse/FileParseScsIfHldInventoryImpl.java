package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.ScsIfHldInventory;
import com.plan.report.domain.ScsIfHldVehicleloadline;
import com.plan.report.domain.excelModel.ScsIfHldInventoryExcelModel;
import com.plan.report.mapper.ScsIfHldInventoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName FileParseEtlHldInventoryImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:29
 */
@Component("HLD_INVENTORY.csv")
public class FileParseScsIfHldInventoryImpl extends IFileParseAbstract{

    @Autowired
    private ScsIfHldInventoryMapper scsIfHldInventoryMapper;

    @Override
    public Class getExcelObjectClass() {
        return ScsIfHldInventoryExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<ScsIfHldInventory> itemList = BeanCopyUtils.copyList(list, ScsIfHldInventory.class);
        List<ScsIfHldInventory> selectList = scsIfHldInventoryMapper.selectList();
        if(!CollectionUtils.isEmpty(selectList)){
            List<Long> ids = selectList.stream().map(ScsIfHldInventory::getId).collect(Collectors.toList());
            scsIfHldInventoryMapper.deleteBatchIds(ids);
        }
        scsIfHldInventoryMapper.insertBatch(itemList);
    }
}
