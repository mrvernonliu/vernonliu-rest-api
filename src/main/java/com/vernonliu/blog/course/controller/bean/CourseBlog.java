package com.vernonliu.blog.course.controller.bean;

import javax.persistence.*;
import java.net.URL;
import java.util.Date;

@Entity
@Table(name = "courseblog")
public class CourseBlog {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "url")
    private URL url;

    @Column(name = "createdDate")
    private Date date;

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

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
