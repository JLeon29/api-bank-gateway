package com.nttdata.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApiBankApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBankApigatewayApplication.class, args);
	}

}
