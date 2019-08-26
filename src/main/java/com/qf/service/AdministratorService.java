package com.qf.service;

import com.qf.dto.LoginInfo;
import com.qf.pojo.Administrator;

public interface AdministratorService {
    /**
     * 管理员登录
     * @param loginInfo
     * @return
     */
    public Administrator loginValidation(LoginInfo loginInfo);

}
