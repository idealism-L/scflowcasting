package com.plan.report.service.fileParse;

import com.plan.common.model.ResultModel;

import java.io.InputStream;

public interface IFileParseService {

    /**
     * 文件数据解析
     * @param inputStream
     * @param fileName
     */
    ResultModel fileParse(InputStream inputStream, String fileName);
}
