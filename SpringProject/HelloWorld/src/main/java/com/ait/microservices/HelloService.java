package com.ait.microservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
	@RequestMapping("/")
	public String index() {
		return "Hello World 2032";
		
	}

	
		@RequestMapping("/ace")
		public String index1() {
		return "Hello World 2032 you are an ace";
			
		}
}
