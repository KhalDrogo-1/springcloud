package com.zhang.springcloud.entities;

public class CommonResult<T> {
    private Integer code;
    private String message;
    private T date;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }

    public CommonResult() {
    }

    public CommonResult(Integer code, String message, T date) {
        this.code = code;
        this.message = message;
        this.date = date;
    }

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

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }


}
