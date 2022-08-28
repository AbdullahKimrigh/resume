package com.codingdojo.LearningMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningMavenApplication.class, args);
	}

	public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
