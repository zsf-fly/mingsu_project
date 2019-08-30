package com.qf.dao;

import com.qf.pojo.ToOrderInfo;
import com.qf.vo.OrderInfoVO;

import java.util.List;

public interface OrderInfoMapper {

    //支付宝二维码
    public String payStart(ToOrderInfo toOrderInfo);

    //展示详情页房源信息（预定页）
    public List<OrderInfoVO> getOrderInfo(int houseid);

    //生成订单信息(添加订单信息)
    public int addOrderInfo(ToOrderInfo toOrderInfo);

    //付款成功后修改订单
    public int updateOrderInof(String order_number);
}



