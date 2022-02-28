package com.example.demo;

public enum FailCodeEnum {

    PARAMS_ERROR(400, "请求参数错误"),

    SERVER_ERROR(500, "服务内部错误");

    private int code;
    private String message;

    FailCodeEnum(int errorCode, String message) {
        this.code = errorCode;
        this.message = message;
    }
}
