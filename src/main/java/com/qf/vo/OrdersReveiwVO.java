package com.qf.vo;

import java.util.Date;

public class OrdersReveiwVO {
    int orderid;
    String user_name;
    long checkin_data;
    long checkout_data;
    Date createtime;
    String h_name;
    String address;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public long getCheckin_data() {
        return checkin_data;
    }

    public void setCheckin_data(long checkin_data) {
        this.checkin_data = checkin_data;
    }

    public long getCheckout_data() {
        return checkout_data;
    }

    public void setCheckout_data(long checkout_data) {
        this.checkout_data = checkout_data;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getH_name() {
        return h_name;
    }

    public void setH_name(String h_name) {
        this.h_name = h_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "OrdersReveiwVO{" +
                "orderid=" + orderid +
                ", user_name='" + user_name + '\'' +
                ", checkin_data=" + checkin_data +
                ", checkout_data=" + checkout_data +
                ", createtime=" + createtime +
                ", h_name='" + h_name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
