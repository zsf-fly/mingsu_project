package com.qf.dao;

import com.qf.dto.LoginInfo;
import com.qf.pojo.Administrator;


public interface AdministratorMapper {

    public Administrator loginValidation(LoginInfo loginInfo);
}
