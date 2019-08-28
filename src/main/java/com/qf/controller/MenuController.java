package com.qf.controller;

import com.qf.dto.LoginInfo;
import com.qf.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MenuController {

    @Autowired
    MenuService menuService;

    /**
     * 查询权限菜单
     * @param adminid
     * @return
     */
    @RequestMapping("initMenuList")
    public Object initMenuList(@RequestParam int adminid){
        return menuService.initMenuList(adminid);
    }

    /**
     * 页面展示权限菜单
     * @param adminid
     * @param httpSession
     * @return
     */
    @RequestMapping("initMenu")
    public Object initMenu(@RequestParam(required = false)Integer adminid, HttpSession httpSession){
        Object menus = httpSession.getAttribute("menus");
        //System.out.println(menus);
        return httpSession.getAttribute("menus");
    }
}
