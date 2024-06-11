package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Movie {
	private String name;
	private String genre;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", genre=" + genre + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("inside @PreConstruct annotation");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("inside @PreDestroy annotation");
	}
}
