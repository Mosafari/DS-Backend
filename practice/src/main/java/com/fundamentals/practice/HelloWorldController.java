package com.fundamentals.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	// Get HTTP Method
	@GetMapping("/")
	public String message() {
		return "Welcome to Spring Boot Application!";
	}
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!";
	}


}
