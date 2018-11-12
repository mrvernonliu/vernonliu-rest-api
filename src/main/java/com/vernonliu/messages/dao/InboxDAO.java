package com.vernonliu.messages.dao;

import com.vernonliu.messages.bean.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InboxDAO extends JpaRepository<Message, Long> {
    List<Message> findAll();
}
