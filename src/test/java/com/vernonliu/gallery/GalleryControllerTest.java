package com.vernonliu.gallery;

import com.vernonliu.gallery.bean.GalleryHome;
import com.vernonliu.gallery.bean.GalleryPage;
import com.vernonliu.gallery.dao.GalleryDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

/*
    Author: Vernon Liu
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GalleryControllerTest {

    @Autowired
    MockMvc mvc;

    @Mock
    GalleryDAO galleryDAO = Mockito.mock(GalleryDAO.class);

    @Mock
    GalleryHome galleryHome;
    @Mock
    GalleryPage galleryPage;

    @Test
    public void testGetFindAllProjectedBy() throws Exception{
        List<GalleryHome> data = new ArrayList<GalleryHome>();
        data.add(galleryHome);
        when(galleryDAO.findAllProjectedBy()).thenReturn(data);

        RequestBuilder request = MockMvcRequestBuilders
                .get("/gallery")
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mvc.perform(request).andReturn();
        assert(result.getResponse().getStatus() == 200);
    }

    @Test
    public void testFindById() throws Exception{
        when(galleryDAO.findById(anyInt())).thenReturn(galleryPage);

        RequestBuilder request = MockMvcRequestBuilders
                .get("/gallery/1")
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mvc.perform(request).andReturn();
        assert(result.getResponse().getStatus() == 200);
    }
}

