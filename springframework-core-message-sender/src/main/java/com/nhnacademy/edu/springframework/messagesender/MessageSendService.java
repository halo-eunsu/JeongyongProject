package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSendService {


    private MessageSender messageSender;
    //생성자에 놓으려면 중복된것을 지워야한다.

    @Autowired
    public MessageSendService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message) {
        messageSender.sendMessage(user, message);
    }


}
