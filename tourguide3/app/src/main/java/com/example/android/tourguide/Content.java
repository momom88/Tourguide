package com.example.android.tourguide;

import android.media.Image;

public class Content {
    // information on all attractions,hotel and restaurant
    private int mContent;
    // name hotel of atraction
    private int mName;
    // Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    // big image for the InforActivity
    private int mImageResourceIdBig = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Content object.
     *
     * @param info is the info for page
     * @param name is the name for the atraction
     */

    public Content(int name, int info, int imageResourceId) {
        mName = name;
        mContent = info;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create a new Content object.
     *
     * @param info               is the info for page
     * @param name               is the name for the atraction
     * @param imageResourceId    is the image for the list
     * @param imageResourceIdBig is the image for the InfoAction
     */

    public Content(int name, int info, int imageResourceId, int imageResourceIdBig) {
        mName = name;
        mContent = info;
        mImageResourceId = imageResourceId;
        mImageResourceIdBig = imageResourceIdBig;
    }

    // Get the Name of the Content.
    public int getName() {
        return mName;
    }

    // Get the Info of the Content.
    public int getContent() {
        return mContent;
    }

    // Get the image of the Content.
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Get the image of the Content.
    public int getmImageResourceIdBig() {
        return mImageResourceIdBig;
    }

    // Get the image of the Content.
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

