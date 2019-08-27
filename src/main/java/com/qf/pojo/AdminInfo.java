package com.qf.pojo;

public class AdminInfo {
    int ainfoid;
    int adminid;
    String adminname;
    String worknumber;
    String adminphone;

    public int getAinfoid() {
        return ainfoid;
    }

    public void setAinfoid(int ainfoid) {
        this.ainfoid = ainfoid;
    }

    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    public String getAdmin_name() {
        return adminname;
    }

    public void setAdmin_name(String admin_name) {
        this.adminname = admin_name;
    }

    public String getWork_number() {
        return worknumber;
    }

    public void setWork_number(String work_number) {
        this.worknumber = work_number;
    }

    public String getAdmin_phone() {
        return adminphone;
    }

    public void setAdmin_phone(String admin_phone) {
        this.adminphone = admin_phone;
    }

    @Override
    public String toString() {
        return "AdminInfo{" +
                "ainfoid=" + ainfoid +
                ", adminid=" + adminid +
                ", adminname='" + adminname + '\'' +
                ", worknumber='" + worknumber + '\'' +
                ", adminphone='" + adminphone + '\'' +
                '}';
    }
}
