package com.example.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("/hi")
	public Message sayHi() {
		return new Message("Hello Nuru!");
	}
	
	@GetMapping("/ex/{val}")
	public int getExec(@PathVariable int val) throws Exception {
		
		if (val<1) {
			throw new Exception("Bad input");
		} else {
			return val;
		}
		
	}

}
