package com.sli.reinsu.batch.splits;

import org.springframework.boot.SpringApplication;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableBatchProcessing
@SpringBootApplication
public class SplitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplitsApplication.class, args);
	}

}
