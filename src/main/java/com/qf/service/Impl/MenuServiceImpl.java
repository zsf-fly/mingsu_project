package com.qf.service.Impl;

import com.qf.dao.MenuMapper;
import com.qf.pojo.Menu;
import com.qf.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    /**
     * 管理员登录时获取到管理员的权限菜单
     * @param adminid
     * @return
     */
    public List<Menu> initMenuList(int adminid){
        return menuMapper.initMenuList(adminid);
    }
}
