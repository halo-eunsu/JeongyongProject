package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
//@Profile("real")
@Profile("!dev")
public class EmailMessageSender implements  MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent ${email} : ${message}");
    }
}
