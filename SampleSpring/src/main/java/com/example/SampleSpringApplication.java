package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleSpringApplication {

	public static void main(String[] args) {
		System.out.println(" Some commit ");
		
		SpringApplication.run(SampleSpringApplication.class, args);
	}
}
