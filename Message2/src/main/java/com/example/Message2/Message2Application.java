package com.example.Message2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.SpringApplication;

@EntityScan("com.example.Message2.repos")




@SpringBootApplication
public class Message2Application {

	public static void main(String[] args) {
		SpringApplication.run(Message2Application.class, args);
	}

}
