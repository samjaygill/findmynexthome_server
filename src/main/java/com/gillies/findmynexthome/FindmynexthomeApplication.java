package com.gillies.findmynexthome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.gillies.findmynexthome")
public class FindmynexthomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindmynexthomeApplication.class, args);
	}

}
