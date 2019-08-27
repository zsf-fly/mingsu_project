package com.qf.service;

import com.qf.dto.LoginInfo;
import com.qf.pojo.Administrator;
import com.qf.vo.AdministratorInfoVO;

import java.util.List;

public interface AdministratorService {
    /**
     * 管理员登录
     * @param loginInfo
     * @return
     */
    public Administrator loginValidation(LoginInfo loginInfo);

    public List<AdministratorInfoVO> listAllAdministrator();

    public AdministratorInfoVO selectAdministratorById(int adminid);

    public int deletAdministrator(int adminid);
}
