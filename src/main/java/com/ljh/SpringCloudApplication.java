package com.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudApplication {

	@RequestMapping("/hello")
	public  String sayHello(String msg){
		return  "hello:" + msg;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApplication.class, args);
	}
}
