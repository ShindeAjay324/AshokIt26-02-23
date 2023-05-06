package com.te.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.te.client.GreetApiClient;

@RestController
public class WelcomeController {
	@Autowired
	private GreetApiClient greetApiClient;
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping(path = "/welcome")
	public String welcomeMsg() {
		String welcome="Welcome to Banglore";
		String greetMsg=greetApiClient.invokeGreetApi();
		return greetMsg+" "+welcome;
	}
}
