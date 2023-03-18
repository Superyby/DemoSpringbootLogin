//package com.example.demospringbootlogin.config;
//
//import lombok.Data;
//
//import java.io.Serializable;
//
///**
// * @program: DemoSpringbootLogin
// * @description:
// * @author: Yu
// * @create: 2023-03-18 21:44
// **/
//@Data
//public class Result implements Serializable {
//    private int code;
//    private String msg;
//    private Object data;
//    public static Result succ(Object data) {
//        return succ(200, "操作成功", data);
//    }
//
//    public static Result fail(String msg) {
//        return fail(400, msg, null);
//    }
//
//    public static Result succ (int code, String msg, Object data) {
//        Result result = new Result();
//        result.setCode(code);
//        result.setMsg(msg);
//        result.setData(data);
//        return result;
//    }
//
//    public static Result fail (int code, String msg, Object data) {
//        Result result = new Result();
//        result.setCode(code);
//        result.setMsg(msg);
//        result.setData(data);
//        return result;
//    }
//}
