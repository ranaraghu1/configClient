package com.rana.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClient {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Config Client";
	}

}
