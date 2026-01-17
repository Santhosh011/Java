package com.mySpring.FirstApplication.springApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    //A new end point
    @GetMapping("/workout")
    public String doWorkout(){
        return "Uff tired after a tough leg day!!";
    }

}
