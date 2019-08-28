package com.qf.pojo;

public class HouseDetails {
    int hdid;
    int houseid;
    String sketch;
    String spots;
    String traffic;

    public int getHdid() {
        return hdid;
    }

    public void setHdid(int hdid) {
        this.hdid = hdid;
    }

    public int getHouseid() {
        return houseid;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }

    public String getSketch() {
        return sketch;
    }

    public void setSketch(String sketch) {
        this.sketch = sketch;
    }

    public String getSpots() {
        return spots;
    }

    public void setSpots(String spots) {
        this.spots = spots;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    @Override
    public String toString() {
        return "HouseDetails{" +
                "hdid=" + hdid +
                ", houseid=" + houseid +
                ", sketch='" + sketch + '\'' +
                ", spots='" + spots + '\'' +
                ", traffic='" + traffic + '\'' +
                '}';
    }
}
