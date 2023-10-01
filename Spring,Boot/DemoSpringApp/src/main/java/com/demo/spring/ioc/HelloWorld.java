package com.demo.spring.ioc;

public class HelloWorld {
	private String message;
	

	

	public HelloWorld(String message) {
		super();
		this.message = message;
		System.out.println("Parametrized conttructor invoked...");
	
}	

	public HelloWorld() {
		super();
		System.out.println("Default conttructor invoked...");
	}

	public String getMessage() {
		return message;
	}






	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	
    
}
