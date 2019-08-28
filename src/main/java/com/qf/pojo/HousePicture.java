package com.qf.pojo;

public class HousePicture {
    int hpid;
    int houseid;
    String picture;

    public int getHpid() {
        return hpid;
    }

    public void setHpid(int hpid) {
        this.hpid = hpid;
    }

    public int getHouseid() {
        return houseid;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "HousePicture{" +
                "hpid=" + hpid +
                ", houseid=" + houseid +
                ", picture='" + picture + '\'' +
                '}';
    }
}

