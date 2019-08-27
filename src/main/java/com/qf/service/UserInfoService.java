package com.qf.service;

import com.qf.dto.LoginInfo;
import com.qf.pojo.UserAccount;
import com.qf.vo.UserInfoVO;

public interface UserInfoService {
    /**
     * 用户登录
     * @param loginInfo
     * @return
     */
    public UserAccount loginCheck(LoginInfo loginInfo);

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

    /**
     * 后台获取展示用户信息
     * @param userid
     * @return
     */
    public UserInfoVO selectUserInfo(int userid);
}
