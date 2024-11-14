package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.ScsIfHldFcstKit;
import com.plan.report.domain.excelModel.ScsIfHldFcstKitExcelModel;
import com.plan.report.mapper.ScsIfHldFcstKitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName FileParseEtlHldFcstKitImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:27
 */
@Component("HLD_FCST_KIT.csv")
public class FileParseScsIfHldFcstKitImpl extends IFileParseAbstract{

    @Autowired
    private ScsIfHldFcstKitMapper scsIfHldFcstKitMapper;

    @Override
    public Class getExcelObjectClass() {
        return ScsIfHldFcstKitExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<ScsIfHldFcstKit> itemList = BeanCopyUtils.copyList(list, ScsIfHldFcstKit.class);
        List<ScsIfHldFcstKit> selectList = scsIfHldFcstKitMapper.selectList();
        if(!CollectionUtils.isEmpty(selectList)){
            List<Long> ids = selectList.stream().map(ScsIfHldFcstKit::getId).collect(Collectors.toList());
            scsIfHldFcstKitMapper.deleteBatchIds(ids);
        }
        scsIfHldFcstKitMapper.insertBatch(itemList);
    }

}
