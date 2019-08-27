package com.qf.service;

import com.qf.dto.OrderCondition;
import com.qf.vo.OrdersReveiwVO;

import java.util.List;

public interface OrdersReveiwService {

    public List<OrdersReveiwVO> selectAllOrder();

    public List<OrdersReveiwVO> checkorders(OrderCondition orderCondition);
}
