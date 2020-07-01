package com.example.service2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ApiController {
	   private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

	@Value("${hi}")
	String sms;
	@Autowired
	private ProxyService proxy;
	
	@GetMapping("/")
	public Message sayHi() {
		
		Message m = proxy.sayHi();
		
		logger.info("response from service 1 " +m);
		
		return m;
		
	}
	
	@GetMapping("/hi")
	public String saySms() {
		//Message m = proxy.sayHi();
		return sms;
		
	}

}
