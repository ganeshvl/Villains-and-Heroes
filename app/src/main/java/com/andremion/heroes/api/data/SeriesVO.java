package com.andremion.heroes.api.data;

import java.io.Serializable;

public class SeriesVO implements Serializable {

    private long mId;
    private String mTitle;
    private String mThumbnail;
    private String mImage;

    public SeriesVO() {
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(String thumbnail) {
        mThumbnail = thumbnail;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    @Override
    public String toString() {
        return "Series{" + mId + ", '" + mTitle + "'}";
    }
}
