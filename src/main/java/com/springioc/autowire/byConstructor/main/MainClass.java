package com.springioc.autowire.byConstructor.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.autowire.byConstructor.beans.User;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		User user = (User)context.getBean("user");
		System.out.println(user.getCar().getName());

	}

}
