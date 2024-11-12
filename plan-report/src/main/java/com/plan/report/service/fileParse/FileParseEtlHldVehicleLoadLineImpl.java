package com.plan.report.service.fileParse;

/**
 * @ClassName EtlHldVehicleloadlineImpl
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 15:31
 */
//@Component("HLD_VEHICLELOADLINE.csv")
//public class FileParseEtlHldVehicleLoadLineImpl extends IFileParseAbstract{
//
//    @Autowired
//    private EtlHldVehicleloadlineMapper etlHldVehicleloadlineMapper;
//
//    @Override
//    public Class getExcelObjectClass() {
//        return EtlHldVehicleloadlineExcelModel.class;
//    }
//
//    @Override
//    public void saveFileData(List list) {
//        List<EtlHldVehicleloadline> itemList = BeanCopyUtils.copyList(list, EtlHldVehicleloadline.class);
//        if(etlHldVehicleloadlineMapper.selectDataCount() > 0){
//            return;
//        }
//        etlHldVehicleloadlineMapper.insertBatch(itemList);
//    }
//}
