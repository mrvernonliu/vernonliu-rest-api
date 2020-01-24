package com.vernonliu.blog.general.dao;

import com.vernonliu.blog.general.bean.Blog;
import com.vernonliu.blog.general.bean.BlogHome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Deprecated
public interface BlogDAO extends JpaRepository<Blog, Long> {
    Blog findById(int id);
    List<BlogHome> findAllProjectedBy();
}
