package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.ScsIfClnItem;
import com.plan.report.domain.excelModel.ScsIfClnItemExcelModel;
import com.plan.report.mapper.ScsIfClnItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName FileParseEtlClnItemImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 9:17
 */
@Component("CLN_ITEM.csv")
public class FileParseScsIfClnItemImpl extends IFileParseAbstract{

    @Autowired
    private ScsIfClnItemMapper scsIfClnItemMapper;

    @Override
    public Class getExcelObjectClass() {
        return ScsIfClnItemExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<ScsIfClnItem> itemList = BeanCopyUtils.copyList(list, ScsIfClnItem.class);
        List<ScsIfClnItem> selectList = scsIfClnItemMapper.selectList();
        if(!CollectionUtils.isEmpty(selectList)){
            List<Long> ids = selectList.stream().map(ScsIfClnItem::getId).collect(Collectors.toList());
            scsIfClnItemMapper.deleteBatchIds(ids);
        }
        scsIfClnItemMapper.insertBatch(itemList);
    }
}
