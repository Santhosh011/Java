package com.mySpring.FirstApplication.springApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }
}
