package com.yomsz.controller;


import com.yomsz.pojo.User;
import com.yomsz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //pathvaraible  url/参数
    @GetMapping("/user") // ?key=value
    public User getUser(@RequestParam("id") Integer id) {
        User user = userService.getUserById(id);
        return user;
    }

    @GetMapping("/buyMovie")
    public Map<String, Object> buyMovie(@RequestParam("id") Integer userId) {
        // user  movie服务
        Map<String, Object> map = userService.buyMovie(userId);
        return map;
    }


}
