package com.example.springbootsample;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;

@EnableJpaRepositories("com.example.springbootsample.repositories")
@EntityScan("com.example.springbootsample.model")
@EnableProcessApplication
@SpringBootApplication
public class SpringbootsampleApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootsampleApplication.class, args);
	}

}

