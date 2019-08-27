package com.qf.pojo;

public class Safetyfacilities {
    int sfid;
    int houseid;
    int smokealarm;
    int co_alam;
    int first_aid_kit;
    int extinguisher;

    public int getSfid() {
        return sfid;
    }

    public void setSfid(int sfid) {
        this.sfid = sfid;
    }

    public int getHouseid() {
        return houseid;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }

    public int getSmokealarm() {
        return smokealarm;
    }

    public void setSmokealarm(int smokealarm) {
        this.smokealarm = smokealarm;
    }

    public int getCo_alam() {
        return co_alam;
    }

    public void setCo_alam(int co_alam) {
        this.co_alam = co_alam;
    }

    public int getFirst_aid_kit() {
        return first_aid_kit;
    }

    public void setFirst_aid_kit(int first_aid_kit) {
        this.first_aid_kit = first_aid_kit;
    }

    public int getExtinguisher() {
        return extinguisher;
    }

    public void setExtinguisher(int extinguisher) {
        this.extinguisher = extinguisher;
    }

    @Override
    public String toString() {
        return "Safetyfacilities{" +
                "sfid=" + sfid +
                ", houseid=" + houseid +
                ", smokealarm=" + smokealarm +
                ", co_alam=" + co_alam +
                ", first_aid_kit=" + first_aid_kit +
                ", extinguisher=" + extinguisher +
                '}';
    }
}
