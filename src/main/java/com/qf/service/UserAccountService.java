package com.qf.service;

import com.qf.dto.LoginInfo;
import com.qf.pojo.UserAccount;

import java.util.List;

public interface UserAccountService {

    public UserAccount loginUser(LoginInfo loginInfo);

    public List<UserAccount> listAllUser();

    public UserAccount checkUserAccount(String telphone);
}
