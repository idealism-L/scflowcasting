package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.ScsIfHldFcstFg26w;
import com.plan.report.domain.excelModel.ScsIfHldFcstFg26wExcelModel;
import com.plan.report.mapper.ScsIfHldFcstFg26wMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName FileParseEtlHldFcstFg26wImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:20
 */
@Component("HLD_FCST_FG_26W.csv")
public class FileParseScsIfHldFcstFg26wImpl extends IFileParseAbstract{

    @Autowired
    private ScsIfHldFcstFg26wMapper scsIfHldFcstFg26wMapper;

    @Override
    public Class getExcelObjectClass() {
        return ScsIfHldFcstFg26wExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<ScsIfHldFcstFg26w> itemList = BeanCopyUtils.copyList(list, ScsIfHldFcstFg26w.class);
        List<ScsIfHldFcstFg26w> selectList = scsIfHldFcstFg26wMapper.selectList();
        if(!CollectionUtils.isEmpty(selectList)){
            List<Long> ids = selectList.stream().map(ScsIfHldFcstFg26w::getId).collect(Collectors.toList());
            scsIfHldFcstFg26wMapper.deleteBatchIds(ids);
        }
        scsIfHldFcstFg26wMapper.insertBatch(itemList);
    }
}
