package com.plan.job.service;

import com.plan.common.enums.ResultType;
import com.plan.common.model.ResultModel;
import com.plan.common.utils.StringUtils;
import com.plan.common.utils.SpringContextHolder;
import com.plan.report.service.fileParse.IFileParseAbstract;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;

/**
 * @ClassName ReportService
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/6 14:44
 */
@Service
@Slf4j
public class ReportService {

    @XxlJob("FileParseJobHandler")
    public void fileParseJobHandler() {
        String fileUrl = XxlJobHelper.getJobParam();
        if (StringUtils.isEmpty(fileUrl)) {
            XxlJobHelper.log("FileParseJobHandler：传入参数为空，无法解析数据！");
        }
        try {
            File file = new File(fileUrl);
            IFileParseAbstract parseAbstract = SpringContextHolder.getBean(file.getName());
            ResultModel resultModel = parseAbstract.fileParse(new FileInputStream(file.getPath()), file.getName());
            if(resultModel.getResult() != ResultType.SUCCESS.getCode()){
                XxlJobHelper.log("FileParseJobHandler：处理文件：" + fileUrl);
                XxlJobHelper.log("FileParseJobHandler：处理失败原因：" + resultModel.getMsg());
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            XxlJobHelper.log("FileParseJobHandler：未找到地址对应文件：" + fileUrl);
        }
    }
}
