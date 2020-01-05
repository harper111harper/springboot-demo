package net.e4net.demo.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	//expose "/" that return "hello world"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on Server is " + LocalDateTime.now();
	}
	
}
