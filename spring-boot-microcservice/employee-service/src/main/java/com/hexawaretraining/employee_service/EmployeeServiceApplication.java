package com.hexawaretraining.employee_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class EmployeeServiceApplication {
	// Config RestTemplate
//	@Bean
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}


 // Config WebClient;

	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
// web Client  :1. Add dependency for Webflux
// 2.
// // Config WebClient;



// Communication between two services using Spring cloud OpenFeign