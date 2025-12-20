package com.springbootdcoker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MyProperties.class)
public class SpringBootDcokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDcokerApplication.class, args);
	}

}
