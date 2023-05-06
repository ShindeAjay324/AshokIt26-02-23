package com.te.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREET-API")
public interface GreetApiClient {
		
	//public static Integer a;
	@GetMapping(path = "/greet")
	public String invokeGreetApi();
}
