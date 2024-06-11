package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	@Autowired		//@Autowired can be witten above reference variable, setter method, and constructor
	private Address newAddress;

	public Address getAddress() {
		return newAddress;
	}

	public void setAddress(Address newAddress) {
		this.newAddress = newAddress;
	}

//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	

	public Employee(Address newAddress) {
		super();
		this.newAddress = newAddress;
	}

	@Override
	public String toString() {
		return "Employee [newAddress=" + newAddress + "]";
	}

	
	
	
}
