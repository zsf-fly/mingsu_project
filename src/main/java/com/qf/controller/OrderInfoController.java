package com.qf.controller;

import com.qf.pojo.ToOrderInfo;
import com.qf.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderInfoController {
    @Autowired
    OrderInfoService  orderInfoService;
    @RequestMapping("getOrderInfo")

    //展示详情页房源信息（预定页）
    public Object getOrderInfo(@RequestParam int houseid){
        return orderInfoService.getOrderInfo(houseid);
    }

    //生成订单信息(添加订单信息)
    @RequestMapping("addOrderInfo")
    public Object addOrderInfo(@RequestBody ToOrderInfo toOrderInfo){
        return orderInfoService.addOrderInfo(toOrderInfo);
    }

}
