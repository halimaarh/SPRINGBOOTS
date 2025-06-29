package com.halimah.restappcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RestappcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestappcrudApplication.class, args);
	}

}
