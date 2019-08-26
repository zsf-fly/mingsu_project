package com.qf.dto;

/**
 * 登录验证接受的信息
 */
public class LoginInfo {
    String name;
    String password;

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

    @Override
    public String toString() {
        return "LoginInfo{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
