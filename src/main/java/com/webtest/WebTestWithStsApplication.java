package com.webtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.webtest")
public class WebTestWithStsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebTestWithStsApplication.class, args);
	}
	
}
