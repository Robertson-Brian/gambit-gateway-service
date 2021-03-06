package com.revature.hydra.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableZuulProxy
@RestController
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
