package com.example.quakereport;

public class Quake {

    private String mMagnitude, mLocation;
    private Long mDate;

    public Quake() {

    }

    public Quake(String mMagnitude, String mLocation, Long mDate) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public Long getmDate() {
        return mDate;
    }
}
