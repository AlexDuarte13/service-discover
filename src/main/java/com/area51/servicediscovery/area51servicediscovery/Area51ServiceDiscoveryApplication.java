package com.area51.servicediscovery.area51servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Area51ServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Area51ServiceDiscoveryApplication.class, args);
	}

}
