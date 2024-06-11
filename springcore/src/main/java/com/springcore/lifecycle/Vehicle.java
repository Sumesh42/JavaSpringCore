package com.springcore.lifecycle;

public class Vehicle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
		System.out.println("setting vehicle name");
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("inside int method");
	}
	public void destroy() {
		System.out.println("inside destroy method");
	}
}
