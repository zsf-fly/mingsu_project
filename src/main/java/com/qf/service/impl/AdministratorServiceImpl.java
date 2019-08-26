package com.qf.service.impl;

import com.qf.dao.AdministratorMapper;
import com.qf.dto.LoginInfo;
import com.qf.pojo.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServiceImpl implements AdministratorMapper {

    @Autowired
    AdministratorMapper administratorMapper;

    public Administrator loginValidation(LoginInfo loginInfo) {
        return administratorMapper.loginValidation(loginInfo);
    }
}
