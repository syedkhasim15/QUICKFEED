package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMysqlImageUploadApplication {
	
	@GetMapping("/welcome")
	public String welcome() {
		
		return "spring boot docker demo";
	}

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMysqlImageUploadApplication.class, args);
        
    }

}
