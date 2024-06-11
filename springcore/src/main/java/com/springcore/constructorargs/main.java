package com.springcore.constructorargs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Person person = (Person) context.getBean("person");
		Constructorambiguity add = (Constructorambiguity) context.getBean("addition");
		System.out.println(person);
		add.doSum();
	}

}
