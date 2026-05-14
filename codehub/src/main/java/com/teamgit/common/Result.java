package com.teamgit.common;


import lombok.Data;
@Data
public class Result<T> {

    private int code;
    private String msg;
    private T data;

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //传入枚举类
    public static <T> Result<T> success(ResultCode resultCode,T data) {
        return new Result<>(resultCode.getCode(), resultCode.getMessage(), data);
    }

    public static <T> Result<T> error(ResultCode resultCode) {
        return new Result<>(resultCode.getCode(), resultCode.getMessage(), null);
    }


    public enum ResultCode{

        SUCCESS(200,"操作成功"),
        REGISTER_SUCCESS(201,"注册成功"),
        LOGIN_SUCCESS(200,"欢迎回来"),
        PARAM_ERROR(400,"参数错误"),
              PASSWORD_ERROR(401,"请检查用户名或密码是否正确"),
        NOT_FOUND(404,"资源未找到"),
        USER_ALREADY_EXISTS(409,"用户已存在"),
        UNKNOWN_ERROR(500,"未知错误");

        private final int code;
        private final String message;

        ResultCode(int code, String message) {
            this.code = code;
            this.message = message;
        }
        
        public int getCode(){
            return code;
        }
        public String getMessage(){
            return message;
        }
    }
}
