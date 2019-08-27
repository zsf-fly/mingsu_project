package com.qf.dao;

import com.qf.pojo.AdminInfo;
import com.qf.vo.AdministratorInfoVO;

public interface AdminInfoMapper {

    public AdminInfo getAdminInfo(int adminid);

    public int addAdminInfo(AdminInfo adminInfo);

    public AdministratorInfoVO checkadmin(String work_number);

    public int updateAdminInfo(AdministratorInfoVO administratorInfoVO);
}
