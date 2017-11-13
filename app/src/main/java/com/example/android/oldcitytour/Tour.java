package com.example.android.oldcitytour;

/**
 * Created by Nicholas on 3/18/2017.
 */

public class Tour {
    private int mTourHeader;
    private int mTourInfo;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Tour(int tourHeader,int imageResourceId, int tourInfo){
        mTourHeader = tourHeader;
        mImageResourceId = imageResourceId;
        mTourInfo = tourInfo;
    }

    public int getTourHeader(){
        return mTourHeader;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getTourInfo(){
        return mTourInfo;
    }

}
