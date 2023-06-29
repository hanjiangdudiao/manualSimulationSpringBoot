package com.fengyang.user.controller;

import com.fengyang.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("fengyang")
    public String fengyang() {
        return userService.fengyang();
    }

}
