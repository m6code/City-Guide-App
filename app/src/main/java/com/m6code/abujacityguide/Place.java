package com.m6code.abujacityguide;

/**
 * Created by Benjamin on 4/7/2017.
 * {@link Place} represents a location that a user can visit
 * it contains a String which is the name of the place.
 */

public class Place {

    private String mPlaceName;
    private String mPlaceLocation;

    public Place(String placeName, String placeLocation){
        mPlaceName = placeName;
        mPlaceLocation = placeLocation;
    }

    /**
     * Get the name of a place
     * @return the name of the place as a string
     */
    public String getPlaceName(){
        return mPlaceName;
    }

    public String getmPlaceLocation(){
        return mPlaceLocation;
    }
}
