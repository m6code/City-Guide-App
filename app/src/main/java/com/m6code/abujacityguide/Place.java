package com.m6code.abujacityguide;

/**
 * Created by Benjamin on 4/7/2017.
 * {@link Place} represents a location that a user can visit
 * it contains a String which is the name of the place.
 */

public class Place {

    private int mPlaceImageID;
    private int mPlaceNameID;

    public Place(int placeImageID, int placeNameID){
        mPlaceNameID = placeNameID;
        mPlaceImageID = placeImageID;
    }

    /**
     * Get the name of a place
     * @return the name id of the place
     */
    public int getPlaceNameID(){
        return mPlaceNameID;
    }

    /**
     * Get the image of a place
     * @return the image id of the place
     */
    public int getPlaceImageID(){
        return mPlaceImageID;
    }

}
