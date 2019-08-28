package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dto.SearchHouseInfoDTO;
import com.qf.service.HouseInfoService;
import com.qf.vo.HouseInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseInfoController {
    @Autowired
    HouseInfoService houseInfoService;
    @RequestMapping("getHouseInfo")
    //首页展示房源信息
    public Object getHouseInfo(@RequestBody SearchHouseInfoDTO searchHouseInfoDT0){

       return houseInfoService.getHouseInfo(searchHouseInfoDT0);
    }
}
