package com.project.servicesServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesServerApplication.class, args);
	}

}
