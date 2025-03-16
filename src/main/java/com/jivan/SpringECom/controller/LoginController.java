package com.jivan.SpringECom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping("/login")
    public String loginUser(){
        return "You are logged in!";
    }
}
