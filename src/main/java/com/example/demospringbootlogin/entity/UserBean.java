package com.example.demospringbootlogin.entity;

import java.io.Serializable;

/**
 * @program: DemoSpringbootLogin
 * @description:
 * @author: Yu
 * @create: 2023-03-18 20:35
 **/
public class UserBean implements Serializable {

    private Integer id;
    private String name;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
