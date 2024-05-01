package com.sli.reinsu.batch.nestedjobs;

import org.springframework.boot.SpringApplication;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableBatchProcessing
@SpringBootApplication
public class NestedJobsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NestedJobsApplication.class, args);
    }

}
