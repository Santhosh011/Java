package com.mySpring.FirstApplication.springApp.controller;

import com.mySpring.FirstApplication.springApp.armyDivisions.Army;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ArmyControllerV2 {

    private static final Logger log =
            LoggerFactory.getLogger(ArmyControllerV2.class);

    private Army army;

    //Below setter method is the part of the setter injection. This V2 class has been
    //created for the sole reason for testing the setter injection
    @Autowired
    public void doSalute(Army theArmy){
        log.info("Calling doSalute Setter injection");
        this.army = theArmy;
    }

    @GetMapping("/armyDescriptionV2")
    public String getArmyDescriptionV2(){
        log.info("Calling getArmyDescriptionV2 Api");
        return army.getDescription();
    }

    @GetMapping("/getArmyLogoV2")
    public ResponseEntity<byte[]> getArmyLogoV2(){
        log.info("Calling getArmyLogoV2 Api");
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(army.getImage());
    }
}