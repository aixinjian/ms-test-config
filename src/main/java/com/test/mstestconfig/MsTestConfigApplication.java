package com.test.mstestconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsTestConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTestConfigApplication.class, args);
	}

}