package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.ScsIfHldVehicleloadline;
import com.plan.report.domain.excelModel.ScsIfHldVehicleloadlineExcelModel;
import com.plan.report.mapper.ScsIfHldVehicleloadlineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName EtlHldVehicleloadlineImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:31
 */
@Component("HLD_VEHICLELOADLINE.csv")
public class FileParseScsIfHldVehicleloadlineImpl extends IFileParseAbstract{

    @Autowired
    private ScsIfHldVehicleloadlineMapper scsIfHldVehicleloadlineMapper;

    @Override
    public Class getExcelObjectClass() {
        return ScsIfHldVehicleloadlineExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<ScsIfHldVehicleloadline> itemList = BeanCopyUtils.copyList(list, ScsIfHldVehicleloadline.class);
        List<ScsIfHldVehicleloadline> selectList = scsIfHldVehicleloadlineMapper.selectList();
        if(!CollectionUtils.isEmpty(selectList)){
            List<Long> ids = selectList.stream().map(ScsIfHldVehicleloadline::getId).collect(Collectors.toList());
            scsIfHldVehicleloadlineMapper.deleteBatchIds(ids);
        }
        scsIfHldVehicleloadlineMapper.insertBatch(itemList);
    }
}
