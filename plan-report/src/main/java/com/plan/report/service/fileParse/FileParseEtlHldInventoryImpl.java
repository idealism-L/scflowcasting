package com.plan.report.service.fileParse;

/**
 * @ClassName FileParseEtlHldInventoryImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:29
 */
//@Component("HLD_INVENTORY.csv")
//public class FileParseEtlHldInventoryImpl extends IFileParseAbstract{
//
//    @Autowired
//    private EtlHldInventoryMapper etlHldInventoryMapper;
//
//    @Override
//    public Class getExcelObjectClass() {
//        return EtlHldInventoryExcelModel.class;
//    }
//
//    @Override
//    public void saveFileData(List list) {
//        List<EtlHldInventory> itemList = BeanCopyUtils.copyList(list, EtlHldInventory.class);
//        if(etlHldInventoryMapper.selectDataCount() > 0){
//            return;
//        }
//        etlHldInventoryMapper.insertBatch(itemList);
//    }
//}
