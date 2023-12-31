package com.example.empmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com")
@EnableJpaRepositories("com.dao")
@EntityScan("com.model")
@EnableEurekaClient
public class EmpMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpMicroServiceApplication.class, args);
	}

}
