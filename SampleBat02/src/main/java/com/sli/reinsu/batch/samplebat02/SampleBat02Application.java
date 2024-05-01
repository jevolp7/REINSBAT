package com.sli.reinsu.batch.samplebat02;


import org.springframework.boot.SpringApplication;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableBatchProcessing
@SpringBootApplication
public class SampleBat02Application {

    public static void main(String[] args) {
        SpringApplication.run(SampleBat02Application.class, args);
    }

}
