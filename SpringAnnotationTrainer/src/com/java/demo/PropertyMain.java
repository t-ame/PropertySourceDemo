package com.java.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.component.HelloWorld;

public class PropertyMain {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ApplicationContext app2 = new AnnotationConfigApplicationContext("com.java.config");
		
		
		HelloWorld hello = (HelloWorld)app.getBean("helloworld");
		if(hello != null)
			hello.sayHello();
		
		HelloWorld hello2 = (HelloWorld)app2.getBean("hello2");
		if(hello2 != null)
			hello2.sayHello();
		
		((ConfigurableApplicationContext)app).close();
		((ConfigurableApplicationContext)app2).close();
		
		
	}
	
	
}
