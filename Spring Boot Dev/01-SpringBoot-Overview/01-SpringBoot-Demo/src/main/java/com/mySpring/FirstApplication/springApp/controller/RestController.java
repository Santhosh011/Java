package com.mySpring.FirstApplication.springApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    //Get the value from property
    @Value("${coach.name}")
    String coachName;

    @Value("${team.name}")
    String teamName;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    //A new end point
    @GetMapping("/workout")
    public String doWorkout(){
        return "Uff tired after a tough leg day!!";
    }

    @GetMapping("/aotIntro")
    public String aotIntro(){
        return coachName + " Leads " + teamName;
    }

}
