package com.example.demo.controller;

import com.example.demo.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/user")
    public String index(Long id, ModelMap modelMap) {
        modelMap.addAttribute("id",id);
        return "user";
    }

    @MessageMapping("/message")
    public void messgae(Message message)  {
        System.out.println("11");
        simpMessagingTemplate.convertAndSendToUser(message.getToUserId(),"/message/get",message);
    }
}
