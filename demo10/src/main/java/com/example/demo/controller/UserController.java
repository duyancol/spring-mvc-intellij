package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("users")
    public String showHomePage(){
        System.out.println("main controler");
        return "index";

    }
}
