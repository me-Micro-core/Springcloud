package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="consul-miya")
public interface HiService {

	@RequestMapping(value="/hi",method = RequestMethod.GET)
	String hi();
}
