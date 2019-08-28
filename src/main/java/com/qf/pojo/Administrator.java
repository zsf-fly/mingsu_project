package com.qf.pojo;

import lombok.Data;

public class Administrator {
    int adminid;
    String adminname;
    String adminpassword;
    final int identity=0;

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

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    public int getIdentity() {
        return identity;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "adminid=" + adminid +
                ", adminname='" + adminname + '\'' +
                ", adminpassword='" + adminpassword + '\'' +
                ", identity=" + identity +
                '}';
    }
}
