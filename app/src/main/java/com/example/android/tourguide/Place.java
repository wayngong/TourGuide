package com.example.android.tourguide;

/**
 * Created by gongkai on 2017/1/16.
 */

public class Place {
    private final static int NO_IMAGE = -1;
    private final static int NO_NAME = -1;
    private final static int NO_ADDRESS = -1;

    private int mNameResourceID = NO_NAME;

    private int mAddressResourceID = NO_ADDRESS;

    private int mImageReSourceID = NO_IMAGE;

    // Constructor
    public Place(int nameId, int addressId, int imageId) {
        mNameResourceID = nameId;
        mAddressResourceID = addressId;
        mImageReSourceID = imageId;
    }

    public Place(int nameId, int addressId){
        mNameResourceID = nameId;
        mAddressResourceID = addressId;
    }

    // Get Name
    public int getName(){ return mNameResourceID; }

    // Get Address
    public int getAddress(){ return mAddressResourceID; }

    // Get Image ID
    public int getImageReSourceIDID(){ return mImageReSourceID; }

    // Has Name
    public boolean hasName() { return mNameResourceID != NO_NAME; }

    // Has Address
    public boolean hasAddress() { return mAddressResourceID != NO_ADDRESS; }

    // Has Image or Not
    public boolean hasImage() {return mImageReSourceID != NO_IMAGE; }

}
