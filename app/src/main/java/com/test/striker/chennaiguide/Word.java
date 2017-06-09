package com.test.striker.chennaiguide;

/**
 * Created by sarthak on 9/6/17.
 */

public class Word {


    private String mName;
    private String mDesc;
    private  String mRating;
    public Word(String Name , String Desc , String Rating)
    {
        mName = Name;
        mDesc = Desc;
        mRating = Rating;
    }

    public String getName() {
        return mName;
    }

    public String getDesc() {
        return mDesc;
    }

    public String getRating() {
        return mRating;
    }
}
