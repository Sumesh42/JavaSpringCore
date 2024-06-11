package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		context.registerShutdownHook();
		
		Vehicle vehicle = (Vehicle) context.getBean("vehicle1");
		System.out.println(vehicle.getName());
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		Polygon polygon = (Polygon) context.getBean("polygon1");
		System.out.println(polygon.getName());
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		Movie movie1 = (Movie) context.getBean("movie");
		System.out.println(movie1);
	}
}



