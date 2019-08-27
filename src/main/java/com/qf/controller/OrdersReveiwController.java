package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dto.OrderCondition;
import com.qf.service.OrdersReveiwService;
import com.qf.vo.OrdersReveiwVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdersReveiwController {

    @Autowired
    OrdersReveiwService ordersReveiwService;

    /**
     * 后台展示订单信息
     * @return
     */
    @RequestMapping("selectAllOrder")
    public Object selectAllOrder(@RequestParam(defaultValue="1",required=true,value="pageNum") Integer pageNum){
        //每页显示的数量
        Integer pageSize=10;
        //分页
        PageHelper.startPage(pageNum,pageSize);
        //获取数据
        List<OrdersReveiwVO> ordersReveiwVOS = ordersReveiwService.selectAllOrder();
        PageInfo<OrdersReveiwVO> ordersReveiwVOPageHelper = new PageInfo<OrdersReveiwVO>(ordersReveiwVOS);
        return ordersReveiwVOPageHelper;
    }

    @RequestMapping("checkorders")
    public Object checkorders(@RequestParam(defaultValue="1",required=true,value="pageNum") Integer pageNum,@RequestBody OrderCondition orderCondition ){
        //每页显示的数量
        Integer pageSize=10;
        //分页
        PageHelper.startPage(pageNum,pageSize);
        //获取数据
        List<OrdersReveiwVO> checkorders = ordersReveiwService.checkorders(orderCondition);
        PageInfo<OrdersReveiwVO> ordersReveiwVOPageInfo = new PageInfo<OrdersReveiwVO>(checkorders);
        return ordersReveiwVOPageInfo;
    }
}
