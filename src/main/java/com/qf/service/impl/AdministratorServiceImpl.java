package com.qf.service.Impl;

import com.qf.dao.AdministratorMapper;
import com.qf.dto.LoginInfo;
import com.qf.pojo.Administrator;
import com.qf.service.AdministratorService;
import com.qf.vo.AdministratorInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    AdministratorMapper administratorMapper;

    /**
     * 登录时查询管理员账号是否存在
     * @param loginInfo
     * @return
     */
    public Administrator loginValidation(LoginInfo loginInfo) {
        return administratorMapper.loginValidation(loginInfo);
    }

    /**
     * 查询一级之外的其他管理员信息
     * 用于后台一级管理员管理其他级别管理员
     * @return
     */
    public List<AdministratorInfoVO> listAllAdministrator() {
        return administratorMapper.listAllAdministrator();
    }

    /**
     * 根据id查询信息展示在修改页
     * @param adminid
     * @return
     */
    public AdministratorInfoVO selectAdministratorById(int adminid) {
        return administratorMapper.selectAdministratorById(adminid);
    }
    /**
     * 根据id删除管理员
     * @param adminid
     * @return
     */
    public int deletAdministrator(int adminid) {
        return administratorMapper.deletAdministrator(adminid);
    }
}
