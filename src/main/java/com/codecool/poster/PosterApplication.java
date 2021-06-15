package com.codecool.poster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PosterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosterApplication.class, args);
	}

}
