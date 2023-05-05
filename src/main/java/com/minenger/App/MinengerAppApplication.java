package com.minenger.App;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.minenger.App"})
public class MinengerAppApplication{
	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/minenger/api");
		SpringApplication app = new SpringApplication(MinengerAppApplication.class);
		app.run(args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
