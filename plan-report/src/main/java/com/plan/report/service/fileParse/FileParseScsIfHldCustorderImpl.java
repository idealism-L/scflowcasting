package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.ScsIfHldCustorder;
import com.plan.report.domain.excelModel.ScsIfHldCustorderExcelModel;
import com.plan.report.mapper.ScsIfHldCustorderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName FileParseScsIfHldCustorderImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/14 13:40
 */
@Component("HLD_CUSTORDER.csv")
public class FileParseScsIfHldCustorderImpl extends IFileParseAbstract{

    @Autowired
    private ScsIfHldCustorderMapper scsIfHldCustorderMapper;

    @Override
    public Class getExcelObjectClass() {
        return ScsIfHldCustorderExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<ScsIfHldCustorder> itemList = BeanCopyUtils.copyList(list, ScsIfHldCustorder.class);
        List<ScsIfHldCustorder> selectList = scsIfHldCustorderMapper.selectList();
        if(!CollectionUtils.isEmpty(selectList)){
            List<Long> ids = selectList.stream().map(ScsIfHldCustorder::getId).collect(Collectors.toList());
            scsIfHldCustorderMapper.deleteBatchIds(ids);
        }
        scsIfHldCustorderMapper.insertBatch(itemList);
    }
}
