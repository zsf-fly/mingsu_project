package com.qf.pojo;

public class Amenities {
    int amenityid;
    int houseid;
    int wifi;
    int toiletries;
    int television;
    int air;
    int refrigerator;
    int desk;
    int hairdryer;
    int washer;
    int hanger;
    int iron;
    int elevator;

    public int getAmenityid() {
        return amenityid;
    }

    public void setAmenityid(int amenityid) {
        this.amenityid = amenityid;
    }

    public int getHouseid() {
        return houseid;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }

    public int getWifi() {
        return wifi;
    }

    public void setWifi(int wifi) {
        this.wifi = wifi;
    }

    public int getToiletries() {
        return toiletries;
    }

    public void setToiletries(int toiletries) {
        this.toiletries = toiletries;
    }

    public int getTelevision() {
        return television;
    }

    public void setTelevision(int television) {
        this.television = television;
    }

    public int getAir() {
        return air;
    }

    public void setAir(int air) {
        this.air = air;
    }

    public int getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(int refrigerator) {
        this.refrigerator = refrigerator;
    }

    public int getDesk() {
        return desk;
    }

    public void setDesk(int desk) {
        this.desk = desk;
    }

    public int getHairdryer() {
        return hairdryer;
    }

    public void setHairdryer(int hairdryer) {
        this.hairdryer = hairdryer;
    }

    public int getWasher() {
        return washer;
    }

    public void setWasher(int washer) {
        this.washer = washer;
    }

    public int getHanger() {
        return hanger;
    }

    public void setHanger(int hanger) {
        this.hanger = hanger;
    }

    public int getIron() {
        return iron;
    }

    public void setIron(int iron) {
        this.iron = iron;
    }

    public int getElevator() {
        return elevator;
    }

    public void setElevator(int elevator) {
        this.elevator = elevator;
    }

    @Override
    public String toString() {
        return "Amenities{" +
                "amenityid=" + amenityid +
                ", houseid=" + houseid +
                ", wifi=" + wifi +
                ", toiletries=" + toiletries +
                ", television=" + television +
                ", air=" + air +
                ", refrigerator=" + refrigerator +
                ", desk=" + desk +
                ", hairdryer=" + hairdryer +
                ", washer=" + washer +
                ", hanger=" + hanger +
                ", iron=" + iron +
                ", elevator=" + elevator +
                '}';
    }
}
