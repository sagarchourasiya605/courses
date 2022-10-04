package com.sagar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestApiDemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =	SpringApplication.run(RestApiDemoApplication.class, args);
		Alien a=context.getBean(Alien.class);
		a.show();
		
	}

}
