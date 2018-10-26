package com.vernonliu.messages.dao;

import com.vernonliu.messages.bean.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface MessageDAO extends JpaRepository<Message, Long> {

    @Transactional
    Message save(Message message);
}
