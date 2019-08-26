package com.qf.service;

import com.qf.dto.LoginInfo;
import com.qf.pojo.Menu;

import java.util.List;

public interface MenuService {

    public List<Menu> initMenuList(LoginInfo loginInfo);
}
