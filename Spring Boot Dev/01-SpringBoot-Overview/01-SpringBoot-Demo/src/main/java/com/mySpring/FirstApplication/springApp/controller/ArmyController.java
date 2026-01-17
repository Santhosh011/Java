package com.mySpring.FirstApplication.springApp.controller;

import com.mySpring.FirstApplication.springApp.armyDivisions.Army;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArmyController {

    private Army army;

    //Below constructor is the example of Dependency Injection
    //This constructor gets the object of the class which implements the Army interface
    //If more than one class implement Army then error will happen in case no qualifier is set in the argument
    //or if one of the class is marked as @primary.
    @Autowired
    ArmyController(Army theArmy){
        this.army = theArmy;
    }

    @GetMapping("/armyDescription")
    public String getArmyDescription(){
        return army.getDescription();
    }

    @GetMapping("/getArmyLogo")
    public ResponseEntity<byte[]> getArmyLogo(){
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(army.getImage());
    }
}
;