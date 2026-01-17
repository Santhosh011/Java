package com.mySpring.FirstApplication.springApp.armyDivisions;

import org.springframework.stereotype.Component;

@Component
public class GarrisonRegimen implements Army{


    @Override
    public String getDescription() {
        return "We are the garrison regimen. We defend the walls.";
    }

    @Override
    public byte[] getImage() {
        return new byte[0];
    }
}
