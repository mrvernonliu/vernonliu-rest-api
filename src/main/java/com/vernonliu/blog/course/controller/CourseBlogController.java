package com.vernonliu.blog.course.controller;

import com.vernonliu.blog.course.controller.bean.CourseBlog;
import com.vernonliu.blog.course.controller.bean.CourseBlogTitles;
import com.vernonliu.blog.course.controller.dao.CourseBlogDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/blog/course")
public class CourseBlogController {

    Logger logger = LoggerFactory.getLogger(CourseBlogController.class);

    @Autowired
    CourseBlogDao courseBlogDao;

    @ResponseBody
    @CrossOrigin
    @RequestMapping("/{courseId}")
    public List<CourseBlogTitles> getCourseBlogTitles(@PathVariable String courseId) {
        logger.info("A user accessed " + courseId);
        return courseBlogDao.findAllProjectedBy();
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping("/{courseId}/{postId}")
    public CourseBlog getCourseBlogPost(@PathVariable String courseId, @PathVariable int postId) {
        logger.info("A user accessed " + courseId + "/" + postId);
        return courseBlogDao.findById(postId);
    }

}
