package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Polygon implements InitializingBean, DisposableBean{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
		System.out.println("Setting polygon name");
	}

	public Polygon() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Polygon [name=" + name + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside disposableBean : destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside initializingBean : init");
		
	}
	
	
}
