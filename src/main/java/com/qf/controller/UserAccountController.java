package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.UserAccount;
import com.qf.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAccountController {

    @Autowired
    UserAccountService userAccountService;

    /**
     * 查询/分页用户
     * @param pageNum
     * @return
     */
    @RequestMapping("listAllUser")
    public Object listAllUser(@RequestParam(defaultValue="1",value="pageNum") Integer pageNum){
        //每页显示的数量
        Integer pageSize = 10;
        //分页查询
        PageHelper.startPage(pageNum,pageSize);
        //获取所有的数据
        List<UserAccount> userAccounts = userAccountService.listAllUser();
        PageInfo<UserAccount> userAccountPageInfo = new PageInfo<UserAccount>(userAccounts);
        return userAccountPageInfo;
    }

    /**
     * 查询用户信息
     * @param telphone
     * @return
     */
    @RequestMapping("checkUserAccount")
    public Object checkUserAccount(@RequestParam String telphone){
        return userAccountService.checkUserAccount(telphone);
    }

    @RequestMapping("deletUser")
    public Object deletUser(int userid){
        return userAccountService.deletUser(userid)>0;
    }
}
