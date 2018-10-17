package com.vernonliu.gallery.bean;

/*
    Author: Vernon Liu
    This is a projection of gallery designed for the gallery browser
    because the browser does not need access to body of the post
 */
public interface GalleryHome {
    public int getId();
    public String getTitle();
    public String getDescription();
    public String getPath();
}
