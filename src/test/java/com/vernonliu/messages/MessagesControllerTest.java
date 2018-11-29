package com.vernonliu.messages;

import com.vernonliu.messages.bean.Message;
import com.vernonliu.messages.dao.MessageDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MessagesControllerTest {

    @Autowired
    MockMvc mvc;

    @Mock
    MessageDAO messageDAO;

    @Mock
    Message message;

    @Test
    public void testSendMessage() throws Exception{
        when(messageDAO.save(message)).thenReturn(message);
        RequestBuilder request = MockMvcRequestBuilders
                .post("/message")
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mvc.perform(request).andReturn();
        assert(result.getResponse().getStatus() == 200);
    }
}
