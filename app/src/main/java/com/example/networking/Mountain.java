package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {
    private String ID;
    private String name;
    @SerializedName("cost")
    private int feet;
    @SerializedName("size")
    private int meter;
    @SerializedName("auxdata")
    private String wiki;

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getFeet() {
        return feet;
    }

    public int getMeter() {
        return meter;
    }

    public String getWiki() {
        return wiki;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }
}
