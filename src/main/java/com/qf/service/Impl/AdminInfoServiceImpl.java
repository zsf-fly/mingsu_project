package com.qf.service.Impl;

import com.qf.dao.AdminInfoMapper;
import com.qf.pojo.AdminInfo;
import com.qf.service.AdminInfoService;
import com.qf.vo.AdministratorInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminInfoServiceImpl implements AdminInfoService {

    @Autowired
    AdminInfoMapper adminInfoMapper;

    public int addAdminInfo(AdminInfo adminInfo) {
        return adminInfoMapper.addAdminInfo(adminInfo);
    }

    public AdminInfo getAdminInfo(int adminid) {
        return adminInfoMapper.getAdminInfo(adminid);
    }

    public AdministratorInfoVO checkadmin(String work_number) {
        return adminInfoMapper.checkadmin(work_number);
    }

    public int updateAdminInfo(AdministratorInfoVO administratorInfoVO) {
        return adminInfoMapper.updateAdminInfo(administratorInfoVO);
    }
}
