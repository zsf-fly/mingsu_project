package com.qf.vo;

import com.qf.pojo.HousePicture;

import java.util.List;

public class HouseInfoVO {
    int houseid;
    long h_price;
    String sketch;
    String city;
    String h_type;
    List<HousePicture> housePictures;

    public int getHouseid() {
        return houseid;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }

    public long getH_price() {
        return h_price;
    }

    public void setH_price(long h_price) {
        this.h_price = h_price;
    }

    public String getSketch() {
        return sketch;
    }

    public void setSketch(String sketch) {
        this.sketch = sketch;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getH_type() {
        return h_type;
    }

    public void setH_type(String h_type) {
        this.h_type = h_type;
    }

    public List<HousePicture> getHousePictures() {
        return housePictures;
    }

    public void setHousePictures(List<HousePicture> housePictures) {
        this.housePictures = housePictures;
    }

    @Override
    public String toString() {
        return "HouseInfoVO{" +
                ", houseid=" + houseid +
                ", h_price=" + h_price +
                ", sketch='" + sketch + '\'' +
                ", city='" + city + '\'' +
                ", h_type='" + h_type + '\'' +
                ", housePictures=" + housePictures +
                '}';
    }
}
