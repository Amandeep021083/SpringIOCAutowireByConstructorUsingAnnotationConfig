package com.springioc.autowire.byConstructor.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	private String name;
	private int cost;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
