package com.springioc.autowire.byConstructor.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

	private Car car;
	
	@Autowired
	public User(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
