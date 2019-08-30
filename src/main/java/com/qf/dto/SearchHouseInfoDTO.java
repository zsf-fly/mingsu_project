package com.qf.dto;

public class SearchHouseInfoDTO {
    String city;
    String h_type;
    int pageNum;

    @Override
    public String toString() {
        return "SearchHouseInfoDTO{" +
                "city='" + city + '\'' +
                ", h_type='" + h_type + '\'' +
                ", pageNum=" + pageNum +
                '}';
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
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

}
