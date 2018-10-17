package com.vernonliu.gallery.controller;

import com.vernonliu.gallery.bean.GalleryHome;
import com.vernonliu.gallery.bean.GalleryPage;
import com.vernonliu.gallery.dao.GalleryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
    Author: Vernon Liu
 */
@Controller
@RequestMapping("/gallery")
public class GalleryController {

    @Autowired
    GalleryDAO galleryDAO;

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public List<GalleryHome> getAll() {
        return galleryDAO.findAllProjectedBy();
    }

    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public GalleryPage findById(@PathVariable int id) {
        return galleryDAO.findById(id);
    }
}
