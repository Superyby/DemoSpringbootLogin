package com.example.demospringbootlogin.controller;

import com.example.demospringbootlogin.entity.UserBean;
import com.example.demospringbootlogin.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @program: DemoSpringbootLogin
 * @description:
 * @author: Yu
 * @create: 2023-03-18 20:34
 **/
@Slf4j
@Controller
public class LoginController {

    //将Service注入Web层
    @Resource
    UserService userService;

    //实现登录
    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        UserBean userBean = userService.LoginIn(name, password);
        log.info("name:{}",name);
        log.info("password:{}",password);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/signup")
    public String disp(){
        return "signup";
    }

    //实现注册功能
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String signUp(String name,String password){
        userService.Insert(name, password);
        return "success";
    }
}
