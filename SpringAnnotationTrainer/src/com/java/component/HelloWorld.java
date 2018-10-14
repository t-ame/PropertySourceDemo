package com.java.component;

public class HelloWorld {

	private String name;
	private int age;
	private float height;
	
	public void sayHello() {
		
		System.out.println("Hello world. My name is "+ name+" i am "+age+" years old and "+height+"cm tall");
		
	}

	public HelloWorld() {
		super();
	}

	public HelloWorld(String name, int age, float height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
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
