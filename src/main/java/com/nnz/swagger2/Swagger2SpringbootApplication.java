package com.nnz.swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Swagger2SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Swagger2SpringbootApplication.class, args);
	}

}
