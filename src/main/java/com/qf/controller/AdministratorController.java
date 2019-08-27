package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.service.AdministratorService;
import com.qf.vo.AdministratorInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdministratorController {

    @Autowired
    AdministratorService administratorService;

    /**
     * 查询所有一级管理员之外管理员的信息
     * 并分页显示
     * @param pageNum
     * @return
     */
    @RequestMapping("listAllAdministrator")
    public Object listAllAdministrator(@RequestParam(defaultValue="1",required=true,value="pageNum") Integer pageNum){
        //每页显示的数量
        Integer pageSize=10;
        //分页
        PageHelper.startPage(pageNum,pageSize);
        //获取数据
        List<AdministratorInfoVO> administratorInfoVOS = administratorService.listAllAdministrator();
        PageInfo<AdministratorInfoVO> administratorInfoVOPageInfo = new PageInfo<AdministratorInfoVO>(administratorInfoVOS);
        return administratorInfoVOPageInfo;
    }

    /**
     * 根据id查询管理员信息
     * 展示在修改页面
     * @param adminid
     * @return
     */
    @RequestMapping("selectAdministratorById")
    public Object selectAdministratorById(@RequestParam int adminid){
        return administratorService.selectAdministratorById(adminid);
    }

    @RequestMapping("deletAdministrator")
    public Object deletAdministrator(@RequestParam int adminid){
        return administratorService.deletAdministrator(adminid)>0;
    }
}
