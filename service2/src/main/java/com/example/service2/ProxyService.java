package com.example.service2;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="gateway-api")
@RibbonClient(name="service1")
public interface ProxyService {
	
		@GetMapping("/service1/hi")
		 Message sayHi();
}
