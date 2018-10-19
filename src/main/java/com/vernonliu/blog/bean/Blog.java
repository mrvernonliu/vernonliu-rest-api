package com.vernonliu.blog.bean;

import javax.persistence.*;
import java.util.Date;

/*
    Author: Vernon Liu
    This object refers to the blogs table in the
    mysql database.
 */

@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @GeneratedValue
    @Column(name = "date")
    private Date date;

    @Column(name = "path")
    private String path;

    @Column(name = "description")
    private String description;

    @Column(name = "post")
    private String post;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
