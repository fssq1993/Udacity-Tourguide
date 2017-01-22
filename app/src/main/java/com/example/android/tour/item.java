package com.example.android.tour;

/**
 * Created by yuanyi on 2017/1/3.
 */

public class item {
    private String name;
    private String location;
    private String content;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    public item(String default_name,String default_location,String default_content){
        name=default_name;
        location=default_location;
        content=default_content;
    }
    public item(String default_name,String default_location,String default_content, int imageResoureId){
        name=default_name;
        location=default_location;
        content=default_content;
        mImageResourceId=imageResoureId;
    }

    public String getName(){
        return name;
    }
    public String getLocation(){return location;}
    public String getContent(){
        return content;
    }
    public int getmImageResourceId(){return mImageResourceId;}
    public boolean hasImage(){return mImageResourceId!= NO_IMAGE_PROVIDED;}
}


