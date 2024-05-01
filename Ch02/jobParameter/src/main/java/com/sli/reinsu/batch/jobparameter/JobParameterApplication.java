package com.sli.reinsu.batch.jobparameter;


import org.springframework.boot.SpringApplication;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableBatchProcessing
@SpringBootApplication
public class JobParameterApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobParameterApplication.class, args);
    }

}
