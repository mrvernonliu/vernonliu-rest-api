package com.vernonliu.gallery.dao;

import com.vernonliu.gallery.bean.Gallery;
import com.vernonliu.gallery.bean.GalleryHome;
import com.vernonliu.gallery.bean.GalleryPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
    Author: Vernon Liu
 */
@Repository
public interface GalleryDAO extends JpaRepository<Gallery, Long> {

    GalleryPage findById(int id);
    List<Gallery> findAll();
    List<GalleryHome> findAllProjectedBy();
}
