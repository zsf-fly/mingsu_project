package com.qf.dao;

import com.qf.dto.LoginInfo;
import com.qf.pojo.UserAccount;

import java.util.List;

public interface UserAccountMapper {

    //登录时查询是否已存在用户账号
    public UserAccount loginUser(LoginInfo loginInfo);

    //后台展示所有的用户账号信息
    public List<UserAccount> listAllUser();

    //根据手机号查询用户账号信息
    public UserAccount checkUserAccount(String telphone);
}
