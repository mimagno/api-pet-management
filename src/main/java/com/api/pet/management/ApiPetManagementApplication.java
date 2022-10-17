package com.api.pet.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
@EnableFeignClients
public class ApiPetManagementApplication {

	@RequestMapping("/")
	public String helloDocker(){
		return "Hello from docker";
	}
	public static void main(String[] args) {
		SpringApplication.run(ApiPetManagementApplication.class, args);
	}

}
