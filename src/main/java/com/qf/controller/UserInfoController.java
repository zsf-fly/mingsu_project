package com.qf.controller;
import com.alibaba.fastjson.JSONObject;
import com.qf.dto.LoginInfo;
import com.qf.pojo.Administrator;
import com.qf.pojo.Menu;
import com.qf.pojo.UserAccount;
import com.qf.service.AdministratorService;
import com.qf.service.AliyunSmsService;
import com.qf.service.MenuService;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class UserInfoController {

    @Autowired
    MenuService menuService;

    @Autowired
    UserInfoService userInfoService;

    @Autowired
    AdministratorService administratorService;

    @Autowired
    AliyunSmsService aliyunSmsService;

    /**
     * 登录根据身份标识进入不同的主页,并将信息存入session
     * 如果是管理员登录,就将对应的权限菜单存入session
     * @param loginInfo
     * @param httpSession
     * @return
     */
    @RequestMapping("loginByIdentity")
    public Object loginByIdentity(@RequestBody LoginInfo loginInfo, HttpSession httpSession){
        Administrator administrator1 = administratorService.loginValidation(loginInfo);
        UserAccount userAccount1 = userInfoService.loginCheck(loginInfo);
        if (administrator1==null&&userAccount1==null){
            return -1;
        }else if (administrator1!=null){
            int adminid = administrator1.getAdminid();
            List<Menu> menus = menuService.initMenuList(adminid);
            httpSession.setAttribute("menus",menus);
            httpSession.setAttribute("administrator",administrator1);
            return 0;
        }else if (userAccount1.getIdentity()==1){
            httpSession.setAttribute("userAccount",userAccount1);
            return 1;
        }
        return null;
    }

    /**
     * 注册
     * @param userAccount
     * @return
     */
    @RequestMapping("registerUserInfo")
    public Object registerUserInfo(@RequestBody UserAccount userAccount){
        System.out.println(userAccount);
        return userInfoService.register(userAccount);

    }

    /**
     * 获取手机验证码
     * @param phone
     * @param request
     * @return
     */
    @RequestMapping("getVerifyCode")
    public Object getPhoneCode(@RequestParam String phone, HttpServletRequest request){
        if (phone==null&&phone==""){
            return  false;
        }
        return aliyunSmsService.getPhonemsg(phone);
    }

    @RequestMapping("selectUserInfo")
    public Object selectUserInfo(@RequestParam int userid){
        return userInfoService.selectUserInfo(userid);
    }
}
