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

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseMaster() {
        return houseMaster;
    }

    public void setHouseMaster(String houseMaster) {
        this.houseMaster = houseMaster;
    }

    public String getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(String monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  id + "\t\t" + houseMaster + "\t\t" + phone + "\t\t" + address + "\t\t" + monthlyRent + "\t\t" + status;
    }
}
