package com.mock.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class AwareMockApiApplication{

	public static void main(String[] args) {
		SpringApplication.run(AwareMockApiApplication.class, args);
	}

}
