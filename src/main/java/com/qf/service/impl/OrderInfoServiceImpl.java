package com.qf.service.impl;

import com.qf.dao.OrderInfoMapper;
import com.qf.pojo.ToOrderInfo;
import com.qf.service.OrderInfoService;
import com.qf.vo.OrderInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    OrderInfoMapper orderInfoMapper;

    /**
     * 展示详情页房源信息（预定页）
     * @param houseid
     * @return
     */
    public List<OrderInfoVO> getOrderInfo(int houseid)
    {
        return orderInfoMapper.getOrderInfo(houseid);
    }

    /**
     * 生成订单信息(添加订单信息)
     * @param toOrderInfo
     * @return
     */
    public boolean addOrderInfo(ToOrderInfo toOrderInfo) {
        return orderInfoMapper.addOrderInfo(toOrderInfo)>0;
    }

}
