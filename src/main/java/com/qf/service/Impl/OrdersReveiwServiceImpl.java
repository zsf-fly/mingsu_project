package com.qf.service.Impl;

import com.qf.dao.OrdersMapper;
import com.qf.dto.OrderCondition;
import com.qf.service.OrdersReveiwService;
import com.qf.vo.OrdersReveiwVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class OrdersReveiwServiceImpl implements OrdersReveiwService {

    @Autowired
    OrdersMapper ordersMapper;

    public List<OrdersReveiwVO> selectAllOrder() {
        return ordersMapper.selectAllOrder();
    }

    public List<OrdersReveiwVO> checkorders(OrderCondition orderCondition) {
        return ordersMapper.checkorders(orderCondition);
    }
}
