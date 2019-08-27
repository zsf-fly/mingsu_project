package com.qf.vo;

public class AuditVO {
    int auditid;
    String user_name;
    String h_name;
    String provinces;
    String city;
    String address;
    String h_type;
    String rent_type;
    int status;
    long createtime;

    public int getAuditid() {
        return auditid;
    }

    public void setAuditid(int auditid) {
        this.auditid = auditid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getH_name() {
        return h_name;
    }

    public void setH_name(String h_name) {
        this.h_name = h_name;
    }

    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getH_type() {
        return h_type;
    }

    public void setH_type(String h_type) {
        this.h_type = h_type;
    }

    public String getRent_type() {
        return rent_type;
    }

    public void setRent_type(String rent_type) {
        this.rent_type = rent_type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(long createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "AuditVO{" +
                "auditid=" + auditid +
                ", user_name='" + user_name + '\'' +
                ", h_name='" + h_name + '\'' +
                ", provinces='" + provinces + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", h_type='" + h_type + '\'' +
                ", rent_type='" + rent_type + '\'' +
                ", status=" + status +
                ", createtime=" + createtime +
                '}';
    }
}
