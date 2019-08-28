package com.qf.dto;

public class OrderCondition {
    String user_name;
    String address;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrderCondition{" +
                "user_name='" + user_name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
