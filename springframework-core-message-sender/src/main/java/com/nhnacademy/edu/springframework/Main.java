package com.nhnacademy.edu.springframework;

import com.nhnacademy.edu.springframework.messagesender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.SmsMessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        User user = new User("1234@gmail.com", "010-1111-2222");
        String message = "Hello!";

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            MessageSender smsMessageSender = context.getBean("smsMessageSender", SmsMessageSender.class);
            MessageSender emailMessageSender = context.getBean("emailMessageSender", EmailMessageSender.class);

            smsMessageSender.sendMessage(user,message);
            emailMessageSender.sendMessage(user,message);
        }

    }








}


