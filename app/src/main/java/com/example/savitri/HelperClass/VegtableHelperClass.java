package com.example.savitri.HelperClass;

public class VegtableHelperClass {

    int image;
    String title;
    String desc;

    public VegtableHelperClass(int image, String title, String desc) {
        this.image = image;
        this.title = title;
        this.desc = desc;

    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
