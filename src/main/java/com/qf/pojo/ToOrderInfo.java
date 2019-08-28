package com.qf.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class ToOrderInfo {
    int orderid;
    int userid;
    int houseid;
    long checkin_data;
    long checkout_data;
    int total_price;
    Date createtime;

}
