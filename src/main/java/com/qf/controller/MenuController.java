package com.qf.controller;

import com.qf.dto.LoginInfo;
import com.qf.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MenuController {

    @Autowired
    MenuService menuService;

    /**
     * 查询权限菜单
     * @param loginInfo
     * @return
     */
    @RequestMapping("initMenuList")
    public Object initMenuList(@RequestBody LoginInfo loginInfo){
        return menuService.initMenuList(loginInfo);
    }

    /**
     * 页面展示权限菜单
     * @param loginInfo
     * @param httpSession
     * @return
     */
    @RequestMapping("initMenu")
    public Object initMenu(@RequestBody(required = false)LoginInfo loginInfo, HttpSession httpSession){
        Object menus = httpSession.getAttribute("menus");
        //System.out.println(menus);
        return httpSession.getAttribute("menus");
    }
}
