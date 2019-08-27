package com.qf.service.Impl;

import com.qf.dao.UserAccountMapper;
import com.qf.dto.LoginInfo;
import com.qf.pojo.UserAccount;
import com.qf.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    UserAccountMapper userAccountMapper;

    /**
     * 登录时查询用户账号是否存在
     * @param loginInfo
     * @return
     */
    public UserAccount loginUser(LoginInfo loginInfo) {
        return userAccountMapper.loginUser(loginInfo);
    }

    /**
     * 后台展示所有用户
     * @return
     */
    public List<UserAccount> listAllUser() {
        return userAccountMapper.listAllUser();
    }

    /**
     * 根据手机号查询用户账号信息
     * @param telphone
     * @return
     */
    public UserAccount checkUserAccount(String telphone) {
        return userAccountMapper.checkUserAccount(telphone);
    }

    /**
     * 根据id删除用户账号
     * @param userid
     * @return
     */
    public int deletUser(int userid) {
        return userAccountMapper.deletUser(userid);
    }
}
