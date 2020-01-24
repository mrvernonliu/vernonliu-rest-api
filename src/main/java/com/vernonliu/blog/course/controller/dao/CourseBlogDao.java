package com.vernonliu.blog.course.controller.dao;

import com.vernonliu.blog.course.controller.bean.CourseBlog;
import com.vernonliu.blog.course.controller.bean.CourseBlogTitles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseBlogDao extends JpaRepository<CourseBlog, Long> {

    CourseBlog findById(int id);
    List<CourseBlogTitles> findAllProjectedBy();
}
