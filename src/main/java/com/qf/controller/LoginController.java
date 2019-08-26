package com.qf.controller;

import com.qf.dto.LoginInfo;
import com.qf.pojo.Administrator;
import com.qf.pojo.Menu;
import com.qf.pojo.UserAccount;
import com.qf.service.AdministratorService;
import com.qf.service.MenuService;
import com.qf.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class LoginController {

    @Autowired
    AdministratorService administratorService;

    @Autowired
    UserAccountService userAccountService;

    @Autowired
    MenuService menuService;

    /**
     * 登录根据身份标识进入不同的主页,并将信息存入session
     * 如果是管理员登录,就将对应的权限菜单存入session
     * @param loginInfo
     * @param httpSession
     * @return
     */
    @RequestMapping("loginByIdentity")
    public Object loginByIdentity(@RequestBody LoginInfo loginInfo, HttpSession httpSession){
        Administrator administrator = administratorService.loginValidation(loginInfo);
        UserAccount userAccount = userAccountService.loginUser(loginInfo);
        if (administrator==null&&userAccount==null){
            return null;
        }else if (administrator!=null){
            List<Menu> menus = menuService.initMenuList(loginInfo);
            httpSession.setAttribute("menus",menus);
            httpSession.setAttribute("administrator",administrator);
            return 0;
        }else if (userAccount.getIdentity()==1){
            httpSession.setAttribute("userAccount",userAccount);
            return 1;
        }
        return null;
    }
}
