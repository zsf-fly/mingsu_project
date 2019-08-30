package com.qf.pojo;

import java.util.Date;

public class ToOrderInfo {
    int orderid;
    int userid;
    int houseid;
    long checkin_data;
    long checkout_data;
    int total_price;
    Date createtime;
    String order_number;
    int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getHouseid() {
        return houseid;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
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

    public int getTotal_price() {
        return total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "ToOrderInfo{" +
                "orderid=" + orderid +
                ", userid=" + userid +
                ", houseid=" + houseid +
                ", checkin_data=" + checkin_data +
                ", checkout_data=" + checkout_data +
                ", total_price=" + total_price +
                ", createtime=" + createtime +
                ", order_number='" + order_number + '\'' +
                ", status=" + status +
                '}';
    }
}
