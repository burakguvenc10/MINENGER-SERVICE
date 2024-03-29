package com.minenger.App;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.minenger.App"})
public class MinengerAppApplication{

	@Bean
	public ModelMapper mapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/minenger/api");
		SpringApplication app = new SpringApplication(MinengerAppApplication.class);
		app.run(args);
	}

}
