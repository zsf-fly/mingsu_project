package com.qf.dao;

import com.qf.dto.LoginInfo;
import com.qf.pojo.UserAccount;
import com.qf.vo.UserInfoVO;

public interface UserInfoMapper {

    public UserAccount loginCheck(LoginInfo loginInfo);

    public int register(UserAccount userAccount);

    public UserAccount checkUsername(UserAccount userAccount);

    public UserAccount checkTelphone(UserAccount userAccount);

    public UserInfoVO selectUserInfo(int userid);
}
