package com.sli.reinsu.batch.decisions;

import org.springframework.boot.SpringApplication;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableBatchProcessing
@SpringBootApplication
public class DecisionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecisionsApplication.class, args);
	}

}
