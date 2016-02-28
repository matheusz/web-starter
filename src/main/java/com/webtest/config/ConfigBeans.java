package com.webtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {

	@Bean
	public JerseyConfig jerseyConfig(){
		return new JerseyConfig();
	}
	
}
