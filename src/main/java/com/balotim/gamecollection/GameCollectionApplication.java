package com.balotim.gamecollection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GameCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameCollectionApplication.class, args);
	}

	@GetMapping("/")
	public String start() {
		return "Hello world!";
	}

}
