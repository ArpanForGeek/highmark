package com.highmark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@AutoConfigurationPackage
public class HighMarkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HighMarkApplication.class, args);
	}

}
