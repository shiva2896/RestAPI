package com.sample.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value={ "com.sample"} )
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication.run(Application.class, args);
	}

}
