package com.vernonliu.blog.bean;

import java.util.Date;

@Deprecated
public interface BlogHome {
    int getId();
    String getTitle();
    Date getDate();
    String getPath();
    String getDescription();
}
