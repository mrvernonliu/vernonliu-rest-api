package com.vernonliu.messages.controller;

import com.vernonliu.messages.bean.Message;
import com.vernonliu.messages.dao.InboxDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/inbox")
public class InboxController {

    Logger logger = LoggerFactory.getLogger(InboxController.class);

    @Autowired
    InboxDAO inboxDAO;

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Message> getAllMessages() {
        logger.info("Accessing inbox");
        return inboxDAO.findAll();
    }
}
