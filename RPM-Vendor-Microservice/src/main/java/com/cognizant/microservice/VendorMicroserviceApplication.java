package com.cognizant.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.slf4j.Slf4j;

//@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class VendorMicroserviceApplication {

	public static void main(String[] args) {
		log.info("Main started...");
		SpringApplication.run(VendorMicroserviceApplication.class, args);
		log.info("Main ended...");
	}

}
