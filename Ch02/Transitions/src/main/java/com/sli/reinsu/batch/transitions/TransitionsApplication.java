package com.sli.reinsu.batch.transitions;

import org.springframework.boot.SpringApplication;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableBatchProcessing
@SpringBootApplication
public class TransitionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransitionsApplication.class, args);
    }

}
