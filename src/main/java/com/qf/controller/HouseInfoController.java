package com.qf.controller;

import com.qf.service.HouseInfoService;
import com.qf.vo.HouseInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseInfoController {
    @Autowired
    HouseInfoService houseInfoService;
    @RequestMapping("getHouseInfo")
    public Object getHouseInfo(){
        return houseInfoService.getHouseInfo();
    }
}
