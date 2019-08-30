package com.qf.dao;

import com.qf.dto.LoginInfo;
import com.qf.pojo.Administrator;
import com.qf.vo.AdministratorInfoVO;

import java.util.List;

public interface AdministratorMapper {

    //登录时查询是否已存在管理员账号
    public Administrator loginValidation(LoginInfo loginInfo);

    //查询所有一级管理员之外的管理员
    public List<AdministratorInfoVO> listAllAdministrator();

    //根据id查询信息
    public AdministratorInfoVO selectAdministratorById(int adminid);

    //删除管理员
    public int deletAdministrator(int adminid);

}