package com.plan.report.service.fileParse;

import com.plan.common.utils.BeanCopyUtils;
import com.plan.report.domain.ScsIfHldFcst;
import com.plan.report.domain.excelModel.ScsIfHldFcstExcelModel;
import com.plan.report.mapper.ScsIfHldFcstMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName FileParseEtlHldFcstImpl
 * @Description: 文件解析新增表数据
 * @Author: xu_yijun
 * @CreateDate: 2024/11/6 16:51
 */
@Component("HLD_FCST.csv")
public class FileParseScsIfHldFcstImpl extends IFileParseAbstract {

    @Autowired
    private ScsIfHldFcstMapper scsIfHldFcstMapper;

    @Override
    public Class getExcelObjectClass() {
        return ScsIfHldFcstExcelModel.class;
    }

    @Override
    public void saveFileData(List list) {
        List<ScsIfHldFcst> itemList = BeanCopyUtils.copyList(list, ScsIfHldFcst.class);
        List<ScsIfHldFcst> selectList = scsIfHldFcstMapper.selectList();
        if(!CollectionUtils.isEmpty(selectList)){
            List<Long> ids = selectList.stream().map(ScsIfHldFcst::getId).collect(Collectors.toList());
            scsIfHldFcstMapper.deleteBatchIds(ids);
        }
        scsIfHldFcstMapper.insertBatch(itemList);
    }
}
