package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.EtlClnItem;
import com.plan.report.domain.excelModel.EtlClnItemExcelModel;
import com.plan.report.mapper.EtlClnItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName FileParseEtlClnItemImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 9:17
 */
@Component("CLN_ITEM.csv")
public class FileParseEtlClnItemImpl extends IFileParseAbstract{

    @Autowired
    private EtlClnItemMapper etlClnItemMapper;

    @Override
    public Class getExcelObjectClass() {
        return EtlClnItemExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<EtlClnItem> itemList = BeanCopyUtils.copyList(list, EtlClnItem.class);
        if(etlClnItemMapper.selectDataCount() > 0){
            return;
        }
        etlClnItemMapper.insertBatch(itemList);
    }
}
