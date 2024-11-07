package com.plan.common.model;

import com.plan.common.enums.ResultType;
import com.plan.common.utils.JsonUtils;

/**
 * @ClassName BaseResultModel
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 9:59
 */
public class BaseResultModel extends ResultModel{
    public static String getDefaultString() {
        ResultModel model = new ResultModel(ResultType.SUCCESS.getCode(), ResultType.SUCCESS.getInfo());
         return JsonUtils.toJsonString(model);
    }

    public static String getSuccessString(String msg) {
        ResultModel model = new ResultModel(ResultType.SUCCESS.getCode(), msg);
        return JsonUtils.toJsonString(model);
    }

    public static String getDefaultErrorString(String msg) {
        ResultModel model = new ResultModel(ResultType.ERROR.getCode(), msg);
        return JsonUtils.toJsonString(model);
    }

    public static ResultModel getDefaultModel() {
        return new ResultModel(ResultType.SUCCESS.getCode(), ResultType.SUCCESS.getInfo());
    }

    public static ResultModel getSuccessModel(String msg) {
        return new ResultModel(ResultType.SUCCESS.getCode(), msg);
    }

    public static ResultModel getDefaultErrorModel(String msg) {
        return new ResultModel(ResultType.ERROR.getCode(), msg);
    }
}
