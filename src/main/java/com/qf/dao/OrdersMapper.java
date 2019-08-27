package com.qf.dao;

import com.qf.dto.OrderCondition;
import com.qf.vo.OrdersReveiwVO;

import java.util.List;

public interface OrdersMapper {

    public List<OrdersReveiwVO> selectAllOrder();

    public List<OrdersReveiwVO> checkorders(OrderCondition orderCondition);
}
