package com.example.android.inclassassignment10_katieb;

import java.io.Serializable;

/**
 * Created by katie on 4/10/17.
 */

public class Episode implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public String name;
    public String info;
    public int photoID;


    public Episode(String name, String info, int photoID) {
        this.name = name;
        this.info = info;
        this.photoID = photoID;
    }

    @Override
    public String toString() {
        return name + info + photoID;
    }

}
