package com.kt.gms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GmsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmsServiceRegistryApplication.class, args);
	}

}
