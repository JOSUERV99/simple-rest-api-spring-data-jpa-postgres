package com.josuerv.sandbox.simplerestapisample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Simple REST API sample application
 * @author JOSUERV99
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
public class SimpleRestApiSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestApiSampleApplication.class, args);
	}

}
