package com.vernonliu.blog.general.controller;

import com.vernonliu.blog.general.bean.Blog;
import com.vernonliu.blog.general.bean.BlogHome;
import com.vernonliu.blog.general.dao.BlogDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
    Author: Vernon Liu
    REST endpoint for blogging
 */
@Deprecated
@Controller
@RequestMapping(value = "/blog")
public class BlogController {

    @Autowired
    BlogDAO blogDAO;

    //TODO: Implement this
    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public List<BlogHome> getBlogHome() {
        return blogDAO.findAllProjectedBy();
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Blog getBlogPost(@PathVariable int id) {
        return blogDAO.findById(id);
    }
}
