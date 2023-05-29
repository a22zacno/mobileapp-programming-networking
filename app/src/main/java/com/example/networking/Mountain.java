package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    @SerializedName("cost")
    private int feet;
    @SerializedName("size")
    private int meter;

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public String getCategory() {
        return category;
    }

    public int getMeter() {
        return meter;
    }

    public int getFeet() {
        return feet;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.name = name;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }
}
