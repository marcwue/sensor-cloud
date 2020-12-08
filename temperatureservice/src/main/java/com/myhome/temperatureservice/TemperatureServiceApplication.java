package com.myhome.temperatureservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TemperatureServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureServiceApplication.class, args);
	}

}
