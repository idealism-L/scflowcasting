package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.ScsIfHldFcstKit26w;
import com.plan.report.domain.ScsIfHldVehicleloadline;
import com.plan.report.domain.excelModel.ScsIfHldFcstKit26wExcelModel;
import com.plan.report.mapper.ScsIfHldFcstKit26wMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName FileParseEtlHldFcstKit26wImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:25
 */
@Component("HLD_FCST_KIT_26W.csv")
public class FileParseScsIfHldFcstKit26wImpl extends IFileParseAbstract{

    @Autowired
    private ScsIfHldFcstKit26wMapper scsIfHldFcstKit26wMapper;

    @Override
    public Class getExcelObjectClass() {
        return ScsIfHldFcstKit26wExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<ScsIfHldFcstKit26w> itemList = BeanCopyUtils.copyList(list, ScsIfHldFcstKit26w.class);
        List<ScsIfHldFcstKit26w> selectList = scsIfHldFcstKit26wMapper.selectList();
        if(!CollectionUtils.isEmpty(selectList)){
            List<Long> ids = selectList.stream().map(ScsIfHldFcstKit26w::getId).collect(Collectors.toList());
            scsIfHldFcstKit26wMapper.deleteBatchIds(ids);
        }
        scsIfHldFcstKit26wMapper.insertBatch(itemList);
    }
}
