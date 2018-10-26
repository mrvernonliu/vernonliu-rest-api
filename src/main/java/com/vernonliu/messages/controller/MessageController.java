package com.vernonliu.messages.controller;

import com.vernonliu.messages.bean.Message;
import com.vernonliu.messages.dao.MessageDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/message")
public class MessageController {

    Logger logger = LoggerFactory.getLogger(MessageController.class);

    @Autowired
    MessageDAO messageDAO;

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<Message> setMessage(@RequestBody Message message) {
        logger.info("A user has sent a message");
        if (messageDAO.save(message) != null) {
            return new ResponseEntity<Message>(message, HttpStatus.OK);
        }
        return new ResponseEntity<Message>(message, HttpStatus.UNPROCESSABLE_ENTITY);
    }
}
