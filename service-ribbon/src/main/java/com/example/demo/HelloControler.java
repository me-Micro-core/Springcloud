package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	@Autowired
    HelloService helloService;
    @RequestMapping(value = "/hs")
    public String hi(@RequestParam String name){
    	String res=helloService.hiService(name);
        return res;
    }

}
