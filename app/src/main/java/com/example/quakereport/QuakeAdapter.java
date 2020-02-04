package com.example.quakereport;

public class QuakeAdapter {

    private String mMagnitude, mLocation, mDate;

    public QuakeAdapter() {
    }

    public QuakeAdapter(String mMagnitude, String mLocation, String mDate) {
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

    public String getmDate() {
        return mDate;
    }
}
