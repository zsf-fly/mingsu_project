package com.qf.vo;

public class AdministratorInfoVO {
    int adminid;
    String adminname;
    String admin_name;
    String work_number;
    String admin_phone;

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getWork_number() {
        return work_number;
    }

    public void setWork_number(String work_number) {
        this.work_number = work_number;
    }

    public String getAdmin_phone() {
        return admin_phone;
    }

    public void setAdmin_phone(String admin_phone) {
        this.admin_phone = admin_phone;
    }

    @Override
    public String toString() {
        return "AdministratorInfoVO{" +
                "adminid=" + adminid +
                ", adminname='" + adminname + '\'' +
                ", admin_name='" + admin_name + '\'' +
                ", work_number='" + work_number + '\'' +
                ", admin_phone='" + admin_phone + '\'' +
                '}';
    }
}
