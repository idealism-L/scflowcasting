package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.EtlHldVehicleloadline;
import com.plan.report.domain.excelModel.EtlHldVehicleloadlineExcelModel;
import com.plan.report.mapper.EtlHldVehicleloadlineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName EtlHldVehicleloadlineImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:31
 */
@Component("HLD_VEHICLELOADLINE.csv")
public class FileParseEtlHldVehicleLoadLineImpl extends IFileParseAbstract{

    @Autowired
    private EtlHldVehicleloadlineMapper etlHldVehicleloadlineMapper;

    @Override
    public Class getExcelObjectClass() {
        return EtlHldVehicleloadlineExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<EtlHldVehicleloadline> itemList = BeanCopyUtils.copyList(list, EtlHldVehicleloadline.class);
        etlHldVehicleloadlineMapper.insertBatch(itemList);
    }
}
