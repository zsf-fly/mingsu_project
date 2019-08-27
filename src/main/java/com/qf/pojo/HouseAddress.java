package com.qf.pojo;

public class HouseAddress {
    int haid;
    int houseid;
    String provinces;
    String city;
    String county;
    String address;

    public int getHaid() {
        return haid;
    }

    public void setHaid(int haid) {
        this.haid = haid;
    }

    public int getHouseid() {
        return houseid;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
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

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "HouseAddress{" +
                "haid=" + haid +
                ", houseid=" + houseid +
                ", provinces='" + provinces + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
