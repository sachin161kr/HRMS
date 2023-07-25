package com.sachinkumar.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HrmsApplication {

	@GetMapping("/")
	public String hello() {
		return "HRMS online";
	}

	public static void main(String[] args) {
		SpringApplication.run(HrmsApplication.class, args);
	}

}
