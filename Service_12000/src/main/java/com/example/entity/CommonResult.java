package com.example.entity;

import java.io.Serializable;

public class CommonResult<T> implements Serializable {//实现该接口、实现可序列化
    private Integer code;
    private String message;
    private T result;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public CommonResult() {
    }

    public CommonResult(Integer code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }
}
