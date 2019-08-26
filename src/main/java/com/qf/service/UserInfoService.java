package com.qf.service;

import com.qf.dto.LoginInfo;
import com.qf.pojo.UserAccount;

public interface UserInfoService {
    /**
     * 用户登录
     * @param loginInfo
     * @return
     */
    public UserAccount loginCheck(LoginInfo loginInfo);

//    /**
//     * 检验用户名是否已经存在
//     * @param telphone
//     * @return
//     */
//    public boolean findUsernameByTelphone(String telphone);
//
//    /**
//     * 检验电话号码是否已经存在
//     * @param telphone
//     * @return
//     */
//    public boolean checkTelphone(String telphone);

    /**
     * 用户注册
     * @param userAccount
     * @return
     */
    public boolean register(UserAccount userAccount);

    /**
     * 注册用户名识别
     * @param userAccount
     * @return
     */
    public UserAccount checkUsername(UserAccount userAccount);

    /**
     * 注册手机号识别
     * @param userAccount
     * @return
     */
    public UserAccount checkTelphone(UserAccount userAccount);


}
