package com.example.android.tourguide;

public class Content {

    private int mContent;

    private int mName;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mImageResourceIdBig = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Content(int name, int info, int imageResourceId) {
        mContent = name;
        mName = info;
        mImageResourceId = imageResourceId;
    }

    public Content(int name, int info, int imageResourceId, int imageResourceIdBig) {
        mContent = name;
        mName = info;
        mImageResourceId = imageResourceId;
        mImageResourceIdBig = imageResourceIdBig;
    }


    public int getName() {
        return mContent;
    }

    public int getiContent() {
        return mName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
    public int getmImageResourceIdBig() {
        return mImageResourceIdBig;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

