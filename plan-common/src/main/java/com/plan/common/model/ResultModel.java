package com.plan.common.model;

import lombok.Data;

/**
 * @ClassName ResultModel
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 9:57
 */
@Data
public class ResultModel {
    private int result;

    private String msg;

    private String data;

    public ResultModel() {}

    public ResultModel(int result, String msg) {
        this.result = result;
        this.msg = msg;
    }
}
