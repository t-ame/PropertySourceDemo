package com.java.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.java.component.HelloWorld;


@Configuration
@PropertySource("test.properties")
public class PropertyAnnotationDemo {

	@Value("${name}")
	private String name;
	@Value("${age}")
	private int age;
	@Value("${height}")
	private float height;
	
	@Bean("hello2")
	HelloWorld getHello() {
		return new HelloWorld(name, age, height);
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
