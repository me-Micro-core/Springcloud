package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@Autowired
	HiService hiService;
	@RequestMapping("/hi")
	public String hi() {
		return hiService.hi();
	}
}
