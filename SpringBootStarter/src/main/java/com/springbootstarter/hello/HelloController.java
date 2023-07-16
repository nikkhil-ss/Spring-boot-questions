package com.springbootstarter.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
		@GetMapping("/hello")
		public String sayHi() {
			return "Hello User";

		}
		@GetMapping("/")
		public String say() {
			return "Homepage for ADMIN and USER";

		}
		
}
