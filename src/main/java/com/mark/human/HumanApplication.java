package com.mark.human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HumanApplication {
	public static void main(String[] args) {
		SpringApplication.run(HumanApplication.class, args);
	}

}
