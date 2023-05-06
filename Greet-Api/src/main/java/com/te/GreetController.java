package com.te;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@ResponseStatus(value = HttpStatus.OK)
	@GetMapping(path = "/greet")
	public String greet() {
		return "Good Morning";
	}

}
