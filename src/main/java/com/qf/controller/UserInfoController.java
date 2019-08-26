package com.qf.controller;
import com.alibaba.fastjson.JSONObject;
import com.qf.dto.LoginInfo;
import com.qf.pojo.Administrator;
import com.qf.pojo.UserAccount;
import com.qf.service.AliyunSmsService;
import com.qf.service.UserInfoService;
import com.qf.service.impl.AdministratorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @Autowired
    AdministratorServiceImpl administratorService;

    @Autowired
    AliyunSmsService aliyunSmsService;

    @RequestMapping("loginByIdentity")
    public Object loginByIdentity(@RequestBody LoginInfo loginInfo, HttpSession session){
        Administrator administrator1 = administratorService.loginValidation(loginInfo);
        UserAccount userAccount1 = userInfoService.loginCheck(loginInfo);
        if (administrator1==null&&userAccount1==null){
            return -1;
        }else if (administrator1!=null){
            session.setAttribute("administrator",administrator1);
            return 0;
        }else if (userAccount1.getIdentity()==1){
            session.setAttribute("userAccount",userAccount1);
            return 1;
        }
        return null;
    }

    @RequestMapping("registerUserInfo")
    public Object registerUserInfo(@RequestBody UserAccount userAccount){
//        UserAccount userAccount1 = userInfoService.checkUsername(userAccount);
//        UserAccount userAccount2 = userInfoService.checkTelphone(userAccount);
//        boolean register = userInfoService.register(userAccount);
//        if(userAccount1!=null&&userAccount2!=null){
//
//            return 0;
//        }else if(userAccount1!=null){
//            return 1;
//        }else if(userAccount2!=null){
//            return 2;
//        }else {
//            return 3;
//        }
        System.out.println(userAccount);
        return userInfoService.register(userAccount);

    }
    @RequestMapping("getVerifyCode")
    public Object getPhoneCode(@RequestParam String phone, HttpServletRequest request){
        if (phone==null&&phone==""){
            return  false;
        }
        return aliyunSmsService.getPhonemsg(phone);
    }
}
