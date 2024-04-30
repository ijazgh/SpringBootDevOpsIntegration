package com.chtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDevOpsIntegrationApplication {
	
	@GetMapping("/get")
	
	public String getMessage() {
		
		return "Hello, Welcome to the spring boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDevOpsIntegrationApplication.class, args);
	}

}
