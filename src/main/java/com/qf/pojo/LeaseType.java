package com.qf.pojo;

public class LeaseType {
    int ltid;
    String leasetype;

    public int getLtid() {
        return ltid;
    }

    public void setLtid(int ltid) {
        this.ltid = ltid;
    }

    public String getLeasetype() {
        return leasetype;
    }

    public void setLeasetype(String leasetype) {
        this.leasetype = leasetype;
    }

    @Override
    public String toString() {
        return "LeaseType{" +
                "ltid=" + ltid +
                ", leasetype='" + leasetype + '\'' +
                '}';
    }
}
