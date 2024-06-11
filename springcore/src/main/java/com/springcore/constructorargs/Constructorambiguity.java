package com.springcore.constructorargs;
/*
 * 	in constructor ambiguity if two or more constructor are present and you
	try to inject value from config.xml then it may not know which constructor to call
	to avoid this we use type in constructor-args
 */
public class Constructorambiguity {
	private int x;
	private int y;
	
	public Constructorambiguity(int x, int y) {
		System.out.println("calling int constructor");
		this.x = x;
		this.y = y;
	}
	public Constructorambiguity(double x, double y) {
		System.out.println("calling double constructor");
		this.x = (int) x;
		this.y = (int) y;
	}
	public Constructorambiguity(String x, String y) {
		System.out.println("calling String constructor");
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
	}
	public void doSum() {
		System.out.println("Sum : "+ (this.x+this.y));
	}
}
