package com.qf.pojo;

public class HouseType {
    int htid;
    String typename;

    public int getHtid() {
        return htid;
    }

    public void setHtid(int htid) {
        this.htid = htid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        return "HouseType{" +
                "htid=" + htid +
                ", typename='" + typename + '\'' +
                '}';
    }
}
