package com.qf.controller;

import com.qf.pojo.AdminInfo;
import com.qf.pojo.Administrator;
import com.qf.service.AdminInfoService;
import com.qf.vo.AdministratorInfoVO;
import com.sun.corba.se.spi.transport.IORTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class AdminInfoController {

    @Autowired
    AdminInfoService adminInfoService;

    /**
     * 添加管理员个人信息
     * @param adminInfo
     * @param httpSession
     * @return
     */
    @RequestMapping("addAdminInfo")
    public Object insertAdminInfo(@RequestBody(required = false) AdminInfo adminInfo,HttpSession httpSession){
        Administrator administrator = (Administrator) httpSession.getAttribute("administrator");
        int adminid = administrator.getAdminid();
        adminInfo.setAdminid(adminid);
        int i = adminInfoService.addAdminInfo(adminInfo);
        return i>0;
    }

    /**
     * 获取个人信息,若没有啧跳转添加页
     * @param administrator
     * @param httpSession
     * @return
     */
    @RequestMapping("getAdminInfo")
    public Object getAdminInfo(@RequestBody(required = false)Administrator administrator,HttpSession httpSession){
        Administrator administrator1 = (Administrator) httpSession.getAttribute("administrator");
        int adminid = administrator1.getAdminid();
        //System.out.println(adminInfo);
        AdminInfo adminInfo = adminInfoService.getAdminInfo(adminid);
        if (adminInfo==null){
            return -1;
        }
        System.out.println(adminInfo);
        return adminInfo;
    }

    /**
     * 根据工作证获取某个管理员
     * @param work_number
     * @return
     */
    @RequestMapping("checkadmin")
    public Object checkadmin(@RequestParam String work_number){
        AdministratorInfoVO checkadmin = adminInfoService.checkadmin(work_number);
        if (checkadmin==null){
            return true;
        }
        return checkadmin;
    }

    /**
     * 修改信息
     * @param administratorInfoVO
     * @return
     */
    @RequestMapping("updateAdminInfo")
    public Object updateAdminInfo(@RequestBody AdministratorInfoVO administratorInfoVO){
        return adminInfoService.updateAdminInfo(administratorInfoVO)>0;
    }
}
