package com.vernonliu.gallery.controller;

import com.vernonliu.gallery.bean.GalleryHome;
import com.vernonliu.gallery.bean.GalleryPage;
import com.vernonliu.gallery.dao.GalleryDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
    Author: Vernon Liu
    REST endpoint for gallery
 */
@Controller
@RequestMapping("/gallery")
public class GalleryController {

    Logger logger = LoggerFactory.getLogger(GalleryController.class);

    @Autowired
    GalleryDAO galleryDAO;

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public List<GalleryHome> getAll() {
        logger.info("A user accessed gallery-home");
        return galleryDAO.findAllProjectedBy();
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public GalleryPage findById(@PathVariable int id) {
        logger.info("A user requested for gallery # {}", id);
        return galleryDAO.findById(id);
    }
}
