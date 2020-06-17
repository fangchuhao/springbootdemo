package com.example.springbootfreemarker.controller;

import com.example.springbootfreemarker.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/getUsers")
    public String getUsers(Model model) {
        List<User> users =new ArrayList<>();
        users.add(new User("曹操","男","14"));
        users.add(new User("刘备","男","16"));
        users.add(new User("关羽","男","17"));
        users.add(new User("弥衡","男","18"));
        users.add(new User("郭嘉","男","19"));
        users.add(new User("周瑜","男","20"));
        users.add(new User("鲁肃","男","11"));
        users.add(new User("孙权","男","21"));
        users.add(new User("小乔","女","15"));
        users.add(new User("大乔","女","15"));
        model.addAttribute("users",users);
        return "userList";
    }
}
