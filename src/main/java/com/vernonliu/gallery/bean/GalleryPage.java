package com.vernonliu.gallery.bean;

/*
    Author: Vernon Liu
    This is the projection for a single gallery page which
    does not need the description
 */
public interface GalleryPage {
    public int getId();
    public String getTitle();
    public String getPath();
    public String getPost();
}
