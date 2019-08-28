package com.qf.service;

import com.qf.pojo.AdminInfo;
import com.qf.vo.AdministratorInfoVO;

public interface AdminInfoService {

    public int addAdminInfo(AdminInfo adminInfo);

    public AdminInfo getAdminInfo(int adminid);

    public AdministratorInfoVO checkadmin(String work_number);

    public int updateAdminInfo(AdministratorInfoVO administratorInfoVO);
}
