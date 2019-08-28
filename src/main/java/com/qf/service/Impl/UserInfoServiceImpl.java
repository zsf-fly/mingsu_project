package com.qf.service.Impl;

import com.qf.dao.UserInfoMapper;
import com.qf.dto.LoginInfo;
import com.qf.pojo.UserAccount;
import com.qf.service.UserInfoService;
import com.qf.toolkit.Md5;
import com.qf.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;


    /**
     * 密码加密
     * @param loginInfo
     * @return
     */
    public UserAccount loginCheck(LoginInfo loginInfo) {
        String pwd = Md5.encodePassword(loginInfo.getPassword());
        loginInfo.setPassword(pwd);
        return userInfoMapper.loginCheck(loginInfo);
    }

    public UserAccount checkUsername(UserAccount userAccount){
        return userInfoMapper.checkUsername(userAccount);
    }

    public UserAccount checkTelphone(UserAccount userAccount){
        return userInfoMapper.checkTelphone(userAccount);
    }

    public UserInfoVO selectUserInfo(int userid) {
        return userInfoMapper.selectUserInfo(userid);
    }

    //注册验证
    @Transactional
    public boolean register(UserAccount userAccount) {
        //验证用户名
    UserAccount usernameByTelphone = userInfoMapper.checkUsername(userAccount);
    if(usernameByTelphone!=null){
        return false;
    }
    //验证电话
    UserAccount userAccount1 = userInfoMapper.checkTelphone(userAccount);
    if(userAccount1!=null){
        return false;
    }
        String pwd = Md5.encodePassword(userAccount.getPassword());
        userAccount.setPassword(pwd);
        int register = userInfoMapper.register(userAccount);
        return register>0;
    }


}
