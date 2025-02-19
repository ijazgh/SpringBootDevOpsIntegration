package com.chtech;

import jakarta.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDevOpsIntegrationApplications {

	public static Logger logger = 	LoggerFactory.getLogger(SpringBootDevOpsIntegrationApplication.class);
	@PostConstruct
	public void init(){
		System.out.println("Welome to SpringbootDevopsIntegration  Application!");
		logger.info("SpringbootDevopsIntegration Application started.....");
	}
	@GetMapping("/get")
	
	public String getMessage() {
		
		return "Hello, Welcome to the spring";
	}



	public static void main(String[] args) {

		logger.info("Application is starting...");
		System.out.println("Application is starting...");
		SpringApplication.run(SpringBootDevOpsIntegrationApplication.class, args);
	}

}
