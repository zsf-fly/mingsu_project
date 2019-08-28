package com.qf.dao;

import com.qf.pojo.ToOrderInfo;
import com.qf.vo.OrderInfoVO;

import java.util.List;

public interface OrderInfoMapper {
    //展示详情页房源信息（预定页）
    public List<OrderInfoVO> getOrderInfo(int houseid);

    //生成订单信息(添加订单信息)
    public int addOrderInfo(ToOrderInfo toOrderInfo);
}



