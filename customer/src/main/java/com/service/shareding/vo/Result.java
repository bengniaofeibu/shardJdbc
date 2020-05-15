package com.service.shareding.vo;

import lombok.Data;


/**
 * @author t3_thz
 */
@Data
public class Result<T> {

    private Integer code;
    private T data;
    private String msg;
    private Exception exception;

    public Result() {
        this(200,null,"success",null);
    }

    public Result(Integer code,String msg) {
        this(code,null,msg,null);
    }

    public Result(T data) {
        this(200,data,"success");
    }

    public Result(T data, String msg) {
        this(200,data,msg);
    }

    public Result(Integer code, T data) {
        this(code,data,"success",null);
    }

    public Result(Integer code, T data, String msg) {
       this(code,data,msg, null);
    }

    public Result(Integer code, T data, String msg, Exception exception) {
        this.code = code;
        this.data = data;
        this.msg = msg;
        this.exception = exception;
    }

    public static Result returnSucces(){
        return new Result<>();
    }

    public static <T> Result<T> returnSucces(T data){
        return new Result<>(data);
    }

    public static Result returnFail(String msg){
        return new Result<>(500,msg);
    }
}
