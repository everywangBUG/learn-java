package com.houseRent;

public class House {
    private int id;
    private String houseMaster;
    private String phone;
    private String address;
    private String monthlyRent;
    private String status;

    public House(int id, String houseMaster, String phone, String address, String monthlyRent, String status) {
        this.id = id;
        this.houseMaster = houseMaster;
        this.phone = phone;
        this.address = address;
        this.monthlyRent = monthlyRent;
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  id + "\t\t" + houseMaster + "\t\t" + phone + "\t\t" + address + "\t\t" + monthlyRent + "\t\t" + status;
    }
}
