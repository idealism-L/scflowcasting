package com.plan.report.service.fileParse;

/**
 * @ClassName FileParseEtlHldYearfcstImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:34
 */
//@Component("HLD_YEARFCST.csv")
//public class FileParseEtlHldYearFcstImpl extends IFileParseAbstract{
//
//    @Autowired
//    private EtlHldYearfcstMapper etlHldYearfcstMapper;
//
//    @Override
//    public Class getExcelObjectClass() {
//        return EtlHldYearfcstExcelModel.class;
//    }
//
//    @Override
//    public void saveFileData(List list) {
//        List<EtlHldYearfcst> itemList = BeanCopyUtils.copyList(list, EtlHldYearfcst.class);
//        if(etlHldYearfcstMapper.selectDataCount() > 0){
//            return;
//        }
//        etlHldYearfcstMapper.insertBatch(itemList);
//    }
//}
