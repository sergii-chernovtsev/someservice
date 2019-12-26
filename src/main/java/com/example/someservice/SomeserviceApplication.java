package com.example.someservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SomeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SomeserviceApplication.class, args);
		System.out.println("Hello");
	}

}
