package com.gaspar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoOpenApiBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOpenApiBaseApplication.class, args);
	}

	/**
	 * para poder obtener los codigos,
	 * Desde la consola ejecutar: mvn clean generate-sources
	 */
}
