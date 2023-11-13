package com.proto.microServicePrototypodiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServicePrototypoDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicePrototypoDiscoveryApplication.class, args);
	}

}
