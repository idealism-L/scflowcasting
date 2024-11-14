package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.ScsIfHldFcstFg;
import com.plan.report.domain.excelModel.ScsIfHldFcstFgExcelModel;
import com.plan.report.mapper.ScsIfHldFcstFgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName FileParseEtlHldFcstFgImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:23
 */
@Component("HLD_FCST_FG.csv")
public class FileParseScsIfHldFcstFgImpl extends IFileParseAbstract{

    @Autowired
    private ScsIfHldFcstFgMapper scsIfHldFcstFgMapper;

    @Override
    public Class getExcelObjectClass() {
        return ScsIfHldFcstFgExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<ScsIfHldFcstFg> itemList = BeanCopyUtils.copyList(list, ScsIfHldFcstFg.class);
        List<ScsIfHldFcstFg> selectList = scsIfHldFcstFgMapper.selectList();
        if(!CollectionUtils.isEmpty(selectList)){
            List<Long> ids = selectList.stream().map(ScsIfHldFcstFg::getId).collect(Collectors.toList());
            scsIfHldFcstFgMapper.deleteBatchIds(ids);
        }
        scsIfHldFcstFgMapper.insertBatch(itemList);
    }
}
