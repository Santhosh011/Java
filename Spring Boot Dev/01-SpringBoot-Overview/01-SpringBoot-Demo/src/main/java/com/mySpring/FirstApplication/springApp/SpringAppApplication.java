package com.mySpring.FirstApplication.springApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@SpringBootApplication(
//		scanBasePackages = {"com.mySpring.FirstApplication.springApp",
//				                  "com.mySpring.FirstApplication.utils"}
//)
@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
