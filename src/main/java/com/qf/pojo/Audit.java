package com.qf.pojo;

public class Audit {
    int auditid;
    int userid;
    int houseid;
    long createtime;
    int status;

    public int getAuditid() {
        return auditid;
    }

    public void setAuditid(int auditid) {
        this.auditid = auditid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getHouseid() {
        return houseid;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }

    public long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(long createtime) {
        this.createtime = createtime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Audit{" +
                "auditid=" + auditid +
                ", userid=" + userid +
                ", houseid=" + houseid +
                ", createtime=" + createtime +
                ", status=" + status +
                '}';
    }
}
