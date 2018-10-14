package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;



@Configuration
public class PropertyDemo {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertyConfig() {
		
		PropertySourcesPlaceholderConfigurer phc = new PropertySourcesPlaceholderConfigurer();
		
		phc.setLocation(new ClassPathResource("test.properties"));
		
		return phc;
	}
	
	
}
