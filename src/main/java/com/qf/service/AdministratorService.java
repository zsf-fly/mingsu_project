package com.qf.service;

import com.qf.dto.LoginInfo;
import com.qf.pojo.Administrator;
import com.qf.vo.AdministratorInfoVO;

import java.util.List;

public interface AdministratorService {

    public Administrator loginValidation(LoginInfo loginInfo);

    public List<AdministratorInfoVO> listAllAdministrator();

    public AdministratorInfoVO selectAdministratorById(int adminid);
}
