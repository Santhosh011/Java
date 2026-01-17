package com.mySpring.FirstApplication.springApp.armyDivisions;

import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
@Primary
public class SurveyCorps implements Army{


    @Override
    public String getDescription() {
        return "We are the survey corps we are the hope of mankind. We explore beyond the walls.";
    }

    @Override
    public byte[] getImage() {

        ClassPathResource resource =
                new ClassPathResource("surveyCorpsLogo.png");
        try {
            return resource.getInputStream().readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
