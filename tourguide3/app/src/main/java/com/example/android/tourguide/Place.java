package com.example.android.tourguide;

public class Place {
    // information on all attractions,hotel and restaurant
    private int mContent;
    // name hotel of atraction
    private int mName;
    // Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     *
     * @param info               is the info for page
     * @param name               is the name for the atraction
     * @param imageResourceId    is the image for the list
     */



    public Place(int name, int info, int imageResourceId) {
        mName = name;
        mContent = info;
        mImageResourceId = imageResourceId;
    }

    // Get the Name of the Place.
    public int getName() {
        return mName;
    }

    // Get the Info of the Place.
    public int getContent() {
        return mContent;
    }

    // Get the image of the Place.
    public int getImageResourceId() {
        return mImageResourceId;
    }


    // Get the image of the Place.
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

