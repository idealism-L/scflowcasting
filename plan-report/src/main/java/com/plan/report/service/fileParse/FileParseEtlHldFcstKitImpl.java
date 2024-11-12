package com.plan.report.service.fileParse;

/**
 * @ClassName FileParseEtlHldFcstKitImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:27
 */
//@Component("HLD_FCST_KIT.csv")
//public class FileParseEtlHldFcstKitImpl extends IFileParseAbstract{
//
//    @Autowired
//    private EtlHldFcstKitMapper etlHldFcstKitMapper;
//
//    @Override
//    public Class getExcelObjectClass() {
//        return EtlHldFcstKitExcelModel.class;
//    }
//
//    @Override
//    public void saveFileData(List list) {
//        List<EtlHldFcstKit> itemList = BeanCopyUtils.copyList(list, EtlHldFcstKit.class);
//        if(etlHldFcstKitMapper.selectDataCount() > 0){
//            return;
//        }
//        etlHldFcstKitMapper.insertBatch(itemList);
//    }
//
//}
