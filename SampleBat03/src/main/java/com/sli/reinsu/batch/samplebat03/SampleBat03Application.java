package com.sli.reinsu.batch.samplebat03;


import org.springframework.boot.SpringApplication;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableBatchProcessing
@SpringBootApplication
public class SampleBat03Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleBat03Application.class, args);
	}

}
