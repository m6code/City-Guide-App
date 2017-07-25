package com.m6code.abujacityguide;

/**
 * Created by Benjamin on 4/7/2017.
 * {@link Place} represents a location that a user can visit
 * it contains a String which is the name of the place.
 */

public class Place {

    private int mPlaceImageID;
    private int mPlaceNameID;
    private int mPlaceDescriptionID;
    private int mPlaceLocationID;
    private int mPlaceWebsiteID;
    private String  mPlaceMapID;

    public Place(int placeImageID, int placeNameID, int placeDescriptionID,
                 int placeLocationID, int placeWebsiteID, String PlaceMapID){

        mPlaceNameID = placeNameID;
        mPlaceImageID = placeImageID;
        mPlaceDescriptionID = placeDescriptionID;
        mPlaceLocationID = placeLocationID;
        mPlaceWebsiteID = placeWebsiteID;
        mPlaceMapID = PlaceMapID;
    }

    public Place(int placeNameID, int placeLocationID,
                 int placeWebsiteID, String PlaceMapID) {

        mPlaceNameID = placeNameID;
        mPlaceLocationID = placeLocationID;
        mPlaceWebsiteID = placeWebsiteID;
        mPlaceMapID = PlaceMapID;
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

    /**
     * Get the description of a place
     * @return the description id of a place as int
     */
    public int getPlaceDescriptionID(){
        return mPlaceDescriptionID;
    }

    /**
     * Get The location of a place
     * @return the location id of a place as int
     */
    public int getPlaceLocationID() {
        return mPlaceLocationID;
    }

    /**
     * Get the website a place
     * @return the website id of a place as int
     */
    public int getPlaceWebsiteID() {
        return mPlaceWebsiteID;
    }

    /**
     * get the map url of a place
     * @return the map url of a place
     */
    public String getPlaceMapID(){
        return mPlaceMapID;
    }
}
