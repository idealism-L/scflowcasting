package com.plan.common.enums;

/**
 * @ClassName ResultType
 * @Description: 类描述
 * @Author: xu_yijun
 * @CreateDate: 2024/11/7 10:03
 */
public enum ResultType {
    SUCCESS(0, "操作成功"),
    ERROR(-1, "操作失败");

    private final int code;
    private final String info;

    ResultType(int code, String info) {
        this.code = code;
        this.info = info;
    }

    public int getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
