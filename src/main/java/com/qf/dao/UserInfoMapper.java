package com.qf.dao;

import com.qf.dto.LoginInfo;
import com.qf.pojo.UserAccount;

public interface UserInfoMapper {
    public UserAccount loginCheck(LoginInfo loginInfo);
    public int register(UserAccount userAccount);
    public UserAccount checkUsername(UserAccount userAccount);
    public UserAccount checkTelphone(UserAccount userAccount);
}
