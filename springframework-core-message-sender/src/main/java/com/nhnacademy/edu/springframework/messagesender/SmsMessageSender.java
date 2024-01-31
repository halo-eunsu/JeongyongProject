package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.Main;
import com.nhnacademy.edu.springframework.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;



@Component//무조건 class 위에 쓴다.
//@Profile("dev")
@Profile({"dev", "default"})//servlet url도 string 배열
public class SmsMessageSender implements  MessageSender{
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to "+ user.getPhoneNumber() + " " + user.getEmail());
    }
}
