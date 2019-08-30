package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dto.SearchHouseInfoDTO;
import com.qf.service.HouseInfoService;
import com.qf.vo.AdministratorInfoVO;
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

    //首页展示房源信息
    @RequestMapping("getHouseInfo")
    public Object getHouseInfo(@RequestParam(defaultValue="1",required=true,value="pageNum") Integer pageNum,@RequestBody SearchHouseInfoDTO searchHouseInfoDT0){
        //每页显示的数量
        Integer pageSize=9;
        //System.err.println("pageNum = " + searchHouseInfoDT0.getPageNum());
        //分页
        PageHelper.startPage(searchHouseInfoDT0.getPageNum(),pageSize);
        //获取数据
        List<HouseInfoVO> houseInfo = houseInfoService.getHouseInfo(searchHouseInfoDT0);
        //System.err.println("houseInfo = " + houseInfo);
        PageInfo<HouseInfoVO> houseInfoVOPageInfo = new PageInfo<HouseInfoVO>(houseInfo);
        //System.err.println("houseInfoVOPageInfo = " + houseInfoVOPageInfo);
        return houseInfoVOPageInfo;
    }
}
