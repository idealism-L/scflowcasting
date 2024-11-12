package com.plan.report.service.fileParse;

/**
 * @ClassName FileParseEtlHldFcstImpl
 * @Description: 文件解析新增表数据
 * @Author: xu_yijun
 * @CreateDate: 2024/11/6 16:51
 */
//@Component("HLD_FCST.csv")
//public class FileParseEtlHldFcstImpl extends IFileParseAbstract {
//
//    @Autowired
//    private EtlHldFcstMapper etlHldFcstMapper;
//
//    @Override
//    public Class getExcelObjectClass() {
//        return EtlHldFcstExcelModel.class;
//    }
//
//    @Override
//    public void saveFileData(List list) {
//        List<EtlHldFcst> itemList = BeanCopyUtils.copyList(list, EtlHldFcst.class);
//        if(etlHldFcstMapper.selectDataCount() > 0){
//            return;
//        }
//        etlHldFcstMapper.insertBatch(itemList);
//    }
//}
