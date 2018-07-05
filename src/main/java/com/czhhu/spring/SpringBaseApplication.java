package com.czhhu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBaseApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringBaseApplication.class, args);
		SpringApplication springApplication = new SpringApplication(SpringBaseApplication.class);
		springApplication.setWebEnvironment(false);
		springApplication.run(args);
	}
}
