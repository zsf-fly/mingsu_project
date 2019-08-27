package com.qf.pojo;

public class Houses {
    int houseid;
    int userid;
    String h_name;
    String h_type;
    String rent_type;
    int h_price;
    int people;
    int bedroom;
    int bed;
    String bed_type;
    int toliet;

    public int getHouseid() {
        return houseid;
    }

    public void setHouseid(int houseid) {
        this.houseid = houseid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getH_name() {
        return h_name;
    }

    public void setH_name(String h_name) {
        this.h_name = h_name;
    }

    public String getH_type() {
        return h_type;
    }

    public void setH_type(String h_type) {
        this.h_type = h_type;
    }

    public String getRent_type() {
        return rent_type;
    }

    public void setRent_type(String rent_type) {
        this.rent_type = rent_type;
    }

    public int getH_price() {
        return h_price;
    }

    public void setH_price(int h_price) {
        this.h_price = h_price;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public String getBed_type() {
        return bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    public int getToliet() {
        return toliet;
    }

    public void setToliet(int toliet) {
        this.toliet = toliet;
    }

    @Override
    public String toString() {
        return "Houses{" +
                "houseid=" + houseid +
                ", userid=" + userid +
                ", h_name='" + h_name + '\'' +
                ", h_type='" + h_type + '\'' +
                ", rent_type='" + rent_type + '\'' +
                ", h_price=" + h_price +
                ", people=" + people +
                ", bedroom=" + bedroom +
                ", bed=" + bed +
                ", bed_type='" + bed_type + '\'' +
                ", toliet=" + toliet +
                '}';
    }
}
