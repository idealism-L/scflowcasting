package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.ScsIfHldYearfcst;
import com.plan.report.domain.excelModel.ScsIfHldYearfcstExcelModel;
import com.plan.report.mapper.ScsIfHldYearfcstMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName FileParseEtlHldYearfcstImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:34
 */
@Component("HLD_YEARFCST.csv")
public class FileParseScsIfHldYearfcstImpl extends IFileParseAbstract{

    @Autowired
    private ScsIfHldYearfcstMapper scsIfHldYearfcstMapper;

    @Override
    public Class getExcelObjectClass() {
        return ScsIfHldYearfcstExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<ScsIfHldYearfcst> itemList = BeanCopyUtils.copyList(list, ScsIfHldYearfcst.class);
        List<ScsIfHldYearfcst> selectList = scsIfHldYearfcstMapper.selectList();
        if(!CollectionUtils.isEmpty(selectList)){
            List<Long> ids = selectList.stream().map(ScsIfHldYearfcst::getId).collect(Collectors.toList());
            scsIfHldYearfcstMapper.deleteBatchIds(ids);
        }
        scsIfHldYearfcstMapper.insertBatch(itemList);
    }
}
