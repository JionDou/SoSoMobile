package com.soso.entity;

/**
 * @author Ms.Dou
 * @description 用户类
 * @create: 2018-12-05 16:16
 */
public class User {
    private String name;
    private String password;

    public User(){ }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
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
