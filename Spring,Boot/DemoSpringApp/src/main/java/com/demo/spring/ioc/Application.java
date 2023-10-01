package com.demo.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld obj =(HelloWorld) context.getBean("helloworld");
		HelloWorld obj2 =(HelloWorld) context.getBean("helloworldAnother");
		System.out.print(obj);
		System.out.print("\n\n");
		System.out.print("Using Setter(<peroperty>)\n");
		System.out.print(obj2);
	}
}
