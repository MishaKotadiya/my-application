package com.example.quakereport;

public class Earthquake {

    public final Double  mMagnitude;
    private String mLocation;
    private Long mDate;
    private String mURL;


    public Earthquake(Double Magnitude, String Location ,Long Date,String URL){
        mMagnitude = Magnitude;
        mLocation = Location;
        mDate = Date;
        mURL = URL;
    }

    public Double getMagnitude(){
        return  mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public  Long  getDate(){
        return mDate;
    }
    public  String getURL(){
        return mURL;
    }


}
