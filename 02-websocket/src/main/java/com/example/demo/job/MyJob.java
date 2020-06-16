package com.example.demo.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;


@Configuration
public class MyJob {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Scheduled(fixedRate = 1000)
    public void sendMessage(){
        System.out.println("来自服务器的消息");
        simpMessagingTemplate.convertAndSend("/server/sendMessageByServer",System.currentTimeMillis());
    }

    @Scheduled(fixedRate = 2000)
    public void sendMessageToUser(){
        System.out.println("服务器推送给指定用户的消息");
        simpMessagingTemplate.convertAndSendToUser("1","/sendMessageByServer",System.currentTimeMillis());
    }
}
