package com.qf.vo;

import com.qf.pojo.Houses;

import java.util.List;

public class UserInfoVO {
    int uinfoid;
    String username;
    String user_name;
    String user_sex;
    String user_email;
    String user_phone;
    String user_address;
    List<Houses> houses;

    public int getUinfoid() {
        return uinfoid;
    }

    public void setUinfoid(int uinfoid) {
        this.uinfoid = uinfoid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public List<Houses> getHouses() {
        return houses;
    }

    public void setHouses(List<Houses> houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "UserInfoVO{" +
                "uinfoid=" + uinfoid +
                ", username='" + username + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_address='" + user_address + '\'' +
                ", houses=" + houses +
                '}';
    }
}
