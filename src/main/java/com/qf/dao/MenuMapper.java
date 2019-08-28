package com.qf.dao;

import com.qf.dto.LoginInfo;
import com.qf.pojo.Menu;

import java.util.List;

public interface MenuMapper {

    //登录时查询权限菜单
    public List<Menu> initMenuList(int adminid);
}
